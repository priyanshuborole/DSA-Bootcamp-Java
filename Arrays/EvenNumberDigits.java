package com.priyanshu.Arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberDigits {
    public static void main(String[] args) {
        //int [] arr = { 42, 564 ,5775 ,34 ,123, 454 ,1, 5, 45 ,3556, 23442};
        int [] arr = { 11,4,200};
        System.out.println(getEvenDigitNumbers(arr));
    }
    static List<Integer> getEvenDigitNumbers (int[] arr) {
        // add your logic her
        List<Integer> evenDig = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "-" + countDigit(arr[i]));
            if(countDigit(arr[i]) % 2 == 0 ){
                evenDig.add(arr[i]);
            }
        }
        return evenDig;
    }

    static int countDigit(int num){
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
}
