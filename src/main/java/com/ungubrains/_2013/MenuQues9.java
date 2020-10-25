package com.ungubrains._2013;

import java.util.Scanner;

/**
 * Created by ashishnayak on 25-Oct-2020||1:20 PM
 * <p>
 * Question 9:
 * Using the switch statement, write a menu driven program :
 * (i) To check and display whether a number input by the user is a composite number or not
 * (A number is said to be a composite, if it has one or more than one factor excluding 1 and the number itself).
 * Example : 4, 6, 8, 9
 * (ii) To find the smallest digit of an integer that is input.
 * Sample inputs: 6524
 * Sample output: Smallest digit is 2
 * For an incorrect choice, an appropriate error message should be displayed.
 */
public class MenuQues9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to check if a number is a composite number or not");
        System.out.println("Enter 2 to find the smallest digit of an integer");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number to check for composite number:: ");
                int number = scanner.nextInt();
                boolean isComposite = false;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isComposite = true;
                        break;
                    }
                }
                if (isComposite)
                    System.out.println(number + " is a composite number");
                else
                    System.out.println(number + " is not a composite number");
                break;

            case 2:
                System.out.print("Enter a number to find the smallest digit:: ");
                number = scanner.nextInt();
                int smallestDigit = number % 10;
                while (number != 0) {
                    int digit = number % 10;
                    if (digit < smallestDigit)
                        smallestDigit = digit;
                    number /= 10;
                }
                System.out.print("Smallest digit : " + smallestDigit);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
