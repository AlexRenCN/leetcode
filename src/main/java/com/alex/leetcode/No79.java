package com.alex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No79 {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        No79 no = new No79();
        System.out.println(no.exist(board, "ABCCED"));
        System.out.println(no.exist(board, "SEE"));
        System.out.println(no.exist(board, "ABCB"));
    }

    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (find(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(int i, int j, char[][] board, String word, int index) {
        //越界
        if (i < 0 || j < 0 || i > board.length-1 || j > board[0].length-1) {
            return false;
        }
        //已访问
        if (visited[i][j]) {
            return false;
        }
        //不匹配
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        //匹配到最后一位了
        if (++index == word.length()) {
            return true;
        }
        //继续匹配
        if (find(i - 1, j, board, word, index)
                ||
                find(i + 1, j, board, word, index) ||
                find(i, j + 1, board, word, index) ||
                find(i, j - 1, board, word, index)) {
            return true;
        }
        //出栈时还原
        visited[i][j] = false;
        //默认
        return false;
    }

}