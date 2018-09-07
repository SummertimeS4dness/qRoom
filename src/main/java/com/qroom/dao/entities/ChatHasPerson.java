package com.qroom.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class ChatHasPerson {
    @Column
    private long chat_id;
    @Column
    private long person_id;

    public ChatHasPerson(){}

    public ChatHasPerson(long chat_id, long person_id) {
        this.chat_id = chat_id;
        this.person_id = person_id;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }
}
