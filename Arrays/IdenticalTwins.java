package com.priyanshu.Arrays;

public class IdenticalTwins {
    public static void main(String[] args) {

    }
    static int getIdenticalTwinsCount (int[] arr) {
        // add your logic here
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
