package com.ungubrains._2015;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||11:44 PM
 * <p>
 * Question 8
 * Write a program to input twenty names in an array. Arrange these names in descending order of alphabets, using the bubble sort technique.
 */
public class BubbleSortDescQues8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[20];
        System.out.println("Enter 20 names::");
        for (int i = 0; i < 20; i++) {
            names[i] = scanner.nextLine();
        }

        //Bubble sort logic for descending order
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j + 1].compareTo(names[j]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        //print in descending order
        System.out.println("====Names Sorted in Descending Order====");
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
    }
}
