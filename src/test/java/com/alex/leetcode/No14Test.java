package com.alex.leetcode;

import com.alex.leetcode.No14;
import org.junit.Test;

public class No14Test {
    /**
     * Example 1:
     *
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     *
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    @Test
    public void longestCommonPrefix() {
        String[] example1=new String[]{"flower","flow","flight"};
        String[] example2=new String[]{"dog","racecar","car"};
        String[] example3=new String[]{""};
        String[] example4=new String[]{"aa","a"};


        No14 no14 =new No14();
        System.out.println("rev "+ no14.longestCommonPrefix(example1));
        System.out.println("rev "+ no14.longestCommonPrefix(example2));
        System.out.println("rev "+ no14.longestCommonPrefix(example3));
        System.out.println("rev "+ no14.longestCommonPrefix(example4));

    }
}