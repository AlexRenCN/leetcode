package com.alex.leetcode;

import com.alex.leetcode.No20;
import org.junit.Test;

public class No20Test {

    @Test
    public void isValid() {
        String[] strings = {"()", "()[]{}", "(]", "([]]", "{[]}"};
        //T T F F T
        No20 no20 = new No20();
        for (String str :
                strings) {
            System.out.println(no20.isValid(str));
        }
        //no20.isValid("()");
    }
}