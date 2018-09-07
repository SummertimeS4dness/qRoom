package com.qroom.dao;

import com.qroom.dao.entities.Person;

public interface DAOPerson {
    Person getPersonByLogin(String login);
    boolean setName(long id, String name);
    boolean setSurname(long id, String surname);
    boolean setIcon(long id, long icon);
    boolean setPhone(long id, String phone);
    String getIcon(long id);
}
