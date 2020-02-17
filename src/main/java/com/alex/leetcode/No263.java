package com.alex.leetcode;

public class No263 {
    public static void main(String[] args) {
        System.out.println(isUgly(0));

        System.out.println(isUgly(6));
        System.out.println(isUgly(8));
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0 && isUgly(num / 2)) {
            return true;
        }
        if (num % 3 == 0 && isUgly(num / 3)) {
            return true;
        }
        if (num % 5 == 0 && isUgly(num / 5)) {
            return true;
        }
        return false;
    }
}