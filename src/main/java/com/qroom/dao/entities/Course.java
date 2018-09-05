package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long course_id;
    @Column
    private String name;
    @Column
    private String about;
    @Column
    private long teacher_id;
    @Column
    private long icon_id;

    public Course() { }

    public Course(String name, String about, long teacher_id, long icon_id) {
        this.name = name;
        this.about = about;
        this.teacher_id = teacher_id;
        this.icon_id = icon_id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
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

    public long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public long getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(long icon_id) {
        this.icon_id = icon_id;
    }
}
