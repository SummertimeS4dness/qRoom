package com.qroom.dao.entities;

public class News {
    private int id;
    private String value;
    private int course;

    public News() { }

    public News(int id, String value, int course) {
        this.id = id;
        this.value = value;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public int getCourse() {
        return course;
    }
}
