package com.priyanshu.Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
     int [] res = new int[nums.length];
        Arrays.sort(nums);
        res[0] = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length;i+=2){
            res[k] = nums[i];
            k++;
        }
        return res;
    }
}
