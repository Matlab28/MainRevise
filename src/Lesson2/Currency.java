package Lesson2;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("To which currency do you want to exchange (USD, EURO)? ");
            String userAnswer = scanner.next();
            System.out.print("How much money do you want to exchange? ");
            double number = scanner.nextDouble();

            double euroToAzn = 1.84;
            double usdToAzn = 1.7;

            if (userAnswer.equalsIgnoreCase("usd")) {
                System.out.println((usdToAzn * number) + " azn");
            } else if (userAnswer.equalsIgnoreCase("euro")) {
                System.out.println((euroToAzn * number) + "azn");
            } else {
                System.out.println("Please add right currency: ");
            }
        }
    }
}
