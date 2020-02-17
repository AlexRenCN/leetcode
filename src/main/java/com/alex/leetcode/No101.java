package com.alex.leetcode;

public class No101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(2);
        TreeNode r4 = new TreeNode(3);
        TreeNode r5 = new TreeNode(4);
        TreeNode r6 = new TreeNode(4);
        TreeNode r7 = new TreeNode(3);
        root.left = r2;
        root.right = r3;
        r2.left=r4;
        r2.right=r5;
        r3.left=r6;
        r3.right=r7;


        System.out.println(isSymmetric(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null&&root.right==null)){
            return true;
        }
        return isSameTree(root.left,root.right);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null) || p.val != q.val) {
            return false;
        }
        if (isSameTree(p.left, q.right) == true && isSameTree(p.right, q.left) == true) {
            return true;
        } else {
            return false;
        }
    }
}