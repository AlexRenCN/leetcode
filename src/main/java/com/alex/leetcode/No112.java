package com.alex.leetcode;

public class No112 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    static boolean flag=false;
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(flag==true){
            return flag;
        }
        if(root==null){
            return false;
        }
        sum-=root.val;
        if(root.left==null && root.right==null) {
            flag= sum == 0;
        }
        if(root.left!=null){
            hasPathSum(root.left,sum);
        }
        if(root.right!=null){
            hasPathSum(root.right,sum);
        }
        return flag;
    }

}