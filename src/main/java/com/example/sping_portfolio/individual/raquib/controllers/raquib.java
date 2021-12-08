package com.example.sping_portfolio.individual.raquib.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class raquib {
    @GetMapping("../individual_pages/raq/raquib.html")

    public String raquib() {
        return "raquib";
    }
}