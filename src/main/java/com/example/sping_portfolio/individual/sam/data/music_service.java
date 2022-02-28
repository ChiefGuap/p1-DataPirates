package com.example.sping_portfolio.individual.sam.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class music_service {

    @Autowired
    private music_repo jpa;

    //query all
    public List<music> listAll() {
        return jpa.findAll();
    }

    //commit to db
    public void commit(music entry) {
        jpa.save(entry);
    }
}