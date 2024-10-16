package com.datastructures.datastructures.leetcodeInJava.trie_heap;

import java.util.HashMap;

public class Trie {

    class Node{
        HashMap<Character, Node> child = new HashMap<>();
        boolean isEnd = false;
    }

    private Node root;
    public Trie() {
        root = new Node();
    }

    //TC: O(n), SC: O(n)
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch)){
                curr.child.put(ch, new Node());
            }
            curr = curr.child.get(ch);
        }
        curr.isEnd = true;
    }

    //TC: O(n), SC: O(1)
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch)) return false;
            curr = curr.child.get(ch);
        }
        return curr.isEnd;
    }

    //TC: O(n), SC: O(1)
    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if(!curr.child.containsKey(ch)) return false;
            curr = curr.child.get(ch);
        }
        return true;
    }


    public static void main(String[] args) {
        Trie trie = new Trie();

        // Test words to insert
        String[] wordsToInsert = {"apple", "app", "banana", "bat", "ball"};

        // Insert words into the Trie
        System.out.println("Inserting words into the Trie:");
        for (String word : wordsToInsert) {
            trie.insert(word);
            System.out.println("Inserted: " + word);
        }

        // Test words to search
        String[] wordsToSearch = {"apple", "app", "apricot", "bat", "bath"};

        // Search for words in the Trie
        System.out.println("\nSearching for words in the Trie:");
        for (String word : wordsToSearch) {
            boolean found = trie.search(word);
            System.out.println("Word '" + word + "' found: " + found);
        }

        // Test prefixes to check
        String[] prefixesToCheck = {"app", "ban", "ba", "cat"};

        // Check if prefixes exist in the Trie
        System.out.println("\nChecking prefixes in the Trie:");
        for (String prefix : prefixesToCheck) {
            boolean startsWith = trie.startsWith(prefix);
            System.out.println("Prefix '" + prefix + "' exists: " + startsWith);
        }
    }
}
