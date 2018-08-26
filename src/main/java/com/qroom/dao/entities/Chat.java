package com.qroom.dao.entities;

public class Chat {
    private int persone;
    private int course;

    public Chat() { }

    public Chat(int persone, int course) {
        this.persone = persone;
        this.course = course;
    }

    public int getPersone() {
        return persone;
    }

    public void setPersone(int persone) {
        this.persone = persone;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
