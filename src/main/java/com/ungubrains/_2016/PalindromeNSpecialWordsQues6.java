package com.ungubrains._2016;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||4:16 PM
 * <p>
 * Question 6:
 * Special words are those words which starts and ends with the same letter.
 * Examples:
 * EXISTENCE
 * COMIC
 * WINDOW
 * <p>
 * Palindrome words are those words which read the same from left to right and vice versa
 * Examples:
 * MALAYALAM
 * MADAM
 * LEVEL
 * ROTATOR
 * CIVIC
 * <p>
 * All palindromes are special words, but all special words are not palindromes.
 * Write a program to accept a word check and print Whether the word is a palindrome or only special word.
 */
public class PalindromeNSpecialWordsQues6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:: ");
        String word = scanner.nextLine();
        String wordReverse = "";

        for (int i = word.length() - 1; i >= 0; i--)
            wordReverse += word.charAt(i);

        if (word.equals(wordReverse))
            System.out.println(word + " is a palindrome");
        else if (word.charAt(0) == word.charAt(word.length() - 1))
            System.out.println(word + " is only a special word");
        else
            System.out.println(word + " is neither a palindrome nor a special word");

    }
}
