package com.alex.leetcode;

import java.util.*;

public class No3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(lengthOfLongestSubstring(" "));//1
        System.out.println(lengthOfLongestSubstring("au"));//2
        System.out.println(lengthOfLongestSubstring("aab"));//2

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    j = s.length();
                } else {
                    set.add(s.charAt(j));
                }
                if (maxLength < set.size()) {
                    maxLength = set.size();
                }
            }
        }
        return maxLength > 0 ? maxLength : s.length();
    }
    //public static int lengthOfLongestSubstring(String s) {
    //    char[] chars=s.toCharArray();
    //    if(chars.length==1){
    //        return 1;
    //    }
    //    int maxLength=-1;
    //    for (int i=0;i<chars.length;i++){
    //        char first=chars[i];
    //        int length=0;
    //        for(int j=i+1;j<chars.length;j++){
    //            length++;
    //            if(chars[j]==first){
    //                if(maxLength<length){
    //                    maxLength=length;
    //                }
    //                break;
    //            }
    //        }
    //    }
    //    return maxLength>0?maxLength:chars.length;
    //}
}