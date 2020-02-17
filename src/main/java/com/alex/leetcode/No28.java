package com.alex.leetcode;

/**
 * 返回haystack中第一次出现needle索引，如果needle不是haystack的一部分，则返回-1。
 */
public class No28 {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("", "a"));
        System.out.println(strStr("a", "a"));
        System.out.println(strStr("aaa", "aaaa"));

    }


    //public static int strStr(String haystack, String needle) {
    //    for (int i=0; ; i++) {
    //        for(int j=0;;j++){
    //            if(j==needle.length()){
    //                return i;
    //            }
    //            if(i+j == haystack.length()){
    //                return -1;
    //            }
    //            if(haystack.charAt(i+j)!=needle.charAt(j)){
    //                break;
    //            }
    //        }
    //    }
    //}

    public static int strStr(String haystack, String needle) {
        char[] haystackChars=haystack.toCharArray();
        char[] needleChars=needle.toCharArray();
        for (int i=0; ; i++) {
            for(int j=0;;j++){
                if(j==needleChars.length){
                    return i;
                }
                if(i+j==haystack.length()){
                    return -1;
                }
                if(haystackChars[i+j]!=needleChars[j]){
                    break;
                }
            }
        }
    }
}