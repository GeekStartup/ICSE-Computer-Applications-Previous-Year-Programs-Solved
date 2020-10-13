package com.ungubrains._2017;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||7:29 PM
 * <p>
 * Question 5.
 * Write a program to accept a number and check and display whether it is a spy number or not.
 * (A number is spy if the sum of its digits equals the product of its digits.)
 * Example : consider the number 1124,
 * Sum of the digits = 1 + 1 + 2 + 4 = 8
 * Product of the digits = 1 × 1 x 2 x 4 = 8
 */
public class SpyNumberQues5 {

    public static void main(String[] args) {
        boolean isSpy;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a spy number:: ");
        number = scanner.nextInt();

        SpyNumberQues5 spyNumber = new SpyNumberQues5();
        isSpy = spyNumber.checkIsSpyNumber(number);
        if (isSpy)
            System.out.println(number + " is a spy number");
        else
            System.out.println(number + " is not a spy number");

    }

    //logic to check if teh number is a spy number
    boolean checkIsSpyNumber(int number) {
        int digit;
        int sum = 0;
        int product = 1;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }
}
