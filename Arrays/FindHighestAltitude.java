package com.priyanshu.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int [] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int [] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int max = 0;
        for (int i = 1; i < gain.length+1; i++){
            altitude[i] = altitude[i-1]+gain[i-1];
            max = Math.max(max,altitude[i]);
        }
        System.out.println(max);

        //Better Approach
        /*int max=0;
        int curr_alt=0;
        for(int i=0;i<gain.length;i++){
            curr_alt+=gain[i];
            max=Math.max(curr_alt, max);
        }
        return max;*/


    }
}
