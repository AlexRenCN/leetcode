package com.alex.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No500 {
    public static void main(String[] args) {
        //System.out.println('a'-0);
        //System.out.println('z'-0);
        String[] res=findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String str:res){
            System.out.println(str);
        }

    }
    private static final int[] rows=new int[]{
    //a b c d e f g
      2,3,3,2,1,2,2,
    //h i j k l m n
      2,1,2,2,2,3,3,
    //o p q r s t
      1,1,1,1,2,1,
    //u v w x y z
      1,3,1,3,1,3
    };

    public static String[] findWords(String[] words) {
        int arrayIndex=0;
        for (String str:words){
            if(str==null ||str.length()<1){
                continue;
            }
            String temstr=str.toLowerCase();
            int index=rows[temstr.charAt(0)-'a'];
            boolean flag=true;
            for (int i=1;i<temstr.length();i++){
                if(rows[temstr.charAt(i)-'a'] !=index){
                    flag=false;
                    break;
                }
            }
            if(flag){
                words[arrayIndex++]=str;
            }
        }
        return Arrays.copyOf(words,arrayIndex);
    }
}