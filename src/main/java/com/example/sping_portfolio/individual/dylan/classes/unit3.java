package com.example.sping_portfolio.individual.dylan.classes;

public class unit3 {
    //declare variables
    private boolean rsvp;
    private int selection;
    private String food;
    private String option1;
    private String option2;

    //constructor
    public unit3(boolean rsvp, int selection, String option2) {
        this.rsvp = rsvp;
        this.selection = selection;
        this.option1 = option1;
        this.option2 = option2;
    }

    public void attending() {
        if(this.rsvp == true) {
            System.out.println("attending");
        }
        else {
            System.out.println("not attending");
        }
    }

    public void foodSelection() {
        if (this.selection == 1) {
            this.food = "beef";
            System.out.println(this.food);
        }

        if (this.selection == 2) {
            this.food = "chicken";
            System.out.println(this.food);
        }
        if (this.selection == 3) {
            this.food = "pasta";
            System.out.println(this.food);
        }
        else {
            this.food = "fish";
            System.out.println(this.food);
        }
    }

    public void dinner() {
        if (this.rsvp = true) {
            System.out.println("Thanks for attending. You will be served" + food);
        }
        else {
            System.out.println("Sorry you can't make it");
        }
    }

    public void checker() {
        if (this.option1 ==  this.option2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}