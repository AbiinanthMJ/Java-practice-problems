package TCSNQT.AfterAssesment.DFSBFS;
import java.util.ArrayList;
class DFStraversal {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int v;
    DFStraversal(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
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
    public void DFSofGraph(int start, boolean[] visited,
                           ArrayList<ArrayList<Integer>> list,
                           ArrayList<Integer> listofdfs) {
        visited[start] = true;
        listofdfs.add(start);
        for (int it : list.get(start)) {
            if (!visited[it]) {
                DFSofGraph(it, visited, list, listofdfs);
            }
        }
    }
    public void DFS() {
        boolean[] visited = new boolean[v];
        ArrayList<Integer> listofdfs = new ArrayList<>();
        DFSofGraph(0, visited, list, listofdfs);
        System.out.println("DFS Traversal:");
        for (int node : listofdfs) {
            System.out.print(node + " ");
        }
    }
    public static void main(String[] args) {
        DFStraversal graph = new DFStraversal(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.display();
        graph.DFS();
    }
}
