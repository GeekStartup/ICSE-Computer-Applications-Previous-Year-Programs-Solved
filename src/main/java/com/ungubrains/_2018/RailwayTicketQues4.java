package com.ungubrains._2018;

import java.util.Scanner;

/**
 * Created by ashishnayak on 13-Oct-2020||11:17 AM
 *
 * Question 4.
 * Design a class Railway Ticket with following description :
 * Instance variables/s data members :
 * String name : To store the name of the customer
 * String coach : To store the type of coach customer wants to travel
 * long mobno : To store customer’s mobile number
 * int amt : To store basic amount of ticket
 * int totalamt : To store the amount to be paid after updating the original amount
 *
 * Member methods
 * void accept ( ) — To take input for name, coach, mobile number and amount
 * void update ( )— To update the amount as per the coach selected
 *
 * Type of Coaches	Amount
 * First_AC	        700
 * Second_AC	    500
 * Third_AC	        250
 * sleeper	        None
 *
 * void display( ) — To display all details of a customer such as name, coach, total amount and mobile number.
 * Write a main method to create an object of the class and call the above member methods.
 */
public class RailwayTicketQues4 {

    //To store the name of the customer
    String name;
    //To store the type of coach customer wants to travel
    String coach;
    //To store customer’s mobile number
    long mobno;
    //To store basic amount of ticket
    int amt;
    //To store the amount to be paid after updating the original amount
    int totalamt;

    //To take input for name, coach, mobile number and amount
    void accept ( ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:: ");
        name = scanner.nextLine();

        System.out.println("Enter coach(First_AC/Second_AC/Third_AC/sleeper)::");
        coach = scanner.nextLine();

        System.out.println("Enter customer mobile number::");
        mobno = scanner.nextLong();

        System.out.println("Enter basic amount of ticket::");
        amt = scanner.nextInt();
    }

    //To update the amount as per the coach selected
    void update ( ){
        switch (coach) {
            case "First_AC":
                totalamt = amt + 700;
                break;
            case "Second_AC":
                totalamt = amt + 500;
                break;
            case "Third_AC":
                totalamt = amt + 250;
                break;
            default:
                totalamt = amt;
                break;
        }
    }

    //To display all details of a customer such as name, coach, total amount and mobile number.
    void display( ){
        System.out.println("============================================================================================");
        System.out.println("Name:: " + name);
        System.out.println("Coach:: " + coach);
        System.out.println("Total Amount:: " + totalamt);
        System.out.println("Mobile Number:: " + mobno);
        System.out.println("============================================================================================");
    }

    public static void main(String[] args){
        RailwayTicketQues4 railwayTicket = new RailwayTicketQues4();
        railwayTicket.accept();
        railwayTicket.update();
        railwayTicket.display();
    }
}
