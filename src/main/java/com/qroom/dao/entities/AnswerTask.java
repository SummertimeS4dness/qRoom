package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class AnswerTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long answer_task_id;
    @Column
    private String value;
    @Column
    private long file_id;
    @Column
    private long person_id;
    @Column
    private double mark;
    @Column
    private long course_id;
    public AnswerTask(){}

    public AnswerTask(String value, long file_id, long person_id, double mark, long course_id) {
        this.value = value;
        this.file_id = file_id;
        this.person_id = person_id;
        this.mark = mark;
        this.course_id = course_id;
    }

    public long getAnswer_task_id() {
        return answer_task_id;
    }

    public void setAnswer_task_id(long answer_task_id) {
        this.answer_task_id = answer_task_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }
}
