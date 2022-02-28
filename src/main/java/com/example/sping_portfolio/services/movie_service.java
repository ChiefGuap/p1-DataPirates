package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.movie_entity;
import com.example.sping_portfolio.repositories.movie_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class movie_service {
    @Autowired
    private movie_repo jpa;

    //query all
    public List<movie_entity> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public movie_entity get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<movie_entity>listName(String term) {
        return jpa.findBynameContainingIgnoreCase(term);
    }

    public List<movie_entity>listGenre(String term) {
        return jpa.findBygenreContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(movie_entity entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}