package com.priyanshu;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String reverseWord = "";
        char [] rev = word.toCharArray();
        for (int i = word.length()-1;i>=0;i--){
            reverseWord += rev[i];
        }
        System.out.println(reverseWord);

    }
}
