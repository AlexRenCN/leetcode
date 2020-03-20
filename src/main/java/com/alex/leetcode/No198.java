package com.alex.leetcode;

public class No198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(rob(new int[]{2, 1, 1, 2}));


    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] subs = new int[n];
        subs[0] = nums[0];
        subs[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            //计算每一步的最大收益，前面是偷，后面是不偷
            subs[i] = Math.max(subs[i - 2] + nums[i], subs[i-1]);
        }
        return subs[n - 1];
    }
}