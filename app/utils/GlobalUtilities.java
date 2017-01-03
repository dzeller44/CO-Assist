package utils;

import javax.inject.Inject;

import play.api.libs.mailer.MailerClient;
import play.libs.mailer.Email;
import play.mvc.Controller;

public class GlobalUtilities extends Controller {

	@Inject
	static MailerClient mailer;

	public void send() {
		String cid = "1234";
		String subject = "Simple email";
		String from = "dan.zeller@state.co.us";
		Email email = new Email();
		email.setSubject(subject);
		email.setFrom(from);
		email.addTo("dan.zeller@state.co.us");
		email.setBodyText("A text message");
		email.setBodyHtml(
				"<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
		String id = mailer.send(email);
	}
}