package com.qroom.dao;

import com.qroom.dao.entities.Login;
import com.qroom.dao.entities.Person;
import com.qroom.dao.repositories.LoginRepository;
import com.qroom.dao.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class DAOLoginImpl implements DAOLogin {

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    PersonRepository personRepository;

    @Override
    public boolean login(String login, String password) {
        return password.equals(loginRepository.findById(login).get().getLogin());
    }

    @Override
    public boolean register(String login, String password, String name, String surname, String email, String phone) {
        if(!loginRepository.existsById(login)) {
            personRepository.save(new Person(login, name, surname, email, phone));
            loginRepository.save(new Login(login, password));
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
