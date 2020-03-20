package com.alex.leetcode;

import java.util.Arrays;

public class No905 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0,2})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1,3})));

    }
    public static int[] sortArrayByParity(int[] A) {
        int j=A.length-1;
        for(int i=0;i<j;i++){
            while (A[i]%2==1 && i<j){
                A[i]=A[i]+A[j];
                A[j]=A[i]-A[j];
                A[i]=A[i]-A[j];
                j--;
            }
        }
        return A;
    }

}