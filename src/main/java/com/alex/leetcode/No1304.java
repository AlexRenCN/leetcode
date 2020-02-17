package com.alex.leetcode;

public class No1304 {

    public static void main(String[] args) {
        int[] ints=sumZero(9);
        for (int i:ints){
            System.out.print(" "+i);
        }
        System.out.println("--------------");
    }
    public static int[] sumZero(int n) {
        int[] res=new int[n];
        int index=0;
        for (int i=1;i<(n/2)+1;i++){
            res[index++]=i;
            res[index++]=-i;
        }
        if(n%2!=0){
            res[index++]=0;
        }
        return res;
    }

}