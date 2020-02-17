package com.alex.leetcode;

public class No38 {
    public static void main(String[] args) {
        ////1. 1
        System.out.println(countAndSay(1));
        ////2. 11
        System.out.println(countAndSay(2));
        ////3. 21
        System.out.println(countAndSay(3));
        ////4. 1211
        System.out.println(countAndSay(4));
        ////5. 111221
        System.out.println(countAndSay(5));
        //6. 312211
        System.out.println(countAndSay(6));
        //7. 13112221
        System.out.println(countAndSay(7));
        ////8. 1113213211
        System.out.println(countAndSay(8));
        ////9. 31131211131221
        System.out.println(countAndSay(9));
        ////10. 13211311123113112211
        System.out.println(countAndSay(10));

    }
    public static String countAndSay(int n) {
        if(1==n){
            return "1";
        }
        String res= countAndSay(n-1);
        char[] resChars=res.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        int j=0;
        int tem=0;
        for(int i=0;i<resChars.length;i++){
            char c=resChars[i];
            if(c==resChars[tem]){
                j++;
            }else{
                stringBuilder.append(j).append(resChars[tem]);
                tem=i;
                j=1;
            }
        }
        stringBuilder.append(j).append(resChars[tem]);
        return stringBuilder.toString();
    }
}