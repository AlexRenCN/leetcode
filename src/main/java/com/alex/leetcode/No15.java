package com.alex.leetcode;

import java.util.*;

public class No15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        //int[] nums = new int[]{0,0,0,0};

        threeSum(nums);
        System.out.println("");
        System.out.println("======");
        for (List<Integer> list : RESULT) {
            for (Integer anint : list) {
                System.out.print(anint);
            }
            System.out.println();
        }
    }


    static List<List<Integer>> RESULT = new LinkedList<>();

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            if (nums[i] > 0) {
                break;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    RESULT.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                if (sum <=0) {
                    while (nums[j]==nums[++j] && j<k);
                }
                if (sum >=0) {
                    while (nums[k--]==nums[k]&& j<k);
                }
            }
            while (nums[i]==nums[++i] &&nums.length-2>i );
        }

        return RESULT;
    }
}