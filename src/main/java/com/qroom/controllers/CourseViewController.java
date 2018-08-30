package com.qroom.controllers;

import com.qroom.dao.DAO;
import com.qroom.dao.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseViewController {
    @Autowired
    DAO dao;

    @RequestMapping(value = "/getCourseInfo")
    public Course getCourseInfo(@RequestParam("id") String id) {
        return null;
    }

    /*@RequestMapping(value = "/getCourseNews")
    public*/
}
