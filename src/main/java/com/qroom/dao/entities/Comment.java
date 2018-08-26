package com.qroom.dao.entities;

public class Comment {
    private int id;
    private String value;
    private int topic;
    private int parentComment;

    public Comment() { }

    public Comment(int id, String value, int topic, int parentComment) {
        this.id = id;
        this.value = value;
        this.topic = topic;
        this.parentComment = parentComment;
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

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    public int getParentComment() {
        return parentComment;
    }

    public void setParentComment(int parentComment) {
        this.parentComment = parentComment;
    }
}
