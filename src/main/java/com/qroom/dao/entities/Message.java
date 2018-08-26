package com.qroom.dao.entities;

public class Message {
    private int id;
    private String text;
    private int file;
    private int integer;
    private int course;
    private int teacher;
    private int pesron;

    public Message() { }

    public Message(int id, String text, int file, int integer, int course, int teacher, int pesron) {
        this.id = id;
        this.text = text;
        this.file = file;
        this.integer = integer;
        this.course = course;
        this.teacher = teacher;
        this.pesron = pesron;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPesron() {
        return pesron;
    }

    public void setPesron(int pesron) {
        this.pesron = pesron;
    }
}
