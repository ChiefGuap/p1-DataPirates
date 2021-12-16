package com.example.sping_portfolio.individual.billy.controllers;

import com.example.sping_portfolio.individual.billy.data.schedule;
import com.example.sping_portfolio.individual.billy.data.schedule_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class billy {
    @Autowired
    private schedule_service db;

    @GetMapping("/billy")
    public String billy() {
        return "billy";
    }

    //database
    @GetMapping("/billy/schedule")
    public String schedule(Model model) {
        List<schedule> list = db.listAll();

        model.addAttribute("schedule_query", list);

        return "billydb";
    }

    @PostMapping("/billy/schedule")
    public String schedule_comit(@RequestParam("period") int period,
                                 @RequestParam("name") String name,
                                 @RequestParam("room") String room) {

        schedule entry = new schedule();
        entry.setPeriod(period);
        entry.setName(name);
        entry.setRoom(room);

        db.commit(entry);
        return "redirect:/billy/schedule";
    }
}