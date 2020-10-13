package com.ungubrains._2018;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||2:12 PM
 * <p>
 * Question 6.
 * Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.
 * Sample input: we are in cyber world
 * Sample output : We Are In Cyber World
 */
public class UpperCaseFirstLetterQues6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter string in lower case:: ");
        input = scanner.nextLine();
        UpperCaseFirstLetterQues6 upperCaseFirstLetter = new UpperCaseFirstLetterQues6();
        System.out.println("Output:: " + upperCaseFirstLetter.changeFirstLetterUpperCase(input));
    }

    String changeFirstLetterUpperCase(String input) {
        String output = "";
        input = " " + input;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                output += " " + Character.toUpperCase(input.charAt(i + 1));
                i++;
            } else {
                output += input.charAt(i);
            }
        }
        return output.trim();
    }
}
