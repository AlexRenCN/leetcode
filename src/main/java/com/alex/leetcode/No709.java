package com.alex.leetcode;

import java.util.Arrays;

public class No709 {
    public static void main(String[] args) {
        //System.out.println(toLowerCase(""));
        System.out.println('A' - 0);
        System.out.println('Z' - 0);
        System.out.println('a' - 0);
        System.out.println('z' - 0);
        //System.out.println('A'+'a');
        //System.out.println('B'+'b');
        //System.out.println('C'+'c');
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            char c=chars[i];
            if (64 < c && c < 91) {
                chars[i] = (char) (c + 32);
            }
        }
        return new String(chars);
    }
}