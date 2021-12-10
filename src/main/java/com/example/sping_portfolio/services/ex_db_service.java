package com.example.sping_portfolio.services;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.repositories.ex_db_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//methods for interacting with database
@Service
@Transactional
public class ex_db_service {
    @Autowired
    private ex_db_repo jpa;

    //query all
    public List<ex_db_entity> listALl() {
        return jpa.findAll();
    }

    //query based on specific id
    public ex_db_entity get(long id){
        return jpa.findById(id).get();
    }

    //query based on search, defined in repository
    public List<ex_db_entity>listLike(String term) {
        return jpa.findBytestStringContainingIgnoreCase(term);
    }

    //commit to db
    public void commit(ex_db_entity entry) {
        jpa.save(entry);
    }

    //delete from db
    public void delete(long id){
        jpa.deleteById(id);
    }
}
