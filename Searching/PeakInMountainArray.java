package com.priyanshu.Searching;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int [] bs = {1,4,5,6,5,3};
        System.out.println(peakSearch(bs));

    }
    public static int peakSearch(int[] bs){
        int start = 0;
        int end = bs.length-1;

        while(start < end) {
            //taking mid;
            int mid = start + (end - start) / 2;
            //if element is greater than next element of that element
            if (bs[mid] > bs[mid+1]) {
                /*then it is decreasing array
                this may be the answer or answer can also lie to left
                so we defining end as mid  */
                end = mid;
            }
            //if element is lesser than next element of that element
            else if (bs[mid] < bs[mid+1]) {
                /*then its increasing array and
                we know mid +1 is greater so answer will lie right
                so we define start as mid+1  */
                start = mid + 1;
            }
        }
        /*In the end, when start == end which will point towards largest
        number because of the 2 checks above. Start and end  are always trying
        to find max element in above 2 checks. So when they are pointing to just
        one element ,that is max one*/
        return bs[start];
    }
}
