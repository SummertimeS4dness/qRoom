package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long person_id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String icon;
    @Column
    private long icon_id;
    @Column
    private String phone;
    @Column
    private long login_id;

    public Person() { }

    public Person(String name, String surname, String icon, long icon_id, String phone, long login_id) {
        this.name = name;
        this.surname = surname;
        this.icon = icon;
        this.icon_id = icon_id;
        this.phone = phone;
        this.login_id = login_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(long icon_id) {
        this.icon_id = icon_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getLogin_id() {
        return login_id;
    }

    public void setLogin_id(long login_id) {
        this.login_id = login_id;
    }
}
