package com.ungubrains._2014;

import java.util.Scanner;

/**
 * Created by ashishnayak on 18-Oct-2020||9:33 AM
 * <p>
 * Question 4.
 * Define a class named movieMagic with the following description:
 * Instance variables/data members:
 * int year – to store the year of release of a movie
 * String title – to store the title of the movie.
 * float rating – to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0)
 * Member Methods:
 * (i) movieMagic() Default constructor to initialize numeric data members to 0 and String data member to “”.
 * (ii) void accept() To input and store year, title and rating.
 * (iii) void display() To display the title of a movie and a message based on the rating as per the table below.
 * RATING MESSAGE TO BE DISPLAYED 0.0 to 2.0 Flop 2.1 to 3.4 Semi-hit 3.5 to 4.5 Hit 4.6 to 5.0 Super Hit
 * Write a main method to create an object of the class and call the above member methods.
 */
public class MovieMagicQues4 {
    int year; //to store the year of release of a movie
    String title; //to store the title of the movie.
    float rating; //to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0)

    //Default constructor
    public MovieMagicQues4() {
        this.year = 0;
        this.title = "";
        this.rating = 0.0f;
    }

    public static void main(String[] args) {
        MovieMagicQues4 movieMagic = new MovieMagicQues4();
        movieMagic.accept();
        movieMagic.display();
    }

    //To input and store year, title and rating.
    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of movie release:: ");
        year = scanner.nextInt();
        System.out.print("Enter the title of movie:: ");
        scanner.nextLine();
        title = scanner.nextLine();
        System.out.print("Enter rating of the movie:: ");
        rating = scanner.nextFloat();
    }

    //To display the title of a movie and a message based on the rating
    void display() {
        String ratingDisplay;
        System.out.println("============================================================================================");
        System.out.println("Title of the movie : " + title);
        if (rating >= 0.0 && rating <= 2.0)
            ratingDisplay = "Flop";
        else if (rating >= 2.1 && rating <= 3.4)
            ratingDisplay = "Semi-hit";
        else if (rating >= 3.5 && rating <= 4.5)
            ratingDisplay = "Hit";
        else
            ratingDisplay = "Super Hit";
        System.out.println("Rating of the movie : " + ratingDisplay);
        System.out.println("============================================================================================");
    }
}
