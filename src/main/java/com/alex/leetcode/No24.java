package com.alex.leetcode;

public class No24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode h = swapPairs(l1);
        while (null != h) {
            System.out.print(h.val + "  ");
            h = h.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (null != current && null != current.next) {
            //前面到后面
            if (null == prev) {
                head = current.next;
            } else {
                //后面到前面
                prev.next=current.next;
            }
            //交换后链接到链上
            ListNode tem=current.next.next;
            current.next.next=current;
            current.next=tem;

            prev=current;
            current=tem;
        }
        return head;
    }

}