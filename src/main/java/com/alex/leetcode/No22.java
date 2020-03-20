package com.alex.leetcode;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No22 {
    public static void main(String[] args) {
        List res = generateParenthesis(3);
        res.stream().forEach((s) -> System.out.println(s));

    }

    public static List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        List<String> res = new LinkedList();
        gp(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void gp(List<String> ans, StringBuilder sb, int left, int right, int n) {
        if (left == n && right == n) {
            ans.add(sb.toString());
            return;
        }
        if (left < n) {
            sb.append('(');
            gp(ans, sb, left + 1, right, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            sb.append(")");
            gp(ans, sb, left, right + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}