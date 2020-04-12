package com.alex.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class No933 {
    public static void main(String[] args) {
        //RecentCounter obj = new RecentCounter();
        //int[] params=new int[]{1,100,3001,3002};
        //
        //for (int anint:params){
        //    int param_1 = obj.ping(t);
        //}
    }

    static class RecentCounter {
        Queue<Integer> queue;
        public RecentCounter() {
            queue=new LinkedList();
        }

        public int ping(int t) {
            queue.offer(t);
            while (!queue.isEmpty() && t-queue.peek()>3000){
                queue.poll();
            }
            return queue.size();
        }
    }
}