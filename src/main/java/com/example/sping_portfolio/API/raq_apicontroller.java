package com.example.sping_portfolio.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class raq_apicontroller {
    @GetMapping("/raq_api")

    public String raq_api() {
        return "raq_api";
    }
}
