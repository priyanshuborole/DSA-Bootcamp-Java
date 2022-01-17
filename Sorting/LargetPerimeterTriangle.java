package com.priyanshu.Sorting;

import java.util.Arrays;

public class LargetPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 1; i < nums.length-1; i++){
            if (nums[i-1]+nums[i] > nums[i+1]){
               if(sum < nums[i-1]+nums[i] + nums[i+1]){
                   sum = nums[i-1]+nums[i] + nums[i+1];
               }
            }
        }
        return sum;
    }
}
