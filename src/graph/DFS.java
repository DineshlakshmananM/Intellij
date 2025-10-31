package graph;

import java.util.ArrayList;

class Graph {
    int v;
    ArrayList<ArrayList<Integer>> l;

    Graph(int v) {
        this.v = v;
        l = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            l.add(new ArrayList<>());
        }
    }

    void addEdge(int n, int v) {
        l.get(n).add(v);
    }

    void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : l.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbor : l.get(start)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }
}
public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(5); // Create a graph with 5 nodes

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.printGraph(); // No need to pass v

        boolean[] visited = new boolean[5];
        System.out.println("DFS starting from node 0:");
        g.dfs(0, visited);
    }
}
