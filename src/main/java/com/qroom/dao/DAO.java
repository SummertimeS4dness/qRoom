package com.qroom.dao;

import com.qroom.dao.entities.Login;
import com.qroom.dao.entities.Person;

import java.util.List;

public interface DAO {
    public List<Person> test();
    public boolean login(String login, String password);
    public boolean register(String login, String password, String name, String surname, String email, String phone);
}
