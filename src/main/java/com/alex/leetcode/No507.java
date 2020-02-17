package com.alex.leetcode;

public class No507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if(num<5){
            return false;
        }
        int sum=1;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                sum+=i;
                sum+=num/i;
            }
        }
        return sum==num;
    }

}