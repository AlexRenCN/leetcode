package com.alex.leetcode;

public class No1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));

        System.out.println(defangIPaddr("255.100.50.0"));

    }

    public static String defangIPaddr(String address) {
        char[] res = new char[address.length() + 6];
        int index = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                res[index++] = address.charAt(i);
            } else {
                res[index++] = '[';
                res[index++] = address.charAt(i);
                res[index++] = ']';
            }
        }
        return new String(res);
    }
}