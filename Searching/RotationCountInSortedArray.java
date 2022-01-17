package com.priyanshu.Searching;

public class RotationCountInSortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr  ));
    }
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        /*if (pivot == -1){
            return 0;
        }*/
        //as if pivot is -1 (not rotated) it will 0 only,coz -1+1 = 0
        return pivot+1;
    }
    static int findPivot(int [] arr){
        //pivot means from where array is changing,basically greatest number here
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end -start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid]< arr[mid - 1]){
                return mid-1;
            }

            if (arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
