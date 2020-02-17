package com.alex.leetcode;

import java.util.Arrays;

public class No136 {
    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{2,2,1}));

        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }
}