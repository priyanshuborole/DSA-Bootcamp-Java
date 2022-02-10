package com.priyanshu.Recursion;

import com.priyanshu.Searching.BinarySearch;

public class BinarySearchRecursion {
    public static int BinarySearchRec(int [] arr, int target , int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                return  BinarySearchRec(arr,target,mid+1,end);
            }
            if (target < arr[mid]){
                return  BinarySearchRec(arr,target,start,mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] bs = {2,3,4,5,6,11,16,17};
        int x = BinarySearchRec(bs,16,0, bs.length-1);
        System.out.println(x);
    }
}
