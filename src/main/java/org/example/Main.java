package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DFS dfs = new DFS();
        BFS bfs = new BFS();

        dfs.addEdge('A', 'C');
        dfs.addEdge('A', 'B');
        dfs.addEdge('A', 'D');

        dfs.addEdge('B', 'A');
        dfs.addEdge('B', 'C');
        dfs.addEdge('B', 'E');
        dfs.addEdge('B', 'G');

        dfs.addEdge('C', 'A');
        dfs.addEdge('C', 'B');
        dfs.addEdge('C', 'D');

        dfs.addEdge('D', 'C');
        dfs.addEdge('D', 'A');

        dfs.addEdge('E', 'G');
        dfs.addEdge('E', 'F');
        dfs.addEdge('E', 'B');

        dfs.addEdge('F', 'G');
        dfs.addEdge('F', 'E');

        dfs.addEdge('G', 'F');
        dfs.addEdge('G', 'B');



        bfs.addEdge('A', 'C');
        bfs.addEdge('A', 'B');
        bfs.addEdge('A', 'D');

        bfs.addEdge('B', 'A');
        bfs.addEdge('B', 'C');
        bfs.addEdge('B', 'E');
        bfs.addEdge('B', 'G');

        bfs.addEdge('C', 'A');
        bfs.addEdge('C', 'B');
        bfs.addEdge('C', 'D');

        bfs.addEdge('D', 'C');
        bfs.addEdge('D', 'A');

        bfs.addEdge('E', 'G');
        bfs.addEdge('E', 'F');
        bfs.addEdge('E', 'B');

        bfs.addEdge('F', 'G');
        bfs.addEdge('F', 'E');

        bfs.addEdge('G', 'F');
        bfs.addEdge('G', 'B');


        dfs.dfs('A');
        System.out.println();
        bfs.bfs('A');
    }
}