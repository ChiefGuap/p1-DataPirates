package com.example.sping_portfolio.controllers;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner; 

class MainUnit6 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userWord;
    String userWord2; 

    System.out.println("Enter any word (x2)"); 
    userWord = myObj.nextLine();  
    userWord2 = myObj.nextLine(); 

    ArrayList<String> list = new ArrayList<String>();

    list.add(userWord); 
    list.add(userWord2); 
    list.add("Hellow");
    list.add("LeBron");
    list.add("Talking");
    list.add("Walking");
    list.add("Crying");
    list.add("tech-talking");

    for (String word : list) {
      if (word.contains("ing")) {
        System.out.println("The Words that end with -ing are " + word);
      }

    }
  }
}