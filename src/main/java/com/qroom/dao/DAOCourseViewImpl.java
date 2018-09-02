package com.qroom.dao;

import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
import com.qroom.dao.repositories.CourseRepository;
import com.qroom.dao.repositories.NewsRepository;
import com.qroom.dao.repositories.StudyObjectRepository;

import java.util.List;

public class DAOCourseViewImpl implements DAOCourseView {
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
        List<StudyObject> list = studyObjectRepository.getContent(id);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public News getNewsById(long id) {
        List<News> list = newsRepository.getNewsById(id);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
