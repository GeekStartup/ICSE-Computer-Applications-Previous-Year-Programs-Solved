package com.ungubrains._2014;

import java.util.Scanner;

/**
 * Created by ashishnayak on 21-Oct-2020||9:51 AM
 * <p>
 * QUESTION 8
 * Using the switch statement, write a menu-driven program to calculate the maturity amount of a bank deposit.
 * The user is given the following options:
 * (i) Term Deposit
 * (ii) Recurring Deposit
 * For option (i) accept Principal (P), rate of interest (r) and time period in years (n).
 * Calculate and output the maturity amount (A) receivable using the formula
 * A = P[1 + r / 100]^n.
 * <p>
 * For option (ii) accept monthly instalment (P), rate of interest (r) and time period in months (n).
 * Calculate and output the maturity amount (A) receivable using the formula
 * A = P x n + P x n(n + 1)/2 x r / 100 x 1 / 12
 * <p>
 * For an incorrect option, an appropriate error message should be displayed.
 */
public class BankInterestQues8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Term Deposit and 2 for Recurring Deposit");
        System.out.print("Enter your choice:: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter principal:: ");
                float P = scanner.nextFloat();
                System.out.print("Enter rate of interest:: ");
                float r = scanner.nextFloat();
                System.out.print("Enter time period in years:: ");
                float n = scanner.nextFloat();

                double A = P * Math.pow(1 + r / 100, n);
                System.out.println("Maturity Amount : " + A);
                break;

            case 2:
                System.out.print("Enter monthly principal:: ");
                P = scanner.nextFloat();
                System.out.print("Enter rate of interest:: ");
                r = scanner.nextFloat();
                System.out.print("Enter time period in months:: ");
                n = scanner.nextFloat();

                A = P * n + P * (n * (n + 1) / 2) * r / 100 * 1 / 12;
                System.out.println("Maturity Amount : " + A);
                break;

            default:
                System.out.println("Wrong choice!");
        }
    }
}
