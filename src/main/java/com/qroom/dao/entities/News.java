package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String value;
    @Column
    private int course;

    public News() { }

    public News(long id, String value, int course) {
        this.id = id;
        this.value = value;
        this.course = course;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public long  getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public int getCourse() {
        return course;
    }
}
