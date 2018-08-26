package com.qroom.dao.entities;

public class Test {
    private int id;
    private String time;
    private int available;
    private int quiz;

    public Test() { }

    public Test(int id, String time, int available, int quiz) {
        this.id = id;
        this.time = time;
        this.available = available;
        this.quiz = quiz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }
}
