package com.qroom.dao.entities;

public class Teacher {
    private int id;
    private String about;
    private int payment;

    public Teacher() { }

    public Teacher(int id, String about, int payment) {
        this.id = id;
        this.about = about;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
