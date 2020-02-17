package com.alex.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No119 {
    public static void main(String[] args) {
        List<Integer> list=getRow(3);
        for (int i:list) {
            System.out.print(" "+i);
        }
        System.out.println();
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            res.add(1);
            for(int j=i-1;j>0;j--){
                res.set(j,res.get(j-1)+res.get(j));
            }
        }
        return res;
    }
}