package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class StudyObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int course;
    @Column
    private int teacher;
    @Column
    private int number;

    public StudyObject() {
    }

    public StudyObject(int course, int teacher, int number) {
        this.course = course;
        this.teacher = teacher;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
