package com.example.sping_portfolio.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
class dylan_apicontroller {
// dylan FRQs

    //Unit 4

    // 1 big String
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
    @GetMapping("/dylanfrq")
    public String returndylanFRQ() {
        return "dylanfrq";
    }

    @GetMapping("/dylanfrq_api")
    @ResponseBody
    public String[] returnFRQ(@RequestParam(name = "week", required = false, defaultValue = "2") String week) {
        String[] array = new String[4];
        array[0] = week2Frq;
        array[3] = week4Frq;

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

