package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long file_id;
    @Column
    private String name;
    @Column
    private String path;
    @Column
    private long person_id;

    public File() { }

    public File(String name, String path, long person_id) {
        this.name = name;
        this.path = path;
        this.person_id = person_id;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }
}
