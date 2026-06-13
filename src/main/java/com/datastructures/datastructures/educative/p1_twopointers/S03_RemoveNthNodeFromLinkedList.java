package com.datastructures.datastructures.educative.p1_twopointers;

class ListNode{

    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode(int val, ListNode head){
        this.val = val;
        this.next = head;
    }

}

public class S03_RemoveNthNodeFromLinkedList {

    public static ListNode removeNthLastNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next =slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        ListNode curr = removeNthLastNode(head, 3);
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

    }
}
