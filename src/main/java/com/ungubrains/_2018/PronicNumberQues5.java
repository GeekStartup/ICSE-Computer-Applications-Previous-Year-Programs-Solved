package com.ungubrains._2018;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||11:58 AM
 *
 * Question 5.
 * Write a program to input a number and check and print whether it is a Pronic number or not.
 * (Pronic number is the number which is the product of two consecutive integers)
 * Examples : 12 = 3 × 4 .
 * 20 = 4 × 5
 * 42 = 6 × 7
 */
public class PronicNumberQues5 {

    public static void main(String[] args) {

        long num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check if it is a Pronic number:: ");
        num = scanner.nextLong();
        PronicNumberQues5 pronicNumber = new PronicNumberQues5();
        if(pronicNumber.checkIsPronic(num)){
            System.out.println(num + " is a pronic number");
        }else{
            System.out.println(num + " is not a pronic number");
        }
    }

    boolean checkIsPronic(long num) {
        boolean isPronic = false;
        for (int i = 0; i <= (long) (Math.sqrt(num)); i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }
        return isPronic;
    }
}
