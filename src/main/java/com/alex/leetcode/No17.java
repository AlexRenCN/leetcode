package com.alex.leetcode;

import java.sql.SQLOutput;
import java.util.*;

public class No17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
    static String[] keys = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0){
            return new ArrayList<>();
        }
        StringBuilder sb=new StringBuilder();
        List<String> res=new ArrayList<>();
        append(digits,0,sb,res);
        res.forEach(s -> System.out.println(s));
        return res;
    }
    public static void append(String digits,int index,StringBuilder sb,List<String> res){
        if(index==digits.length()){
            res.add(sb.toString());
            return;
        }
        int digitsInt=digits.charAt(index)-48;
        char[] chars=keys[digitsInt].toCharArray();
        for (int i=0;i<chars.length;i++){
            append(digits,index+1,sb.append(chars[i]),res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    //static Map<Integer,String> MAPPING;
    //static {
    //    MAPPING=new HashMap<>();
    //    MAPPING.put(2,"abc");
    //    MAPPING.put(3,"def");
    //    MAPPING.put(4,"ghi");
    //    MAPPING.put(5,"jkl");
    //    MAPPING.put(6,"mno");
    //    MAPPING.put(7,"pqrs");
    //    MAPPING.put(8,"tuv");
    //    MAPPING.put(9,"wxyz");
    //
    //}
    //public static List<String> letterCombinations(String digits) {
    //    LinkedList<String> queue=new LinkedList();
    //
    //    for (int i=0;i<digits.length()-1;i++){
    //        int index=Character.getNumericValue(digits.charAt(i));
    //        queue.add(MAPPING.get(2));
    //        //queue.add(MAPPING.get(digits.charAt(index)));
    //        while (queue.peek().length()==i){
    //            String s=queue.remove();
    //            for (char c:MAPPING.get(index).toCharArray()){
    //                queue.add(s+c);
    //            }
    //        }
    //    }
    //    return queue;
    //}

}