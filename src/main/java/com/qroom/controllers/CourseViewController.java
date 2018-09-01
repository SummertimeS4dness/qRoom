package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.dao.DAOCourseView;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseViewController {
    @Autowired
    DAOLogin daoLogin;

    @Autowired
    DAOCourseView daoCourseView;

    @RequestMapping(value = "/getCourseInfo")
    public Answer getCourseInfo(@RequestParam("id") String id) {
        return new SuccessAnswer<>("getCourseInfo", null, daoCourseView.getCourse(id));
    }

    @RequestMapping(value = "/getCourseNews")
    public Answer news(@RequestParam("id") long id) {
        return new SuccessAnswer<>("getCourseContents", null, daoCourseView.getNewsByCourse(id));
    }

    @RequestMapping(value = "/getCourseContents")
    public Answer contents(@RequestParam("id") long id) {
        return new SuccessAnswer<>("getCourseContents", null, daoCourseView.getContentsByCourse(id));
    }

    @RequestMapping(value = "/getContentById")
    public Answer content(@RequestParam("id") long id) {
        return new SuccessAnswer<>("getContentById", null, daoCourseView.getContent(id));
    }
}
