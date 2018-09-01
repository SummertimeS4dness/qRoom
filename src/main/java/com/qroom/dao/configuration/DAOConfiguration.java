package com.qroom.dao.configuration;

import com.qroom.dao.DAOCourseView;
import com.qroom.dao.DAOLogin;
import com.qroom.dao.DAOLoginImpl;
import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
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
        return new DAOCourseView() {
            @Override
            public Course getCourse(String code) {
                return null;
            }

            @Override
            public List<News> getNewsByCourse(long id) {
                return null;
            }

            @Override
            public List<StudyObject> getContentsByCourse(long id) {
                return null;
            }

            @Override
            public StudyObject getContent(long id) {
                return null;
            }
        };
    }
}
