package com.datastructures.datastructures.leetcodeInJava.binaryTree;

public class MinimumDepth {

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }


//    public int minDepth(TreeNode root) {
//        if(root == null ) return 0;
//        return dfs(root);
//    }
//
//    private int dfs(TreeNode root) {
//        if(root == null) return Integer.MAX_VALUE;
//        if(root.left == null && root.right == null) return 1;
//        int left = dfs(root.left);
//        int right = dfs(root.right);
//        return 1 + Math.min(left, right);
//    }

//    Optimized way:
    public int minDepth(TreeNode root) {
        if(root == null ) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? 1 + left + right : Math.min(left, right) + 1 ;
    }


    //TC: O(n), SC: O(n)
    public static void main(String[] args) {
        MinimumDepth minimumDepth = new MinimumDepth();
        TreeNode root = minimumDepth.createBinaryTree();
        System.out.println(minimumDepth.minDepth(root));

    }
}
