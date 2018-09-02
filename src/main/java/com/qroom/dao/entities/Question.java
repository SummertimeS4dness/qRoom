package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int test;
    @Column
    private String question;
    @Column
    private String about;
    @Column
    private int type;
    @Column
    private int conformity;

    public Question() { }

    public Question(long id, int test, String question, String about, int type, int conformity) {
        this.id = id;
        this.test = test;
        this.question = question;
        this.about = about;
        this.type = type;
        this.conformity = conformity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getConformity() {
        return conformity;
    }

    public void setConformity(int conformity) {
        this.conformity = conformity;
    }
}
