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
        return "search"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/testsearch")
    public String testsearch() {
        return "testsearch"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/billyfrq")
    public String billyfrq() {
        return "billy/billyfrq"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/featuredmovies")
    public String featuredmovies() {
        return "featuredmovies"; // returns HTML VIEW (greeting)
    }
}



