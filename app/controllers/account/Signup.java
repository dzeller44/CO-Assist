package controllers.account;

import controllers.Application;
import models.Token;
import models.User;
import models.enums.RoleType;
import models.utils.AppException;
import models.utils.Hash;
import models.utils.Mail;
import org.apache.commons.mail.EmailException;
import play.Configuration;
import play.Logger;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import controllers.helpers.AccessMiddleware;

import javax.inject.Inject;

import views.html.account.signup.confirm;
import views.html.account.signup.create;
import views.html.account.signup.created;
import views.html.account.signup.approval;
import views.html.admin.createadmin;
import views.html.admin.createdadmin;
import views.html.account.signup.duplicateuser;
import views.html.account.signup.duplicateadmin;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import static play.data.Form.form;

/**
 * Signup to PlayStartApp : save and send confirm mail.
 * 
 * Created by: yesnault Date: 31/01/12
 * Edited by: dzeller, cwyatt
 */
public class Signup extends Controller {
	@Inject
	MailerClient mailerClient;

	/**
	 * Display the create form.
	 *
	 * @return create form
	 */
	public Result create() {
		return ok(create.render(form(Application.Register.class)));
	}

	/**
	 * Display the create admin form.
	 *
	 * @return create admin form
	 */
	public Result createAdmin() {
		return ok(createadmin.render(form(Application.AdminRegister.class)));
		// return ok(create.render());
	}

	/**
	 * Display the create form only (for the index page).
	 *
	 * @return create form
	 */
	public Result createFormOnly() {
		return ok(create.render(form(Application.Register.class)));
		// return ok(create.render());
	}

	/**
	 * Save the new user.
	 *
	 * @return Successfull page or created form if bad
	 */
	public Result save() {
		Form<Application.Register> registerForm = form(Application.Register.class).bindFromRequest();

		if (registerForm.hasErrors()) {
			return badRequest(create.render(registerForm));
			// return badRequest(create.render());
		}

		Application.Register register = registerForm.get();
		Result resultError = checkBeforeSave(registerForm, register.email);

		if (resultError != null) {
			return resultError;
		}

		try {
			User user = new User();
			user.setEmail(register.email);
			user.fullname = register.fullname;
			user.agency = register.agency;
			user.passwordHash = Hash.createPassword(register.inputPassword);
			user.confirmationToken = UUID.randomUUID().toString();
			user.userkey = user.createUserKey();
			user.dateCreation = new Date();
			// Custom fields...
			String role = register.role;
			switch (role) {
			case "user":
				user.role = RoleType.USER;
				break;
			case "manager":
				user.role = RoleType.MANAGER;
				break;
			case "admin":
				user.role = RoleType.ADMIN;
				break;
			default:
				user.role = RoleType.UNDEFINED;
				break;
			}
			
			user.dateCreation = new Date();
			user.updatedBy = AccessMiddleware.getSessionEmail();
			user.dateUpdated = new Date();
			// Create reminder dates...
			// Update account...
			Calendar cal = null;
			Date result = null;
			cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, 6);
			result = cal.getTime();			
			//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			//String dateOnly = dateFormat.format(result);			
			user.dateRemind = result;
			// Password...
			cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, 3);
			result = cal.getTime();
			user.datePasswordRemind = result;
			user.save();

			// if user.role is "manager" set approved to "N"
			if (role.compareTo("manager") == 0) {
				user.approved = "N";
				user.save();
				
				String admin = Messages.get("email.principal.address");
				
				sendMailAdminConfirm(admin, user.getEmail());
				
				return ok(approval.render());
			} else {
				sendMailAskForConfirmation(user);
				return ok(created.render());
			}
		} catch (EmailException e) {
			Logger.debug("Signup.save Cannot send email", e);
			flash("error", Messages.get("error.sending.email"));
		} catch (Exception e) {
			Logger.error("Signup.save error", e);
			flash("error", Messages.get("error.technical"));
		}
		return badRequest(create.render(registerForm));
		//return badRequest(create.render());
	}

	public Result saveAdmin() throws EmailException {
		Form<Application.AdminRegister> registerAdminForm = form(Application.AdminRegister.class).bindFromRequest();

		if (registerAdminForm.hasErrors()) {
			return badRequest(createadmin.render(registerAdminForm));
		}

		Application.AdminRegister admin = registerAdminForm.get();
		Result resultError = checkAdminBeforeSave(registerAdminForm, admin.email);
		if (resultError != null) {
			return resultError;
		}

		try {
			User user = new User();
			user.setEmail(admin.email);
			user.fullname = admin.fullname;
			String checkPassword = Messages.get("admin.default.password");
			user.passwordHash = Hash.createPassword(checkPassword);
			user.userkey = user.createUserKey();
			// user.confirmationToken = UUID.randomUUID().toString();  //admins don't need this, are validated when reset password.
			// user.validated = true;  //admins are validated when they click the reset password link.
			user.dateCreation = new Date();
			user.updatedBy = AccessMiddleware.getSessionEmail();
			user.dateUpdated = new Date();
			user.role = RoleType.ADMIN;
			user.save();

			// Send reset password email?
			Token t = new Token();
			t.sendNewAdminMail(user, mailerClient);
			return ok(createdadmin.render());

		} catch (Exception e) {
			Logger.error("Signup.saveAdmin error", e);
			flash("error", Messages.get("error.technical"));
		}
		return badRequest(createadmin.render(registerAdminForm));
	}

	/**
	 * Check if the email already exists.
	 *
	 * @param registerForm
	 *            User Form submitted
	 * @param email
	 *            email address
	 * @return Index if there was a problem, null otherwise
	 */
	private Result checkBeforeSave(Form<Application.Register> registerForm, String email) {
		// Check unique email
		if (User.findByEmail(email) != null) {
			flash("error", Messages.get("error.email.already.exist"));
			//return badRequest(create.render(registerForm));
			// return badRequest(create.render());
			return ok(duplicateuser.render(email));
		}

		return null;
	}

	/**
	 * Check if the email already exists.
	 *
	 * @param registerForm
	 *            User Form submitted
	 * @param email
	 *            email address
	 * @return Index if there was a problem, null otherwise
	 */
	private Result checkAdminBeforeSave(Form<Application.AdminRegister> registerForm, String email) {
		// Check unique email
		if (User.findByEmail(email) != null) {
			flash("error", Messages.get("error.email.already.exist"));
			//return badRequest(createadmin.render(registerForm));
			return ok(duplicateadmin.render(email));
		}

		return null;
	}

	/**
	 * Send the welcome Email with the link to confirm.
	 *
	 * @param user
	 *            user created
	 * @throws EmailException
	 *             Exception when sending mail
	 */
	private void sendMailAskForConfirmation(User user) throws EmailException, MalformedURLException {
		String subject = Messages.get("mail.confirm.subject");

		String urlString = Messages.get("url") + Configuration.root().getString("server.hostname");
		urlString += "/confirm/" + user.confirmationToken;
		URL url = new URL(urlString); // validate the URL, will throw an
										// exception if bad.
		String message = Messages.get("mail.confirm.message", url.toString());

		Mail.Envelop envelop = new Mail.Envelop(subject, message, user.getEmail());
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
	}
	
	private void sendMailAdminConfirm(String admin, String email) throws EmailException, MalformedURLException {
		String subject = Messages.get("mail.admin.subject");

		String urlString = Messages.get("url") + Configuration.root().getString("server.hostname");
		urlString += "/finduserurl?email=" + email;
		URL url = new URL(urlString); // validate the URL, will throw an
										// exception if bad.
		String message = Messages.get("mail.admin.message", url.toString());

		Mail.Envelop envelop = new Mail.Envelop(subject, message, admin);
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
	}

	/**
	 * Valid an account with the url in the confirm mail.
	 *
	 * @param token
	 *            a token attached to the user we're confirming.
	 * @return Confirmationpage
	 */
	public Result confirm(String token) {
		User user = User.findByConfirmationToken(token);
		if (user == null) {
			flash("error", Messages.get("error.unknown.email"));
			return badRequest(confirm.render());
		}

		if (user.validated) {
			flash("error", Messages.get("error.account.already.validated"));
			return badRequest(confirm.render());
		}

		try {
			if (User.confirm(user)) {
				sendMailConfirmation(user);
				flash("success", Messages.get("account.successfully.validated"));
				return ok(confirm.render());
			} else {
				Logger.debug("Signup.confirm cannot confirm user");
				flash("error", Messages.get("error.confirm"));
				return badRequest(confirm.render());
			}
		} catch (AppException e) {
			Logger.error("Cannot signup", e);
			flash("error", Messages.get("error.technical"));
		} catch (EmailException e) {
			Logger.debug("Cannot send email", e);
			flash("error", Messages.get("error.sending.confirm.email"));
		}
		return badRequest(confirm.render());
	}

	/**
	 * Send the confirm mail.
	 *
	 * @param user
	 *            user created
	 * @throws EmailException
	 *             Exception when sending mail
	 */
	private void sendMailConfirmation(User user) throws EmailException {
		String subject = Messages.get("mail.welcome.subject");
		String message = Messages.get("mail.welcome.message");
		Mail.Envelop envelop = new Mail.Envelop(subject, message, user.getEmail());
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
	}
	
	
}
