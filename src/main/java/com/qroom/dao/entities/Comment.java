package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String value;
    @Column
    private int topic;
    @Column
    private int parentComment;

    public Comment() { }

    public Comment(long id, String value, int topic, int parentComment) {
        this.id = id;
        this.value = value;
        this.topic = topic;
        this.parentComment = parentComment;
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
