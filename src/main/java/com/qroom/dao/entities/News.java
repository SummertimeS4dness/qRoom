package com.qroom.dao.entities;

public class News {
    private int id;
    private String name;
    private int course;

    public News() { }

    public News(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
