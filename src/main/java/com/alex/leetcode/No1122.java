package com.alex.leetcode;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class No1122 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,2,6,6,8,8,9,9,5,10,14,15}, new int[]{5, 8, 10})));

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        //记录a1出现次数,【TreeMap直接保证了升序】
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            countMap.put(arr1[i], countMap.getOrDefault(arr1[i], 0) + 1);
        }
        //【插入arr2】
        int index = 0;
        for (int i : arr2) {
            int count = countMap.get(i);
            for (int j = 0; j < count; j++) {
                arr1[index++] = i;
            }
            countMap.remove(i);
        }
        for (int i : countMap.keySet()) {
            int count = countMap.get(i);
            for (int j = 0; j < count; j++) {
                arr1[index++] = i;
            }
        }
        return arr1;
    }

}