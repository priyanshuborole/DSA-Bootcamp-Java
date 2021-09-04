package com.priyanshu.Searching;

import java.util.Arrays;

public class FirstLastPositionInArray {
    public static void main(String[] args) {
        int [] ans = {-1,-1};
        int [] arr = {1,2,3,7,7,7,7,7,8,9,10};
        ans[0] = binarySearch(arr,7,true);
        ans[1] =  binarySearch(arr,7,false);

        for (int ar: ans) {
            System.out.print(ar+" ");
        }

    }
    static int binarySearch(int[] bs, int target,boolean firstELement) {
        int ans = -1;
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
                ans = mid;
                if (firstELement){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans ;
    }
}
