package com.alex.leetcode;

import com.alex.leetcode.No13;
import org.junit.Test;

public class No13Test {

    static final String[] strings=new String[]{"III","IV","IX","LVIII","MCMXCIV"};
    // 3 4 9 58 1994
    @Test
    public void romanToInt() {
        No13 no13 =new No13();
        for (String str:
             strings) {
            System.out.println(no13.romanToInt(str));
        }
    }
}