package com.priyanshu.Sorting;

import java.util.Arrays;

public class ArrayPartition1 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i+=2){
            result+=nums[i];
        }
        return result;
    }
}
