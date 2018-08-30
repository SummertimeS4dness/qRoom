package com.qroom.dao.entities;

public class StudyObject {
    private int id;
    private int course;
    private int teacher;
    private int number;

    public StudyObject() {
    }

    public StudyObject(int course, int teacher, int number) {
        this.course = course;
        this.teacher = teacher;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
