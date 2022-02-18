package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class about {
    @GetMapping("/about")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String about() {
        return "about"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/search")
    public String search() {
        return "search"; // returns HTML VIEW (main search html)
    }

    @GetMapping("/testsearch")
    public String testsearch() {
        return "testsearch"; // returns HTML VIEW (testing search html)
    }

    @GetMapping("/searchDirections")
    public String searchDirections() {
        return "searchDirections"; // returns HTML VIEW (directions of search in the iframe)
    }


    @GetMapping("/featuredmovies")
    public String featuredmovies() {
        return "featuredmovies"; // returns HTML VIEW (greeting)
    }
}



