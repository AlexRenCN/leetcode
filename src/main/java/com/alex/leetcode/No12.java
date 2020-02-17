package com.alex.leetcode;



public class No12 {



    public static void main(String[] args)  {
        System.out.println(intToRoman(3));
    }
    static int[] INTS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    static String[] CHARS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<INTS.length;i++){
            while (num>=INTS[i]){
                num-=INTS[i];
                sb.append(CHARS[i]);
            }
        }
        return sb.toString();
    }

    //public static int calaInt(int num,)
}