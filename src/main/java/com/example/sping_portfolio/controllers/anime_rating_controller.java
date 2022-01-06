package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.anime_rating;
import com.example.sping_portfolio.services.anime_rating_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class anime_rating_controller {
    @Autowired
    private anime_rating_service ar;

    //Edit Rating List
    @GetMapping("/ar2022/admin")
    public String schedule(Model model) {
        //query database
        List<anime_rating> ar_query = ar.listALl();

        model.addAttribute("ar_query", ar_query);
        return "anime_rating";
    }

    @PostMapping("/ar2022/admin")
    public String schedule(@RequestParam("rank") int rank,
                           @RequestParam("name") String name,
                           @RequestParam("rating") int rating,
                           @RequestParam("review") String review) {

        //commit to db
        anime_rating entry = new anime_rating(rank, name, rating, review);
        ar.commit(entry);

        return "anime_rating";
    }
}