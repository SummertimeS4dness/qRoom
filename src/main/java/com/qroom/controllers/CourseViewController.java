package com.qroom.controllers;

import com.qroom.dao.DAOLogin;
import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseViewController {
    @Autowired
    DAOLogin daoLogin;

    @RequestMapping(value = "/getCourseInfo")
    public Course getCourseInfo(@RequestParam("id") String id) {
        return null;
    }

    @RequestMapping(value = "/getCourseNews")
    public List<News> news() {
        return null;
    }
}
