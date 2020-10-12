package main.java.com.ungubrains;

import java.util.Scanner;

/**
 * Created by ashishnayak on 12-Oct-2020||10:04 PM
 *
 * Question 6.
 * Write a program to input 15 integer elements in an array and sort them in ascending order using the bubble sort technique.
 */
public class BubbleSort {

    public static void main(String[] args){
        BubbleSort sort = new BubbleSort();

        int[] arr = new int[15];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 15 integers to sort in ascending order::");
        for(int i=0; i<15; i++){
            arr[i] = scanner.nextInt();
        }

        sort.bubbleSort(arr);
        sort.displayArr(arr);
    }

    //logic to sort the array
    void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i=0; i<len; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //display the sorted array
    void displayArr(int[] arr){
        System.out.println("Array sorted in ascending order::");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
