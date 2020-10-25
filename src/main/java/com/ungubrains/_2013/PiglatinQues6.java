package com.ungubrains._2013;

import java.util.Scanner;

/**
 * Created by ashishnayak on 23-Oct-2020||1:09 PM
 * <p>
 * Question 6:
 * Write a program that encodes a word into Piglatin. To translate word into a Piglatin word, convert the word into uppercase
 * and then place the first vowel of the original word as the start of the new word along with the remaining alphabets.
 * The alphabets present before the vowel being shifted towards the end followed by “AY”.
 * Sample input (1) : London, Sample output (1) : ONDONLAY
 * Sample input (2) : Olympics, Sample output (2) : OLYMPICSAY
 */
public class PiglatinQues6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word to encode into Piglatin:: ");
        String word = scanner.nextLine();
        word = word.toUpperCase();
        String pigLatin;
        int indexVowel = 0;
        boolean vowelFound = false;
        char alphabet;

        for (int i = 0; i < word.length(); i++) {
            alphabet = word.charAt(i);
            if ((alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') && !vowelFound) {
                indexVowel = i;
                vowelFound = true;
            }
        }
        pigLatin = word.substring(indexVowel);
        pigLatin += word.substring(0, indexVowel);
        pigLatin += "AY";
        System.out.println("Piglatin encoded string of " + word + " is " + pigLatin);
    }
}
