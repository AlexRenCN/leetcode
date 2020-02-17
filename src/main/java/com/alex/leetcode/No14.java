package com.alex.leetcode;


/**
 * 编写一个函数来查找字符串数组中最长的公共前缀字符串。
 *
 * 如果没有公共前缀，则返回空字符串""。
 **
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * 说明：输入字符串中没有公共前缀。
 * 注意：
 *
 * 所有给定的输入都是小写字母a-z。
 * @author alex
 */
public class No14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }
        String commonStr=strs[0];
        for (int i=1;i<strs.length;i++){
            while (!strs[i].startsWith(commonStr)){
                commonStr=commonStr.substring(0,commonStr.length()-1);
            }
        }
        return commonStr;
    }
}