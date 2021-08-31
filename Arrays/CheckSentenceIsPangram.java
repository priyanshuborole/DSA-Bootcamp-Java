package com.priyanshu.Arrays;

public class CheckSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char [] pangram = sentence.toCharArray();
        int count = 0;
        for(char i = 'a' ; i <='z' ; i++){
            count = 0;
            for(int j = 0; j < sentence.length(); j++){
                if(pangram[j]==i){
                    count+=1;
                }
            }
            if (count==0){
                System.out.println("false");
            }

        }

    }
}
