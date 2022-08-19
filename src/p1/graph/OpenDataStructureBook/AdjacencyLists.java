package p1.graph.OpenDataStructureBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdjacencyLists {

    int n;
    ArrayList<Integer>[] adj;

    public AdjacencyLists(int n0) {
        n = n0;
        adj = (ArrayList<Integer>[]) new List[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
    }

    void addEdge(int i, int j) {
        adj[i].add(j);
    }

    void removeEdge(int i, int j) {
        Iterator<Integer> it = adj[i].iterator();
        while (it.hasNext()) {
            if (it.next() == j) {
                it.remove();
                return;
            }
        }
    }

    boolean hasEdge(int i, int j) {
        return adj[i].contains(j);
    }

    List<Integer> outEdges(int i) {
        return adj[i];
    }

    List<Integer> inEdges(int i) {
        List<Integer> edges = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (adj[j].contains(i)) edges.add(j);
        return edges;
    }

}
