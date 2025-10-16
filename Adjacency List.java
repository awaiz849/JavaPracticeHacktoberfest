import java.util.*;

public class GraphList {
    private final int vertices;
    private final LinkedList<Integer>[] adjList;

    GraphList(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // Undirected
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList[i])
                System.out.print(node + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList g = new GraphList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        System.out.println("Adjacency List:");
        g.printGraph();
    }
}
