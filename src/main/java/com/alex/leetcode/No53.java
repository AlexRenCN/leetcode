package com.alex.leetcode;

import java.util.Arrays;

public class No53 {

    public static void main(String[] args) {
        //System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int tem=0;
        for (int i=0;i<nums.length;i++){
            tem=Math.max(tem,0)+nums[i];
            max=Math.max(max,tem);
        }
        return max;
    }
}