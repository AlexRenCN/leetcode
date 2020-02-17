package com.alex.leetcode;

public class No342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(-79));
        System.out.println(isPowerOfFour(-64));


        System.out.println(0 % 4);
    }

    public static boolean isPowerOfFour(int num) {
        return Integer.toString(num, 4).matches("^10*$");
    }


}