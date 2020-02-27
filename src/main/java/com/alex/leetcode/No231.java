package com.alex.leetcode;

public class No231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741825));
    }

    public static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i *= 2;
        }
        return i == n;
    }

}