package com.datastructures.datastructures.leetcodeInJava.grapthTheory;

import java.util.*;

public class CloneAGraph {

// Definition for a Node.
static class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            List<Node> newNeighbors = map.get(curr).neighbors;
            for (Node n: curr.neighbors) {
                if(!map.containsKey(n)){
                    Node temp = new Node(n.val);
                    map.put(n, temp);
                    queue.add(n);
                }
                newNeighbors.add(map.get(n));
            }
        }
        return newNode;
    }


    //TC: O(N + E), SC: O(N + E)  N -> Node, E -> Edge
    public static void main(String[] args) {
        CloneAGraph clone = new CloneAGraph();
        Node node = new Node();
        Node result = clone.cloneGraph(node);
        System.out.println(result == node);

    }



}
