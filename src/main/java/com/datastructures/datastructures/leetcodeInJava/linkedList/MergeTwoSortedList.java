package com.datastructures.datastructures.leetcodeInJava.linkedList;

import java.util.List;

public class MergeTwoSortedList {


//      Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        ListNode p1 = list1, p2 = list2, curr = newHead;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;

            } else {
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }
        if(p1 == null) curr.next = p2;
        if(p2 == null) curr.next = p1;

        return newHead.next;
    }

    //TC: O(m+n), SC: O(1)
    public static void main(String[] args) {
        MergeTwoSortedList list = new MergeTwoSortedList();
        ListNode list1 = list.createList1();
        ListNode list2 = list.createList2();
        ListNode result = list.mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

}




    private ListNode createList1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        return head;
    }

    private ListNode createList2(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        return head;
    }

}
