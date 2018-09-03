package com.qroom.dao;

import com.qroom.dao.entities.Message;

import java.util.List;

public interface DAOMessage {
    List<Long> getMessages(long person, long course);
    boolean sendMessage(Message message);
    Message getMessageById(long id);
    long getSender(long senderId);
}
