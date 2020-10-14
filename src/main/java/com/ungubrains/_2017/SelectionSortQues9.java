package com.ungubrains._2017;

/**
 * Created by ashishnayak on 14-Oct-2020||11:24 AM
 * <p>
 * Question 9
 * Write a program to input forty words in an array. Arrange these words in descending order of
 * alphabets, using selection sort technique. Print the sorted array.
 */
public class SelectionSortQues9 {

    //test
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twentyone", "twentytwo", "twentythree", "twentyfour", "twentyfive", "twentysix", "twentyseven", "twentyeight",
                "twentynine", "thirty", "thirtyone", "thirtytwo", "thirtythree", "thirtyfour", "thirtyfive",
                "thirtysix", "thirtyseven", "thirtyeight", "thirtynine", "forty"};
        SelectionSortQues9 selectionSort = new SelectionSortQues9();
        selectionSort.selectionSort(words);
    }

    void selectionSort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[i]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
