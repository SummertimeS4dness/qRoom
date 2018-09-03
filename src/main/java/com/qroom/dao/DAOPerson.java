package com.qroom.dao;

import com.qroom.dao.entities.Person;

public interface DAOPerson {
    Person getPersonByLogin(String login);
}
