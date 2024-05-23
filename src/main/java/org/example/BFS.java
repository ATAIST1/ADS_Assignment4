package org.example;
import java.util.*;

class BFS{
    private Map<Character, List<Character>> adjList;
    BFS() {
        adjList = new HashMap<>();
    }
    void addEdge(char source, char destination) {
        adjList.computeIfAbsent(source, k -> new LinkedList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new LinkedList<>()).add(source);
    }

    void bfs(char startNode) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            char currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (char neighbor : adjList.getOrDefault(currentNode, new LinkedList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
