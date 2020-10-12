package com.ungubrains._2019;

import java.util.Scanner;

/**
 * Created by ashishnayak on 12-Oct-2020||11:55 PM
 *
 * Question 8
 * Write a program to input a sentence and convert it into uppercase and count and display the
 * total number of words starting with a letter 'A'.
 * Example:
 * Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY ARE EVER CHANGING.
 * Sample Output: Total number of words starting with letter 'A' = 4
 */
public class WordsWithAQues8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String sentence;
        System.out.println("Enter a sentence:: ");
        sentence = scanner.nextLine();
        sentence = sentence.toUpperCase();

        for(int i=0; i<sentence.length(); i++){
            if(i==0 && sentence.charAt(0)=='A'){
                counter++;
            }else if(sentence.charAt(i)==' ' && sentence.charAt(i+1)=='A'){
                counter++;
            }
        }

        System.out.println("Total number of words starting with letter 'A' =" + counter);
    }
}
