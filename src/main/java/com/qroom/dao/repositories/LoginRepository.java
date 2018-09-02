package com.qroom.dao.repositories;

import com.qroom.dao.entities.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, String> {
}