package com.alex.leetcode;

public class No326 {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(45));
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isPowerOfThree(int n) {
        return Integer.toString(n,3).matches("^10*$");
    }
}