package com.ungubrains._2013;

import java.util.Scanner;

/**
 * Created by ashishnayak on 25-Oct-2020||11:19 AM
 * <p>
 * Question 7:
 * Write a program to input 10 integer elements in an array and sort them in descending order using the bubble sort technique.
 */
public class BubbleSortDescQues7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers to be sorted in descending order:: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Original array:: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + ", ");
        }

        bubbleSortDesc(numbers);
        System.out.println();
        System.out.print("Array sorted in descending order:: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    //logic for bubble sort
    private static void bubbleSortDesc(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
