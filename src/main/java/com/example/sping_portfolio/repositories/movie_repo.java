package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.movie_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface movie_repo extends JpaRepository<movie_entity, Long> {
    List<movie_entity> findBynameContainingIgnoreCase(String name);
    List<movie_entity> findBygenreContainingIgnoreCase(String genre);
}
