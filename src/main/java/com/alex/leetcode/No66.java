package com.alex.leetcode;

import java.util.Arrays;

public class No66 {
    public static void main(String[] args) {

        int[] res = plusOne(new int[]{8,9,9,9});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println("====");
        res = plusOne(new int[]{1,2,4});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println("====");
        res = plusOne(new int[]{9});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println("====");
        res = plusOne(new int[]{0});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println("====");
    }

    public static int[] plusOne(int[] digits) {

        boolean flag = false;
        for (int i = digits.length-1; i > -1; i--) {
            int tem=digits[i];
            if(tem==9){
                flag=true;
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        if (flag) {
            int[] news = new int[digits.length + 1];
            news[0] = 1;
            for (int i = 1; i < news.length; i++) {
                news[i] = digits[i - 1];
            }
            return news;
        }
        return digits;
    }
}