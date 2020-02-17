package com.alex.leetcode;

/**
 * Two Sum
 * 给定一个整数数组，返回两个数字的索引，他们相加等于指定目标。
 * 您可以假设每个输入只有一个结果，并且可能不会两次使用相同的元素。
 * 例：
 * 给定nums = [2,7,11,15]，target = 9，
 * 因为nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9，
 * 返回[ 0，1 ]。
 * @author alex
 */
public class No1 {

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]+nums[i]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}