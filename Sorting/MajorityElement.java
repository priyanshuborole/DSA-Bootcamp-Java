package com.priyanshu.Sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {4,5,4};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length/2];
    }
    static void sort(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length-i; j++){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
