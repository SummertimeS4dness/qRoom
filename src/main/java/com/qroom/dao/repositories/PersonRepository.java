package com.qroom.dao.repositories;

import com.qroom.dao.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Query(value = "SELECT * FROM person WHERE person.login=?1", nativeQuery = true)
    Person getPersonByLogin(String login);
}
