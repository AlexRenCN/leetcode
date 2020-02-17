package com.alex.leetcode;

public class No111 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        //TreeNode root = new TreeNode(3);
        //TreeNode r1 = new TreeNode(9);
        //TreeNode r2 = new TreeNode(20);
        //TreeNode r3 = new TreeNode(15);
        //TreeNode r4 = new TreeNode(7);
        //root.left = r1;
        //root.right = r2;
        //r2.left = r3;
        //r2.right = r4;
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(5);
        root.left = r1;
        root.right = r2;
        r1.left = r3;
        r1.right = r4;
        System.out.println(minDepth(root));
    }
    static int MIN=Integer.MAX_VALUE;
    public static int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        calaDepth(root,1);
        return MIN;
    }
    public static int calaDepth(TreeNode node,int depth){
        if(node.left==null && node.right==null){
            MIN=Math.min(MIN,depth);
            return depth;
        }
        depth++;
        if(node.left!=null){
            calaDepth(node.left,depth);
        }
        if(node.right!=null){
            calaDepth(node.right,depth);
        }
        return depth;
    }

}