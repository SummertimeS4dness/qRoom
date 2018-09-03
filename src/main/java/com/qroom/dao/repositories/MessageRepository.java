package com.qroom.dao.repositories;

import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository /*extends CrudRepository<Message, Long>*/ {
    @Query(value = "SELECT * FROM message WHERE message.person=?1 AND message.course=?2", nativeQuery = true)
    List<Message> getMessages(long person, long course);

    @Query(value = "SELECT message.sender FROM message WHERE message.id=?1", nativeQuery = true)
    long getSender(long id);
}
