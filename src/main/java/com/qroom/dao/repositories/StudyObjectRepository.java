package com.qroom.dao.repositories;

import com.qroom.dao.entities.StudyObject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudyObjectRepository extends CrudRepository<StudyObject, Long> {
    @Query(value = "SELECT * FROM study_object WHERE study_object.course=?1", nativeQuery = true)
    List<StudyObject> getContentsByCourse(long id);

    @Query(value = "SELECT * FROM study_object WHERE study_object.id=?1", nativeQuery = true)
    List<StudyObject> getContent(long id);

}
