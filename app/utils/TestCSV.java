package utils;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.avaje.ebean.Ebean;
import com.opencsv.CSVWriter;
import models.User;

public class TestCSV {

	public static void main(String[] args) {
		
		try
		{
			
			List<User> users = Ebean.find(models.User.class).findList();
			String usersCSV = "users.csv";
			System.out.println("Writing -----users.csv----------------");
			CSVWriter usersWriter = new CSVWriter(new FileWriter(usersCSV));
			List<String[]> usersArr = new ArrayList<String[]>();
			usersArr.add(new String[] { "ID", "Email","Full Name" });

			for(User user : users){
				usersArr.add(new String[] {
						new Long(user.getId()).toString(),
						user.getEmail(),
						user.fullname});
			}

			usersWriter.writeAll(usersArr);
			usersWriter.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
