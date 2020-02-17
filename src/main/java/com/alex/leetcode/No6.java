package com.alex.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * ZigZag
 * 字符串"PAYPALISHIRING"以Z字形模式写在给定的行数上，如下所示：（您可能希望以固定的字体显示此模式以提高可读性）
 */
public class No6 {
    public static void main(String[] args) {
        //PAHNAPLSIIGYIR
        //System.out.println(convert("PAYPALISHIRING",3));
        //"PINALSIGYAHRPI"
        System.out.println(convert("PAYPALISHIRING",4));

    }

    public static String convert(String s, int numRows) {
        if(numRows<2){
            return s;
        }
        List<StringBuilder> sbs=new ArrayList<>();
        //为每一行创建一个SB
        int bufferSize=s.length()<numRows?s.length():numRows;
        for (int i=0;i<bufferSize;i++){
            sbs.add(new StringBuilder());
        }
        int row=sbs.size();
        int temRow=0;
        boolean down=false;
        char[] chars=s.toCharArray();
        //处理每一个char，并处理下一次应该写在哪一行中
        for(int i=0;i<chars.length;i++){
            sbs.get(temRow).append(chars[i]);
            if(temRow==0 || temRow==row-1){
                down=!down;
            }
            temRow+=down?1:-1;
        }
        //将每一行拼接起来
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sbs.size();i++){
            sb.append(sbs.get(i));
        }
        return sb.toString();
    }

}