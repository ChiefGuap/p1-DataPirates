package com.example.sping_portfolio.individual.sam;

import java.util.ArrayList;
import java.util.Random;

// Write a Class Number
public class Number {
    int x;
    int y;
    public Number() {
       x = 3;
       y = 36;
       int random_num = (int)Math.floor(Math.random()*(y-x+1)+x);
    }

    public String getNum() {
      return random_num;
    }

    public static void main(String[] args) {
      ArrayList<String> Number = new ArrayList<String>();
      Number.add("Squirrels: " + (Number) + " Day: "+ random_num);

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        
    }

}









