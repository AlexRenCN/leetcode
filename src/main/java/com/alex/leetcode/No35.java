package com.alex.leetcode;

/**
 * 简单插入
 * 给定排序数组和目标值，如果找到目标，则返回索引。如果不是，则返回按顺序插入索引的位置的索引。
 * 您可以假设阵列中没有重复项。
 */
public class No35 {
    public static void main(String[] args) {
        //2
        System.out.println(searchInsert(new int[]{1,3,5,6},5));
        //1
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        //4
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
        //0
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
    }

    public static int searchInsert(int[] nums, int target) {
        int index=0;
        for (int num:nums) {
            if(target==num){
                return index;
            }
            if(target>num){
                index++;
            }
            if(target<num){
                return index;
            }
        }
        return index;
    }

}