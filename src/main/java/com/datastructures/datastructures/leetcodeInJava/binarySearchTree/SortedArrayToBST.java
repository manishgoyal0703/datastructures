package com.datastructures.datastructures.leetcodeInJava.binarySearchTree;

public class SortedArrayToBST {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        int size = nums.length;
        if(size == 0) return null;
        this.root = helper(nums, 0, size-1);
        return root;
    }


    private TreeNode helper(int[] nums, int s, int e){
        if(s>e) return null;
        int mid = s + (e-s)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, s, mid-1);
        root.right = helper(nums, mid+1, e);
        return root;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90};
        sortedArrayToBST.sortedArrayToBST(arr);
        sortedArrayToBST.printBST();

    }

}
