package com.alex.leetcode;

public class No67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int sum = 0;
        int carry=0;
        while (al >= 0 || bl >= 0 || carry!=0) {
            sum=carry;
            if (al >= 0) {
                sum += a.charAt(al--) - '0';
            }
            if (bl >= 0) {
                sum += b.charAt(bl--) - '0';
            }
            sb.append(sum%2);
            carry=sum/2;

        }
        return sb.reverse().toString();
    }
}