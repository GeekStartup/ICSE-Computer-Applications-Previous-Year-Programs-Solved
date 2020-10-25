package com.ungubrains._2012;

import java.util.Scanner;

/**
 * Created by ashishnayak on 25-Oct-2020||2:04 PM
 * <p>
 * QUESTION 4
 * Define a class called Library with the following description:
 * Instance variables/data members:
 * int acc_num: stores the accession number of the book.
 * String title: stores the title of the book.
 * String author: stores the name of the author.
 * Member functions:
 * (i) void input(): to accept and store the accession number, title and author.
 * (ii) void compute(): to accept the number of days late, calculate and display the fine charged at the rate of Rs. 2 per day.
 * (iii) void display(): to display the details in the following format:
 * Accession Number    Title    Author
 * Write a main() method to create an object of the class and call the above member functions.
 */
public class LibraryQues4 {
    int acc_num; //stores the accession number of the book.
    String title; //stores the title of the book.
    String author; //stores the name of the author.

    public static void main(String[] args) {
        LibraryQues4 library = new LibraryQues4();
        library.input();
        library.compute();
        library.display();
    }

    //to accept and store the accession number, title and author.
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter accession number:: ");
        acc_num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter title:: ");
        title = scanner.nextLine();
        System.out.print("Enter author:: ");
        author = scanner.nextLine();
    }

    //to accept the number of days late, calculate and display the fine charged at the rate of Rs. 2 per day.
    void compute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days late:: ");
        int late = scanner.nextInt();
        int fine = 2 * late;
        System.out.println(" Fine charged : Rs " + fine);
    }

    //to display the details
    void display() {
        System.out.print("Accession Number\tTitle\tAuthor\n");
        System.out.print("\t" + acc_num + "\t" + title + "\t" + author);
    }
}
