package com.example.sping_portfolio.repositories;

import com.example.sping_portfolio.entities.anime_rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//query methods
// this defines the methods we can use in the service.
// JPA includes most of these methods already but we had to create the Jpa object here.

public interface anime_rating_repo extends JpaRepository<anime_rating, Long> {
    //find values in Anime_rating_Entity based on search
    List<anime_rating> findBynameContainingIgnoreCase(String testString);
}