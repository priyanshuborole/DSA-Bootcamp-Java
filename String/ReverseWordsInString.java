package com.priyanshu.String;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String [] split = s.split(" ");
        StringBuilder rev = new StringBuilder();
        for(String word : split){
            rev.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return rev.toString().trim();
    }
}
