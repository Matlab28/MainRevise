package Lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        boolean answer = true;
        while (answer) {
            System.out.print("Enter the first number - ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number - ");
            int b = scanner.nextInt();

            System.out.println("\n" + "Which method do you want to use for calculating?");
            System.out.println("Choose one of the calculating method (*, /, -, +): ");

            char c = scanner.next().charAt(0);

            switch (c) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;

                default:
                    System.out.println("Please enter the right method:");
            }
            System.out.println();

//            System.out.print("Do you want to continue? Please choose only 'yes' or 'no': ");
//            String user = scanner.next();
//
//            if (user.equals("yes")){
//                System.out.println(answer);
//            } else {
//                break;
//            }

        }


    }
}
