package com.priyanshu.Searching;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,0));
    }
    static int search (int [] nums , int target){
        int pivot = findPivot(nums);
        // if we not found pivot means array is not rotated
        if (pivot == -1){
            binarySearch(nums,target,0, nums.length-1);
        }
        //if pivot is found we have found 2 ascending array
        if(nums[pivot]==target){
            return pivot;
        }
        if (target > nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }
    public static int binarySearch(int[] bs,int elem,int start, int end){

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (elem == bs[mid]) {
                return mid;
            }
            else if (elem > bs[mid]) {
                start = mid +1;
            }
            else if (elem < bs[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int findPivot(int [] arr){
        //pivot means from where array is changing,basically greatest number here
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end -start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
            }

            if (mid > start && arr[mid]< arr[mid - 1]){
                return mid-1;
            }

            if (arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
