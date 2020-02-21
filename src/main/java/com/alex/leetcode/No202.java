package com.alex.leetcode;


public class No202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {
        if(n==1 || n==7){
            return true;
        }
        if(n<10){
            return false;
        }
        int res=0,tem=0;
        while (n>9) {
            tem = n % 10;
            res += tem * tem;
            n=n/10;
        }
        res+=n*n;
        if(res==1){
            return true;
        }else {
            return isHappy(res);
        }
    }
}