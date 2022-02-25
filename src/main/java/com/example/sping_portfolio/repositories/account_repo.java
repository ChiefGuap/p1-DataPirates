package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.account_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//query methods
public interface account_repo extends JpaRepository<account_entity, Long> {
    //find values in ex_db_entity based on search
    List<account_entity> findByusernameContainingIgnoreCase(String testString);
}