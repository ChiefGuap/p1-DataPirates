package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.tv_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface tv_repo extends JpaRepository<tv_entity, Long> {
    List<tv_entity> findBynameContainingIgnoreCase(String name);
    List<tv_entity> findBygenreContainingIgnoreCase(String genre);
}
