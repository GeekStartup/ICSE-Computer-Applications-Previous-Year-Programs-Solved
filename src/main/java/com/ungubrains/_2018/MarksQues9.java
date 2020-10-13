package com.ungubrains._2018;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||5:06 PM
 * <p>
 * Question 9.
 * Write a program to accept name and total marks of N number of students in two single subscript array name[] and totalmarks[ ].
 * Calculate and print:
 * (i) The average of the total marks obtained by N Number of students.
 * [average = (sum of total marks of all the students)/N]
 * (ii) Deviation of each student’s total marks with the average.
 * [deviation = total marks of a student – average] ‘
 */
public class MarksQues9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:: ");
        int N = scanner.nextInt();
        String[] name = new String[N];
        int[] totalmarks = new int[N];

        for (int i = 0; i < N; i++) {
            scanner.nextLine();
            System.out.println("Enter name of student:: ");
            name[i] = scanner.nextLine();
            System.out.println("Enter total marks of student:: ");
            totalmarks[i] = scanner.nextInt();
        }

        MarksQues9 marks = new MarksQues9();
        double average = marks.calculateAverage(totalmarks);
        double[] deviations = marks.calculateDeviation(totalmarks, average);
        System.out.println("Average of total marks obtained by " + N + " students:: " + average);
        for (int i = 0; i < N; i++) {
            System.out.println("Deviation of " + name[i] + "'s total marks with the average:: " + deviations[i]);
        }

    }

    //logic to calculate average
    double calculateAverage(int[] totalmarks) {
        double total = 0.0;
        for (int i = 0; i < totalmarks.length; i++) {
            total += totalmarks[i];
        }
        return total / totalmarks.length;
    }

    //logic to calculate deviation
    double[] calculateDeviation(int[] totalmarks, double average) {
        double[] deviations = new double[totalmarks.length];
        for (int i = 0; i < totalmarks.length; i++) {
            deviations[i] = totalmarks[i] - average;
        }
        return deviations;
    }

}
