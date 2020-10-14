package com.ungubrains._2016;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||9:27 PM
 * <p>
 * Question 9:
 * Write a program to initialise the seven Wonders of the World along with their locations in two different arrays.
 * Search for a name of the country input by the user. If found, display the name of the country along with its Wonder,
 * otherwise display “Sorry Not Found!”.
 * Seven wonders — CHICHEN ITZA, CHRIST THE REDEEMER, TAJMAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA, COLOSSEUM
 * Locations — MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY
 * Example — Country Name: INDIA   Output: INDIA-TAJMAHAL
 * Country Name: USA   Output: Sorry Not Found!
 */
public class SevenWondersQues9 {
    public static void main(String[] args) {
        String[] sevenWonders = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String[] countries = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Country:: ");
        String country = scanner.nextLine();
        int indexFound = -1;

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase(country))
                indexFound = i;
        }

        if (indexFound != -1)
            System.out.println(countries[indexFound] + "-" + sevenWonders[indexFound]);
        else
            System.out.println("Sorry Not Found!");
    }
}
