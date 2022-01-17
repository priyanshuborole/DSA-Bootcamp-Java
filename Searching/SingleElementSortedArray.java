package com.priyanshu.Searching;

public class SingleElementSortedArray {
    public static void main(String[] args) {

    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                if (nums[mid] != nums[mid+1] && mid != end) {
                    return mid;
                }
                if (nums[mid-1] != nums[mid] && mid != start) {
                    return mid;
                }
            }
            if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
