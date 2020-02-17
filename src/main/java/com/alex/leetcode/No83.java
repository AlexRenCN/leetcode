package com.alex.leetcode;

public class No83 {
    public static void main(String[] args) {
        //1->1->2
        //ListNode l1 = new ListNode(1);
        //ListNode l2 = new ListNode(1);
        //ListNode l3 = new ListNode(2);
        //l1.next = l2;
        //l2.next = l3;
        //ListNode listNode = deleteDuplicates(l1);
        //while (listNode != null) {
        //    System.out.println(listNode.val);
        //    listNode=listNode.next;
        //}

        ListNode l1 = new ListNode(-3);
        ListNode l2 = new ListNode(-1);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(0);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next=l6;
        l6.next=l7;
        ListNode listNode = deleteDuplicates(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(head.val), temHead = newHead;
        while (head != null) {
            if (temHead.val != head.val) {
                temHead.next = new ListNode(head.val);
                temHead = temHead.next;
            }
            head = head.next;
        }
        return newHead;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}