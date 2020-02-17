package com.alex.leetcode;

public class No415 {
    public static void main(String[] args) {
        System.out.println(addStrings("1","1"));
        System.out.println(addStrings("12005","205"));

    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.toCharArray().length;
        int j=num2.toCharArray().length;
        int carry=0;
        while (i>0 || j>0){
            int sum=carry;
            if(i>0){
                sum+=num1.charAt(--i)-'0';
            }
            if(j>0){
                sum+=num2.charAt(--j)-'0';
            }
            sb.append(sum%10);
            carry=sum/10;
        }
        if(carry>0){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}