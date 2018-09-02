package com.qroom.dao;

import com.qroom.dao.entities.File;
import com.qroom.dao.repositories.FileRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class DAOFileImpl implements DAOFile {
    //@Autowired
    FileRepository fileRepository;

    @Override
    public File getFile(String hash) {
        List<File> list = fileRepository.getFileByHash(hash);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public String save(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        java.io.File dir = new java.io.File("files");
        if (!dir.exists())
            dir.mkdirs();

        //--- сохранение в базу данных

        //---
        String name = ""; // хеш номера файла
        java.io.File serverFile = new java.io.File(dir.getAbsolutePath()
                + java.io.File.separator + name);
        BufferedOutputStream stream = new BufferedOutputStream(
                new FileOutputStream(serverFile));
        stream.write(bytes);
        stream.close();
        return name;
    }

    @Override
    public boolean delete(String hash) {
        java.io.File file = new java.io.File("D:/" + hash);
        return file.delete();
    }
}
