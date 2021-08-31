package com.priyanshu;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int count = 0, remainder, result = 0;
        int temp = num;
        int num2 = num;

        while(temp!=0){
            temp = temp/10;
            count++;
        }
        System.out.println(count);
        while(num2!=0){
           remainder = num2%10;
           result += Math.pow(remainder,count);
           num2 = num2/10;
        }
        System.out.println(result);
        if (result==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
