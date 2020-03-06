package com.alex.leetcode;

public class No633 {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(2));

    }
    public static boolean judgeSquareSum(int c) {
        //最低
        int left=0;
        //最高
        int right=(int)Math.sqrt(c);
        while (left<=right){
            int sum=left*left+right*right;
            if(sum==c){
                return true;
            }else if(sum>c){
                right--;
            }else {
                left++;
            }
        }
        return false;
    }
}