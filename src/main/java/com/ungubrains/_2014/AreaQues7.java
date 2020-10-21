package com.ungubrains._2014;

/**
 * Created by ashishnayak on 21-Oct-2020||9:06 AM
 * <p>
 * Question 7.
 * Design a class to overload a function area() as follows:
 * (i) double area(double a, double b, double c) with three double arguments, returns the area of a scalene triangle using the formula:
 * area = sqrt {s(s-a)(s-b)(s-c)}
 * where s = (a+b+c)/2
 * <p>
 * (ii) double area(int a, int b, int height) with three integer arguments, returns the area of a trapezium using the formula:
 * area = 1/2 x height x (a+b)
 * <p>
 * (iii) double area(double diagonal1, double diagonal2) with two double arguments, returns the area of a rhombus using the formula:
 * area = 1/2 x (diagonal 1 x diagonal 2)
 */
public class AreaQues7 {

    //test
    public static void main(String[] args) {
        AreaQues7 areaQues7 = new AreaQues7();
        System.out.println("Area of scalene triangle:: " + areaQues7.area(2.0, 3.0, 4.5));
        System.out.println("Area of a trapezium:: " + areaQues7.area(2, 3, 4));
        System.out.println("Area of a rhombus:: " + areaQues7.area(2.0, 4.5));
    }

    //returns the area of a scalene triangle
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    //returns the area of a trapezium
    double area(int a, int b, int height) {
        double area = (double) 1 / 2 * height * (a + b);
        return area;
    }

    //returns the area of a rhombus
    double area(double diagonal1, double diagonal2) {
        double area = (double) 1 / 2 * (diagonal1 * diagonal2);
        return area;
    }
}
