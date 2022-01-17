package com.priyanshu.Searching;

public class CeilingOfTheNumber {
    public static void main(String[] args) {
        int[] bs = {2,3,4,5,6,11,16,17};
        int x = binarySearch(bs,15);
        System.out.println(x);
    }


    static int binarySearch(int[] bs, int target) {
        int start = 0;
        int end = bs.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>bs[mid]){
                start = mid +1;
            } else if (target < bs[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        //if target is not found
        // Here start will return the smallest value greater than a target
        if (target < bs[bs.length-1]){
            return bs[start];
        }
        return Integer.MIN_VALUE;
    }
}
