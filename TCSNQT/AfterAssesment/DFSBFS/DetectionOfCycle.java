import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int currentNode;
    int parentNode;

    Pair(int _currentNode, int _parentNode) {
        this.currentNode = _currentNode;
        this.parentNode = _parentNode;
    }
}

public class DetectionOfCycle {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    int vertices;
    DetectionOfCycle(int vertices) {
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public void display() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbour : adjList.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
    public static boolean hasCycleBFS(
            int startNode,
            boolean[] visited,
            ArrayList<ArrayList<Integer>> adjList) {

        Queue<Pair> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(new Pair(startNode, -1));
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int currentNode = curr.currentNode;
            int parentNode = curr.parentNode;

            for (int neighbour : adjList.get(currentNode)) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(new Pair(neighbour, currentNode));
                }
                else if (visited[neighbour]&&neighbour != parentNode) { // this is a shit piece of code .....aaaaAAAAHHHHHHHH
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleInGraph(
            int vertices,
            ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (hasCycleBFS(i, visited, adjList)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectionOfCycle graph = new DetectionOfCycle(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.display();
        System.out.println(
                detectCycleInGraph(graph.vertices, graph.adjList)
        );
    }
}
