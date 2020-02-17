package com.alex.leetcode;

public class No8 {
    public static void main(String[] args) {
        //0~9
        //48~57

        //42
        System.out.println(myAtoi(" 42"));
        //-42
        System.out.println(myAtoi("   -42"));
        //-2147483648
        System.out.println(myAtoi("-91283472332"));
        //4193
        System.out.println(myAtoi("4193 with words"));
        //1
        System.out.println(myAtoi("+1"));
        //0
        System.out.println(myAtoi("+-2"));
        //0
        System.out.println(myAtoi("   +0 123"));
        //2147483647
        System.out.println(myAtoi("2147483648"));
        //2147483647
        System.out.println(myAtoi("2147483800"));
        //-2147483648
        System.out.println(myAtoi("-91283472332"));
        //0
        System.out.println(myAtoi("-   234"));
        //0
        System.out.println(myAtoi( "0  123"));
        //0
        System.out.println(myAtoi( "0-1"));

    }



    public static int myAtoi(String str) {
        /**
         * 为正数
         */
         Boolean POSITIVE = null;
        /**
         * 结果
         */
         Long RESULT = null;

        char[] chars = str.toCharArray();
        int index=0;
        for (int i = 0; i < chars.length; i++) {
            char c=chars[i];
            if(' '==c){
                if(POSITIVE!=null ||RESULT!=null){
                    break;
                }
                continue;
            }
            if('+'==c){
                if(POSITIVE!=null ||RESULT!=null){
                    break;
                }
                POSITIVE=true;
                continue;
            }
            if('-'==c){
                if(POSITIVE!=null ||RESULT!=null){
                    break;
                }
                POSITIVE=false;
                continue;
            }
            if(!isNum(c)){
                break;
            }
            if (RESULT == null) {
                RESULT = new Long(0);
            }
            RESULT = RESULT * 10;
            RESULT += c - '0';
            if (null == POSITIVE || POSITIVE) {
                if (RESULT > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (RESULT > Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        if (RESULT == null) {
            RESULT = new Long(0);
        }
        return null == POSITIVE || POSITIVE ? RESULT.intValue() : -RESULT.intValue();
    }
    public static boolean isNum(char c) {
        return c >= 48 && c <= 57;
    }

}