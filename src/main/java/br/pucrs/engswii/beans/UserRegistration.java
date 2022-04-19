package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {

	private List<User> userRecords;

	private static UserRegistration userRegd = null;

	private UserRegistration(){
		userRecords= new ArrayList<User>();
	}

	public static UserRegistration getInstance() {

		if(userRegd == null) {
			userRegd= new UserRegistration();
			return userRegd;
		}
		else {
			return userRegd;
		}
	}

	public void add(User std) {
		userRecords.add(std);
	}

	public String upDateUser(User std) {

		for(int i=0; i<userRecords.size(); i++)
		{
			User stdn = userRecords.get(i);
			if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				userRecords.set(i, std);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteUser(String registrationNumber) {

		for(int i=0; i<userRecords.size(); i++)
		{
			User stdn = userRecords.get(i);
			if(stdn.getRegistrationNumber().equals(registrationNumber)){
				userRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<User> getUserRecords() {
		return userRecords;
	}

}