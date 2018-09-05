package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lecture_id;
    @Column
    private String path;
    @Column
    private long study_object_id;

    public Lecture() { }

    public Lecture(String path, long study_object_id) {
        this.path = path;
        this.study_object_id = study_object_id;
    }

    public long getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(long lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getStudy_object_id() {
        return study_object_id;
    }

    public void setStudy_object_id(long study_object_id) {
        this.study_object_id = study_object_id;
    }
}
