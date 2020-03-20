package com.alex.leetcode;

import java.util.Arrays;

public class No189 {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate(new int[]{-1,-100,3,99}, 2);
        rotate(new int[]{-1}, 2);

    }

    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = i + k > nums.length - 1 ? (i + k) % nums.length : i + k;
            res[index] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=res[i];
        }
        nums = res;
        System.out.println(Arrays.toString(nums));
    }

}