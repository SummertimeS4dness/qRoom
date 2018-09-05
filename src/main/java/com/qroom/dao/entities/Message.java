package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long message_id;
    @Column
    private long chat_id;
    @Column
    private String text;
    @Column
    private long sender_id;
    @Column
    private long file_id;

    public Message() { }

    public Message(long chat_id, String text, long sender_id, long file_id) {
        this.chat_id = chat_id;
        this.text = text;
        this.sender_id = sender_id;
        this.file_id = file_id;
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getSender_id() {
        return sender_id;
    }

    public void setSender_id(long sender_id) {
        this.sender_id = sender_id;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
    }
}
