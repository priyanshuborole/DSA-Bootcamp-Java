package com.priyanshu.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int [] arr){
        boolean swapped;
        // run the step n-1 times
        for (int i = 0; i < arr.length;i++){
            swapped = false;
            //for each step max item will come at last resp. index
            for (int j = 1; j < arr.length-i; j++){
                // swap if the item is smaller than the prev item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1] =  temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the program.
            //we r doing this to optimise the code
            if (!swapped){
                break;
            }
        }
    }
}
