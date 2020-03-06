package com.alex.leetcode;

public class No704 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //public int search(int[] nums, int target) {
    //
    //    while (left <= right) {
    //        int mid = left + (right - left) / 2;
    //        if (nums[mid] == target) return mid;
    //        if (target < nums[mid]) {
    //            right = mid - 1;
    //        } else {
    //            left = mid + 1;
    //        }
    //    }
    //    return -1;
    //}
}