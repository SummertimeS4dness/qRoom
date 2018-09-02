package com.qroom.dao;

import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import com.qroom.dao.entities.StudyObject;

import java.util.List;

public interface DAOCourseView {
    Course getCourse(String code);
    List<News> getNewsByCourse(long id);
    List<StudyObject> getContentsByCourse(long id);
    StudyObject getContent(long id);
    News getNewsById(long id);
}
