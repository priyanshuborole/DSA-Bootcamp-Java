package com.priyanshu.Sorting;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));;

    }
    static boolean containsDuplicate(int[] nums){
        sort(nums);
        if (nums.length > 1) {
            for (int i = 0; i < nums.length-1; i++){
                if (nums[i] == nums[i+1]){
                    return true;
                }
            }
        }
        return false;
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
