package com.priyanshu.Sorting;

import java.util.Arrays;

public class MaxProductOfThreeNum {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int multiply=0;
        int n = nums.length;
        multiply = Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0] * nums[1] * nums[n - 1]);
        return multiply;
    }
    static void sort(int[] nums){
        boolean swapped;
        for (int i = 0 ; i < nums.length; i++){
            swapped = false;
            for (int j = 1; j < nums.length-i; j++){
                if (nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
