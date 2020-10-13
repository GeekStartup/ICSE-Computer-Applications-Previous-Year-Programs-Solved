package com.ungubrains._2017;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||8:53 PM
 * <p>
 * Question 7
 * Write a program to input integer elements into an array of size 20 and perform the following operations:
 * (i) Display largest number from the array.
 * (ii) Display smallest number from the array.
 * (iii) Display sum of all the elements of the array
 */
public class ArrayQues7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNum = new int[20];
        System.out.println("Enter 20 numbers:: ");
        for (int i = 0; i < 20; i++) {
            arrayOfNum[i] = scanner.nextInt();
        }
        int min = arrayOfNum[0];
        int max = arrayOfNum[0];
        int sum = 0;

        for (int i = 0; i < 20; i++) {

            if (arrayOfNum[i] > max)
                max = arrayOfNum[i];

            if (arrayOfNum[i] < min)
                min = arrayOfNum[i];

            sum += arrayOfNum[i];
        }

        System.out.println("Largest number in array:: " + max);
        System.out.println("Smallest number in array:: " + min);
        System.out.println("Sum of all elements in array:: " + sum);
    }
}
