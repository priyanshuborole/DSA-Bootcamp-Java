package com.priyanshu.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] num = {1,2,3,3,3,4,5,6};
        int [] ans;
        System.out.println(isPresent(num,4,0));
        System.out.println(searchIndex(num,4,0));
        searchIndexMultiple(num,3,0);
        System.out.println(list);
    }

    static boolean isPresent(int [] arr, int target , int index){

        if (index == arr.length){
            return false;
        }

        return arr[index] == target || isPresent(arr,target,index+1);

    }
    static int searchIndex(int [] arr, int target , int index){

        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target ){
            return index;
        }
        else{
            return searchIndex(arr,target,index+1);
        }

    }

    //Multiple occurrences

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchIndexMultiple(int [] arr, int target , int index){

        if (index == arr.length){
            return;
        }
        if (arr[index] == target ){
            list.add(index);
        }
        searchIndexMultiple(arr,target,index+1);
    }
}
