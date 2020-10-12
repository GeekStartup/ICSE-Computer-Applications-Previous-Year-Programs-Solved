package com.ungubrains._2019;

/**
 * Created by ashishnayak on 13-Oct-2020||12:13 AM
 *
 * Question 9
 * A tech number has even number of digits. If the number is split in two equal halves, then the
 * square of sum of these halves is equal to the number itself. Write a program to generate and
 * print all four digits tech numbers.
 * Example:
 * Consider the number 3025
 * Square of sum of the halves of 3025 = (30+25)^2
 *                                     = (55)^2
 *                                     = 3025 is a tech number.
 */
public class TechNumberQues9 {

    public static void main(String[] args){
        System.out.print("All 4 digit tech numbers are:: ");
        for(int i=1000; i<=9999; i++){
            int first2digits = i/100;
            int last2digits = i%100;
            if(i == (int)(Math.pow(first2digits+last2digits,2))){
                System.out.print(i + ", ");
            }
        }
    }
}
