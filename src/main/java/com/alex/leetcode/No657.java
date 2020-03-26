package com.alex.leetcode;

public class No657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));

    }

    public static boolean judgeCircle(String moves) {
        int[] path = new int[]{0, 0, 0, 0};
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    path[0]++;
                    break;
                case 'L':
                    path[1]++;
                    break;
                case 'U':
                    path[2]++;
                    break;
                case 'D':
                    path[3]++;
                    break;
            }
        }
        return path[0]==path[1] && path[2]==path[3];
    }

}