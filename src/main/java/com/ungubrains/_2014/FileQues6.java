package com.ungubrains._2014;

import java.util.Scanner;

/**
 * Created by ashishnayak on 18-Oct-2020||11:07 AM
 * <p>
 * Question 6.
 * Write a program to assign a full path and file name as given below. Using library functions, extract and output the file path,
 * file name and file extension separately as shown.
 * <p>
 * Input C:\Users\admin\Pictures\flower.jpg
 * Output Path: C:\Users\admin\Pictures\
 * File name: flower
 * Extension: jpg
 */
public class FileQues6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path and file name with extension:: ");
        String input = scanner.nextLine();
        int indexOfLastSlash = input.lastIndexOf('\\');
        int indexOfLastDot = input.lastIndexOf('.');
        String filePath = input.substring(0, indexOfLastSlash + 1);
        System.out.println("Output Path: " + filePath);
        String fileName = input.substring(indexOfLastSlash + 1, indexOfLastDot);
        System.out.println("File name: " + fileName);
        String extension = input.substring(indexOfLastDot + 1);
        System.out.println("Extension: " + extension);
    }
}
