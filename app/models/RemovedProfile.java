package models;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * @author zellerd
 *
 */
@Entity
public class RemovedProfile extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String name;

	@Constraints.Required
	public String address;

	public String address1;

	@Constraints.Required
	public String city;

	@Constraints.Required
	public String state;

	@Constraints.Required
	public String zip;
	
	@Constraints.Required
	public String county;

	@Constraints.Required
	public String billname;
	
	@Constraints.Required
	public String billaddress;

	public String billaddress1;

	@Constraints.Required
	public String billcity;

	@Constraints.Required
	public String billstate;

	@Constraints.Required
	public String billzip;
	
	@Constraints.Required
	public String billcountry;
	
	@Constraints.Required
	public String billphone;
	
	@Constraints.Required
	public String billemail;

	@Constraints.Required
	public String primaryNameFirst;

	@Constraints.Required
	public String primaryNameLast;

	@Constraints.Required
	public String primaryPhone;

	@Constraints.Required
	public String primaryEmail;

	@Constraints.Required
	public String secondaryNameFirst;

	@Constraints.Required
	public String secondaryNameLast;

	@Constraints.Required
	public String secondaryPhone;

	@Constraints.Required
	public String secondaryEmail;
	
	public String secondaryNameFirst2;

	public String secondaryNameLast2;

	public String secondaryPhone2;

	public String secondaryEmail2;

	@Constraints.Required
	public String services;

	public String servicesOther;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateCreation;

	@Constraints.Required
	public String profilekey;

	public String userkey;
	
	public String updatedBy;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateUpdated;

	public String removedBy;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateRemoved;

	// -- Queries (long id, profile.class)
	public static Model.Finder<Long, RemovedProfile> find = new Model.Finder<Long, RemovedProfile>(Long.class,
			RemovedProfile.class);

	/**
	 * Retrieve a profile by business name.
	 *
	 * @param name
	 *            to search
	 * @return a profile
	 */
	public static RemovedProfile findByName(String name) {
		return find.where().eq("name", name).findUnique();
	}

	public String createProfileKey() {
		String profileKey = UUID.randomUUID().toString().replaceAll("-", "");

		// Make sure it is unique...
		Boolean isUnique = false;
		while (!isUnique) {
			RemovedProfile profile = RemovedProfile.findByProfileKey(profileKey);
			if (profile != null) {
				// Found profile, not unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey
						+ " is not unique, creating a new one...");
			} else {
				// profile Key is unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey + " is unique.");
				isUnique = true;
			}
		}

		return profileKey;
	}

	/**
	 * Retrieves a user by unique user key.
	 *
	 * @param unique
	 *            user key.
	 * @return a user if the unique user key is found, null otherwise.
	 */
	public static RemovedProfile findByProfileKey(String profileKey) {
		return find.where().eq("profilekey", profileKey).findUnique();
	}

}
