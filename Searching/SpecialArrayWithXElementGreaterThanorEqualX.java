package com.priyanshu.Searching;

import java.util.Arrays;

public class SpecialArrayWithXElementGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        System.out.println(specialArray(nums));
        System.out.println(nums.length);
    }
    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<=nums[nums.length-1];i++) {
            int greater = greaterEqualElement(i,nums);
            if (greater - i == 0){
                return i;
            }
        }
        return -1;
    }
    static  int greaterEqualElement(int x , int [] num){
        int start = 0;
        int end = num.length-1;
        int temp = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(num[mid]>=x){
                for(int j = mid; j <= end;j++){
                   temp ++;
                }
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return temp;
    }
}
