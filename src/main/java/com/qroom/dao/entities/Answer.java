package com.qroom.dao.entities;

public class Answer {
    private long id;
    private String value;
    private int person;
    private int mark;

    public Answer() { }

    public Answer(long id, String value, int person, int mark) {
        this.id = id;
        this.value = value;
        this.person = person;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
