package com.qroom.dao.entities;

public class Answer {
    private int id;
    private String value;
    private int person;
    private int mark;

    public Answer() { }

    public Answer(int id, String value, int person, int mark) {
        this.id = id;
        this.value = value;
        this.person = person;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
