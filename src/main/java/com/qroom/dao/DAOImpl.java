package com.qroom.dao;

import com.qroom.dao.entities.Login;
import com.qroom.dao.entities.Person;
import com.qroom.dao.repositories.LoginRepository;
import com.qroom.dao.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOImpl implements DAO {
    private Map<String, String> loginPassword;
    private List<Person> persons;

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    PersonRepository personRepository;

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
            loginRepository.save(new Login(login, password));
            personRepository.save(new Person(login, name, surname, email, phone));
            persons.add(new Person(login, name, surname, email, phone));
            return true;
        }
        return false;
    }

    @Override
    public List<Person> test() {
        return  (List<Person>) personRepository.findAll();
        //return (List<Login>) loginRepository.findAll();
        //return null;
    }
}
