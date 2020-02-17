package com.alex.leetcode;

import com.alex.leetcode.No2;
import org.junit.Test;

public class No2Test {

    @Test
    public void addTwoNumbers() {
        //ListNode a1=new ListNode(2);
        //ListNode a2=new ListNode(4);
        //ListNode a3=new ListNode(3);
        //a1.next=a2;
        //a2.next=a3;
        //
        //ListNode b1=new ListNode(5);
        //ListNode b2=new ListNode(6);
        //ListNode b3=new ListNode(4);
        //b1.next=b2;
        //b2.next=b3;


        No2.ListNode a1=new No2().new ListNode(1);
        No2.ListNode a2=new No2().new ListNode(8);
        a1.next=a2;

        No2.ListNode b1=new No2().new ListNode(0);



        No2 no2 =new No2();
        No2.ListNode result= no2.addTwoNumbers(a1,b1);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}