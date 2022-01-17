package com.priyanshu.Sorting;

import java.util.Arrays;

public class AvgSalaryExcMaxMin {
    public static void main(String[] args) {
        int [] s = {4000,3000,1000,2000};
        System.out.println(average(s));
    }
    static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for(int i = 1; i < salary.length - 1; i++){
            sum+=salary[i];
        }

        double avg = sum/(salary.length-2);
        return avg;
    }
}
