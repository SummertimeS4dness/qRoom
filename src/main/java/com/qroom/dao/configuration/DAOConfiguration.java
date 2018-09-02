package com.qroom.dao.configuration;

import com.qroom.dao.DAOCourseView;
import com.qroom.dao.DAOCourseViewImpl;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.DAOLoginImpl;
import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
import com.qroom.dao.repositories.CourseRepository;
import com.qroom.dao.repositories.NewsRepository;
import com.qroom.dao.repositories.StudyObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DAOConfiguration {
    @Bean
    public DAOLogin daoLogin() {
        return new DAOLoginImpl();
    }

    @Bean
    public DAOCourseView daoCourseView() {
        return new DAOCourseViewImpl();
    }
}
