package com.priyanshu.String;

public class StringHalvesAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
    static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        String [] halves = {s.substring(0,s.length()/2),s.substring(s.length()/2)};
        int k = 0;
        for (int i = 0; i < halves[0].length(); i++){
            if (vowels.indexOf(halves[0].charAt(i)) >= 0){
                k++;
            }
            if (vowels.indexOf(halves[1].charAt(i)) >= 0){
                k--;
            }
        }
        return k == 0;
    }
}
