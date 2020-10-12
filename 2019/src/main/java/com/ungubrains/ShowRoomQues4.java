package main.java.com.ungubrains;

import java.util.Scanner;

/**
 * Created by ashishnayak on 12-Oct-2020||5:29 PM
 * =====================================================================================================================
 * Question 4.
 * Design a class name ShowRoom with the following description :
 * Instance variables/ Data members :
 * String name – To store the name of the customer
 * long mobno – To store the mobile number of the customer
 * double cost – To store the cost of the items purchased
 * double dis – To store the discount amount
 * double amount – To store the amount to be paid after discount
 * Member methods: –
 * ShowRoom() – default constructor to initialize data members
 * void input() – To input customer name, mobile number, cost
 * void calculate() – To calculate discount on the cost of purchased items, based on following criteria
 *
 * Cost                                                 |          Discount (in percentage)
 * ----------------------------------------------------------------------------------------------
 * Less than or equal to ₹ 10000                        |                    5%
 * More than ₹ 10000 and less than or equal to ₹ 20000  |                   10%
 * More than ₹ 20000 and less than or equal to ₹ 35000  |	                15%
 * More than ₹ 35000                                    |                   20%
 * ----------------------------------------------------------------------------------------------
 * void display() – To display customer name, mobile number, amount to be paid after discount
 * Write a main method to create an object of the class and call the above member methods.
 * =====================================================================================================================
 */
public class ShowRoomQues4 {

    String name; //To store the name of the customer
    long mobno; //To store the mobile number of the customer
    double cost; //To store the cost of the items purchased
    double dis; //To store the discount amount
    double amount; //To store the amount to be paid after discount

    //default constructor to initialize data members
    public ShowRoomQues4() {
        this.name = "";
        this.mobno = 0;
        this.cost = 0;
        this.dis = 0;
        this.amount = 0;
    }

    //To input customer name, mobile number, cost
    void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:: ");
        name = scanner.nextLine();

        System.out.println("Enter mobile number:: ");
        mobno = scanner.nextLong();

        System.out.println("Enter cost:: ");
        cost = scanner.nextDouble();

    }

    //To calculate discount on the cost of purchased items
    void calculate(){
        if (cost<=10000){
            dis = cost * 5/100;
            amount = cost - dis;
        }else if (cost>10000 && cost<=20000){
            dis = cost * 10/100;
            amount = cost - dis;
        }else if (cost>20000 && cost<=35000){
            dis = cost * 15/100;
            amount = cost - dis;
        }else if (cost>35000){
            dis = cost * 20/100;
            amount = cost - dis;
        }
    }

    //To display customer name, mobile number, amount to be paid after discount
    void display(){
        System.out.println("############################################################################################");
        System.out.println("Customer name:: " + name);
        System.out.println("Mobile number:: " + mobno);
        System.out.println("Amount:: " + amount);
        System.out.println("############################################################################################");
    }

    public static void main(String[] args){
        ShowRoomQues4 showRoom = new ShowRoomQues4();
        showRoom.input();
        showRoom.calculate();
        showRoom.display();
    }
}
