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

    // GET request, no parameters
    @GetMapping("/sam_apicontroller")
    public String News(Model model) throws IOException, InterruptedException, ParseException {
        //api setup:
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://data-imdb1.p.rapidapi.com/genres/"))
		.header("x-rapidapi-host", "data-imdb1.p.rapidapi.com")
		.header("x-rapidapi-key", "32750fe179msh1b6c52dc5ff6064p1aca8djsnc4892ff52ca2")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    // System.out.println(response.body());

        //alternative #2: convert response.body() to JSON object
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

//        System.out.println(jo.get("data"));
        model.addAttribute("data", jo.get("d" ));
        System.out.println(jo.get("d"));

        return "sam_apicontroller";
    }
}

