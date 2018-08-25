package com.qroom.dao;

public interface DAO {
    public boolean login(String login, String password);
    public boolean register(String login, String password, String name, String surname, String email, String phone);
}
