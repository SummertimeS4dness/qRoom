package com.qroom.dao.repositories;

import com.qroom.dao.entities.Course;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository {
    @Query(value = "SELECT * FROM course WHERE course.code=?1", nativeQuery = true)
    Course getCourseInfo(String code);
}
