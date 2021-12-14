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

class LightSequence {
    String sequence;

    public LightSequence(String sequence) {
        this.sequence = sequence;
    }

    public String insertSegment(String segment, int ind) {
        StringBuilder sb = new StringBuilder(segment);
        sb.insert(ind, segment);
        return sb.toString();
    }

    public void changeSequence(String sequence) {
        this.sequence = sequence;
    }

    public void display() {
        System.out.println(sequence);
    }

}





@Controller
public class raq_apicontroller {

    // GET request, no parameters
    @GetMapping("/raq_api")
    public String News(Model model) throws IOException, InterruptedException, ParseException {
        //api setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api-nba-v1.p.rapidapi.com/statistics/players/gameId/5"))
                .header("x-rapidapi-host", "api-nba-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "c9cd6ede56msh21fd0a650f12276p14c863jsn63127aad93fa")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
      //  System.out.println(response.body());

        //alternative #2: convert response.body() to JSON object
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

//        System.out.println(jo.get("data"));
        model.addAttribute("data", jo.get("api" ));
        System.out.println(jo.get("api"));

        return "raq_api";
    }
}



