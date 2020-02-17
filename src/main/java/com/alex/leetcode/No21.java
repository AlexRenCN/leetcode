package com.alex.leetcode;


//合并两个排序列表

//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4
public class No21 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next=a2;
        a2.next=a3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next=b2;
        b2.next=b3;
        ListNode listNode=mergeTwoLists(a1,b1);
        boolean flag=true;
        while (flag){
            if(listNode.next==null){
                flag=false;
                break;
            }
            listNode=listNode.next;
        }
    }

    /**
     * 合并两个list
     * 这里返回的是最小的
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        //l1迭代完了
        if(l1==null){
            return l2;
        }
        //l2迭代完了
        if(l2==null){
            return l1;
        }
        //l2小，l2的数据提前，拿l1的当前数据继续比
        if(l2.val<l1.val){
            l2.next=mergeTwoLists(l1,l2.next);
            //永远返回小的
            return l2;
        }else {
            //l1小，数据不动，拿l1的下个数据和l2继续比
            l1.next=mergeTwoLists(l1.next,l2);
            //永远返回小的
            return l1;
        }
    }

}