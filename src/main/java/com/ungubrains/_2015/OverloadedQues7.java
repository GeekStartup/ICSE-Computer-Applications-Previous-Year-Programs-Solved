package com.ungubrains._2015;

/**
 * Created by ashishnayak on 14-Oct-2020||11:25 PM
 * <p>
 * Question 7
 * Design a class to overload a function Joystring() as follows:
 * (i) void Joystring(String s, char ch1, char ch2) with one string and two character arguments that replaces the character
 * argument ch1 with the character argument ch2 in the given string s and prints the new string
 * Example:
 * Input value of s = “TECHNALAGY”
 * ch1 = ‘A’
 * ch2 = ‘O’
 * Output : “TECHNOLOGY”
 * (ii) void Joystring(String s) with one string argument that prints the position of the first space and the last space of the given String s.
 * Example:
 * Input value of = “"Cloud computing means Internet based computing"”
 * First Index : 5
 * Last Index : 36
 * (iii) void Joystring(String s1, String s2) with two string arguments that combines the two strings with a space between
 * them and prints the resultant string
 * Example :
 * Input value of s1 = “COMMON WEALTH”
 * s2 = “GAMES”
 * Output : “COMMON WEALTH GAMES”
 * (use library functions)
 */
public class OverloadedQues7 {

    //test
    public static void main(String[] args) {
        OverloadedQues7 overloaded = new OverloadedQues7();
        overloaded.Joystring("TECHNALAGY", 'A', 'O');
        overloaded.Joystring("Cloud computing means Internet based computing");
        overloaded.Joystring("COMMON WEALTH", "GAMES");
    }

    //replaces the character argument ch1 with the character argument ch2 in the given string s and prints the new string
    void Joystring(String s, char ch1, char ch2) {
        String output = s.replace(ch1, ch2);
        System.out.println("Output : " + output);
    }

    //prints the position of the first space and the last space of the given String s
    void Joystring(String s) {
        System.out.println("First Index : " + s.indexOf(' '));
        System.out.println("First Index : " + s.lastIndexOf(' '));
    }

    //combines the two strings with a space between them and prints the resultant string
    void Joystring(String s1, String s2) {
        String output = s1.concat(" ").concat(s2);
        System.out.println("Output : " + output);
    }
}
