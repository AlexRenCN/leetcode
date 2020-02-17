package com.alex.leetcode;

import java.util.*;

/**
 * 由于只包含字符的字符串'('，')'，'{'，'}'，'['和']'，确定输入字符串是有效的。
 * <p>
 * 如果输入字符串有效：
 * <p>
 * 必须使用相同类型的括号关闭左括号。
 * 必须以正确的顺序关闭打开括号。
 * 请注意，空字符串也被视为有效。
 *
 * @author alex
 */
public class No20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 1) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(8);
        map.put('(', 1);
        map.put('{', 2);
        map.put('[', 3);
        map.put(')', 4);
        map.put('}', 5);
        map.put(']', 6);
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            int tem = map.get(chars[i]);
            if (tem < 4) {
                stack.push(tem);
            } else if (!stack.empty() && tem - stack.peek() == 3) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}