package com.alex.leetcode;

import org.junit.Test;

public class No1Test {

    int[] intArray = new int[]{-1, -2, -3, -4, -5};

    int target = -8;

    @Test
    public void twoSum() {

        int[] result = No1.twoSum(intArray, target);
        System.out.println("result ");
        for (int anInt :
                result) {
            System.out.println(anInt);
        }
    }


}