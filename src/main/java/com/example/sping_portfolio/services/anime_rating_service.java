package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.anime_rating;
import com.example.sping_portfolio.repositories.anime_rating_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class anime_rating_service {
    @Autowired
    // This uses methods from our JPA repesitory
    // This file creates the methods we use in the backend
    // Methods below are the repository methods
    private anime_rating_repo jpa;

    //query all
    public List<anime_rating> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public anime_rating get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<anime_rating>listLike(String term) {
        return jpa.findBynameContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(anime_rating entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}