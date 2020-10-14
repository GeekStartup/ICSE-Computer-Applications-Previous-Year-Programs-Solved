package com.ungubrains._2015;

import java.util.Scanner;

/**
 * Created by ashishnayak on 15-Oct-2020||12:30 AM
 * <p>
 * Question 9
 * Use switch statement,write a menu driven program to:
 * (i) To find and display all the factors of a number input by the user (including 1 and excluding number itself.)
 * Example :
 * Sample Input : n = 15.
 * Sample Output : 1, 3, 5
 * (ii) To find and display the factorial of a number input by the user. The factorial of a non-negative integer n ,denoted by n!,is the product of all integers less than or equal to n.
 * Example :
 * Sample Input : n = 5
 * Sample Output : 120.
 * For an incorrect choice, an appropriate error message should be displayed.
 */
public class FactorsNFactorialQues9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Factors and 2 for Factorial");
        System.out.print("Enter choice:: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number to find factors:: ");
                int number = scanner.nextInt();
                System.out.print("Factors of " + number + " are ");
                for (int i = 1; i <= number / 2; i++) {
                    if (number % i == 0)
                        System.out.print(i + ", ");
                }
                break;
            case 2:
                System.out.print("Enter number to find factorial:: ");
                number = scanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is " + factorial);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
