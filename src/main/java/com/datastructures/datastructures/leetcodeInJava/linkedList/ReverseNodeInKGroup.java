package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class ReverseNodeInKGroup {

//    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k ==1 || head == null) return head;
        int count = k;
        ListNode curr = head;
        while(curr != null && count != 0 ){
            count--;
            curr = curr.next;
        }

        if(count > 0) return head;
        ListNode prev = reverseKGroup(curr, k);
        ListNode currHead = head;
        for (int i = 0; i < k; i++) {
            ListNode next = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = next;
        }

        return prev;
    }

    //TC: O(nk), SC: O(n/k)
    public static void main(String[] args) {
        ReverseNodeInKGroup group = new ReverseNodeInKGroup();
        ListNode head = group.createList();
        ListNode result = group.reverseKGroup(head, 3);
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
        head.next.next.next.next.next.next = new ListNode(7);
        return head;
    }
}
