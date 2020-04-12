package com.alex.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class No46 {

    public static void main(String[] args) {

        List<List<Integer>> res=permute(new int[]{1,2,3});
        for (List<Integer> list:res){
            for (Integer anint:list){
                System.out.print(anint);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> queue=new LinkedList();
        int[] used=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            permute(nums,used,i,new ArrayList<Integer>(),queue);
        }
        return queue;
    }

    /**
     *
     * @param nums  参数
     * @param used  使用标记
     * @param i 当前下标
     * @param current   当前队列
     * @param queue 队列集合
     */
    public static void permute(int[] nums,int[] used,int i,List<Integer> current,List<List<Integer>> queue){
        //检查使用标记
        if(used[i]==1){
            return;
        }
        //进行使用标记
        used[i]=1;
        current.add(nums[i]);
        //递归里凑了一整组
        if(current.size()==nums.length){
            //记录到结果中,需要使用副本，current还要继续操作
            queue.add(new ArrayList<>(current));
            //递归里去除标记位
            used[i]=0;
            //递归里去除最后一位，交给上层，补最后一位
            current.remove(current.size()-1);
            return;
        }
        //还没有组成一整组
        for(int j=0;j<nums.length;j++){
            permute(nums,used,j,current,queue);
        }
        //去除标记位
        used[i]=0;
        //去除最后一位，交给主函数，补最后一位
        current.remove(current.size()-1);
    }

}