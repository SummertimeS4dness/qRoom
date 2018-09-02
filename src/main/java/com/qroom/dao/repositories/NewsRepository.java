package com.qroom.dao.repositories;

import com.qroom.dao.entities.Course;
import com.qroom.dao.entities.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository /*extends CrudRepository<News, Long>*/ {
    @Query(value = "SELECT * FROM news WHERE news.course=?1", nativeQuery = true)
    List<News> getNewsForCourse(long id);
}
