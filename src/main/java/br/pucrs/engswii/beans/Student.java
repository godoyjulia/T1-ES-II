package br.pucrs.engswii.beans;

public class Student extends User {

    int age;
	
	public Student(String registrationNumber, String name, int age){
		super(registrationNumber, name);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
