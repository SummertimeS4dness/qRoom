package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long login_id;
    @Column
    private String email;
    @Column
    private String password;

    public Login() { }

    public Login(String email, String password) {
        this.login_id = login_id;
        this.email = email;
        this.password = password;
    }

    public long getLogin_id() {
        return login_id;
    }

    public void setLogin_id(long login_id) {
        this.login_id = login_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
