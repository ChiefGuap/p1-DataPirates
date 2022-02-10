package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.login_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//query methods
public interface login_repo extends JpaRepository<login_entity, Long> {
    //find values in ex_db_entity based on search
    List<login_entity> findBytestStringContainingIgnoreCase(String testString);
}