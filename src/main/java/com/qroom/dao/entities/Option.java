package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long option_id;
    @Column
    private String name;
    @Column
    private Long parent_option_id;
    @Column
    private long type;
    @Column
    private long question_id;

    public Option(){}

    public Option(String name, Long parent_option_id, long type, long question_id) {
        this.name = name;
        this.parent_option_id = parent_option_id;
        this.type = type;
        this.question_id = question_id;
    }

    public long getOption_id() {
        return option_id;
    }

    public void setOption_id(long option_id) {
        this.option_id = option_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent_option_id() {
        return parent_option_id;
    }

    public void setParent_option_id(Long parent_option_id) {
        this.parent_option_id = parent_option_id;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }
}
