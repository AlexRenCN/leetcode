package com.alex.leetcode;

public class No11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
    //暴力解法
    //public static int maxArea(int[] height) {
    //    int max = 0;
    //    for (int i = 0; i < height.length; i++) {
    //        for (int j = height.length - 1; j > i; j--) {
    //            int min = Math.min(height[i], height[j]);
    //            max=Math.max(max,min * (j - i));
    //        }
    //    }
    //    return max;
    //}
    //双指针解法
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while (left<right){
            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return area;
    }
}