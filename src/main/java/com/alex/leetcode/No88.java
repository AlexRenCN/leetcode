package com.alex.leetcode;

public class No88 {
    public static void main(String[] args) {
        //merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        int[] num = new int[]{0};
        merge(num, 0, new int[]{1}, 1);
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println("");
    }

    //public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //    int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
    //    while (tail1 >= 0 && tail2 >= 0) {
    //        nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
    //                nums1[tail1--] : nums2[tail2--];
    //    }
    //
    //    while (tail2 >= 0) { //only need to combine with remaining nums2
    //        nums1[finished--] = nums2[tail2--];
    //    }
    //}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int mlen = m - 1;
        int nlen = n - 1;
        while (mlen >= 0 && nlen >= 0) {
            nums1[len--] = nums1[mlen] > nums2[nlen] ? nums1[mlen--] : nums2[nlen--];
        }
        while (nlen >= 0) {
            nums1[len--] = nums2[nlen--];
        }
    }
}