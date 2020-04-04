package com.alex.leetcode;

public class No19 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        //1-> 2-> 3-> 4-> 5
        //ListNode l1=new ListNode(1);
        //ListNode l2=new ListNode(2);
        //ListNode l3=new ListNode(3);
        //ListNode l4=new ListNode(4);
        //ListNode l5=new ListNode(5);
        //l1.next=l2;
        //l2.next=l3;
        //l3.next=l4;
        //l4.next=l5;
        //ListNode h=removeNthFromEnd(l1,2);
        //while (null!=h){
        //    System.out.print(h.val+"  ");
        //    h=h.next;
        //}

        ListNode ll1 = new ListNode(1);
        ListNode h1 = removeNthFromEnd(ll1, 2);
        while (null != h1) {
            System.out.print(h1.val + "  ");
            h1 = h1.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head, node2 = head;
        int i = 0;
        while (i < n && null != node2.next) {
            node2 = node2.next;
            i++;
        }
        if (i < n) {
            return head.next;
        }
        while (null != node2.next) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node1.next = node1.next.next;
        return head;
    }

}