package com.ungubrains._2017;

/**
 * Created by ashishnayak on 13-Oct-2020||9:12 PM
 * <p>
 * Question 8.
 * Design a class to overload a function check ( ) as follows :
 * (i) void check (String str, char ch) – to find and print the frequency of a character in a string.
 * Example :
 * Input:
 * str = “success”
 * ch = ‘s’ .
 * Output:
 * number of s present is = 3
 * <p>
 * (ii) void check(String s1) – to display only vowels from string s1, after converting it to lower case.
 * Example:
 * Input:
 * s1 = “computer”
 * Output:
 * o u e
 */
public class StringCheckQues8 {

    //test
    public static void main(String[] args) {
        StringCheckQues8 stringCheck = new StringCheckQues8();
        stringCheck.check("success", 's');
        stringCheck.check("COMPUTER");

    }

    //to find and print the frequency of a character in a string.
    void check(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                counter++;
        }
        System.out.println("Number of " + ch + " present is = " + counter);
    }

    //to display only vowels from string s1, after converting it to lower case.
    void check(String s1) {
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.print(ch + " ");
        }
    }

}
