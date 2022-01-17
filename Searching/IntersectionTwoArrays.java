package com.priyanshu.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        intersect(nums1,nums2);

    }
    static void intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int start1 = 0;
        int start2 = 0;
        List<Integer> arr = new ArrayList<>();
        int last = -1;

        while(start1 < nums1.length && start2 < nums2.length){
            if(last !=  nums1[start1]&&nums1[start1] == nums2[start2]){
                arr.add(nums2[start2]);
                last = (nums2[start2]);
                start1++;
                start2++;
            }
            if(nums1[start1] > nums2[start2]){
                start2++;
            }
            if(nums1[start1] < nums2[start2]){
                start1++;
            }
        }

        int[] commonArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            commonArr[i] = arr.get(i);
        }
        for (int ar:commonArr
             ) {
            System.out.print(ar + " ");
        }
    }
}
