package main.java.com.ungubrains;

import java.util.Scanner;

/**
 * Created by ashishnayak on 12-Oct-2020||9:02 PM
 *
 * Question 5.
 * Using the switch-case statement, write a menu driven program to do the following :
 * (a) To generate and print Letters from A to Z and their Unicode Letters Unicode
 *
 * Letters      Unicode
 *    A            65
 *    B            66
 *    .            .
 *    .            .
 *    .            .
 *    Z            90
 *
 * (b) Display the following pattern using iteration (looping) statement:
 *
 *  1
 *  1   2
 *  1   2   3
 *  1   2   3   4
 *  1   2   3   4   5
 *
 */
public class UnicodeNPatternQues5 {

    public static void main(String[] args){
        System.out.println("Enter 1 to generate Unicode");
        System.out.println("Enter 2 to generate pattern");
        System.out.println("Enter choice::");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Letters \t Unicode");
                for(char alphabet='A'; alphabet<='Z'; alphabet++) {
                    System.out.println("\t" + alphabet + "\t\t\t" + (int) alphabet);
                }
                break;

            case 2:
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(j + "\t");
                    }
                    System.out.print("\n");
                }
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}
