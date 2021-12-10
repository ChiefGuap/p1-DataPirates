package com.example.sping_portfolio.individual.dylan.controllers;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.repositories.ex_db_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class dylan {
    @Autowired
    private ex_db_repo repository;

    @GetMapping("/dylan")

    public String dylan(Model model) {

        List<ex_db_entity> list = repository.findAll();

        System.out.println(list);
        
        return "dylan";
    }
}