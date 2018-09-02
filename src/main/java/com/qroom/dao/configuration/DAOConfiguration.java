package com.qroom.dao.configuration;

import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.dao.*;
import com.qroom.dao.entities.File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Configuration
public class DAOConfiguration {
    @Bean
    public DAOLogin daoLogin() {
        return new DAOLoginImpl();
    }

    @Bean
    public DAOCourseView daoCourseView() {
        return new DAOCourseViewImpl();
    }

    @Bean
    public DAOFile daoFile() {
        return new DAOFile() {
            @Override
            public File getFile(String hash) throws IOException {

                return null;
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
                return false;
            }
        };
    }
}
