package com.qroom.dao.configuration;

import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.dao.*;
import com.qroom.dao.entities.File;
import com.qroom.dao.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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
        return new DAOFileImpl();
    }
}
