package modelos;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Graph {

    private String id;
    private String edgedefault;

    @XStreamAsAttribute
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;

    public Graph() {
        this.nodes = new ArrayList();
        this.edges = new ArrayList();

    }

    public Graph(String id) {
        this.id = id;
        this.nodes = new ArrayList();
        this.edges = new ArrayList();

    }

    public Graph(String id, String edgedefault) {
        this.id = id;
        this.nodes = new ArrayList();
        this.edges = new ArrayList();
        this.edgedefault = edgedefault;

    }

    public void addNodes(Node node) {

        this.nodes.add(node);
    }

    public void addEdge(Edge edge) {

        if (this.getNodes().indexOf(edge.getSource()) != -1 && this.getNodes().indexOf(edge.getTarget()) != -1) {
            this.edges.add(edge);
        }
    }

    public Node pegarNodeDaLista(String nome) {
        int i;
        for (i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getId().equals(nome)) {
                return nodes.get(i);
            }
        }

        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdgedefault() {
        return edgedefault;
    }

    public void setEdgedefault(String edgedefault) {
        this.edgedefault = edgedefault;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public void removeNode(Node no) {
        int i;
        for (i = 0; i < this.edges.size(); i++) {

            if ((no.getId().equals(this.edges.get(i).getSource().getId())) || (no.getId().equals(this.edges.get(i).getTarget().getId()))) {
                this.removeEdge(edges.get(i));
                i--;
            }
        }

        this.nodes.remove(no);

    }

    public void removeEdge(Edge aresta) {

        this.edges.remove(aresta);

    }

    public int getOrdem() {
        return this.nodes.size();
    }

    public int getGrauRecepcao(Node no) {
        int cont = 0;
        int i;

        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getTarget() == no) {
                cont++;
            }
        }

        return cont;
    }

    public int getGrauEmissao(Node no) {
        int cont = 0;
        int i;

        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getSource().getId().equals(no.getId())) {
                cont++;
            }
        }
        return cont;
    }

    public int getGrauTotal(Node no) {
        int cont1 = 0;
        int i;

        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getTarget() == no) {
                cont1++;
            }
        }

        int cont2 = 0;

        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getSource().getId().equals(no.getId())) {
                cont2++;
            }
        }

        return cont1 + cont2;
    }

    public boolean isFonte(Node no) {
        if (getGrauRecepcao(no) == 0) {
            return true;
        }
        return false;
    }

    public boolean isSumidouro(Node no) {
        if (getGrauEmissao(no) == 0) {
            return true;
        }
        return false;
    }

    public boolean isAdjacente(Node no1, Node no2) {
        int i;
        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getSource().getId().equals(no1.getId()) && this.edges.get(i).getTarget().getId().equals(no2.getId())
                    || this.edges.get(i).getSource().getId().equals(no2.getId()) && this.edges.get(i).getTarget().getId().equals(no1.getId())) {

                return true;
            }
        }
        return false;
    }

    public Edge getAdjacenteEdge(Node no1, Node no2) {
        int i;
        for (i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).getSource() == no1 && this.edges.get(i).getTarget() == no2) {
                return this.edges.get(i);
            }
            if (this.edges.get(i).getSource() == no2 && this.edges.get(i).getTarget() == no1) {
                return this.edges.get(i);
            }

        }
        return null;
    }

    public ArrayList<Node> getNosAdjacentes(Node no1) {
        ArrayList<Node> adjacentes = new ArrayList<>();
        int i;
        for (i = 0; i < this.getNodes().size(); i++) {
            if (this.isAdjacente(no1, this.getNodes().get(i))) {
                adjacentes.add(this.getNodes().get(i));
            }
        }

        return adjacentes;
    }

    public int[][] getMatrizIncidencia() {
        int linha = this.getNodes().size();
        int coluna = this.getEdges().size();
        int[][] matrizIncidencia = new int[linha][coluna];
        int i, j;
        for (i = 0; i < linha; i++) {
            for (j = 0; j < coluna; j++) {
                if (this.getEdges().get(j).getDirected()) {

                    if (this.getNodes().get(i).getId().equals(this.getEdges().get(j).getSource().getId()) && this.getNodes().get(i).getId().equals(this.getEdges().get(j).getTarget().getId())) {
                        matrizIncidencia[i][j] = 2;
                    } else {
                        if (this.getNodes().get(i).getId().equals(this.getEdges().get(j).getSource().getId())) {
                            matrizIncidencia[i][j] = 1;
                        }
                        if (this.getNodes().get(i).getId().equals(this.getEdges().get(j).getTarget().getId())) {
                            matrizIncidencia[i][j] = -1;
                        }
                    }
                } else {
                    if (this.getNodes().get(i).getId().equals(this.getEdges().get(j).getSource().getId()) && this.getNodes().get(i).getId().equals(this.getEdges().get(j).getTarget().getId())) {
                        matrizIncidencia[i][j] = 2;
                    } else if ((this.getNodes().get(i).getId().equals(this.getEdges().get(j).getSource().getId()))
                            || (this.getNodes().get(i).getId().equals(this.getEdges().get(j).getTarget().getId()))) {
                        matrizIncidencia[i][j] = 1;

                    }
                }
            }
        }

        return matrizIncidencia;
    }
