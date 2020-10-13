package com.ungubrains._2018;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||4:35 PM
 * <p>
 * Question 8.
 * Write a menu driven program to display the pattern as per user’s choice.
 * <p>
 * Pattern 1        Pattern 2
 * ABCDE           B
 * ABCD            LL
 * ABC             UUU
 * AB              EEEE
 * A
 * <p>
 * For an incorrect option, an appropriate error message should be displayed.
 */
public class PatternQues8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to display ABCDE pattern");
        System.out.println("Enter 2 to display BLUE pattern");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (char letter = 'E'; letter >= 'A'; letter--) {
                    for (char alphabet = 'A'; alphabet <= letter; alphabet++) {
                        System.out.print(alphabet);
                    }
                    System.out.println();
                }
                break;

            case 2:
                String word = "BLUE";
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(word.charAt(i));
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
