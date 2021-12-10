package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.repositories.ex_db_repo;
import com.example.sping_portfolio.services.ex_db_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class test_db {
    @Autowired
    private ex_db_service ex_db;

    @GetMapping("/test_db")

    public String dylan(@RequestParam(name = "testStringinput", required = false, defaultValue = "test3")String testStringinput,
                        @RequestParam(name = "testIntinput", required = false, defaultValue = "3")Integer testIntinput,
                        Model model) {

        List<ex_db_entity> list = ex_db.listALl();

        model.addAttribute("dbQuery", list);


        ex_db_entity dbEntry = new ex_db_entity();

        dbEntry.setTestString(testStringinput);
        dbEntry.setTestInt(testIntinput);

        ex_db.commit(dbEntry);

        return "test_db";
    }

}