package com.datastructures.datastructures.leetcodeInJava.binaryTree;

public class FlipBinaryTree {

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

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        FlipBinaryTree flipBinaryTree = new FlipBinaryTree();
        TreeNode root = flipBinaryTree.createBinaryTree();
        TreeNode output = flipBinaryTree.invertTree(root);
        System.out.println(output);
    }
}
