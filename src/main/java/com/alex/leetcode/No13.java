package com.alex.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 罗马数字是由七个不同的符号来表示  I，V，X，L，C，D和M。
 * <p>
 * 符号       值
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1000
 * 例如，两个用II 罗马数字写成，只有两个加在一起。
 * 十二写为，XII简称X+ II。
 * <p>
 * 数字二十七写为XXVII，XX+ V+ II。
 * <p>
 * 罗马数字通常从左到右从最大到最小。但是，
 * <p>
 * 四个数字不是IIII。相反，第四个被写为IV。因为一个在五个之前，我们减去四个。
 * <p>
 * 同样的原则适用于编号为9的数字IX。有六个使用减法的实例：
 * <p>
 * I可以放在V（5）和X（10）之前制作4和9。
 * X可以在L（50）和C（100）之前放置40和90。
 * C可以放在D（500）和M（1000）之前制作400和900。
 * 给定罗马数字，将其转换为整数。输入保证在1到3999的范围内。
 * <p>
 * 例1：
 * <p>
 * 输入：  “III”
 * 输出： 3
 * 例2：
 * <p>
 * 输入：  “IV”
 * 输出： 4
 * 例3：
 * <p>
 * 输入：  “IX”
 * 输出： 9
 * 例4：
 * <p>
 * 输入：  “LVIII”
 * 输出： 58
 * 说明： L = 50，V = 5，III = 3。
 * 例5：
 * <p>
 * 输入：  “MCMXCIV”
 * 输出： 1994
 * 说明： M = 1000，CM = 900，XC = 90，IV = 4。
 *
 * @author alex
 */
public class No13 {

    public int romanToInt(String s) {
        int rev = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char tem = chars[i];
            //不是最后一位
            if (i < chars.length - 1) {
                char nextChar = chars[i + 1];
                int sub = map(nextChar) - map(tem);
                if (sub > 0) {
                    //跳
                    rev += sub;
                    i++;
                } else {
                    //不跳
                    rev += map(tem);
                }
            } else {
                rev += map(tem);
            }
        }
        return rev;
    }

    private int map(char character) {
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new RuntimeException("what mean " + character + "???");
        }
    }
}