package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chat_id;
    @Column
    private String name;

    public Chat() { }

    public Chat(String name) {
        this.name = name;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
