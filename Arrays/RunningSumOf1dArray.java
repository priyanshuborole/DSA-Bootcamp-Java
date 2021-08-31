package com.priyanshu.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        int sumArray [] = new int[nums.length];
        //sumArray[0] = nums[0];
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j <= i ;j++){
                sumArray[i]+=nums[j];
            }
        }
        for (int sumArr:sumArray) {
            System.out.print(sumArr+" ");
        }
        //Better Approach
      /*  int[] result = new int[nums.length];

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            result[i] = result[i - 1] + nums[i];
        }
        return result;*/
    }
}
