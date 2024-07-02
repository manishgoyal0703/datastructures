package com.datastructures.datastructures.leetcodeInJava.binaryTree;

import java.util.*;

public class LevelOrderTraversal {

//      Definition for a binary tree node.
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) return traversal;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            while(size > 0){
                size--;
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            size = queue.size();
            traversal.add(list);
        }

        return traversal;
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        TreeNode root = traversal.createBinaryTree();
        List<List<Integer>> result = traversal.levelOrder(root);
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
