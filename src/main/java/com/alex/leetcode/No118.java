package com.alex.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No118 {
    public static void main(String[] args) {
        List<List<Integer>> lists=generate(5);
        for (int i=0;i<lists.size();i++){
            List<Integer> list=lists.get(i);
            for (int j=0;j<list.size();j++){
                System.out.print(" "+list.get(j));
            }

            System.out.println();
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    row.add(1);
                    continue;
                }else {
                    int a = res.get(i - 1).get(j - 1);
                    int b = res.get(i - 1).get(j);
                    row.add(a + b);
                }
            }
            res.add(row);
        }
        return res;
    }
    //0 1

    //0 1   1 1

    //0 1   1 2    2 1

    //0 1   1 3    2 3    3 1

}