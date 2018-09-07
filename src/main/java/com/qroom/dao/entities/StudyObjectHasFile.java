package com.qroom.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class StudyObjectHasFile {
    @Column
    private long study_object_id;
    @Column
    private long file_id;

    public StudyObjectHasFile(){}

    public StudyObjectHasFile(long study_object_id, long file_id) {
        this.study_object_id = study_object_id;
        this.file_id = file_id;
    }

    public long getStudy_object_id() {
        return study_object_id;
    }

    public void setStudy_object_id(long study_object_id) {
        this.study_object_id = study_object_id;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
    }
}
