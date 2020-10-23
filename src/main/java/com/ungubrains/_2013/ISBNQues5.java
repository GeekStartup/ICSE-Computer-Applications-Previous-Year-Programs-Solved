package com.ungubrains._2013;

import java.util.Scanner;

/**
 * Created by ashishnayak on 23-Oct-2020||12:13 PM
 * <p>
 * Question 5:
 * The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book.
 * The ISBN is based upon a 10-digit code. The ISBN is legal if:
 * 1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 + 6 × digit6 + 7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10
 * is divisible by 11.
 * Example : For an ISBN 1401601499
 * Sum = 1×1 + 2×4 +3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.
 * Write a program to :
 * (i) Input the ISBN code as a 10-digit integer.
 * (ii) If the ISBN is not a 10-digit integer, output the message, “Illegal ISBN” and terminate the program.
 * (iii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.
 * If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.
 */
public class ISBNQues5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN code:: ");
        String ISBN = scanner.nextLine();

        if (ISBN.length() != 10)
            System.out.println("Illegal ISBN");
        else {
            int sum = 0;
            for (int i = 1; i <= ISBN.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(ISBN.charAt(i - 1)));
                sum = sum + (digit * i);
            }
            if (sum % 11 == 0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}
