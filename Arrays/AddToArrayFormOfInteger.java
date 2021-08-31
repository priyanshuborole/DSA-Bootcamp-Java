package com.priyanshu.Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {

        int [] nums = {2,7,4,5,6,0};
        int k = 1181;
        int sum = 0;
        int a = 0;
        int n = nums.length;
        for (int i = n-1; i >= 0; i--){

            sum += nums[i]*Math.pow(10,a);
            a++;
        }
        sum+=k;
        int temp =sum;

        int count =0;
        while (temp!=0){
            temp = temp/10;
            count ++;
        }


        int [] arr = new int[count];
        String x = Integer.toString(sum);
        for (int i = 0; i < x.length();i++){
           arr[i]=x.charAt(i) - '0';
        }
        List<Integer> intArr = new ArrayList<>();
        for (int j : arr){
            intArr.add(j);
        }
        System.out.println(intArr);

    }
}
