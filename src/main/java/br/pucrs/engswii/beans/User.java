package br.pucrs.engswii.beans;

public class User {

    String name;
    String registrationNumber;
    
	public User(String registrationNumber, String name){
        this.registrationNumber = registrationNumber;
        this.name = name;
    }


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
