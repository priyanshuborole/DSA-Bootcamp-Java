package com.priyanshu.Sorting;

public class thirdMaxNumber {
    public static void main(String[] args) {
        int [] nums = {5,2,2}; // 1,2,2,3
        System.out.println(thirdMax(nums));;

    }
    static int thirdMax(int[] nums) {
        sort(nums);
        int count = 2;
        for(int i = nums.length-1; i >=1;i--){
            if (nums[i]>nums[i-1]){
                count--;
            }
            if (count==0){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];

    }
    static void sort(int[] nums){
        boolean swapped;
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j]<nums[j-1]){
                    swap(nums,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
