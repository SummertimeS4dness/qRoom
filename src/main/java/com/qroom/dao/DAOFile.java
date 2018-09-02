package com.qroom.dao;

import com.qroom.dao.entities.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DAOFile {
    File getFile(String hash) throws IOException;
    String save(MultipartFile multipartFile) throws IOException;
    boolean delete(String hash);
}
