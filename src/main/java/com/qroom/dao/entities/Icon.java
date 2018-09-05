package com.qroom.dao.entities;

import javax.persistence.*;

@Entity
public class Icon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long icon_id;
    @Column
    private long file_id;

    public Icon(){}

    public Icon(long file_id) {
        this.file_id = file_id;
    }

    public long getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(long icon_id) {
        this.icon_id = icon_id;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
    }
}
