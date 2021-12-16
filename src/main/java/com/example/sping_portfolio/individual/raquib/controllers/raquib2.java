package com.example.sping_portfolio.individual.raquib.controllers;

import com.example.sping_portfolio.individual.raquib.data.movies;
import com.example.sping_portfolio.individual.raquib.data.movies_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class raquib2 {
    @Autowired
    private movies_service db;

    @GetMapping("/raq2")
    public String raquib2() {
        return "raq2";
    }

    @GetMapping("/raq/movies")
    public String movies (Model model) {
        List<movies> list = db.listAll();

        model.addAttribute("movie_query", list);

        return "raquibdb";
    }

    @PostMapping("/raq/movies")
    public String movies_commit(@RequestParam("name") String name, @RequestParam("genre") String genre) {

        movies entry = new movies();

        entry.setName(name);
        entry.setGenre(genre);
        db.commit(entry);

        return "redirect:/billy/schedule";
    }
}