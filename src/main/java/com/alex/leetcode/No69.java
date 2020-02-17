package com.alex.leetcode;

public class No69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    /**
     * 使用牛顿迭代法求平方根
     * @param x
     * @return
     */
    public static int mySqrt(int x) {

        long r = x;
        while (r * r > x) {
            r =(r+x/r)/2;
        }
        return (int)r;
    }
}