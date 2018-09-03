package com.qroom.dao;

import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.StudyObject;

import java.util.List;

public interface DAOCourse {
    List<StudyObject> getAllStudyObject();
    List<Long> getNewsForCourse(long id);
    Course getCourseByMessage(long id);
}
