package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class RightAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long right_answer_id;
    @Column
    private long answer_id;
    @Column
    private long question_id;

    public RightAnswer(){}

    public RightAnswer(long answer_id, long question_id) {
        this.answer_id = answer_id;
        this.question_id = question_id;
    }

    public long getRight_answer_id() {
        return right_answer_id;
    }

    public void setRight_answer_id(long right_answer_id) {
        this.right_answer_id = right_answer_id;
    }

    public long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(long answer_id) {
        this.answer_id = answer_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }
}
