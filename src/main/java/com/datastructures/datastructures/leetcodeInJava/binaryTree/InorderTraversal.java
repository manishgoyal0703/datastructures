package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

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

    List<Integer> traversal = new ArrayList<>();
    // LNR
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return traversal;
    }

    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        traversal.add(root.val);
        inOrder(root.right);
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        InorderTraversal order = new InorderTraversal();
        TreeNode root = order.createBinaryTree();
        List<Integer> result = order.inorderTraversal(root);
        System.out.println(result);
    }
}
