package com.alex.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No260 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    public static int[] singleNumber(int[] nums) {
        int x = nums[0];
        //经过一次循环找到a^b
        for (int i = 1; i < nums.length; i++) {
            x ^= nums[i];
        }
        //找到一位数字，区分ab二进制的其中一位差异
        int bit = x & ~(x - 1);
        int num0 = 0, num1 = 0;
        for (int anint : nums) {
            //分组，相同数字会进入一组通过^运算抵消，不同数字会落在两个结果上
            if ((anint & bit) > 0) {
                num0 ^= anint;
            } else {
                num1 ^= anint;
            }
        }
        return new int[]{num0, num1};
    }
    //public static int[] singleNumber(int[] nums) {
    //    Set<Integer> set = new HashSet<>();
    //    for (int anint : nums) {
    //        if (set.contains(anint)) {
    //            set.remove(anint);
    //        } else {
    //            set.add(anint);
    //        }
    //    }
    //    int[] res = set.stream().mapToInt(Number::intValue).toArray();
    //    return res;
    //}

}