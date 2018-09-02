package com.qroom.controllers.answers.templates;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Login;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class AuthorizationTemplate implements Template {

    @Autowired
    private DAOLogin daoLogin;

    private ActionServer actionServer;
    private HttpSession session;
    private String command;

    public AuthorizationTemplate(ActionServer actionServer, HttpSession session, String command) {
        this.actionServer = actionServer;
        this.session = session;
        this.command = command;
    }

    @Override
    public Answer answer() {
        Login login = (Login)session.getAttribute("user");
        if (login != null && daoLogin.login(login.getLogin(), login.getPassword())) {
            return actionServer.action();
        } else {
            return new ErrorAnswer(command, "Authorization error");
        }
    }
}
