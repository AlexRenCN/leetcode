package com.alex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    private static Map<Integer,Integer> CACHE=new HashMap<>();

    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(CACHE.containsKey(n)){
            return CACHE.get(n);
        }
        int result=climbStairs(n-1)+climbStairs(n-2);
        CACHE.put(n,result);
        return result;
    }
}