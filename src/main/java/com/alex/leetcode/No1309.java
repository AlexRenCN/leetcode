package com.alex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No1309 {
    //字符（'a'至'i')分别由（'1'至  '9'）表示。
    //字符（'j'至'z')分别由（'10#' 至  '26#'）表示。
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("25#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    private static final char[] MAPPING=new char[]{' ','a','b','c','d','e','f','g','h',
            'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        char[] chars=s.toCharArray();
        for(int i=chars.length-1;i>-1;i--){
            if(chars[i]=='#'){
                int key=(chars[--i]-48)+10*(chars[--i]-48);
                sb.append(MAPPING[key]);
            }else {
                sb.append(MAPPING[chars[i]-48]);
            }
        }
        return sb.reverse().toString();
    }

    //static final Map<Integer,Character> MAPPING=new HashMap<>();
    //static {
    //    MAPPING.put(1,'a');
    //    MAPPING.put(2,'b');
    //    MAPPING.put(3,'c');
    //    MAPPING.put(4,'d');
    //    MAPPING.put(5,'e');
    //    MAPPING.put(6,'f');
    //    MAPPING.put(7,'g');
    //    MAPPING.put(8,'h');
    //    MAPPING.put(9,'i');
    //    MAPPING.put(10,'j');
    //    MAPPING.put(11,'k');
    //    MAPPING.put(12,'l');
    //    MAPPING.put(13,'m');
    //    MAPPING.put(14,'n');
    //    MAPPING.put(15,'o');
    //    MAPPING.put(16,'p');
    //    MAPPING.put(17,'q');
    //    MAPPING.put(18,'r');
    //    MAPPING.put(19,'s');
    //    MAPPING.put(20,'t');
    //    MAPPING.put(21,'u');
    //    MAPPING.put(22,'v');
    //    MAPPING.put(23,'w');
    //    MAPPING.put(24,'x');
    //    MAPPING.put(25,'y');
    //    MAPPING.put(26,'z');
    //}

    /**
     * Runtime: 3 ms, faster than 18.16% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
     * Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
     * @param s
     * @return
     */
    //public static String freqAlphabets(String s) {
    //    StringBuilder sb=new StringBuilder();
    //    char[] chars=s.toCharArray();
    //    for(int i=chars.length-1;i>-1;i--){
    //        if(chars[i]=='#'){
    //            int key=Character.getNumericValue(chars[--i])+10*Character.getNumericValue(chars[--i]);
    //            sb.append(MAPPING.get(key));
    //        }else {
    //            sb.append(MAPPING.get(Character.getNumericValue(chars[i])));
    //        }
    //    }
    //    return sb.reverse().toString();
    //}
}