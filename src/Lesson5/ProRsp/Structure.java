package Lesson5.ProRsp;

import java.util.Scanner;

public class Structure {
    public String rock;
    public String paper;
    public String scissors;

    public Structure(String rock, String paper, String scissors) {
        this.rock = rock;
        this.paper = paper;
        this.scissors = scissors;
    }

    public int setup() {
        return ((int) Math.random() * 3) + 1;
    }

    Scanner scanner = new Scanner(System.in);
    String user  = scanner.nextLine();
    public String usually() {
        if (user.equalsIgnoreCase("rock")) {
            System.out.println("Rock");
        } else if (user.equalsIgnoreCase("paper")) {
            System.out.println("Paper");
        } else if (user.equalsIgnoreCase("scissors")) {
            System.out.println("Scissors");
        } else {
            System.out.println("Please choose only paper, rock, or scissors...");
        } return usually();
    }
}
