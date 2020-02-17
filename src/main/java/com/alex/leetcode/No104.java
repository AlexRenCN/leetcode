package com.alex.leetcode;

public class No104 {
    public static void main(String[] args) {
        //TreeNode root=new TreeNode(3);
        //TreeNode r1=new TreeNode(9);
        //TreeNode r2=new TreeNode(20);
        //TreeNode r3=new TreeNode(15);
        //TreeNode r4=new TreeNode(7);
        //root.left=r1;
        //root.right=r2;
        //r2.left=r3;
        //r2.left=r4;

        TreeNode root=new TreeNode(1);
        TreeNode r1=new TreeNode(2);
        root.left=r1;
        System.out.println(maxDepth(root));
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    static int MAX_DEEP=1;

    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        calaDeep(root,0);
        return MAX_DEEP;
    }

    public static void calaDeep(TreeNode treeNode,int deep){
        deep++;
        if(treeNode.left==null && treeNode.right==null){
            MAX_DEEP=Math.max(MAX_DEEP,deep);
            return;
        }
        if(treeNode.left!=null){
            calaDeep(treeNode.left,deep);
        }
        if(treeNode.right!=null){
            calaDeep(treeNode.right,deep);
        }
    }
}