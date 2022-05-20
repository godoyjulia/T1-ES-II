package br.pucrs.engswii.beans;

import java.util.List;

public class Subject {
    String name;
    String id;
    List<Character> schedule;

    public Subject(String name, String id, List<Character> schedule) {
        this.name = name;
        this.id = id;
        this.schedule = schedule;
    }
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


    
}
