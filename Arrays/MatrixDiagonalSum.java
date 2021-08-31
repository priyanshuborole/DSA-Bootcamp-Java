package com.priyanshu.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] mat = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };
        int sum=0;
        for(int i=0;i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                if((i==j) || ((i+j==mat.length-1) &&(i!=j)))
                {
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
