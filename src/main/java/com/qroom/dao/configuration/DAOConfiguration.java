package com.qroom.dao.configuration;

import com.qroom.dao.DAOLogin;
import com.qroom.dao.DAOLoginImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfiguration {
    @Bean
    public DAOLogin dao() {
        return new DAOLoginImpl();
    }
}
