package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

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
    // NLR
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return traversal;
    }

    public void preOrder(TreeNode root){
        if(root == null) return;
        traversal.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        PreorderTraversal order = new PreorderTraversal();
        TreeNode root = order.createBinaryTree();
        List<Integer> result = order.preorderTraversal(root);
        System.out.println(result);
    }
}
