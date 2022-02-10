package com.priyanshu.Sorting;

public class FindMedianSortedArrays {
    static double findMedianSortedArrays(int [] nums1, int [] nums2){
        int [] mergedArray = new int[nums1.length+nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                mergedArray[k] = nums1[i];
                i++;
            }
            else{
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        int sum = 0;
        for(int l = 0; l < mergedArray.length ; l++){
            sum+=mergedArray[l];
        }

        double median = 0.0;

        if(mergedArray.length % 2 == 0){
            median = (double) (mergedArray[mergedArray.length/2] + mergedArray[(mergedArray.length/2) - 1])/2;
        }
        else{
            median = mergedArray[mergedArray.length/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int [] num1 = {1,2};
        int [] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
