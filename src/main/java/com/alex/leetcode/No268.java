package com.alex.leetcode;

public class No268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

    }
    public static int missingNumber(int[] nums) {
        int res=0;
        for (int i=0;i<nums.length;i++){
            res^=i;
            res^=nums[i];
        }
        res^=nums.length;
        return res;
    }
}