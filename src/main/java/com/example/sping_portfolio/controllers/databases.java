package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.ex_db_entity;
import com.example.sping_portfolio.entities.movie_entity;
import com.example.sping_portfolio.services.movie_service;
import com.example.sping_portfolio.services.tv_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class databases {
    @Autowired
    private movie_service movie;
    private tv_service tv;

    @GetMapping("/our10movies")
    public String our10movies(Model model) {
        //query database
        List<movie_entity> list = movie.listALl();

        model.addAttribute("media", "Movies");

        model.addAttribute("query", list);

        return "display";
    }
}
