package com.ungubrains._2015;

import java.util.Scanner;

/**
 * Created by ashishnayak on 14-Oct-2020||9:48 PM
 * <p>
 * Question 4.
 * Define a class ParkingLot with the following description:
 * Instance variables/data members:
 * int vno – To store the vehicle number
 * int hours – To store the number of hours the vehicle is parked in the parking lot
 * double bill – To store the bill amount
 * Member methods:
 * void input() – To input and store vno and hours
 * void calculate() – To compute the parking charge at the rate of Rs.3 for the first hour or part thereof,
 * and Rs.1.50 for each additional hour or part thereof.
 * void display() – To display the detail
 * Write a main method to create an object of the class and call the above methods
 */
public class ParkingLotQues4 {
    int vno; //To store the vehicle number
    int hours; //To store the number of hours the vehicle is parked in the parking lot
    double bill; //To store the bill amount

    public static void main(String[] args) {
        ParkingLotQues4 parkingLot = new ParkingLotQues4();
        parkingLot.input();
        parkingLot.calculate();
        parkingLot.display();
    }

    //To input and store vno and hours
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle number:: ");
        vno = scanner.nextInt();
        System.out.println("Enter number of hours parked:: ");
        hours = scanner.nextInt();
    }

    //To compute the parking charge
    void calculate() {
        bill = 3 + (hours - 1) * 1.50;
    }

    //To display the detail
    void display() {
        System.out.println("============================================================================================");
        System.out.println("Vehicle number:: " + vno);
        System.out.println("Hours parked:: " + hours);
        System.out.println("Amount to be paid:: Rs " + bill);
        System.out.println("============================================================================================");
    }
}
