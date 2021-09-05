package com.priyanshu.Searching;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,7,5,4,3,2};
        int target = 2;
        System.out.println(search(arr,target));
    }
    static int search(int[]arr, int target){
        // peak needed so we know that left of the peak is ascending
        // and right of the peak is descending
        int peak = peakSearch(arr);
        //searching in first half after peak
        int firstTry = ordAgnostic(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        //seaching in second half after peak
        return ordAgnostic(arr, target,peak+1,arr.length-1);
    }

    static int peakSearch(int[] bs){
        int start = 0;
        int end = bs.length-1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (bs[mid] > bs[mid+1]) {
                end = mid;
            }
            else if (bs[mid] < bs[mid+1]) {

                start = mid + 1;
            }
        }
        return start;
    }
    static int ordAgnostic(int [] arr, int target , int start ,int end){
        boolean isAsc = arr[start] < arr[end];
        if (isAsc){
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
                else if (target > arr[mid]) {
                    start = mid +1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        else{
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
                else if (target < arr[mid]) {
                    start = mid +1;
                }
                else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
