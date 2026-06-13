package com.datastructures.datastructures.leetcodeInJava.binarySearchTree;

import com.sun.source.tree.Tree;

public class BSTFromPreorder {

    TreeNode root;

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

    public void printBST() {
        printRec(root, 0);
    }

    // Recursive method to print the BST structure with indentation for levels
    private void printRec(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        // Increase spacing for right child
        printRec(node.right, level + 1);

        // Print the current node with indentation based on level
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + node.val);
        } else {
            System.out.println(node.val);
        }

        // Increase spacing for left child
        printRec(node.left, level + 1);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            helper(root, preorder[i]);
        }
        return root;
    }

    public TreeNode helper(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        else if (root.val > val) {
            root.left = helper(root.left, val);
        }
        else {
            root.right = helper(root.right, val);
        }
        return root;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        BSTFromPreorder bstFromPreorder = new BSTFromPreorder();
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90};
        bstFromPreorder.bstFromPreorder(arr);
        bstFromPreorder.printBST();
    }
}
