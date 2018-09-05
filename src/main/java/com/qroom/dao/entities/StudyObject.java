package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class StudyObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long study_object_id;
    @Column
    private long number;
    @Column
    private long course_id;

    public StudyObject() {
    }

    public StudyObject(long number, long course_id) {
        this.number = number;
        this.course_id = course_id;
    }

    public long getStudy_object_id() {
        return study_object_id;
    }

    public void setStudy_object_id(long study_object_id) {
        this.study_object_id = study_object_id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }
}
