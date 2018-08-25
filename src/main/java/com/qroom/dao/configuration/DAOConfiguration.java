package com.qroom.dao.configuration;

import com.qroom.dao.DAO;
import com.qroom.dao.DAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfiguration {
    @Bean
    public DAO dao() {
        return new DAOImpl();
    }
}
