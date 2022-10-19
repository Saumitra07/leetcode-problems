package com.company;

import java.util.*;

// "static void main" must be defined in a public class.
public class OptiverOA {
    public static void main(String[] args) {
        System.out.println("Hello World!");

      //  String str= "(A,B) (A,C) (B,D) (D,C)";

        String str="(A,B) (B,D) (D,E) (A,C) (C,F) (E,G)";

        treeErrors(str);

    }
    public static void treeErrors(String pairs) {

        // Invalid input format, dups and more than two children as we build the tree.
        String nodes = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] input = pairs.split(" ",-1);
        Set<String> dup = new HashSet<>();
        char[] indegree = new char[26];
        Map<Character, List<Character>> tree = new HashMap<>();
        boolean duplicate = false, more_than_two_children = false;
        for (String i : input) {
            if (i.length() != 5 || i.charAt(0) != '(' || i.charAt(4) != ')' ||
                    i.charAt(2) != ',') {
                System.out.println("E1");
                return;
            }
            if (!dup.add(i)) duplicate = true;

            char parent = i.charAt(1);
             char child = i.charAt(3);
            List<Character> children;
             if(!tree.containsKey(parent))
                children =new ArrayList<>();
             else
                 children=tree.get(parent);
         //   List<Character> children = tree.getOrDefault(parent, new ArrayList<>());
            children.add(child);
            if (children.size() > 2) more_than_two_children = true;
            tree.put(parent, children);
            indegree[child - 'A']++;
        }
        if (duplicate) {
            System.out.println("E2");
            return;
        }
        if (more_than_two_children) {
            System.out.println("E3");
            return;
        }

        // Traverse the tree and check for multiple nodes and cycles.
        int visited = 0;
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < 26; i++)
            if (indegree[i] == 0 && tree.containsKey((char)i))
                q.offer((char)i);

        if (q.size() > 1) {
            System.out.println("E4");
            return;
        }
        if (q.size() == 0) {
            System.out.println("E5");
            return;
        }
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                char node = q.poll();
                List<Character> children = tree.get(node);
                for (char c : children) {
                    indegree[c - 'A']--;
                    if (indegree[c - 'A'] == 0) {
                        q.offer(c);
                        visited++;
                    }
                }
            }
        }
        // input contains all nodes except root. Same with visited, if no cycles.
        if (visited < input.length) System.out.println("E5");
        return;
    }
}