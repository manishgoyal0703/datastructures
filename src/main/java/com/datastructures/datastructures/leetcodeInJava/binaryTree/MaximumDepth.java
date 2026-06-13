package com.datastructures.datastructures.leetcodeInJava.binaryTree;

public class MaximumDepth {

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

//    1st approach
//    public int maxDepth(TreeNode root) {
//        if(root == null) return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
//    }


    //2nd Approach
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;      //invalid path
        if(root.left == null && root.right == null) return 1;       //leaf node
        int left = dfs(root.left);
        int right = dfs(root.right);
        return 1 + Math.max(left, right);
    }

    //TC: O(n), SC: O(n)
    public static void main(String[] args) {
        MaximumDepth maximumDepth = new MaximumDepth();
        TreeNode root = maximumDepth.createBinaryTree();
        System.out.println(maximumDepth.maxDepth(root));
    }
}
