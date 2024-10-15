package com.datastructures.datastructures.leetcodeInJava.binarySearchTree;

public class InsertIntoBST {

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
        root = insertRec(root, value);
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


    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root, val);
        return root;
    }

    private TreeNode insert(TreeNode root, int val){
        TreeNode temp = root;
        if(temp == null){
            return new TreeNode(val);
        }
        else {
            if(val < temp.val){
                temp.left = insert(temp.left, val);
            } else {
                temp.right = insert(temp.right, val);

            }
        }
        return temp;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        InsertIntoBST insertIntoBST = new InsertIntoBST();
        TreeNode root = insertIntoBST.create();
        insertIntoBST.insertIntoBST(root, 25);
        insertIntoBST.printBST();
    }
}
