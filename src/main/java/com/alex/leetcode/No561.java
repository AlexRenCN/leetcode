package com.alex.leetcode;

import java.util.Arrays;

public class No561 {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }

    public static int arrayPairSum(int[] nums) {
        //从小到大排序
        Arrays.sort(nums);
        int sum=0;
        //用+=2步长，保证较小数是从数组中比较大的部分取出来的
        //比如排序后是  1 2 3 4 5 6 7 8 ，则取数的时候取 1 3 5 7，保证去除的较小数集合加起来最大
        for (int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}