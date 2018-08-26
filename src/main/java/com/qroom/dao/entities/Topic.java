package com.qroom.dao.entities;

public class Topic {
    private int id;
    private String name;
    private String about;
    private int person;
    private int course;

    public Topic() { }

    public Topic(int id, String name, String about, int person, int course) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.person = person;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
