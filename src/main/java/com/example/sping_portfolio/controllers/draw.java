package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class draw {
    @GetMapping("/draw")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String draw(@RequestParam(name = "x", required=false, defaultValue = "0")int x,
    @RequestParam(name = "y", required=false, defaultValue = "0")int y,
    Model model) {

        //model.addAttribute("x", x);
        //model.addAttribute("y", y);
        return "draw"; // returns HTML VIEW (greeting)
    }
}