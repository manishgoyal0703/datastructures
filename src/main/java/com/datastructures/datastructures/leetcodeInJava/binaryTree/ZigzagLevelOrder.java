package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.*;

public class ZigzagLevelOrder {
    
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


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) return traversal;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0){
                TreeNode node = queue.poll();
                if(level % 2 == 0){
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if(node.left !=null ) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
            level++;
            traversal.add(list);
        }

        return traversal;
    }


    //TC: O(n), SC: O(n)
    public static void main(String[] args) {
        ZigzagLevelOrder order = new ZigzagLevelOrder();
        TreeNode root = order.createBinaryTree();
        List<List<Integer>> result = order.zigzagLevelOrder(root);
        System.out.println(Arrays.deepToString(result.toArray()));
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
    
}
