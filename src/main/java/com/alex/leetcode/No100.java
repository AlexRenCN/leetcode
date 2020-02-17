package com.alex.leetcode;


public class No100 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(1);
        root.left = r2;
        root.right = r3;
        TreeNode root1 = new TreeNode(1);
        TreeNode r21 = new TreeNode(2);
        TreeNode r31 = new TreeNode(1);
        root1.left = r21;
        root1.right = r31;

        System.out.println(isSameTree(root, root1));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null) || p.val != q.val) {
            return false;
        }
        if (isSameTree(p.left, q.left) == true && isSameTree(p.right, q.right) == true) {
            return true;
        } else {
            return false;
        }
    }
}