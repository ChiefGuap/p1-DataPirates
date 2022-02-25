package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.account_entity;
import com.example.sping_portfolio.repositories.account_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class account_service {
    @Autowired
    private account_repo jpa;

    //query all
    public List<account_entity> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public account_entity get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<account_entity>listLike(String term) {
        return jpa.findByusernameContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(account_entity entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}