package Lesson4;

import java.util.Scanner;

public class ScoreRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your score for learning your letter grade (it must be between 1-100): ");
            int score = scanner.nextInt();

            char letterGrade;

            int restOfNumber = score % 10;

            if (restOfNumber == 0) {
                score--;
            }

            if (score >= 1 && score <= 100) {
                switch (score / 10) {
                    case 10:
                    case 9:
                        letterGrade = 'A';
                        break;
                    case 8:
                        letterGrade = 'B';
                        break;
                    case 7:
                        letterGrade = 'C';
                        break;
                    case 6:
                        letterGrade = 'D';
                        break;
                    default:
                        letterGrade = 'F';
                }

                System.out.println("Your letter grade score is - " + letterGrade);
                System.out.println();
            } else {
                System.out.println("Please enter an integer number, which is between 1-100.");
                System.out.println();
            }
        }
    }
}
