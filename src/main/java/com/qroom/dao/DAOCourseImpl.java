package com.qroom.dao;

import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;
import com.qroom.dao.repositories.NewsRepository;

import java.util.ArrayList;
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
    public List<Long> getNewsForCourse(long id) {
        List<Long> list = new ArrayList<>();
        List<News> news = newsRepository.getNewsForCourse(id);
        for (News n : news) {
            list.add((long)n.getId());
        }
        return list;
    }
}
