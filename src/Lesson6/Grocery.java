package Lesson6;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many things do you want to ad your grocery list? - ");

        String[] array = new String[scanner.nextInt()];

        int count = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(count++ + ") ");
            array[i] = scanner.next();
        }

        System.out.println("\n");

        int count2 = 1;

        System.out.println("Your grocery list:");

        for (String items : array) {
            System.out.println(count2++ + ") " + items);
        }
    }
}
