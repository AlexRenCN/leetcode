package com.alex.leetcode;

public class No1323 {
    public static void main(String[] args) {
        //System.out.println('6'+0);
        //System.out.println('9'+0);
        //System.out.println(54-6);
        //System.out.println(57-9);

        System.out.println(maximum69Number(9669));
    }
    public static int maximum69Number (int num) {
        char[] chars=String.valueOf(num).toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='6'){
                chars[i]='9';
                break;
            }
        }
        int res=0;
        for(int i=0;i<chars.length;i++) {
            res*=10;
            res+=chars[i]-48;
        }
        return res;
    }
}