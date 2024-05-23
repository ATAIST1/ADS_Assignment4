package org.example;

import java.util.*;

public class DFS {
    private Map<Character, List<Character>> graph;
    private Set<Character> visited;

    public DFS() {
        graph = new HashMap<>();
        visited = new HashSet<>();
    }

    public void addEdge(char source, char destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }

    public void dfs(char node) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.print(node + " ");

        for (char neighbor : graph.get(node)) {
            dfs(neighbor);
        }
    }


}