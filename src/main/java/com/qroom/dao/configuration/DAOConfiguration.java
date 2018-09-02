package com.qroom.dao.configuration;

import com.qroom.dao.DAOCourseView;
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
        return new DAOCourseView() {
            //@Autowired
            NewsRepository newsRepository;

            //@Autowired
            CourseRepository courseRepository;

            //@Autowired
            StudyObjectRepository studyObjectRepository;

            @Override
            public Course getCourse(String code) {
                return courseRepository.getCourseInfo(code);
            }

            @Override
            public List<News> getNewsByCourse(long id) {
                return newsRepository.getNewsForCourse(id);
            }

            @Override
            public List<StudyObject> getContentsByCourse(long id) {
                return studyObjectRepository.getContentsByCourse(id);
            }

            @Override
            public StudyObject getContent(long id) {
                return studyObjectRepository.getContent(id).get(0);
            }
        };
    }
}
