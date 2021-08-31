package com.priyanshu.Arrays;

import java.util.ArrayList;

import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatNum = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                greatNum.add(true);
            } else {
                greatNum.add(false);
            }
        }
        return greatNum;
    }

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
