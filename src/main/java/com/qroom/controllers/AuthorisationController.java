package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.controllers.answers.templates.ActionServer;
import com.qroom.controllers.answers.templates.AuthorizationTemplate;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Login;
import com.qroom.dao.entities.Person;
import com.qroom.dao.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AuthorisationController {
    @Autowired
    DAOLogin daoLogin;

    @Autowired
    AuthenticationManager authenticationManager;
    List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

    public AuthorisationController() {
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
    }


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

    @RequestMapping(value = "/login1")
    public Answer login(HttpServletRequest request, @RequestParam("login") String login, @RequestParam("password") String password, HttpSession session) {
        boolean check = daoLogin.login(login, password);
        System.out.println("LOGIN: " + login);


        UserDetails user = new User(login, password, authorities);
        Authentication authentication = new UsernamePasswordAuthenticationToken(user, null, authorities);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        if(check) {
            session.setAttribute("user", new Login(login, password));
            return new SuccessAnswer<>("login", null, new Login(login, password));
        } else {
            session.removeAttribute("user");
            return new ErrorAnswer("login", null);
        }
        /*Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication1.getName();
        return currentPrincipalName;*/
    }

    @RequestMapping(value = "/test")
    public Answer test(HttpSession session) {
        final String command = "test";
        ActionServer actionServer = () -> new SuccessAnswer<>(command, "Authorization test success", true);
        return new AuthorizationTemplate(actionServer, session, command, daoLogin).answer();
    }

    @RequestMapping(value = "/secret")
    public String secret(HttpSession session) {
        return "secret";
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

    @RequestMapping(value = "/loginGoogle")
    public String googleTest(HttpSession session) {
        System.out.println("GOOGLE");
        return "loginGoogle!";
        /*session.setAttribute("test", "test");
        return login;*/
    }

    @RequestMapping("/user")
    public Map<String, Object> user(Principal principal, OAuth2Authentication auth) {
        //return principal;
        return (Map<String, Object>) auth.getUserAuthentication().getDetails();
    }
}
