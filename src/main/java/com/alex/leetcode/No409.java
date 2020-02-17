package com.alex.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No409 {
    public static void main(String[] args) {
        //97~122
        //System.out.println('a' + 0);
        //System.out.println('z' + 0);
        //65~90
        //System.out.println('A' + 0);
        //System.out.println('Z' + 0);
        //System.out.println(longestPalindrome("a"));
        //System.out.println(longestPalindrome("abccccdd"));
        String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));

    }

    public static int longestPalindrome(String s) {
        int count=0;
        int[] chars=new int[58];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)-65]++;
        }
        for (int i:chars){
            count+=(i/2)*2;
        }
        return s.length()==count?count:count+1;
    }

}