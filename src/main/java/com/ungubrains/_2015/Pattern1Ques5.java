package com.ungubrains._2015;

/**
 * Created by ashishnayak on 14-Oct-2020||10:13 PM
 * <p>
 * Question 5
 * Write two separate programs to generate the following patterns using iteration(loop) statements:
 * (a)
 * *
 * * #
 * * # *
 * * # * #
 * * # * # *
 * (b)
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 */

/*program to generate
 *   *
 *   * #
 *   * # *
 *   * # * #
 *   * # * # *
 */
public class Pattern1Ques5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0)
                    System.out.print("* ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}

/* Program to generate
 *      5 4 3 2 1
 *      5 4 3 2
 *      5 4 3
 *      5 4
 *      5
 */
class Pattern2Ques5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
