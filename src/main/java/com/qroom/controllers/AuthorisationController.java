package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.dao.DAO;
import com.qroom.dao.entities.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AuthorisationController {
    @Autowired
    DAO dao;

    @RequestMapping(value = "/register")
    public Answer register(@RequestParam("login") String login, @RequestParam("password") String password,
                           @RequestParam("name") String name, @RequestParam("surname") String surname,
                           @RequestParam("email") String email, @RequestParam("phone") String phone, HttpSession session) {
        boolean check = dao.register(login, password, name, surname, email, phone);
        System.out.println("REGISTER: " + login);
        if(check) {
            session.setAttribute("user", new Login(login, password));
            return new SuccessAnswer<Login>("register", null, new Login(login, password));
        } else {
            return new ErrorAnswer("register", null);
        }
    }

    @RequestMapping(value = "/login")
    public Answer login(@RequestParam("login") String login, @RequestParam("password") String password, HttpSession session) {
        boolean check = dao.login(login, password);
        System.out.println("LOGIN: " + login);
        if(check) {
            session.setAttribute("user", new Login(login, password));
            return new SuccessAnswer<Login>("login", null, new Login(login, password));
        } else {
            return new ErrorAnswer("login", null);
        }
    }

    @RequestMapping(value = "/test")
    public String test(HttpSession session) {
        Login login = (Login)session.getAttribute("user");
        System.out.println("TEST: " + login.getLogin());
        if(dao.login(login.getLogin(), login.getPassword())) {
            return "True";
        } else {
            return "False";
        }
        /*session.setAttribute("test", "test");
        return login;*/
    }

    @RequestMapping(value = "/testCon")
    public String testCon(HttpSession session) {
        System.out.println("TESTCON");
        return "HIHIHhd";
        /*session.setAttribute("test", "test");
        return login;*/
    }
}
