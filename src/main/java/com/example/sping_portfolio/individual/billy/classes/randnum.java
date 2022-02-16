package com.example.sping_portfolio.individual.billy.classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

public class randnum {


    public class number {
// creating instance variables
        private int squirrelnum;
        private int qnt;
        //defining an array list
        private ArrayList<Integer> numbers;
// creating the constuctor
//qnt is the variable being used from user input
        public number(int qnt) {
            this.qnt = qnt;
            ArrayList<Integer> numbers = new ArrayList<Integer>();
        }

        public void addnum() {
            Random rand = new Random();
// This is a for loop to generate a random number
            // creates a random number from 32 to 3 qnd then ads 3
            for(int i = 0; i <= this.qnt; i++) {
                int squirrelnum = rand.nextInt(32) + 3;

                this.numbers.add(squirrelnum);
            }

        }
// this is the getter that returns this.numbers
        public ArrayList<Integer> getNumbers() {
            return this.numbers;
        }
// this is the tester method
        // this is creating 10 numbers
        public void main(String[] args) {
            number squirrel = new number(10);
            squirrel.addnum();

            ArrayList<Integer> squirrels = squirrel.getNumbers();


        }
    }
}

