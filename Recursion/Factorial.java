package com.priyanshu.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int num){
        if (num < 2){
            return 1;

        }
        return num * factorial(num-1);
    }
}
