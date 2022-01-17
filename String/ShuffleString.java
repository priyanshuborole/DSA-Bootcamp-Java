package com.priyanshu.String;

public class ShuffleString {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,0};
        System.out.println(restoreString("aiohn",arr));
    }
    static String restoreString(String s, int[] indices) {
    int n = s.length();
    char[] shuffle = new char[n];
    for(int i = 0; i < n; i++){
        shuffle[indices[i]] = s.charAt(i);
    }
        return new String(shuffle);
    }
}
