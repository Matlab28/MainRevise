package Lesson8;

import java.util.Scanner;

public class LessonEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you want to add? - ");
        int[] array = new int[scanner.nextInt()];

//        int count = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.print(i++ + ") Enter the student's name - ");
            String name = scanner.next();
            System.out.print(i++ + ") Enter the student's grade - ");
            int grade=scanner.nextInt();
        }


    }
}
