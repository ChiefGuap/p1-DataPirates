package com.example.sping_portfolio.individual.dylan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dylan {
    @GetMapping("/dylan")

    public String dylan() {
        return "dylan/dylan";
    }
}