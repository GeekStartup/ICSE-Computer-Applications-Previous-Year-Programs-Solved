package com.ungubrains._2016;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||1:59 PM
 * <p>
 * Question 4.
 * Define a class named BookFair with the following description:
 * <p>
 * Instance variables/Data members:
 * <p>
 * String Bname – stores the name of the book.
 * double price – stores the price of the book.
 * <p>
 * Member Methods:
 * <p>
 * (i) BookFair() Default constructor to initialize data members.
 * <p>
 * (ii) void Input() To input and store the name and the price of the book.
 * <p>
 * (iii) void calculate() To calculate the price after discount. Discount is calculated based on the following criteria.
 * <p>
 * Price	                                            Discount
 * Less than or equal to Rs 1000	                    2% of price
 * More than Rs 1000 and less than or equal to Rs 3000	10% of price
 * More than Rs 3000	                                15% of price
 * (iv) void display() To display the name and price of the book after discount.
 * <p>
 * Write a main method to create an object of the class and call the above member methods.
 */
public class BookFairQues4 {
    String Bname; //stores the name of the book.
    double price; //stores the price of the book.

    //default constructor
    public BookFairQues4() {
        this.Bname = "";
        this.price = 0.0;
    }

    public static void main(String[] args) {
        BookFairQues4 bookFair = new BookFairQues4();
        bookFair.Input();
        bookFair.calculate();
        bookFair.display();
    }

    //To input and store the name and the price of the book.
    void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the book::");
        Bname = scanner.nextLine();
        System.out.println("Enter price of the book::");
        price = scanner.nextDouble();
    }

    //To calculate the price after discount.
    void calculate() {
        if (price <= 1000)
            price = price - (price * 2 / 100);
        else if (price > 1000 && price <= 3000)
            price = price - (price * 10 / 100);
        else
            price = price - (price * 15 / 100);
    }

    //To display the name and price of the book after discount.
    void display() {
        System.out.println("============================================================================================");
        System.out.println("Name of the book:: " + Bname);
        System.out.println("Price of the book:: Rs " + price);
        System.out.println("============================================================================================");
    }
}
