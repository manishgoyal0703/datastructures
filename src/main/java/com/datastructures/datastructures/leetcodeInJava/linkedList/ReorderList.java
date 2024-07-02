package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class ReorderList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer !=null && fastPointer.next !=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode prev = null;
        ListNode curr = slowPointer;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode currHead = head;
        while (prev.next != null){
            ListNode temp1 = currHead.next;
            ListNode temp2 = prev.next;

            currHead.next = prev;
            prev.next = temp1;

            prev = temp2;
            currHead = temp1;
        }

    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode head = reorderList.createList();
        reorderList.reorderList(head);
        while(head !=null){
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
        return head;
    }
}
