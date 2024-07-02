package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class DeleteNodeInLinkedList {

    //      Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    //TC: O(1), SC: O(1)
    public static void main(String[] args) {
        DeleteNodeInLinkedList linkedList = new DeleteNodeInLinkedList();
        ListNode head = linkedList.createList();
        linkedList.deleteNode(head.next.next);
        while (head !=null){
            System.out.print(head.val + " ");
            head = head.next;
        }


    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        return head;      //3
    }
}
