package com.priyanshu.Sorting;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
       for (int i = 0; i < nums.length;i++){
           nums[i]=nums[i]*nums[i];
       }
       Arrays.sort(nums);
       return nums;
    }

    private static void swap(int[] nums, int f, int s) {
    int temp = nums[f];
    nums[f] = nums[s];
    nums[s] = temp;
    }
}
