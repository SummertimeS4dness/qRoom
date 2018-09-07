package com.qroom.dao.repositories;

import com.qroom.dao.entities.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Query(value = "SELECT * FROM person WHERE person.login=?1", nativeQuery = true)
    Person getPersonByLogin(String login);

    @Transactional
    @Modifying
    @Query(value = "UPDATE person SET name=?2 WHERE person_id=?1", nativeQuery = true)
    void setName(long id, String name);

    @Transactional
    @Modifying
    @Query(value = "UPDATE person SET surname=?2 WHERE person_id=?1", nativeQuery = true)
    void setSurname(long id, String surname);

    @Transactional
    @Modifying
    @Query(value = "UPDATE person SET phone=?2 WHERE person_id=?1", nativeQuery = true)
    void setPhone(long id, String phone);

    @Transactional
    @Modifying
    @Query(value = "UPDATE person SET icon_id=?2 WHERE person_id=?1", nativeQuery = true)
    void setIcon(long id, long icon);

    @Query(value = "SELECT file.path FROM person JOIN icon ON (person.icon_id=icon.icon_id) JOIN file ON " +
            "(icon.file_id=file.file_id) WHERE person.person_id=?1", nativeQuery = true)
    long getIcon(long id);
}
