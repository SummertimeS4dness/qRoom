package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.controllers.answers.templates.AuthorizationTemplate;
import com.qroom.dao.DAOCourseView;
import com.qroom.dao.DAOLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class CourseViewController {
    @Autowired
    DAOLogin daoLogin;

    @Autowired
    DAOCourseView daoCourseView;

    @RequestMapping(value = "/getCourseInfo")
    public Answer getCourseInfo(@RequestParam("id") String id, HttpSession session) {
        final String command = "getCourseInfo";
        return new AuthorizationTemplate(() -> new SuccessAnswer<>(command, null, daoCourseView.getCourse(id)),
                session, command, daoLogin).answer();
    }

    @RequestMapping(value = "/getCourseNews")
    public Answer news(@RequestParam("id") long id, HttpSession session) {
        final String command = "getCourseContents";
        return new AuthorizationTemplate(() -> new SuccessAnswer<>(command, null, daoCourseView.getNewsByCourse(id)),
                session, command, daoLogin).answer();
    }

    @RequestMapping(value = "/getCourseContents")
    public Answer contents(@RequestParam("id") long id, HttpSession session) {
        final String command = "getCourseContents";
        return new AuthorizationTemplate(() -> new SuccessAnswer<>(command, null, daoCourseView.getContentsByCourse(id)),
                session, command, daoLogin).answer();
    }

    @RequestMapping(value = "/getContentById")
    public Answer content(@RequestParam("id") long id, HttpSession session) {
        final String command = "getContentById";
        return new AuthorizationTemplate(() -> new SuccessAnswer<>(command, null, daoCourseView.getContent(id)),
                session, command, daoLogin).answer();
    }

    @RequestMapping(value = "/getNewsById")
    public Answer newsById(@RequestParam("id") long id, HttpSession session) {
        final String command = "getNewsById";
        return new AuthorizationTemplate(() -> new SuccessAnswer<>(command, null, daoCourseView.getNewsById(id)),
                session, command, daoLogin).answer();
    }



}
