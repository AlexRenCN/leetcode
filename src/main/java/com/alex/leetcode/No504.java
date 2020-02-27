package com.alex.leetcode;

public class No504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }

    public static String convertToBase7(int num) {
        int res = 0;
        //中间变量处理每次的位
        int base = 1;
        while (num != 0) {
            res += base * (num % 7);
            num /= 7;
            base *= 10;
        }
        return Integer.toString(res);
    }


}