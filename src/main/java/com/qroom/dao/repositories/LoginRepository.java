package com.qroom.dao.repositories;

import com.qroom.dao.entities.Login;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, String> {
    @Query(value = "SELECT login_id FROM login WHERE login.email=?1", nativeQuery = true)
    long getIdByEmail(String email);
}