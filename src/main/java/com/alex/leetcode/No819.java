package com.alex.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No819 {
    public static void main(String[] args) {
        //System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
        System.out.println(mostCommonWord("Bob. hIt, baLl",new String[]{"bob", "hit"}));
    }

    static final String[] paras = new String[]{"!", "?", "'", ",", ";", "."};

    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String[] strs = paragraph
                .toLowerCase()
                .replace("!"," ")
                .replace("?"," ")
                .replace("'"," ")
                .replace(","," ")
                .replace(";"," ")
                .replace("."," ")
                .replace("  "," ")
                .split(" ");
        Arrays.stream(banned).forEach((s) -> map.put(s.toLowerCase(), -1000));
        String res = null;
        int max = 0;
        for (String s : strs) {
            int v;
            if (map.containsKey(s)) {
                v = map.get(s) + 1;
            } else {
                v = 1;
            }
            map.put(s, v);
            if (v > max) {
                max = v;
                res = s;
            }
        }
        return res;
    }

}