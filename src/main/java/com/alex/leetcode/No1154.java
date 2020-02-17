package com.alex.leetcode;

public class No1154 {
    public static void main(String[] args) {
        //2019-01-09


        System.out.println(dayOfYear("1900-03-25"));
    }



    public static int dayOfYear(String date) {
        int res=0;
        int[] arrs=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int years=Integer.valueOf(date.substring(0,4));
        boolean flag=years%4==0 && years%100!=0;
        if(flag){
            arrs[2]++;
        }
        int month=Integer.valueOf(date.substring(5,7));
        for(int i=1;i<month;i++){
            res+=arrs[i];
        }
        int day=Integer.valueOf(date.substring(8,10));
        res+=day;
        return res;
    }

}