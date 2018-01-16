package modelos;

import java.util.ArrayList;
import java.util.LinkedList;
import modelos.Edge;
import modelos.Graph;
import modelos.Graph;
import modelos.Node;

public class BuscaLargura {

    private Graph grafo;
    private LinkedList<Node> filaNos;
    private ArrayList<Node> visitados;
    private ArrayList<Edge> arestasBfs;

    public BuscaLargura() {
        this.grafo = new Graph();
        filaNos = new LinkedList<>();
        visitados = new ArrayList<>();
        arestasBfs = new ArrayList<>();

    }

    public Graphml getBfs(Graphml grafo, Node raiz) {
        this.grafo = grafo.getGraph();
        filaNos.add(raiz);
        while (!filaNos.isEmpty()) {
            getArestasBfs(filaNos.pop());
        }
        Graph graph = new Graph(this.grafo.getId(), this.grafo.getEdgedefault(), this.grafo.getNodes(), this.arestasBfs);
        Graphml bfs = new Graphml(graph, grafo.getKeys());
        return bfs;
    }

    private void getArestasBfs(Node no) {
        ArrayList<Edge> arestas = grafo.getArestas(no);
        for (int i = 0; i < arestas.size(); i++) {
            if (arestas.get(i).getDirected()) {
                if (arestas.get(i).getSource().getId().equals(no.getId()) && !visitado(arestas.get(i).getTarget())) {
                    visitados.add(arestas.get(i).getTarget());
                    filaNos.add(arestas.get(i).getTarget());
                    arestasBfs.add(arestas.get(i));
                }
            } else {
                if (arestas.get(i).getSource().getId().equals(no.getId()) && !visitado(arestas.get(i).getTarget())) {
                    visitados.add(arestas.get(i).getTarget());
                    filaNos.add(arestas.get(i).getTarget());
                    arestasBfs.add(arestas.get(i));
                } else if (arestas.get(i).getTarget().getId().equals(no.getId()) && !visitado(arestas.get(i).getSource())) {
                    visitados.add(arestas.get(i).getSource());
                    filaNos.add(arestas.get(i).getSource());
                    arestasBfs.add(arestas.get(i));
                }
            }
        }
    }

    private boolean visitado(Node no) {
        for (int i = 0; i < this.visitados.size(); i++) {
            if (this.visitados.get(i).getId().equals(no.getId())) {
                return true;
            }
        }
        return false;
    }
}
