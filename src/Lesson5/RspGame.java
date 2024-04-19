package Lesson5;

import java.util.Scanner;

public class RspGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the 'Rock-Scissors-paper' game.");
        System.out.println("You'll play with me. I have just one rule: You have to choose only 'ROCK, SCISSORS, or PAPER'.");
        System.out.println("If you ready, then let's get started." + "\n");
        int countRound = 1;
        while (true) {
            System.out.print("Choose one of them: Rock, scissors, or paper: ");
            String userChoice = scanner.next();


            System.out.println(":::::::::::::::::::::ROUND " + (countRound) + ":::::::::::::::::::::");
            int random = (int) (Math.random() * 3) + 1;
            String myChoice;
            countRound ++;


            String p = "paper";
            String s = "scissors";
            String r = "rock";
//
            switch (random) {
                case 1:
                    myChoice = "Scissors";
                    break;
                case 2:
                    myChoice = "Rock";
                    break;
                default:
                    myChoice = "Paper";
            }

//            myChoice = scanner.next();

//            System.out.println(myChoice);
            String result= " ";
            int playerScore = 1;
            int myScore = 1;

            if (userChoice.equals(p) || userChoice.equals(r) || userChoice.equals(s)) {
                System.out.println("Your choice - " + userChoice);
                System.out.println("My choice - " + myChoice);
            }
            else if (userChoice.equals(myChoice)) {
                result = "What a great choice! This round is tie. Let's play another one...";
                playerScore++;
            } else if (userChoice.equals(p) && myChoice.equals("Scissors")) {
                result = "Ops, I won...Don't worry, let's play another round";
                myScore++;
            } else if (userChoice.equals(r) && myChoice.equals("Paper")) {
                result = "Ops, I won...Don't worry, let's play another round";
                myScore++;
            } else if (userChoice.equals(s) && myChoice.equals("Rock")) {
                result = "Ops, I won...Don't worry, let's play another round";
                myScore++;
            } else {
                result = "Congratulations, you won this round! Let's play another one..";
                playerScore++;
            }

            System.out.println(result);
            System.out.println(playerScore);
            System.out.println(myScore);
            System.out.println();
        }
    }
}
