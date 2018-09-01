package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Login;
import com.qroom.dao.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
public class AuthorisationController {
    @Autowired
    DAOLogin daoLogin;

    @RequestMapping(value = "/register")
    public Answer register(@RequestParam("login") String login, @RequestParam("password") String password,
                           @RequestParam("name") String name, @RequestParam("surname") String surname,
                           @RequestParam("email") String email, @RequestParam("phone") String phone, HttpSession session) {
        boolean check = daoLogin.register(login, password, name, surname, email, phone);
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
        boolean check = daoLogin.login(login, password);
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
        if(daoLogin.login(login.getLogin(), login.getPassword())) {
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
        return "HI!";
        /*session.setAttribute("test", "test");
        return login;*/
    }

    @RequestMapping(value = "/testDB")
    public List<Person> testDB(HttpSession session) {
        System.out.println("TESTDB");
        return daoLogin.test();
        /*session.setAttribute("test", "test");
        return login;*/
    }

    @RequestMapping(value = "/google/login")
    public String lul(HttpSession session) {
        System.out.println("GOOGLE");
        return "GOOOGLEEE!";
        /*session.setAttribute("test", "test");
        return login;*/
    }

    @RequestMapping("/user")
    public Map<String, Object> user(Principal principal, OAuth2Authentication auth) {
        //return principal;
        return (Map<String, Object>) auth.getUserAuthentication().getDetails();
    }

}
