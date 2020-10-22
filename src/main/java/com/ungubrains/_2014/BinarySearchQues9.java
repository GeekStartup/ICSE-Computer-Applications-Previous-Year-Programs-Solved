package com.ungubrains._2014;

import java.util.Scanner;

/**
 * Created by ashishnayak on 22-Oct-2020||12:00 PM
 * <p>
 * QUESTION 9
 * Write a program to accept the year of graduation from school as an integer value from the user. Using the binary search
 * technique on the sorted array of integers given below, output the message “Record exists” if the value input is located in the array.
 * If not, output the message “Record does not exist”.
 * {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010}
 */
public class BinarySearchQues9 {
    public static void main(String[] args) {
        int[] graduationYear = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of graduation:: ");
        int searchYear = scanner.nextInt();
        boolean isYearPresent = false;
        int start = 0;
        int end = graduationYear.length - 1;
        int mid;
        while (start <= end && !isYearPresent) {
            mid = (start + end) / 2;
            if (searchYear == graduationYear[mid])
                isYearPresent = true;
            else if (searchYear > graduationYear[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        if (isYearPresent)
            System.out.println("Record exists");
        else
            System.out.println("Record does not exist");
    }
}
