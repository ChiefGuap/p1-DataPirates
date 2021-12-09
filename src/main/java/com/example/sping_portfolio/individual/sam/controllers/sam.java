package com.example.sping_portfolio.individual.sam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sam {
    @GetMapping("/sam")

    public String sam() {
        return "sam";
    }
}