package com.priyanshu.Searching;

public class FirstBadVersion {
    static boolean isBadVersion(int version){
        return true; // or false,this func is defined in leetcode,
        // just to get rid of error , initializing this function
    }
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
