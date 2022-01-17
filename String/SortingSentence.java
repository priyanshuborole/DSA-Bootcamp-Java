package com.priyanshu.String;

public class SortingSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    static String sortSentence(String s) {
        String [] str =  s.split(" ");
        String [] ans = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(String word : str){

            i = word.charAt(word.length()-1)-'0';
            System.out.println(i);
            int j = word.charAt(word.length()-1);
            System.out.println(j);
            ans[i-1] = word.substring(0,word.length()-1);
        }
        for(i = 0; i < ans.length-1; i++){
            sb.append(ans[i]).append(" ");
        }
        sb.append(ans[i]);

        return sb.toString();
    }
}

