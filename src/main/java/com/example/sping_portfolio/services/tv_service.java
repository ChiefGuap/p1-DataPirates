package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.tv_entity;
import com.example.sping_portfolio.repositories.tv_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class tv_service {
    @Autowired
    private tv_repo jpa;

    //query all
    public List<tv_entity> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public tv_entity get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<tv_entity>listName(String term) {
        return jpa.findBynameContainingIgnoreCase(term);
    }

    public List<tv_entity>listGenre(String term) {
        return jpa.findBygenreContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(tv_entity entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}