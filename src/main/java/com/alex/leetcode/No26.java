package com.alex.leetcode;

/**
 * 排序数组中删除重复项
 * 给定一个已排序的数组nums，删除重复项，以使每个元素仅出现一次并返回新的长度。
 * 不要为另一个数组分配额外的空间，必须通过使用O（1）额外的内存,使用本数组就地修改输入数组来做到。
 */
public class No26 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int a = removeDuplicates(nums);
        System.out.println(a);
    }

    //public static int removeDuplicates(int[] nums) {
    //    int newLength = 0;
    //    Integer temInt = null;
    //    for (int num : nums) {
    //        if (temInt == null || num > temInt) {
    //            temInt = num;
    //            nums[newLength] = num;
    //            newLength++;
    //        }
    //    }
    //    return newLength;
    //}

    public static int removeDuplicates(int[] nums) {
        int newLetgth=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>nums[newLetgth]){
                nums[++newLetgth]=nums[i];
            }
        }
        return newLetgth+1;
    }
}