package com.priyanshu.Searching;

public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));

    }
    static int countNegatives(int[][] grid) {
        int  count = 0;
        for(int i = 0; i < grid.length; i++){
            int start = 0;
            int end = grid[i].length;
            while(start <  end){
                int mid = start + (end - start)/2;
                if(grid[i][mid] < 0){
                    for (int j = mid; j < end; j++) {
                        count++;
                        System.out.println(count + " " + i);
                    }
                    end = mid;
                }
                if(grid[i][mid] >=0){
                    start = mid+1;
                }
            }
        }
        return count;
    }
}
