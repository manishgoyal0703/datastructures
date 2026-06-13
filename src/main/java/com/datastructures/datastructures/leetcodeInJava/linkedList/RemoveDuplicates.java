package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class RemoveDuplicates {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        if(head == null || head.next == null) return result;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            } else head = head.next;
        }
        return result;
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicatesN = new RemoveDuplicates();
        ListNode head = removeDuplicatesN.createList();
        ListNode result = removeDuplicatesN.deleteDuplicates(head);
        while(result !=null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        return head;
    }
}
