package com.qroom.dao;

import com.qroom.dao.entities.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOImpl implements DAO {
    private Map<String, String> loginPassword;
    private List<Person> persons;

    public DAOImpl() {
        loginPassword = new HashMap<>();
        persons = new ArrayList<>();
        loginPassword.put("1", "1");
    }

    @Override
    public boolean login(String login, String password) {
        return password.equals(loginPassword.get(login));
    }

    @Override
    public boolean register(String login, String password, String name, String surname, String email, String phone) {
        if(!loginPassword.containsKey(login)) {
            loginPassword.put(login, password);
            persons.add(new Person(login, name, surname, email, phone));
            return true;
        }
        return false;
    }
}
