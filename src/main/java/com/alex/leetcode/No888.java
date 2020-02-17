package com.alex.leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class No888 {
    public static void main(String[] args) {
        int[] ints = fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        for (int anint : ints) {
            System.out.print(" " + anint);
        }
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new LinkedHashSet<>();
        int suma = 0, sumb = Arrays.stream(B).sum();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            suma += A[i];
        }
        int sub = (suma - sumb) / 2;
        for (int i=0;i<B.length;i++){
            if(set.contains(sub+B[i])){
                return new int[]{sub+B[i],B[i]};
            }
        }
        return null;
    }
}