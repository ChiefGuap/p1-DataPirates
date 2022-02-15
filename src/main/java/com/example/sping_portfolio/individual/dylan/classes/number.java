import java.util.ArrayList;
import java.util.Random;

public class number {

    private int randnum;
    private int amnt;
    private ArrayList<Integer> nums;

    public number(int amnt) {
        this.amnt = amnt;
        this.nums = new ArrayList<Integer>();
    }

    public void addnum() {
        Random rand = new Random();

        for(int i = 0; i <= this.amnt; i++) {
            int randnum = rand.nextInt(33) + 3;

            this.nums.add(randnum);
        }

    }

    public ArrayList<Integer> getNums() {
        return this.nums;
    }

    public static void main(String[] args) {
        number squirrel = new number(10);
        squirrel.addnum();

        ArrayList<Integer> squirrels = squirrel.getNums();

        for(int animal : squirrels) {
            System.out.println("Squirrels: " + animal);
        }
    }
}