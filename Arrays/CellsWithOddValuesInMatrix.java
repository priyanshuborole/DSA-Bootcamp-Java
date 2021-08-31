package com.priyanshu.Arrays;

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int[][] matrix=new int[m][n];
        int count=0;
        for(int ind=0; ind<indices.length; ind++)
        {
            for(int col=0; col<n; col++)
            {
                matrix[indices[ind][0]][col]++;
            }
            for(int row=0; row<m; row++)
            {
                matrix[row][indices[ind][1]]++;
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int val:matrix[i])
            {
                if(val%2!=0)
                    count++;
            }
        }
        System.out.println(count);

    }
}
