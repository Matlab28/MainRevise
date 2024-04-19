package Lesson5.ProRsp;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        System.out.println("Welcome to the rock-scissors-paper game!..");
        boolean playOrExit = true;
        while (playOrExit) {
            Scanner scanner = new Scanner(System.in);
            Players players = new Players("nothing", "nothing","nothing");
//            int random = ((int) Math.random() * 3) + 1;
            String randomSays;


            System.out.println("Please enter your choose (rock, scissors, paper)");
            String userChoose = scanner.next();

            if (userChoose.equalsIgnoreCase(players.usually())) {
                System.out.println();
            }

            switch (players.setup()) {
                case 1:
                     randomSays = "Rock";
                    break;
                case 2:
                    randomSays = "Paper";
                    break;
                case 3:
                    randomSays = "Scissors";
                    break;
            }



        }

    }
}
