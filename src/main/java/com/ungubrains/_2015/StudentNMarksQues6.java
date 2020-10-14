package com.ungubrains._2015;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||10:52 PM
 * <p>
 * Question 6
 * Write a program to input and store all roll numbers, names and marks in 3 subjects of n number of students
 * in five single dimensional arrays and display the remark based on average marks as given below:
 * Average marks = total marks/3
 * <p>
 * AVERAGE MARKS	REMARK
 * 85 – 100	        EXCELLENT
 * 75 – 84	        DISTINCTION
 * 60 – 74	        FIRST CLASS
 * 40 – 59	        PASS
 * Less than 40	    POOR
 */
public class StudentNMarksQues6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:: ");
        int n = scanner.nextInt();
        int[] rollNumbers = new int[n];
        String[] names = new String[n];
        int[] markSubject1 = new int[n];
        int[] markSubject2 = new int[n];
        int[] markSubject3 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Marks of student number: " + (i + 1) + "\n=============================================================");
            System.out.print("Enter roll number:: ");
            rollNumbers[i] = scanner.nextInt();
            System.out.print("Enter name:: ");
            scanner.nextLine();
            names[i] = scanner.nextLine();
            System.out.print("Enter marks in Subject 1:: ");
            markSubject1[i] = scanner.nextInt();
            System.out.print("Enter marks in Subject 2:: ");
            markSubject2[i] = scanner.nextInt();
            System.out.print("Enter marks in Subject 3:: ");
            markSubject3[i] = scanner.nextInt();
        }

        System.out.println("\nRESULTS");
        for (int i = 0; i < n; i++) {
            System.out.println("========================================================================================");
            System.out.println("Name: " + names[i]);
            System.out.println("Roll number: " + rollNumbers[i]);
            int avgMarks = (markSubject1[i] + markSubject2[i] + markSubject3[i]) / 3;
            if (avgMarks >= 85 && avgMarks <= 100)
                System.out.println("EXCELLENT");
            else if (avgMarks >= 75 && avgMarks <= 84)
                System.out.println("DISTINCTION");
            else if (avgMarks >= 60 && avgMarks <= 74)
                System.out.println("FIRST CLASS");
            else if (avgMarks >= 40 && avgMarks <= 59)
                System.out.println("PASS");
            else
                System.out.println("POOR");
            System.out.println("========================================================================================");
        }
    }
}
