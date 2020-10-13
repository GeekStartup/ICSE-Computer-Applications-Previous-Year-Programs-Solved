package com.ungubrains._2018;

/**
 * Created by ashishnayak on 13-Oct-2020||3:01 PM
 * <p>
 * Question 7.
 * Design a class to overload a function volume() as follows :
 * (i) double volume (double R) — with radius (R) as an argument, returns the volume of sphere using the formula.
 * V = 4/3 × 22/7 × R^3
 * (ii) double volume (double H, double R) – with height(H) and radius(R) as the arguments, returns the volume of a cylinder using the formula.
 * V = 22/7 × R^2 × H
 * (iii) double volume (double L, double B, double H) – with length(L), breadth(B) and Height(H) as the arguments, returns the volume of a cuboid using the formula.
 * V = L x B x H
 */
public class VolumesQues7 {

    //Volume of sphere
    double volume(double R) {
        double V = (double) 4 / 3 * 22 / 7 * Math.pow(R, 3);
        return V;
    }

    //Volume of cylinder
    double volume(double H, double R) {
        double V = (double) 22 / 7 * Math.pow(R, 2) * H;
        return V;
    }

    //Volume of cuboid
    double volume(double L, double B, double H) {
        double V = L * B * H;
        return V;
    }

    /*
     * Testing code
     */
    double radius;
    double length;
    double breadth;
    double height;

    public VolumesQues7(double radius, double length, double breadth, double height) {
        this.radius = radius;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public static void main(String[] args) {
        VolumesQues7 volumes = new VolumesQues7(10.7, 5.9, 4.2, 3.5);
        System.out.println("Volume of sphere:: " + volumes.volume(volumes.radius));
        System.out.println("Volume of cylinder:: " + volumes.volume(volumes.height, volumes.radius));
        System.out.println("Volume of cuboid:: " + volumes.volume(volumes.length, volumes.breadth, volumes.height));
    }
}
