package Lesson3;

import java.util.Scanner;

public class Entertaining3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the 'Guess Number' game!");
        System.out.println("The rules are so simple. Just you have to guess a number, which is between 1-10.");
        System.out.print("Please for starting enter your name: ");
        String name = scanner.next();
        System.out.println("\n" + "Welcome " + name + ", let's get started!");

        while (true) {
            System.out.print("Please guess a number, which is between from 1 to 10 - ");
            int userEntered = scanner.nextInt();

            if (userEntered > 10 || userEntered < 1) {
                System.out.println("\n" + "---------------------------------------------------------------------");
                System.out.println("WARNING!!! Please enter a number, which is between 1-10");
                System.out.println("---------------------------------------------------------------------" + "\n");
                continue;
            }

            System.out.println("\n" + userEntered + "...Good guess. Let's find out what's my guess?!" + "\n");
            int random = (int) (Math.random() * 10) + 1;

            if (userEntered > random) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Ops...Too high. My number was " + random);
                System.out.println("But don't worry, let's play again!");
                System.out.println("---------------------------------------------------------------------");
            } else if (userEntered < random) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Ops...Too low. My number was " + random);
                System.out.println("But don't worry, let's play again!");
                System.out.println("---------------------------------------------------------------------");
            } else if (userEntered == random) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Wow! what a great guess! My number was " + random + " too. Congratulations.");
                System.out.println("Let's play again!");
                System.out.println("---------------------------------------------------------------------");
            } else {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Please enter a number which is between 1-10:");
                System.out.println("---------------------------------------------------------------------");
            }
            System.out.println();
        }
    }
}
