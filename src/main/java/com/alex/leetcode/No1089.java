package com.alex.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class No1089 {

    public static void main(String[] args) {

    }

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> queue=new LinkedList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                queue.add(0);
            }
            queue.add(arr[i]);
            arr[i]=queue.remove();
        }
    }
}