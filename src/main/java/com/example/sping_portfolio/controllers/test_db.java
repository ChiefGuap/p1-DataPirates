package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.services.ex_db_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class test_db {
    @Autowired
    private ex_db_service ex_db;

    @GetMapping("/test_db")
    public String test_db_render(Model model) {
        //query database
        List<ex_db_entity> list = ex_db.listALl();

        model.addAttribute("dbQuery", list);

        return "test_db";
    }

    @PostMapping("/test_db")
    public String test_db_commit(@RequestParam("testString")String testString,
                                 @RequestParam("testInt")int testInt,
                                 Model model) {
        //commit to database
        ex_db_entity dbEntry = new ex_db_entity();

        dbEntry.setTestString(testString);
        dbEntry.setTestInt(testInt);

        ex_db.commit(dbEntry);

        return "redirect:/test_db";
    }
}