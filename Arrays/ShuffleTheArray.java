package com.priyanshu.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int nums [] = {2,5,1,3,4,7};
        int n = 3;
        int shuffleArr [] = new int [nums.length];
        int j = 0;
        //2,3,5,4,1,7
        for(int i = 0; i < nums.length; i++){
            if(i%2==0){
                shuffleArr[i]=nums[j];
            }
            else{
                shuffleArr[i]= nums[n+j];
                j++;
            }
        }
        for (int shufflearr: shuffleArr
             ) {
            System.out.print(shufflearr+" ");
        }

// Other Approach
        /*int[] shuffledArray = new int[n * 2];

        for(int i = 0, k=0; i< nums.length /2; i++,k+=2) {
            shuffledArray[k] = nums[i];
            shuffledArray[k+1] = nums[n + i];

        }
        for (int shuffledArr: shuffledArray
        ) {
            System.out.print(shuffledArr+" ");
        }*/
        }

    }

