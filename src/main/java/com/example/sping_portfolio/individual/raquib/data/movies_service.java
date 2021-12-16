package com.example.sping_portfolio.individual.raquib.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class movies_service {

    @Autowired
    private movies_repo jpa;

    //query all
    public List<movies> listAll() {
        return jpa.findAll();
    }

    //commit to db
    public void commit(movies entry) {
        jpa.save(entry);
    }
}