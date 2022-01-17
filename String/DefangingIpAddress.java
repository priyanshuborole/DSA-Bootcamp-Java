package com.priyanshu.String;

public class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));

    }
    static String defangIPaddr(String address) {
        String replaceString=address.replace(".","[.]");
        return replaceString;
    }
}
