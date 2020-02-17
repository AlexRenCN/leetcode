package com.alex.leetcode;


public class No4 {
    public static void main(String[] args) {
        //int[] nums1 = new int[]{1, 2};
        //int[] nums2 = new int[]{3, 4};
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1 == null ? 0 : nums1.length, l2 = nums2 == null ? 0 : nums2.length;
        int mergeLength = l1 + l2;
        boolean isOdd = mergeLength % 2 == 1;
        int middle = mergeLength >> 1;
        int i1 = 0, i2 = 0;
        int[] newArray = new int[mergeLength];
        //TODO 改成一半
        //for (int i = 0; i < middle; i++) {
        for (int i = 0; i < middle + 1; i++) {
            if (i2 == l2) {
                newArray[i] = nums1[i1];
                i1++;
                continue;
            }
            if (i1 == l1) {
                newArray[i] = nums2[i2];
                i2++;
                continue;
            }
            if (nums1[i1] <= nums2[i2]) {
                newArray[i] = nums1[i1];
                i1++;
                continue;
            }
            if (nums1[i1] > nums2[i2]) {
                newArray[i] = nums2[i2];
                i2++;
                continue;
            }
        }
        if (isOdd) {
            return newArray[middle];
        } else {
            return (newArray[middle - 1] + newArray[middle]) / 2.0;
        }
    }

}