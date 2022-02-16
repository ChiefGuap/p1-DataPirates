package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.services.login_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class account {
    @Autowired
    private login_service db;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login_post(@RequestParam("user") String user,
                             @RequestParam("pass") String pass) {
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup_post(@RequestParam("user") String username,
                              @RequestParam("pass") String password,
                              @RequestParam("pass_confirm") String pass_confirm) {
        return "redirect:/login";
    }
}