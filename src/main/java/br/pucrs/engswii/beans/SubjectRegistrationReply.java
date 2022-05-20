package br.pucrs.engswii.beans;

import java.util.List;

public class SubjectRegistrationReply {
    String name;
    String id;
    List<Character> schedule;
	String registrationStatus;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Character> getSchedule() {
        return schedule;
    }
    public void setSchedule(List<Character> schedule) {
        this.schedule = schedule;
    }
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
}
