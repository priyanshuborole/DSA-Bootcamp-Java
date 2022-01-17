package com.priyanshu.Recursion;

public class ProdOfDigits {
    public static void main(String[] args) {
        int prod = prodOfDigits(1717);
        System.out.println(prod);
    }
    static int prodOfDigits(int n){
        if (n%10 == n){
            return 1;
        }
        return (n % 10) * (prodOfDigits(n / 10));
    }
}
