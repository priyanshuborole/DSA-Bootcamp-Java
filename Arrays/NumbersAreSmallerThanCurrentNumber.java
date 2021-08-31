package com.priyanshu.Arrays;

public class NumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int count = 0;
        int [] countNum = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            for (int j = 0; j < nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    count+=1;
                }
            }
            countNum[i] = count;
            count = 0;
        }
        for (int cNum:countNum
             ) {
            System.out.print(cNum + " ");

        }

    }
}
