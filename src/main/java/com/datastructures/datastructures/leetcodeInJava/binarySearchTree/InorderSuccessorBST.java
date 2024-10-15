package com.datastructures.datastructures.leetcodeInJava.binarySearchTree;

public class InorderSuccessorBST {

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

    public void insert(int value) {
        this.root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.val) {
            root.left = insertRec(root.left, value);
        } else if (value > root.val) {
            root.right = insertRec(root.right, value);
        }

        // Return the unchanged root pointer
        return root;
    }

    public TreeNode create(){
        insert(50); // Root node
        insert(30); // Insert left child of root
        insert(20); // Insert left child of node with value 30
        insert(40); // Insert right child of node with value 30
        insert(70); // Insert right child of root
        insert(60); // Insert left child of node with value 70
        insert(80);
        return root;
    }

    public TreeNode inorderSuccessor(TreeNode root,TreeNode x) {
        //add code here.
        TreeNode successor = null;
        while(root != null){
            if(x.val < root.val){
                successor = root;
                root = root.left;
            } else{
                root = root.right;
            }
        }
        return successor;

    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        InorderSuccessorBST inorderSuccessorBST = new InorderSuccessorBST();
        TreeNode root = inorderSuccessorBST.create();
        TreeNode node = inorderSuccessorBST.getNode(8);
        System.out.println(inorderSuccessorBST.inorderSuccessor(root, node).val);
    }

    private TreeNode getNode(int val){
        return new TreeNode(val);
    }
}
