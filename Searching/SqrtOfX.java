package com.priyanshu.Searching;
//https://leetcode.com/problems/sqrtx/
public class SqrtOfX {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    static int mySqrt(int x) {
        int i = 1;
        int j = x/2;
        if(x <= 1)
            return x;

        if(x <= 0) return 0;
        while(i<=j){
            int mid = (i + j)/2;
            if(mid == x/mid){
                return mid;
            }
            if(mid < x/mid){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return i-1;
    }
}
