package TCSNQT.AfterAssesment.DFSBFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFStraversal {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int v;

    BFStraversal(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {list.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " -> ");
            for (int j : list.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void BFS() {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        System.out.println("BFS Traversal:");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbour : list.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFStraversal graph = new BFStraversal(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.display();
        graph.BFS();
    }
}
