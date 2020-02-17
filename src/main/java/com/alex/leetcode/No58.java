package com.alex.leetcode;

public class No58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("a "));

    }
    public static int lengthOfLastWord(String s) {
        char[] chars=s.toCharArray();
        int tem=0;
        for (int i=chars.length;i>0;i--){
            if(chars[i-1]==' '){
                if(tem!=0){
                    return tem;
                }else {
                    continue;
                }
            }
            tem++;
        }
        return tem;
    }
}