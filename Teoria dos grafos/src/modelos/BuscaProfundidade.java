package modelos;

import java.util.ArrayList;
import modelos.Edge;
import modelos.Graph;
import modelos.Graph;
import modelos.Node;

public class BuscaProfundidade {
    Graphml graphml;
    Graph grafo;
    ArrayList<Boolean> visitados;
    ArrayList<String> nodeId;
    ArrayList<Edge> arestasDFS;
    int n;

    public BuscaProfundidade(Graphml grafo) {
        this.graphml = grafo;
        this.nodeId = new ArrayList<>();
        this.visitados = new ArrayList<>();
        this.arestasDFS = new ArrayList<>();
        this.grafo = grafo.getGraph();
        this.n = grafo.getGraph().getNodes().size();
        for (int i = 0; i < n; i++) {
            visitados.add(Boolean.FALSE);
            nodeId.add(grafo.getGraph().getNodes().get(i).getId());
        }
    }

    public Graphml getDfs(Node no) {
        getArestasDfs(no);
        Graph graph = new Graph(grafo.getId(), grafo.getEdgedefault(), grafo.getNodes(), arestasDFS);
        Graphml DFS = new Graphml(graph, graphml.getKeys());
        return DFS;
    }

    private void getArestasDfs(Node no) {
        visitados.set(nodeId.indexOf(no.getId()), Boolean.TRUE);
        ArrayList<Edge> arestas = grafo.getArestas(no);
        for (int i = 0; i < arestas.size(); i++) {
            int j = nodeId.indexOf(arestas.get(i).getTarget().getId());
            int k = nodeId.indexOf(arestas.get(i).getSource().getId());
            if (!visitados.get(j)) {
                this.arestasDFS.add(arestas.get(i));
                this.getArestasDfs(arestas.get(i).getTarget());
            }
            if (!visitados.get(k)) {
                this.arestasDFS.add(arestas.get(i));
                this.getArestasDfs(arestas.get(i).getSource());
            }
        }
    }

}