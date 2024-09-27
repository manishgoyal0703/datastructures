package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node createBinaryTree(){
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node prev = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if(prev != null){
                    prev.next = curr;
                }
                prev = curr;
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);

            }
            prev.next = null;
        }

        return root;
    }

    //TC: O(n), SC: O(n)
    public static void main(String[] args) {
        PopulatingNextRightPointers pointers = new PopulatingNextRightPointers();
        Node root = pointers.createBinaryTree();
        pointers.connect(root);
    }
}
