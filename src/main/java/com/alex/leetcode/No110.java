package com.alex.leetcode;

public class No110 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        calaDepth(root);
        return flag;
    }
    static boolean flag=true;
    public static int calaDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        int lDepth=calaDepth(node.left);
        int rDepth=calaDepth(node.right);
        if(Math.abs(lDepth-rDepth)>1){
            flag=false;
        }
        return Math.max(lDepth,rDepth)+1;
    }

}