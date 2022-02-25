package com.example.sping_portfolio.individual.raquib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class raquib {
    @GetMapping("/raquib")

    public String raquib() {
        return "raq/raquib";
    }
}