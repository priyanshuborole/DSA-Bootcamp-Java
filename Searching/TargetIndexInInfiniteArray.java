package com.priyanshu.Searching;

public class TargetIndexInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int x = infiniteAns(arr,13);
        System.out.println(x);

    }
    static int infiniteAns (int [] arr,int target){
        //box size of two
        int start = 0;
        int end = 1;
        // condition for target to lie in range
        while(target > arr[end]){
            int newStart = end +1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
         return binarySearch(arr,start,end,target);
    }
    static int binarySearch(int[] bs,int start,int end,int target) {
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>bs[mid]){
                start = mid +1;
            }
            else if (target < bs[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
