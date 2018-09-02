package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String text;
    @Column
    private int file;
    @Column
    private int integer;
    @Column
    private int course;
    @Column
    private int teacher;
    @Column
    private int person;

    public Message() { }

    public Message(long id, String text, int file, int integer, int course, int teacher, int person) {
        this.id = id;
        this.text = text;
        this.file = file;
        this.integer = integer;
        this.course = course;
        this.teacher = teacher;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) { this.person = person; }
}
