package com.priyanshu.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {
    public static void main(String[] args) {
        int [] arr = {1, -2, 3, 4, -6};
        System.out.println(getPositiveCumulativeSum(arr));
    }
    static List<Integer> getPositiveCumulativeSum (int[] arr) {
        // add your logic here
        List<Integer> sum = new ArrayList<>();
        int [] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pSum[i] = pSum[i-1]+arr[i];
        }
        for (int j : pSum) {
            if (j > 0) {
                sum.add(j);
            }
        }
        return sum;
    }
}
