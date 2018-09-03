package com.qroom.dao.repositories;

import com.qroom.dao.entities.File;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileRepository/* extends CrudRepository<File, Long>*/ {
    @Query(value = "SELECT * FROM file WHERE file.hash=?1", nativeQuery = true)
    List<File> getFileByHash(String hash);
}
