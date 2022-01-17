package com.priyanshu.String;

import java.util.Locale;

public class CheckTwoStringArrayEqual {
    public static void main(String[] args) {
        String [] word1 = {"ab","c"};
        String [] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String letter1 : word1){
            sb1.append(letter1);
        }
        for(String letter2 : word2){
            sb2.append(letter2);
        }
        String k = sb1.toString().toLowerCase();
        return sb1.toString().equals(sb2.toString());
    }
}
