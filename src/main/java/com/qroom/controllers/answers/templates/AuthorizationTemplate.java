package com.qroom.controllers.answers.templates;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Login;
import javax.servlet.http.HttpSession;

public class AuthorizationTemplate implements Template {


    private ActionServer actionServer;
    private HttpSession session;
    private String command;
    private DAOLogin daoLogin;

    public AuthorizationTemplate(ActionServer actionServer, HttpSession session, String command, DAOLogin daoLogin) {
        this.actionServer = actionServer;
        this.session = session;
        this.command = command;
        this.daoLogin = daoLogin;
    }

    @Override
    public Answer answer() {
        Login login = (Login)session.getAttribute("user");
        if (login != null && daoLogin.login(login.getLogin(), login.getPassword())) {
            return actionServer.action();
        } else {
            session.removeAttribute("user");
            return new ErrorAnswer(command, "Authorization error");
        }
    }
}
