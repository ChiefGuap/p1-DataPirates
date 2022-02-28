package com.example.sping_portfolio.API;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class sam_apicontroller {

    @GetMapping("/sam_frq")
        public String returnSamFRQ() {
            return "/sam/sam_frq";
        }

    @GetMapping("/sam_api")
    public String News(Model model) throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://mdblist.p.rapidapi.com/?s=jaws"))
                .header("x-rapidapi-host", "mdblist.p.rapidapi.com")
                .header("x-rapidapi-key", "7a79b8a230mshff68040a0bd2bf0p1174f8jsnf85b178f3369")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

        model.addAttribute("data", jo.get("search"));
        System.out.println(jo.get("search"));
        return "/sam/sam_api";
    }
}



