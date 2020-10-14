package com.ungubrains._2016;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||9:00 PM
 * <p>
 * Question 8:
 * Write a program to accept a number and check and display whether it is a Niven number or not.
 * (Niven number is that number which is divisible by its sum of digits).
 * Example:
 * Consider the number 126.
 * Sum of its digits is 1+2+6 = 9 and 126 is divisible by 9.
 */
public class NivenNumberQues8 {

    public static void main(String[] args) {
        NivenNumberQues8 nivenNumber = new NivenNumberQues8();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int number = scanner.nextInt();
        if (nivenNumber.checkIsNiven(number))
            System.out.println(number + " is a niven number");
        else
            System.out.println(number + " is not a niven number");
    }

    //logic to check if a number is Niven number or not
    boolean checkIsNiven(int number) {
        int sumOfDigits = 0;
        int numBackup = number;
        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return numBackup % sumOfDigits == 0;
    }
}
