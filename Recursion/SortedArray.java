package com.priyanshu.Recursion;

public class SortedArray {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6};
        System.out.println(isSorted(num,0));

    }

    static boolean isSorted(int [] num , int index){
        if (index == num.length-1){
            return true;
        }
        return num[index] < num[index+1] && isSorted(num, index+1);
    }


}
