package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entities.movie_entity;
import com.example.sping_portfolio.entities.tv_entity;
import com.example.sping_portfolio.services.movie_service;
import com.example.sping_portfolio.services.tv_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/our10movies")
    public String our10movies_post(@RequestParam("genre") String term, Model model) {
        //query database
        List<movie_entity> list = movie.listGenre(term);

        model.addAttribute("media", "Movies");

        model.addAttribute("query", list);

        return "display";
    }

    @GetMapping("/our10shows")
    public String our10shows(Model model) {
        //query database
        List<tv_entity> list = tv.listALl();

        model.addAttribute("media", "Movies");

        model.addAttribute("query", list);

        return "display";
    }

    @PostMapping("/our10shows")
    public String our10shows_post(@RequestParam("genre") String term, Model model) {
        //query database
        List<tv_entity> list = tv.listGenre(term);

        model.addAttribute("media", "Movies");

        model.addAttribute("query", list);

        return "display";
    }

    @GetMapping("/add")
    public String add(Model model){
        List<movie_entity> movie_list = movie.listALl();

        model.addAttribute("movies", movie_list);
        return "add";
    }

    @PostMapping("/add")
    public String add_post(@RequestParam("media") int media,
                           @RequestParam("name") String name,
                           @RequestParam("genre") String genre,
                           @RequestParam("length") String length,
                           @RequestParam("rank") int rank,
                           Model model){

        movie_entity commit = new movie_entity(name, genre, length, rank);
        movie.commit(commit);

        return "redirect:/add";
    }

    @GetMapping("/edit")
    public String edit(Model model){
        List<movie_entity> movie_list = movie.listALl();

        model.addAttribute("movies", movie_list);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit_post(@RequestParam("function") int function,
                            @RequestParam("id") Long id,
                            @RequestParam("name") String name,
                            @RequestParam("genre") String genre,
                            @RequestParam("length") String length,
                            @RequestParam("rank") int rank,
                           Model model){

        if (function == 0) {
            movie_entity commit = new movie_entity(name, genre, length, rank);
            commit.setId(id);
            movie.commit(commit);
        }
        else {
            movie.delete(id);
        }



        return "redirect:/edit";
    }
}