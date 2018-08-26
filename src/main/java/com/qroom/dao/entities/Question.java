package com.qroom.dao.entities;

public class Question {
    private int id;
    private int test;
    private String question;
    private String about;
    private int type;
    private int conformity;

    public Question() { }

    public Question(int id, int test, String question, String about, int type, int conformity) {
        this.id = id;
        this.test = test;
        this.question = question;
        this.about = about;
        this.type = type;
        this.conformity = conformity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
