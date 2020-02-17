package com.alex.leetcode;

public class No283 {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 0, 3, 12};
        moveZeroes(ints);
        for (int anint : ints) {
            System.out.print(" " + anint);
        }
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (i <nums.length) {
            if (nums[i]!=0){
                nums[j++]=nums[i];
            }
            i++;
        }
        for (;j<nums.length;j++){
            nums[j]=0;
        }
    }
}