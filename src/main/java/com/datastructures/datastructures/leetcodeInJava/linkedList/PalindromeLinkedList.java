package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class PalindromeLinkedList {
    
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode node) { this.val = val; this.next = node;}
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode currHead = slow;
        ListNode prev = null;
        while (currHead != null){
            ListNode temp = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = temp;
        }

        ListNode p1 = head;
        ListNode p2 = prev;
        while( p2 !=null){
            if(p1.val != p2.val) return false;
            p2 = p2.next;
            p1 = p1.next;
        }
        return true;
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        PalindromeLinkedList linkedList = new PalindromeLinkedList();
        ListNode head = linkedList.createList();
        System.out.println(linkedList.isPalindrome(head));
    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(1);
        return head;
    }
    
}
