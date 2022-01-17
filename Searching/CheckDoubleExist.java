package com.priyanshu.Searching;

import java.util.Arrays;

public class CheckDoubleExist {
    public static void main(String[] args) {
        int [] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int ar : arr){
            if(ar!=0){
                if(binarySearch(ar,arr)){
                    return binarySearch(ar,arr);
                }
            }
        }
        return false;
    }
    static boolean binarySearch (int target,int[] num){
        int start =0;
        int end = num.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(num[mid] == target){
                return true;
            }
            if(num[mid] > target){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
}
