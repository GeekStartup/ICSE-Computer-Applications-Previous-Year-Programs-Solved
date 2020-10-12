package main.java.com.ungubrains;

/**
 * Created by ashishnayak on 12-Oct-2020||10:42 PM
 *
 * Question 7.
 * Design a class to overload a function series() as follows:
 * (a) void series (int x, int n) – To display the sum of the series given below:
 * x^1 + x^2 + x^3 + ……………+ x^n terms
 * (b) void series (int p) – To display the following series:
 * 0, 7, 26, 63 p terms.
 * (c) void series () – To display the sum of the series given below:
 *  1/2 + 1/3 + 1/4+....+1/10
 */
public class OverloadedSeriesQues7 {

    //Solution for a
    void series (int x, int n){
        long sum = 0;
        for(int i=0; i<n; i++){
            sum+=Math.pow(x,i);
        }
        System.out.println("Sum of " + x +"^1 + " + x +"^2 + " + x +"^3 + ...... + " + x +"^" + n + "::\t" + sum);
    }

    //Solution for b
    void series (int p){
        for(int i=1; i<=p; i++){
            System.out.print((int)(Math.pow(i,3))-1 + ", ");
        }
    }

    //Solution for c
    void series (){
        double sum = 0.0;
        for(int i=2; i<=10; i++){
            sum+=(double)1/i;
        }
        System.out.println("\nSum of 1/2 + 1/3 + 1/4+....+1/10:: " + sum);
    }

    public static void main(String[] args){
        OverloadedSeriesQues7 seriesQues7 = new OverloadedSeriesQues7();
        seriesQues7.series(5,7);
        seriesQues7.series(10);
        seriesQues7.series();
    }
}
