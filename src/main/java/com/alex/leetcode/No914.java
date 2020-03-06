package com.alex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No914 {

    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        System.out.println(hasGroupsSizeX(new int[]{1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
        System.out.println(hasGroupsSizeX(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}));


    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap(deck.length / 2);
        for (int anint : deck) {
            map.put(anint, map.getOrDefault(anint, 0)+1);
        }
        int res = 0;
        for (int anint : map.values()) {
            res = gcd(anint, res);
        }
        return res > 1;
    }

    /**
     * 最小公约数
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

}