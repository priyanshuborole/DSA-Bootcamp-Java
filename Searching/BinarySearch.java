package com.priyanshu.Searching;

public class BinarySearch {
    public static int binarySearch(int[] bs,int elem){
        int start = 0;
        int end = bs.length-1;

        while(start <= end) {
            //taking mid;
            int mid = start + (end - start) / 2;
            //if we found element at mid
            if (elem == bs[mid]) {
                return mid;
            }
            //if element is greater than mid,
            //we set new range from start+1 to end
            else if (elem > bs[mid]) {
                start = mid +1;
            }
            //if element is lesser than mid,
            //we set new range from start i.e 0 to end-1;
            else if (elem < bs[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] bs = {2,3,4,5,6,11,16,17};
        int x = binarySearch(bs,16);
        System.out.println(x);
    }
}
