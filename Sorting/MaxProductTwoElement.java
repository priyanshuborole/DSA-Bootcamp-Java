package com.priyanshu.Sorting;

import java.util.Arrays;

public class MaxProductTwoElement {
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int l = nums.length-1;
        int k = nums.length-2;
        return (nums[l]-1)*(nums[k]-1);
    }

    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j-1, j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
