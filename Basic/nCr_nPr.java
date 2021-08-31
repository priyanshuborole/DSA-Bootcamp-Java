package com.priyanshu;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n of nPr/nCr ");
        int n = sc.nextInt();
        System.out.print("Enter the r of nPr/nCr ");
        int r = sc.nextInt();
        int nfact = 1;
        for (int i = 2; i <= n; i++){
            nfact= nfact * i;
        }
        int rfact = 1;
        for (int i = 2; i <= r; i++){
            rfact= rfact * i;
        }
        int nrfact = 1;
        for (int i = 2; i <= n-r ; i++){
            nrfact= nrfact * i;
        }
        int nPr = nfact/nrfact;
        System.out.println(n+"P"+r+" = "+nPr);
        int nCr = nfact/(rfact*nrfact);
        System.out.println(n+"C"+r+" = "+nCr);
    }
}
