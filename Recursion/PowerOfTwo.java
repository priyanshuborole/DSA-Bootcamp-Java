package com.priyanshu.Recursion;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        if (n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        if (n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);

        /*
        static boolean isPowerOfTwo(int x){
           return ((x & (x - 1)) == 0);
           }
           The binary representation of a power-of-two 2y is a 1 followed only by 0s.
           In such a case, x − 1 generates a binary number where the 1s turn into 0s and the former 0s turn into 1s.
           For example, 8 = 1000b and 8 − 1 = 7 = 0111b.
           If x and x − 1 are binary ANDed then the result is only 0 if x is a power of two
         */
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
}
