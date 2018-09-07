package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.controllers.answers.templates.ActionServer;
import com.qroom.controllers.answers.templates.AuthorizationTemplate;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.DAOMessage;
import com.qroom.dao.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MessageController {
    @Autowired
    private DAOMessage daoMessage;

    @Autowired
    private DAOLogin daoLogin;

    @RequestMapping("/getMessages")
    public Answer getMessages(@RequestParam ("person") long person, @RequestParam ("course") long course, HttpSession session) {
        final String command = "/getMessages";
        ActionServer actionServer = () -> new SuccessAnswer<>(command, null, daoMessage.getMessages(person, course));
        return new AuthorizationTemplate(actionServer, session, command, daoLogin).answer();
    }

    @RequestMapping("/sendMessage")
    public Answer sendMessage(@RequestParam ("text") String text, @RequestParam ("file") Long file,
                              @RequestParam ("sender_id") long sender_id, @RequestParam ("chat_id") long chat_id, HttpSession session){
        Message message = new Message(chat_id, text, sender_id, file);
        final String command = "/sendMessage";
        ActionServer actionServer = () -> new SuccessAnswer<>(command, null, daoMessage.sendMessage(message));
        return new AuthorizationTemplate(actionServer, session, command, daoLogin).answer();
    }

    @RequestMapping("/getMessage")
    public Answer getMessage(@RequestParam ("id") long id, HttpSession session){
        final String command = "/getMessage";
        ActionServer actionServer = () -> new SuccessAnswer<>(command, null, daoMessage.getMessageById(id));
        return new AuthorizationTemplate(actionServer, session, command, daoLogin).answer();
    }
}
