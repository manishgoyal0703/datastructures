package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.LinkedList;
import java.util.Stack;

public class FlattenBTToLinkedList {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val) { this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode createBinaryTree(){
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

//    public void flatten(TreeNode root) {
//        if(root == null) return;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode curr = stack.pop();
//
//            if(curr.right!=null) stack.push(curr.right);
//
//            if(curr.left!=null) stack.push(curr.left);
//
//            if(!stack.isEmpty()) curr.right = stack.peek();
//
//            curr.left = null;
//        }
//    }



    // Another approach
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }



    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        FlattenBTToLinkedList linkedList = new FlattenBTToLinkedList();
        TreeNode root = linkedList.createBinaryTree();
        linkedList.flatten(root);
        printTree(root, 0, "Root: " );

    }

    private static void printTree(TreeNode node, int level, String label) {
        if (node == null) {
            return;
        }

        // Indentation based on the level of the node
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // 4 spaces for each level
        }

        // Print the current node value with its label
        System.out.println(label + node.val);

        // Recursively print the left and right subtrees
        printTree(node.left, level + 1, "L--- ");
        printTree(node.right, level + 1, "R--- ");
    }

}
