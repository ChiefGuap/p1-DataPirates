package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.services.ex_db_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//add to db
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
    public String test_db_commit(@RequestParam("testString") String testString,
                                 @RequestParam("testInt") int testInt) {
        //commit to database
        ex_db_entity dbEntry = new ex_db_entity();

        dbEntry.setTestString(testString);
        dbEntry.setTestInt(testInt);

        ex_db.commit(dbEntry);

        return "redirect:/test_db";
    }

    //edit db entry
    @GetMapping("/test_db/edit")
    public String test_db_edit(Model model) {
        //query database
        List<ex_db_entity> list = ex_db.listALl();

        model.addAttribute("dbQuery", list);

        return "test_db_edit";
    }

    @PostMapping("/test_db/edit")
    public String test_db_edit(@RequestParam("id") long id, @RequestParam("testString") String testString,
                               @RequestParam("testInt") int testInt) {
        //commit to database
        ex_db_entity dbEntry = new ex_db_entity();

        dbEntry.setId(id);
        dbEntry.setTestString(testString);
        dbEntry.setTestInt(testInt);

        ex_db.commit(dbEntry);

        return "redirect:/test_db";
    }


    //delete db entry
    @GetMapping("/test_db/delete")
    public String test_db_delete(Model model) {
        //query database
        List<ex_db_entity> list = ex_db.listALl();

        model.addAttribute("dbQuery", list);

        return "test_db_delete";
    }

    @PostMapping("/test_db/delete")
    public String test_db_commit(@RequestParam("id") long id) {
        //commit to database
        ex_db.delete(id);

        return "redirect:/test_db";
    }
}