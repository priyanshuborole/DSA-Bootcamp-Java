package com.priyanshu;

public class build_array_from_permutation {
    public static void main(String[] args){
        int nums [] = {0,2,1,5,3,4};
        int pnums [] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            pnums[i]=nums[nums[i]];
        }
        for (int pnum : pnums) {
            System.out.print(pnum + " ");
        }
    }
}
