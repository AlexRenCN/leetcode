package com.alex.leetcode;


/**
 * 最长回文子串
 * <p>
 * 给定一个字符串小号，发现最长的回文子小号。您可以假设s的最大长度为1000。
 * <p>
 * 范例1：
 * 输入：babad
 * 输出：bab
 * 注意：aba也是有效答案。
 * <p>
 * 范例2：
 * 输入：cbbd
 * 输出： bb
 */
public class No5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));

    }

    public static String longestPalindrome(String s) {
        if(null==s || s.length()==0){
            return "";
        }
        int startIndex = 0, endIndex = 0, length = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int odd = getLength(chars, i, i);
            int even = getLength(chars, i, i + 1);
            int newLen=odd>even?odd:even;
            if(newLen>length){
                startIndex=i-(newLen-1)/2;
                endIndex=i+newLen/2;
                length=newLen;
            }
        }
        return s.substring(startIndex, endIndex+1);
    }

    public static int getLength(char[] chars, int start, int end) {
        int s = start, e = end;
        while (s >= 0 && e < chars.length && chars[s] == chars[e]) {
            s--;
            e++;
        }
        return e-s-1;
    }
}