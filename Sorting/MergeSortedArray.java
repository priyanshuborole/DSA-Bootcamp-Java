package com.priyanshu.Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6 ;
        int [] nums2 = {1,2,2};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++){
            if (i < m+n && k < n){
                nums1[i]=nums2[k];
                k++;
            }
        }
        boolean swapped;
        for (int i = 0; i < nums1.length; i++){
            swapped = false;
            for (int j = 1; j < nums1.length - i; j++){
                if (nums1[j-1] > nums1[j]){
                    int temp = nums1[j];
                    nums1[j] =  nums1[j-1];
                    nums1[j-1] =  temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }


    }
}
