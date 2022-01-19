package com.example.sping_portfolio.API;

import com.example.sping_portfolio.controllers.RAlamWeek5Q1Model;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class Sequence {
    String sequence;

    public Sequence(String sequence) {
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
class RAlamWeek5Q1Controller {


    @GetMapping("/createEventAPI")
    @ResponseBody
    public String getFRQ5(@RequestParam(name = "host", required = false, defaultValue = "null") String host,
                          @RequestParam(name = "address", required = false, defaultValue = "null") String address,
                          @RequestParam(name = "invitee", required = false, defaultValue = "null") String invitee) throws IOException {

        RAlamWeek5Q1Model rAlamWeek5Q1Model = new RAlamWeek5Q1Model(host, address, invitee);

        return rAlamWeek5Q1Model.sendInvite(host, address, invitee);


    }



    class billy_apicontroller {
// billy FRQs

        //Unit 5 Frq


        //Unit 4

        // 1 big String
        // I Initialized the string by naming it week 4 frq
        // This string is the answer to the FRQ
        // "/n" is seperating each line of code
        String week4Frq = "(a) \n" +
                "public int getPlayer2Move(int round)\n" +
                "{\n" +
                "int result;\n" +
                "  return result;\n" +
                "}\n" +
                " \n" +
                "Public int getPlayer2Move(int round) {\n" +
                "if(round % 3 == 0) return 3; \n" +
                "if(round % 2 == 0) return 2;\n" +
                "Return 1; \n" +
                "}\n" +
                "(b) \n" +
                "public void playGame() \n" +
                "int playerOneCoins = startingCoins; \n" +
                "Int playerTwoCoins = startingCoins; \n" +
                "Int numberOfRoundsLeft = maxRounds; \n" +
                "while(playerOneCoins > 3 && playerTwoCoins > 3 && numberOfRoundsLeft > 0){ \n" +
                "numberOfRoundsLeft —; \n" +
                "Int m1 = getPlayerOneMove(); \n" +
                " Int m2 = getPlayerTwoMove(); \n" +
                " playerOneCoins -= m1; \n" +
                " playerTwoCoins -= m2; \n" +

                " if(m1 == m2) += 1; \n" +
                " if(m1-m2 == 1) playerTwoCoins +=1; \n" +
                " if(m1-m2 == 2) playerOneCoins +=1; \n" +

                " } \n" +
                " ; \n";


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

        @GetMapping("/billyfrq")
        public String returnBillyFRQ() {
            return "billyfrq";
        }

        @GetMapping("/billyfrq_api")
        @ResponseBody
        // This is making a string array variable attatched to an array value.
        // This is done by setting an array numnber to the frq week number
        public String[] returnFRQ(@RequestParam(name = "week", required = false, defaultValue = "2") String week) {
            String[] array = new String[5];
            array[0] = week2Frq;
            array[3] = week4Frq;
           // array[4] = week5Frq;

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
            output += resultSeq;
            output += ",";
            //E
            String oldSeq = "1100000111";
            String segment = "11";
            int index = oldSeq.indexOf(segment);
            String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
            output += newSeq;
            output += ",";
            //F
            int a = 4;
            int b = 5;
            double c = Math.sqrt((a * a) + (b * b));
            output += String.valueOf(c);
            output += ",";

            // this returns the array
            array[1] = output;
            return array;
        }
    }

    @Controller
    public class apicontroller {

        // GET request, no parameters
        @GetMapping("/imdb")
        public String News(Model model) throws IOException, InterruptedException, ParseException {
            //api setup:
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://imdb8.p.rapidapi.com/auto-complete?q=name"))
                    .header("x-rapidapi-host", "imdb8.p.rapidapi.com")
                    .header("x-rapidapi-key", "7a79b8a230mshff68040a0bd2bf0p1174f8jsnf85b178f3369")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());

            //alternative #2: convert response.body() to JSON object
            Object obj = new JSONParser().parse(response.body());
            JSONObject jo = (JSONObject) obj;

//        System.out.println(jo.get("data"));
            model.addAttribute("data", jo.get("d"));
            System.out.println(jo.get("d"));

            return "imdb";
        }
    }
}

