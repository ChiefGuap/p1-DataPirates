package com.example.sping_portfolio.individual.dylan.classes.services;

import com.example.sping_portfolio.individual.dylan.classes.entities.schedule;
import com.example.sping_portfolio.individual.dylan.classes.repositories.schedule_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class schedule_service {

    @Autowired
    private schedule_repo jpa;

    //query all
    public List<schedule> listAll() {
        return jpa.findAll();
    }

    //commit to db
    public void commit(schedule entry) {
        jpa.save(entry);
    }
}