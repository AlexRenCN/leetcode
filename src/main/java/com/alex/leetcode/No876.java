package com.alex.leetcode;

public class No876 {

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        ListNode a6=new ListNode(6);

        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;

        System.out.println(middleNode(l1).val);
        System.out.println(middleNode(a1).val);
        ListNode b1=new ListNode(1);
        ListNode b2=new ListNode(2);
        b1.next=b2;
        System.out.println(middleNode(b1).val);


    }


    public static ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        return findMiddle(head,head.next);
    }
    public static ListNode findMiddle(ListNode l1,ListNode l2){
        if(l2.next==null){
            return l1.next;
        }
        if(l2.next.next==null){
            return l1.next;
        }
        return findMiddle(l1.next,l2.next.next);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}