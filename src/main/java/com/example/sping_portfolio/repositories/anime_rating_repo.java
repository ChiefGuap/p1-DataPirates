package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.anime_rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//query methods
public interface anime_rating_repo extends JpaRepository<anime_rating, Long> {
    //find values in ex_db_entity based on search
    List<anime_rating> findBynameContainingIgnoreCase(String testString);
}