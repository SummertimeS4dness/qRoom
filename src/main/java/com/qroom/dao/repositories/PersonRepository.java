package com.qroom.dao.repositories;

import com.qroom.dao.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
