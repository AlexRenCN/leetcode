package com.alex.leetcode;

public class No896 {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
    }
    public static boolean isMonotonic(int[] A) {
        int flag=0;
        for (int i=0;i<A.length-1;i++){
            if(flag>0){
                if(A[i]<A[i+1]){
                    return false;
                }
            }else if(flag<0){
                if(A[i]>A[i+1]){
                    return false;
                }
            }else {
                flag=A[i]-A[i+1];
            }
        }
        return true;
    }
}