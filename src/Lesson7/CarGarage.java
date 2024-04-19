package Lesson7;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many brands do you want to add? ");
        int brands = scanner.nextInt();
        System.out.print("How many models do you want to add? ");
        int models = scanner.nextInt();

//        int[][] array = new int[brands][models];

        String[][] array = new String[brands][models];

        int count = 1;
        int count2 = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(count++ + ") " + "Enter the brand of car: ");
                array[i] = new String[]{scanner.next()};
                System.out.println();
                System.out.print(count2++ + ") " + "Enter the model of car: ");
                array[j] = new String[]{scanner.next()};

                System.out.println("Your cars");



                int count3 = 1;
                for (String cars : array[i]) {
                    System.out.println(count3++ + ") " + cars);
                }

                int count4 = 1;

                for (String[] modelsOfCars : array) {
                    System.out.println(count4++ + ") " + modelsOfCars);
                }
                System.out.println();
            }
        }







    }
}
