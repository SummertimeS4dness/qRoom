package com.qroom.dao;

import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
import com.qroom.dao.repositories.NewsRepository;
import com.qroom.dao.repositories.StudyObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DAOCourseImpl implements DAOCourse {
    //@Autowired
    //StudyObjectRepository studyObjectRepository;

    //@Autowired
    NewsRepository newsRepository;

    @Override
    public List<StudyObject> getAllStudyObject() {
        //return studyObjectRepository.findAll();
        return null;
    }

    @Override
    public List<News> getNewsForCourse(int id) {
        return newsRepository.getNewsForCourse(id);
        //return null;
    }
}
