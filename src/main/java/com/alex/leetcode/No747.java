package com.alex.leetcode;

import java.util.Arrays;

public class No747 {
    public static void main(String[] args) {
        //System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
        //System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
        System.out.println(dominantIndex(new int[]{0, 0, 0, 1}));

    }

    public static int dominantIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int a, b, index;
        if (nums[0] > nums[1]) {
            a = nums[0];
            b = nums[1];
            index = 0;
        } else {
            a = nums[1];
            b = nums[0];
            index = 1;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > a) {
                b = a;
                a = nums[i];
                index = i;
            } else if (nums[i] > b) {
                b = nums[i];
            }
        }
        if (b == 0) {
            return index;
        }
        return a / b >= 2 ? index : -1;
    }


}