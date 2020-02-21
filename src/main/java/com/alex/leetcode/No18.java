package com.alex.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No18 {

    public static void main(String[] args) {
        //System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2},0));

        //System.out.println(fourSum(new int[]{-1,0,1,2,-1,-4},-1));

        System.out.println(fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0));


    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //循环处理数组
        for (int i = 0; i < nums.length - 3; i++) {
            //4sum去重,不能连续出现两个相同数字，否则结果会有重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //转化为3sum
            for (int j = i + 1; j < nums.length - 2; j++) {
                //3sum去重,不能连续出现两个相同数字，否则结果会有重复
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                //转化为2sum,定义左右游标
                int begin = j + 1, end = nums.length - 1;
                while (begin < end) {
                    int temTarget = target - nums[i] - nums[j];
                    int sum = nums[begin] + nums[end];
                    if (sum > temTarget) {
                        end--;
                    } else if (sum < temTarget) {
                        begin++;
                    } else {
                        //不能连续出现两个相同数字，否则结果会有重复
                        //if (begin == j + 1 || nums[begin] != nums[begin - 1]) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[begin], nums[end]));
                        //}
                        while (begin < end && nums[begin] == nums[begin + 1]) {
                            begin++;
                        }
                        while (begin < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        //在取出结果后两端指针都向中间变化，继续寻找
                        begin++;
                        end--;
                    }
                }
            }
        }
        return res;
    }
}