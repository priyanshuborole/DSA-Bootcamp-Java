package com.priyanshu.Sorting;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7}; // 7,8,9,10
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        sort(g);
        sort(s);
        int content = 0;
        int childIndex = 0;
        for(int i=0; i < s.length && childIndex < g.length; i++) {
            if(s[i] >= g[childIndex]) {
                childIndex++;
                content++;
            }
        }
        return content;
    }
    static void sort(int[] nums){
        boolean swapped;
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j]<nums[j-1]){
                    swap(nums,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
