package com.priyanshu.Recursion;

import java.util.Arrays;

public class ReverseCharArray {
    public static  char[] reverse(char [] s){
        int start = 0;
        int end = s.length-1;
        return swapHelper(s,start,end);
    }
    public static char[] swapHelper(char [] s, int start, int end){
        if (start > end) {
            return s;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return swapHelper(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char [] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverse(s));
    }
}
