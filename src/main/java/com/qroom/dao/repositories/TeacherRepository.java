package com.qroom.dao.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository /*extends CrudRepository<Teacher, Long>*/ {
    @Query(value = "SELECT course.teacher FROM course WHERE course.id=?1", nativeQuery = true)
    long getTeacherByCourse(long id);
}
