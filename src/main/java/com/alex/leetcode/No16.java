package com.alex.leetcode;

import java.util.Arrays;

public class No16 {

    public static void main(String[] args) {

        //2
        //System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));

        System.out.println(threeSumClosest(new int[]{-3,-2,-5,3,-4},-1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int tem=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k= nums.length-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return target;
                }
                if(Math.abs(sum-target)<Math.abs(tem-target)){
                    tem=sum;
                }
                if(sum<target){
                    j++;
                }
                if(sum>target){
                    k--;
                }
            }
        }
        return tem;
    }

}