package org.example;
import java.util.*;
public class Dijkstra_algorithm {
    private Map<String, List<Edge>> adjList;

    static class Edge {
        String destination;
        int weight;

        Edge(String destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public Dijkstra_algorithm() {
        this.adjList = new HashMap<>();
    }

    public void addEdge(String source, String destination, int weight) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(destination, weight));
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(new Edge(source, weight));
    }

    public Map<String, Integer> dijkstra(String start) {
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (String vertex : adjList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        priorityQueue.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!priorityQueue.isEmpty()) {
            Map.Entry<String, Integer> currentEntry = priorityQueue.poll();
            String current = currentEntry.getKey();
            int currentDistance = currentEntry.getValue();

            if (currentDistance > distances.get(current)) {
                continue;
            }

            for (Edge edge : adjList.getOrDefault(current, new ArrayList<>())) {
                int newDistance = currentDistance + edge.weight;
                if (newDistance < distances.get(edge.destination)) {
                    distances.put(edge.destination, newDistance);
                    priorityQueue.add(new AbstractMap.SimpleEntry<>(edge.destination, newDistance));
                }
            }
        }

        return distances;
    }
public List<String> getShortestPath(String start, String end, Map<String, Integer> distances) {
        List<String> path = new ArrayList<>();
        if (!distances.containsKey(end)) {
            return path;}

        String current = end;
        while (!current.equals(start)) {
            path.add(current);
            int minDistance = distances.get(current);
            String nextNode = null;

            for (Edge edge : adjList.getOrDefault(current, new ArrayList<>())) {
                int distance = distances.get(edge.destination) + edge.weight;
                if (distance == minDistance) {
                    nextNode = edge.destination;
                    break;
                }
            }
            if (nextNode == null) {
                return new ArrayList<>(); }
            current = nextNode;
        }

        path.add(start);
        Collections.reverse(path);
        return path;
    }
}
