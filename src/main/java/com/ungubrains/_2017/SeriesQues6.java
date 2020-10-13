package com.ungubrains._2017;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||8:21 PM
 * <p>
 * Question 6
 * Using switch statement, write a menu driven program for the following:
 * (i) To find and display the sum of the series given below:
 * 𝑆 = x^1 − x^2 + x^3 − x^4 + x^5. . . . . . . . . . . . . . . .. − x^20
 * (where x = 2)
 * (ii) To display the following series:
 * 1 11 111 1111 11111
 * For an incorrect option, an appropriate error message should be displayed.
 */
public class SeriesQues6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to view Series_1 or enter 2 to view Series_2\n\nEnter your choice:: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double sum = 0.0;
                int x = 2;
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0)
                        sum -= Math.pow(x, i);
                    else
                        sum += Math.pow(x, i);
                }
                System.out.println("Sum of series x^1 − x^2 + x^3 − x^4 + x^5. . . . . . . . . . . . . . . .. − x^20:: " + sum);
                break;

            case 2:
                int num = 0;
                for (int i = 1; i <= 5; i++) {
                    num = num * 10 + 1;
                    System.out.print(num + " ");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
