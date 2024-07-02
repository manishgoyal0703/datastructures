package com.datastructures.datastructures.leetcodeInJava.linkedList;

public class RotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode curr = head;
        while(curr !=null && curr.next != null){
            length++;
            curr = curr.next;
        }
        if(k%length==0) return head;
        int move =  length - k % length;
        ListNode currHead = head;
        while(move > 1){
            currHead = currHead.next;
            move--;
        }
        ListNode result = currHead.next;
        currHead.next = null;
        curr.next = head;
        return result;

    }
    
    

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        RotateList rotateList = new RotateList();
        ListNode head = rotateList.createList();
        int k = 2;
        ListNode result = rotateList.rotateRight(head, k);
        while(result !=null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    private ListNode createList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);
        return head;
    }
}
