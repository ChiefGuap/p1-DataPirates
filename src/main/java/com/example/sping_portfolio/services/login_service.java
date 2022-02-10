package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.login_entity;
import com.example.sping_portfolio.repositories.login_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class login_service {
    @Autowired
    private login_repo jpa;

    //query all
    public List<login_entity> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public login_entity get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<login_entity>listLike(String term) {
        return jpa.findBytestStringContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(login_entity entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}