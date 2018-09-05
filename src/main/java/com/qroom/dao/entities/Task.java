package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long task_id;
    @Column
    private String name;
    @Column
    private String content;
    @Column
    private long study_object_id;

    public Task() { }

    public Task(String name, String content, long study_object_id) {
        this.name = name;
        this.content = content;
        this.study_object_id = study_object_id;
    }

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getStudy_object_id() {
        return study_object_id;
    }

    public void setStudy_object_id(long study_object_id) {
        this.study_object_id = study_object_id;
    }
}
