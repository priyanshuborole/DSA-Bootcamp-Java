package com.priyanshu.Searching;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        int m =2;
        System.out.println(splitArray(arr,m));

    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i =0; i < nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while (start<end){
            int mid = start + (end-start)/2;

            // calc how many pieces u can divide this in with this max sum
            int sum = 0;
            int pieces =1;
            for (int num : nums){
                if (sum + num > mid ){
                    //add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum+= num;
                }
            }
            if (pieces > m){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
