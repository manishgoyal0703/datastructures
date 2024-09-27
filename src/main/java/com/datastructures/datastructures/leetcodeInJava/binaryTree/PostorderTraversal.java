package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

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
    // LRN
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return traversal;
    }

    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        traversal.add(root.val);
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        PostorderTraversal order = new PostorderTraversal();
        TreeNode root = order.createBinaryTree();
        List<Integer> result = order.postorderTraversal(root);
        System.out.println(result);
    }
}
