package br.pucrs.engswii.beans;

public class Student{

	String registrationNumber;
    int age;
	String name;
	
	public Student(String registrationNumber, String name, int age){
		 this.registrationNumber = registrationNumber;
        this.name = name;
		this.age = age;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
