package com.priyanshu.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int accounts [][] = {
                {1,2,3},
                {3,2,1}
        };
        int max = 0;
        int sum = 0;
        for(int customer = 0; customer < accounts.length; customer++){
            sum = 0;
            for(int bank = 0; bank < accounts[customer].length; bank++){
                sum=sum+accounts[customer][bank];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
