package p1.graph.OpenDataStructureBook;

public class AdjacencyMatrix{

    int V;//qtdVertices
    int E;//qtdArestas
    boolean adj[][];//relacoes

    public AdjacencyMatrix(int v, int e) {
        V = v;
        adj = new boolean[v][v];
        E = e;
    }

    //adiciona vertice
    public void addEdge(int u, int v){
        if(!adj[u][v]){
            E++;
        }
        adj[u][v]=true;
    }
}