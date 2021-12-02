package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.ex_db_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//query methods
public interface ex_db_repo extends JpaRepository<ex_db_entity, Long>{
    //find values in ex_db_entity based on search
    //List<ex_db_entity> findBytestStringContainingIgnoreCase(String testString);
}
