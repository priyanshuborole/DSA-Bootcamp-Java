package com.priyanshu.Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }

    static int heightChecker(int[] heights) {
        int count = 0;
        if (heights[0] > heights[1] || heights[heights.length - 1] < heights[heights.length - 2]) {
            count++;
        }
        for (int i = 1 ; i < heights.length-1;i++){
            if (heights[i] > heights[i-1] && heights[i]<heights[i+1]){
                count++;
            }
        }
        return count;
    }
}