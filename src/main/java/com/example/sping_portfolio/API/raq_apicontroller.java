package com.example.sping_portfolio.API;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
// Raq FRQs

// Unit 2

    String week2Frq = "(a) \n" +
            "LightSequence GradShow = new LightSequence();\n" +
            "LightSequence(“0101 0101 0101”); \n" +
            "(b) \n" +
            "\n" +
            "gradShow.display(); \n" +
            " \n" +
            "(c)\n" +
            "gradShow.changeSequence(“0011 0011 0011”);\n" +
            " \n" +
            "(d) \n" +
            "String resultSeq = gradShow.insertSegment(\"1111 1111\", 4);\n" +
            " \n" +
            "(e) \n" +
            "int index = oldSeq.indexOf(segment);\n" +
            "String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());\n" +
            " \n" +
            "f)\n" +
            "double c = Math.sqrt((a * a) + (b * b);\n" +
            "System.out. println(c); \n" +
            " \n";
    @GetMapping("/raq_frq")
        public String returnRaqFRQ() {
            return "raq_frq";
        }
    @GetMapping("/raq_frq_api")
    @ResponseBody
    public String [] returnFRQ(@RequestParam(name = "week", required = false, defaultValue = "2") String week) {
        String[] array = new String[3];
        array[0] = week2Frq;

        // FRQ Handling

        // Unit 2 FRQ
        String output = "";

        //A
        LightSequence GradShow = new LightSequence("0101 0101 0101");
        //B
        GradShow.display();


        //C
        GradShow.changeSequence("0011 0011 0011");

        //D

        String resultSeq = GradShow.insertSegment("1111 1111", 4);
        output+= resultSeq;
        output+= ",";
        //E
        String oldSeq = "1100000111";
        String segment = "11";
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        output+= newSeq;
        output += ",";
        //F
        int a = 4;
        int b = 5;
        double c = Math.sqrt((a * a) + (b * b));
       output+= String.valueOf(c);
       output+= ",";

       array[1] = output;
        return array;
    }
    // GET request, no parameters
    @GetMapping("/raq_api")
    public String News(Model model) throws IOException, InterruptedException, ParseException {
        //api setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://data-imdb1.p.rapidapi.com/genres/"))
                .header("x-rapidapi-host", "data-imdb1.p.rapidapi.com")
                .header("x-rapidapi-key", "7a79b8a230mshff68040a0bd2bf0p1174f8jsnf85b178f3369")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        //alternative #2: convert response.body() to JSON object
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

//        System.out.println(jo.get("data"));
        model.addAttribute("data", jo.get("results" ));
        System.out.println(jo.get("results"));

        return "raq_api";
    }
}



