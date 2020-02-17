package com.alex.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No107 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode r1 = new TreeNode(9);
        TreeNode r2 = new TreeNode(20);
        TreeNode r3 = new TreeNode(15);
        TreeNode r4 = new TreeNode(7);
        root.left = r1;
        root.right = r2;
        r2.left = r3;
        r2.right = r4;
        //TreeNode root = new TreeNode(1);
        //TreeNode r1 = new TreeNode(2);
        //TreeNode r2 = new TreeNode(3);
        //TreeNode r3 = new TreeNode(4);
        //TreeNode r4 = new TreeNode(5);
        //root.left = r1;
        //root.right = r2;
        //r2.left = r3;
        //r2.right = r4;
        List<List<Integer>> res=levelOrderBottom(root);
        for (List<Integer> e: res){
            for (Integer i:e){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static List<List<Integer>> RES=new LinkedList<>();

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return RES;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list=new LinkedList();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode t=queue.poll();
                list.add(t.val);
                if(t.left!=null){
                    queue.add(t.left);
                }
                if(t.right!=null){
                    queue.add(t.right);
                }
            }
            RES.add(0,list);
        }
        return RES;
    }
}