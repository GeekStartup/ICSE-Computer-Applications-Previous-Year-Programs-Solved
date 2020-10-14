package com.ungubrains._2016;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||3:36 PM
 * <p>
 * Question 5.
 * <p>
 * Using the switch statement, write a menu driven program for the following:
 * <p>
 * (i) To print the Floyd’s triangle [Given below]
 * <p>
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * <p>
 * (ii) To display the following pattern
 * <p>
 * I
 * I C
 * I C S
 * I C S E
 * <p>
 * For an incorrect option, an appropriate error message should be displayed.
 */
public class SeriesQues5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to display Floyd's triangle and 2 display ICSE pattern:: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int startNum = 1;
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(startNum + " ");
                        startNum++;
                    }
                    System.out.println();
                }
                break;

            case 2:
                String pattern = "ICSE";
                for (int i = 0; i < pattern.length(); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(pattern.charAt(j) + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
