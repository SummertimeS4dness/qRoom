package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long test_id;
    @Column
    private String name;
    @Column
    private long study_object_id;

    public Test() { }

    public Test(String name, long study_object_id) {
        this.name = name;
        this.study_object_id = study_object_id;
    }

    public long getTest_id() {
        return test_id;
    }

    public void setTest_id(long test_id) {
        this.test_id = test_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudy_object_id() {
        return study_object_id;
    }

    public void setStudy_object_id(long study_object_id) {
        this.study_object_id = study_object_id;
    }
}
