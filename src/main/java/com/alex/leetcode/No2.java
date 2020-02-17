package com.alex.leetcode;

/**
 * Add Two Numbers
 * 您将获得两个非空链表，表示两个非负整数。数字以相反的顺序存储，每个节点包含一个数字。
 * 添加两个数字并将其作为链接列表返回。
 * <p>
 * 您可以假设这两个数字不包含任何前导零，除了数字0本身。
 * <p>
 * 例：
 * <p>
 * 输入：（2  - > 4  - > 3）+（5  - > 6  - > 4）
 * 输出： 7  - > 0  - > 8
 * 说明： 342 + 465 = 807。
 *
 * @author alex
 */
public class No2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode=null;
        ListNode temNode=null;
        int tem=0;
        while (l1!=null || l2!=null){
            int sum=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+tem;
            tem=0;
            if(sum>9){
                tem=1;
                sum=sum%10;
            }
            if(firstNode==null){
                firstNode=new ListNode(sum);
                temNode=firstNode;
            }else {
                ListNode node=new ListNode(sum);
                temNode.next=node;
                temNode=node;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(tem>0){
            temNode.next=new ListNode(tem);
        }
        return firstNode;
    }
}