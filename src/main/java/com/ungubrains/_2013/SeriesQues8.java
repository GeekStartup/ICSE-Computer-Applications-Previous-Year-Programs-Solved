package com.ungubrains._2013;

/**
 * Created by ashishnayak on 25-Oct-2020||11:50 AM
 * <p>
 * Question 8:
 * Design a class to overload a function series() as follows:
 * (i) double series(double n) with one double argument and returns the sum of the series.
 * sum = 1/1 + 1/2 + 1/3 +.....+ 1/n
 * (ii) double series(double a, double n) with two double arguments and returns the sum of the series.
 * sum = 1/a^2 + 4/a^5 + 7/a^8 + 10/a^11 +.....+ to n terms
 */
public class SeriesQues8 {
    //test
    public static void main(String[] args) {
        SeriesQues8 series = new SeriesQues8();
        System.out.println("Sum of Series(i):: " + series.series(3));
        System.out.println("Sum of Series(ii):: " + series.series(3, 3));
    }

    double series(double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    double series(double a, double n) {
        double sum = 0.0;
        int numerator = 1;
        int power = 2;
        for (int i = 0; i < n; i++) {
            sum += numerator / Math.pow(a, power);
            numerator += 3;
            power += 3;
        }
        return sum;
    }
}
