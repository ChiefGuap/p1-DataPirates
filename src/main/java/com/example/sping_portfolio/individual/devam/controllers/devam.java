package com.example.sping_portfolio.individual.devam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class devam {
    @GetMapping("/devam")

    public String devam() {
        return "devam";
    }
}