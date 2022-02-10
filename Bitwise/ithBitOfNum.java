package com.priyanshu.Bitwise;

public class ithBitOfNum {
    private static int findBit(int n, long bit, boolean dec){
        int decimal =  (int) (bit & (1<<(n-1)));
        int binary =  (int) (bit & (1<<(n-1)))>>(n-1);
        if (dec){
            return decimal;
        }else{
            return binary;
        }
    }
    public static void main(String[] args) {
        int bitPos =  5;
        long bit = 11110111;
        System.out.println(findBit(bitPos,bit,false));
    }
}
