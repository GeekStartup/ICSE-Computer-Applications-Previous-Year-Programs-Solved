package com.ungubrains._2016;

/**
 * Created by ashishnayak on 14-Oct-2020||4:45 PM
 * <p>
 * Question 7:
 * Design a class to overload a function SumSeries() as follows:
 * (i) void SumSeries(int n, double x) – with one integer argument and one double argument to find and display the sum of the series given below:
 * S = x/1 - x/2 + x/3 - x/4 + x/5 ........ to n terms
 * <p>
 * (ii) void SumSeries() – To find and display the sum of the following series:
 * S = 1 + (1 x 2) + (1 x 2 x 3) + ........ + (1 x 2 x 3 x 4 x 20)
 */
public class SeriesQues7 {

    //test
    public static void main(String[] args) {
        SeriesQues7 series = new SeriesQues7();
        series.SumSeries(100, 5.0);
        series.SumSeries();
    }

    //find sum and display the result of x/1 - x/2 + x/3 - x/4 + x/5 ........ to n terms
    void SumSeries(int n, double x) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sum -= x / i;
            else
                sum += x / i;
        }
        System.out.println("Sum of " + x + "/1 - " + x + "/2 + " + x + "/3 - " + x + "/4 + " + x + "/5 ........ to " + n + "th term = " + sum);
    }

    //find sum and display the result of S = 1 + (1 x 2) + (1 x 2 x 3) + ........ + (1 x 2 x 3 x 4 x 20)
    void SumSeries() {
        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            int multiply = 1;
            for (int j = 1; j <= i; j++) {
                multiply *= j;
            }
            sum += multiply;
        }
        System.out.println("Sum of 1 + (1 x 2) + (1 x 2 x 3) + ........ + (1 x 2 x 3 x 4 x 20) = " + sum);
    }
}
