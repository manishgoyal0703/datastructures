package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class ReverseLinkedList {


//      Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode prev = null;
        while(curr !=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

//    Using Recursion
//    private ListNode newHead = null;
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//        reverse(head);
//        return newHead;
//    }
//
//    public ListNode reverse(ListNode head){
//        if(head.next == null){
//            newHead = head;
//            return head;
//        }
//        ListNode temp = reverse(head.next);
//        temp.next = head;
//        head.next = null;
//        return head;
//    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        ListNode head = linkedList.createList();
        ListNode result = linkedList.reverseList(head);
        while(result !=null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        return head;
    }
}
