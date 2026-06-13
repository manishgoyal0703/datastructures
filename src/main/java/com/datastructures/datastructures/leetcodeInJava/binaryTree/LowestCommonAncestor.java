package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import com.sun.source.tree.Tree;

public class LowestCommonAncestor {

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
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        return root;
    }

    public TreeNode lowestCommonAnces(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(root.val==p.val || root.val==q.val) return root;

        TreeNode left = lowestCommonAnces(root.left,p,q);
        TreeNode right = lowestCommonAnces(root.right,p,q);
        if(left!=null && right!=null) return root;
        return (left != null) ? left : right;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        TreeNode root = lowestCommonAncestor.createBinaryTree();
        TreeNode p = lowestCommonAncestor.getTreeNode(5);
        TreeNode q = lowestCommonAncestor.getTreeNode(6);
        System.out.println(lowestCommonAncestor.lowestCommonAnces(root, p , q).val);

    }

    private TreeNode getTreeNode(int val){
        return new TreeNode(val);
    }
}
