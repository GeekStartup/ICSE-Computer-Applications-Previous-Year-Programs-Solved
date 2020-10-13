package com.ungubrains._2017;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||6:38 PM
 * <p>
 * Question 4.
 * Define a class ElectricBill with the following specifications :
 * class : ElectricBill
 * Instance variables /data member :
 * String n – to store the name of the customer
 * int units – to store the number of units consumed
 * double bill – to store the amount to be paid
 * Member methods :
 * void accept ( ) – to accept the name of the customer and number of units consumed
 * void calculate ( ) – to calculate the bill as per the following tariff :
 * Number of units          Rate per unit
 * First 100 units          Rs. 2.00
 * Next 200 units           Rs. 3.00
 * Above 300 units          Rs. 5.00
 * A surcharge of 2.5% charged if the number of units consumed is above 300 units.
 * <p>
 * void print ( ) - to print the details as follows:
 * Name of the customer:....................
 * Number of units consumed:................
 * Bill amount:.............................
 * <p>
 * Write a main method to create an object of the class and call the above member methods.
 */
public class ElectricBillQues4 {

    String n; //to store the name of the customer
    int units; //to store the number of units consumed
    double bill; //to store the amount to be paid

    public static void main(String[] args) {
        ElectricBillQues4 electricBill = new ElectricBillQues4();
        electricBill.accept();
        electricBill.calculate();
        electricBill.print();
    }

    //to accept the name of the customer and number of units consumed
    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the customer:: ");
        n = scanner.nextLine();
        System.out.println("Enter number of units consumed:: ");
        units = scanner.nextInt();

    }

    //to calculate the bill as per the tariff
    void calculate() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units > 100 && units <= 300) {
            bill = 100 * 2.00 + (units - 100) * 3.00;
        } else {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            double surcharge = 2.5 / 100 * bill;
            bill += surcharge;
        }
    }

    //to print the details of the bill
    void print() {
        System.out.println("============================================================================================");
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
        System.out.println("============================================================================================");
    }
}
