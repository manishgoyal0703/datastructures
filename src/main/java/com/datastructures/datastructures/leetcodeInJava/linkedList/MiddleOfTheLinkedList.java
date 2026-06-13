package com.datastructures.datastructures.leetcodeInJava.linkedList;

import java.util.LinkedList;
import java.util.List;

public class MiddleOfTheLinkedList {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode middleNode(ListNode head) {
          if(head.next == null) return head;
        ListNode fastNode = head;
        while(fastNode != null && fastNode.next !=null){
            head = head.next;
            fastNode = fastNode.next.next;
        }
        return head;
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        MiddleOfTheLinkedList linkedList = new MiddleOfTheLinkedList();
        ListNode listNode = linkedList.createList();
        ListNode resultNode = linkedList.middleNode(listNode);
        while (resultNode !=null){
            System.out.println(resultNode.val + " ");
            resultNode = resultNode.next;
        }
    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        return head;
    }
}
