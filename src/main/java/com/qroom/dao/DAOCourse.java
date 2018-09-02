package com.qroom.dao;

import com.qroom.dao.entities.StudyObject;

import java.util.List;

public interface DAOCourse {
    public List<StudyObject> getAllStudyObject();
    public List<Long> getNewsForCourse(long id);
}
