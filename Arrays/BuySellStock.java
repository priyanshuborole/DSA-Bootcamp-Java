package com.priyanshu.Arrays;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int index = prices.length;
        int diff =0;
        if(prices.length<=1){
            return 0;
        }
        if(prices.length==2){
            if(prices[0]<prices[1]){
                return prices[1]-prices[0];
            }
            return 0;

        }
        for (int n : prices) {
            if (n > min) {
                if (diff < n - min) {
                    diff = n - min;
                }
            } else {
                min = n;
            }
        }
        return diff;

    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
