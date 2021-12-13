package com.example.sping_portfolio.individual.raquib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class raquib2 {
    @GetMapping("/raq2")

    public String raquib2() {
        return "raq2";
    }
}
