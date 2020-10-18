package com.ungubrains._2014;

import java.util.Scanner;

/**
 * Created by ashishnayak on 18-Oct-2020||10:44 AM
 * <p>
 * Question 5.
 * A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result
 * is equal to the original two-digit number.
 * Example: Consider the number 59.
 * Sum of digits = 5 + 9 = 14
 * Product of its digits = 5 x 9 = 45
 * Sum of the sum of digits and product of digits= 14 + 45 = 59
 * Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
 * If the value is equal to the number input, output the message “Special 2-digit number” otherwise,
 * output the message “Not a Special 2-digit number”.
 */
public class SpecialNumberQues5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 2 digit number:: ");
        int number = scanner.nextInt();

        int firstDigit = number % 10;
        int lastDigit = number / 10;
        int sumOfDigits = firstDigit + lastDigit;
        int productOfDigits = firstDigit * lastDigit;

        if (sumOfDigits + productOfDigits == number)
            System.out.println("Special 2-digit number");
        else
            System.out.println("Not a Special 2-digit number");
    }
}
