package com.example.sping_portfolio.individual.billy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class billy {
    @GetMapping("/billy")

    public String billy() {
        return "billy";
    }
}