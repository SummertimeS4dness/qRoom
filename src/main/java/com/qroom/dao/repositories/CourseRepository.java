package com.qroom.dao.repositories;

import com.qroom.dao.entities.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    @Query(value = "SELECT * FROM course WHERE course.code=?1", nativeQuery = true)
    Course getCourseInfo(String code);
}
