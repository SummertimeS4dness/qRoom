package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long question_id;
    @Column
    private String name;
    @Column
    private long test_id;
    @Column
    private String about;
    @Column
    private String type;

    public Question() { }

    public Question(String name, long test_id, String about, String type) {
        this.name = name;
        this.test_id = test_id;
        this.about = about;
        this.type = type;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTest_id() {
        return test_id;
    }

    public void setTest_id(long test_id) {
        this.test_id = test_id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
