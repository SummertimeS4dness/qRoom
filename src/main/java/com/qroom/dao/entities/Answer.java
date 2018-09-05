package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long answer_id;
    @Column
    private long option_id;
    @Column
    private long status;
    @Column
    private double mark;
    @Column
    private long course_id;
    @Column
    private long question_id;
    @Column
    private long person_id;

    public Answer() { }

    public Answer(long option_id, long status, double mark, long course_id, long question_id, long person_id) {
        this.option_id = option_id;
        this.status = status;
        this.mark = mark;
        this.course_id = course_id;
        this.question_id = question_id;
        this.person_id = person_id;
    }

    public long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(long answer_id) {
        this.answer_id = answer_id;
    }

    public long getOption_id() {
        return option_id;
    }

    public void setOption_id(long option_id) {
        this.option_id = option_id;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
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

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }
}
