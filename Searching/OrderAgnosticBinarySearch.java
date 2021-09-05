package com.priyanshu.Searching;

public class OrderAgnosticBinarySearch {
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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        //int [] arr = {7,6,5,4,3,2,1};
        int start = 0;
        int end = arr.length-1;
        int target = 4;
        System.out.println(ordAgnostic(arr,target,start,end));
    }
}
