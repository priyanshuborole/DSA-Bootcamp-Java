package com.priyanshu.Searching;

public class SmallestLetter {
    public static void main(String[] args) {
        char [] letters = {'a','b','c','f','z'};
        char x = binarySearch(letters,'d');
        System.out.println(x);


    }
    static char binarySearch(char[] bs, char target) {
        int start = 0;
        int end = bs.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>bs[mid]){
                start = mid +1;
            } else if (target < bs[mid]) {
                end = mid - 1;
            }
        }
        //Here we are returning smallest letter greatest than a target
        //we are using modulo two wrap up the char array means,
        //if array is {'a','b'} and target = 'z' ,then output='a'
        return bs[start%bs.length];
    }
}
