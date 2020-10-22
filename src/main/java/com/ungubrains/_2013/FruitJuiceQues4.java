package com.ungubrains._2013;

import java.util.Scanner;

/**
 * Created by ashishnayak on 22-Oct-2020||2:48 PM
 * <p>
 * Question 4:
 * Define a class called FruitJuice with the following description:
 * Instance variables/data members:
 * int product_code – stores the product code number
 * String flavour – stores the flavor of the juice.(orange, apple, etc)
 * String pack_type – stores the type of packaging (tetra-pack, bottle etc)
 * int pack_size – stores package size (200ml, 400ml etc)
 * int product_price – stores the price of the product
 * <p>
 * Member methods :
 * (i) FruitJuice() — Default constructor to initialize integer data members to 0 and String data members to “”.
 * (ii) void input( ) — To input and store the product code, flavour, pack type, pack size and product price.
 * (iii) void discount( ) — To reduce the product price by 10.
 * (iv) void display() — To display the product code, flavour, pack type, pack size and product price.
 */
public class FruitJuiceQues4 {
    int product_code; //stores the product code number
    String flavour; //stores the flavor of the juice.(orange, apple, etc)
    String pack_type; //stores the type of packaging (tetra-pack, bottle etc)
    int pack_size; //stores package size (200ml, 400ml etc)
    int product_price; //stores the price of the product

    //Default constructor to initialize data
    public FruitJuiceQues4() {
        this.product_code = 0;
        this.flavour = "";
        this.pack_type = "";
        this.pack_size = 0;
        this.product_price = 0;
    }

    public static void main(String[] args) {
        FruitJuiceQues4 fruitJuice = new FruitJuiceQues4();
        fruitJuice.input();
        fruitJuice.discount();
        fruitJuice.display();
    }

    //To input and store the product code, flavour, pack type, pack size and product price.
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product code:: ");
        product_code = scanner.nextInt();
        System.out.print("Enter flavour:: ");
        scanner.nextLine();
        flavour = scanner.nextLine();
        System.out.print("Enter pack type:: ");
        pack_type = scanner.nextLine();
        System.out.print("Enter pack size:: ");
        pack_size = scanner.nextInt();
        System.out.print("Enter product price:: ");
        product_price = scanner.nextInt();
    }

    //To reduce the product price by 10.
    void discount() {
        product_price -= 10;
    }

    //To display the product code, flavour, pack type, pack size and product price.
    void display() {
        System.out.println("============================================================================================");
        System.out.println("Product Code : " + product_code);
        System.out.println("Flavour : " + flavour);
        System.out.println("Pack type : " + pack_type);
        System.out.println("Pack size : " + pack_size);
        System.out.println("Product price : " + product_price);
        System.out.println("============================================================================================");
    }
}
