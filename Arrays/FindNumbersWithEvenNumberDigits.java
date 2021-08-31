package com.priyanshu.Arrays;

public class FindNumbersWithEvenNumberDigits {
    public static int countNum(int digit){
        int count = 0;
        while(digit!=0){
            digit = digit/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int even = 0;
        for (int i = 0; i < nums.length; i++){
            int number = countNum(nums[i]);
            if (number%2==0){
                even+=1;
            }
        }
        System.out.println(even);

    }
}
