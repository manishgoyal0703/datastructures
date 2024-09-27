package com.datastructures.datastructures.leetcodeInJava.binaryTree;

public class DiameterOfBinaryTree {

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

    private static int DIAMETER = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        findDiameter(root);
        return DIAMETER;
    }
    private int findDiameter(TreeNode root){
        if(root == null) return 0;
        int left = findDiameter(root.left);
        int right = findDiameter(root.right);
        DIAMETER = Math.max(DIAMETER, 1 + left + right);
        return 1 + Math.max(left, right);
    }

    //TC: O(n), SC: O(n)
    public static void main(String[] args) {
        DiameterOfBinaryTree tree= new DiameterOfBinaryTree();
        TreeNode root = tree.createBinaryTree();
        System.out.println(tree.diameterOfBinaryTree(root));
    }
}
