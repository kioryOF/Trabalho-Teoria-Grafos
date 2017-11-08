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

    public int[][] getMatrizAdjacencia() {

        int n = this.getNodes().size();
        int m = this.getEdges().size();
        int[][] matrizAdjacencia = new int[n][n];
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                boolean teste = this.isAdjacente(this.getNodes().get(i), this.getNodes().get(j));
                if (teste) {
                    for (k = 0; k < m; k++) {
                        for (k = 0; k < m; k++) {
                            if (this.getEdges().get(k).getDirected()) {
                                if (this.edges.get(k).getSource().getId().equals(this.getNodes().get(i).getId())
                                        && this.edges.get(k).getTarget().getId().equals(this.getNodes().get(j).getId())) {
                                    matrizAdjacencia[i][j] = 1;

                                }
                            } else {
                                matrizAdjacencia[i][j] = 1;

                            }
                        }

                    }

                }
            }

        }
        return matrizAdjacencia;
    }

   
    public ArrayList<ArrayList<Node>> getListaDeAdjacencia() {
        int i, j;
        ArrayList<ArrayList<Node>> lista = new ArrayList<>();
        for (i = 0; i < this.nodes.size(); i++) {
            ArrayList<Node> listaAux = new ArrayList<>();
            for (j = 0; j < this.edges.size(); j++) {
                if (this.edges.get(j).getDirected()) {
                    if (this.edges.get(j).getSource().getId().equals(this.nodes.get(i).getId())) {
                        listaAux.add(this.edges.get(j).getTarget());
                    }
                } else {
                    if (this.edges.get(j).getSource().getId().equals(this.nodes.get(i).getId())) {
                        listaAux.add(this.edges.get(j).getTarget());
                    }
                    if (this.edges.get(j).getTarget().getId().equals(this.nodes.get(i).getId())) {
                        listaAux.add(this.edges.get(j).getSource());
                    }
                }
            }
            lista.add(listaAux);
        }
        return lista;
    }

    private ArrayList<Edge> getArestas(Node origem) {
        ArrayList<Edge> arestas = new ArrayList<>();
        int i;
        for (i = 0; i < this.getEdges().size(); i++) {
            if (this.getEdges().get(i).getDirected()) {
                if (this.getEdges().get(i).getSource().getId().equals(origem.getId())) {
                    arestas.add(this.getEdges().get(i));
                }
            } else {
                if (this.getEdges().get(i).getSource().getId().equals(origem.getId()) || this.getEdges().get(i).getTarget().getId().equals(origem.getId())) {
                    arestas.add(this.getEdges().get(i));
                }
            }

        }

        return arestas;
    }

    public Boolean isMultigrafo() {
        int i, j;
        for (i = 0; i < this.getEdges().size(); i++) {
            for (j = 0; j < this.getEdges().size(); j++) {
                if (this.getEdges().get(i).getTarget().getId().equals(this.getEdges().get(j).getSource().getId())) {

                    if (this.getEdges().get(i).getSource().getId().equals(this.getEdges().get(j).getTarget().getId())) {
                        return true;
                    }
                }
            }

            for (j = 0; j < this.getEdges().size(); j++) {
                if ((this.getEdges().get(i).getSource().getId().equals(this.getEdges().get(j).getSource().getId()))
                        && (this.getEdges().get(i).getTarget().getId().equals(this.getEdges().get(j).getTarget().getId()))
                        && (!this.getEdges().get(i).getId().equals(this.getEdges().get(j).getId()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isRegular() {
        int i;
        int grauTotal = this.getGrauTotal(this.getNodes().get(0));
        for (i = 0; i < this.getNodes().size(); i++) {

            if (this.getGrauTotal(this.getNodes().get(i)) != grauTotal) {
                return false;
            }
        }

        return true;
    }

    public Boolean isCompleto() {
        if (this.isRegular()) {
            for (int i = 0; i < this.getNodes().size(); i++) {
                for (int j = 0; j < this.getNodes().size(); j++) {
                    if (!(this.getNodes().get(i).getId().equals(this.getNodes().get(j).getId()))) {
                        if (!(this.isAdjacente(this.getNodes().get(i), this.getNodes().get(j)))) {
                            return false;
                        }
                    }
                }

            }
            return true;

        }

        return false;
    }

	
