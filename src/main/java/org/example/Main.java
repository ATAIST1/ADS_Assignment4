package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dijkstra_algorithm da = new Dijkstra_algorithm();

        da.addEdge("Edinburgh", "Perth", 100);
        da.addEdge("Edinburgh", "Stirling", 50);
        da.addEdge("Edinburgh", "Glasgow", 70);

        da.addEdge("Glasgow", "Stirling", 50);
        da.addEdge("Glasgow", "Edinburgh", 70);

        da.addEdge("Stirling", "Perth", 40);
        da.addEdge("Stirling", "Edinburgh", 50);
        da.addEdge("Stirling", "Glasgow", 50);


        da.addEdge("Perth", "Dundee", 60);
        da.addEdge("Perth", "Edinburgh", 100);
        da.addEdge("Perth", "Stirling", 40);

        da.addEdge("Dundee", "Perth", 60);

        String start = "Edinburgh";
        String end = "Dundee";
        Map<String, Integer> distances = da.dijkstra(start);
        List<String> path = da.getShortestPath(start, end, distances);

        System.out.println("Shortest path from " + start + " to " + end + ": " + path);
        System.out.println(distances.get(end));

    }
}