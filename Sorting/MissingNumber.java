package com.priyanshu.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        cyclic(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i){
                System.out.println(i);
                break;
            }
        }
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] ;
            if ( arr[i] < arr.length && arr[i] != arr[correct] ) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
