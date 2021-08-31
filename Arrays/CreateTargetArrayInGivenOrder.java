package com.priyanshu.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++){
            list.add(index[i],nums[i]);
        }
        int [] target = new int [list.size()];
        for (int i = 0; i < list.size(); i++){
            target[i]= list.get(i);
        }
        for (int targ:target
             ) {
            System.out.print(targ+"");

        }
    }
}
