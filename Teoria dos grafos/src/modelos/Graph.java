package modelos;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.ArrayList;

public class Graph implements Cloneable {

    private String id;
    private String edgedefault;

    @XStreamAsAttribute
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;

    //Esse construtor é para clonar
    public Graph(Graph original) {
        if (null == original) {
            throw new IllegalArgumentException("Argumento não pode ser nulo para clonagem");
        }
        this.id = original.getId();
        this.edgedefault = original.getEdgedefault();

        if (!original.getNodes().isEmpty()) {
            ArrayList<Node> nodesCopy = new ArrayList<>();
            for (int i = 0; i < original.getNodes().size(); i++) {
                Node no = new Node(original.getNodes().get(i));
                nodesCopy.add(no);
            }
            this.nodes = nodesCopy;

        } else {
            this.nodes = new ArrayList<>();
        }

        if (!original.getEdges().isEmpty()) {
            ArrayList<Edge> edgesCopy = new ArrayList<>();
            for (int i = 0; i < original.getEdges().size(); i++) {
                Edge edge = new Edge(original.getEdges().get(i));
                edgesCopy.add(edge);
            }
            this.edges = edgesCopy;
        } else {
            this.edges = new ArrayList<>();
        }
    }

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

    public Graph(String id, String edgedefault, ArrayList<Node> nodes, ArrayList<Edge> edges) {
        this.id = id;
        this.edgedefault = edgedefault;
        this.nodes = nodes;
        this.edges = edges;
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
        return (ArrayList<Node>) nodes.clone();
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Edge> getEdges() {
        return (ArrayList<Edge>) edges.clone();
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
            String target = this.edges.get(i).getTarget().getId();
            String noId = no.getId();
            if (target.equals(noId)) {
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
        return getGrauRecepcao(no) == 0;
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
            if (this.edges.get(i).getDirected()) {
                if (this.edges.get(i).getSource().getId().equals(no1.getId()) && this.edges.get(i).getTarget().getId().equals(no2.getId())) {
                    return true;
                }
            } else {
                if (this.edges.get(i).getSource().getId().equals(no1.getId()) && this.edges.get(i).getTarget().getId().equals(no2.getId())
                        || this.edges.get(i).getSource().getId().equals(no2.getId()) && this.edges.get(i).getTarget().getId().equals(no1.getId())) {
                    return true;
                }
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

    public ArrayList<Edge> getArestas(Node origem) {
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

    public ArrayList<Node> getCadeia(Node noAtual, Node noProcurado) {

        int i;
        ArrayList<Node> listaSaidas = new ArrayList<>();
        for (i = 0; i < this.edges.size(); i++) {
            if (noAtual.getId().equals(this.edges.get(i).getSource().getId())) {
                listaSaidas.add(this.edges.get(i).getTarget());
                if (this.edges.get(i).getTarget().getId().equals(noProcurado.getId())) {
                    ArrayList listaCadeia = new ArrayList();
                    listaCadeia.add(noProcurado);
                    listaCadeia.add(0, noAtual);
                    return listaCadeia;
                }
            }
        }
        if (listaSaidas.size() > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                ArrayList volta = this.getCadeia(listaSaidas.get(j), noProcurado);
                if (volta != null) {

                    volta.add(0, noAtual);

                    return volta;
                }
            }
        }

        return null;

    }

    public ArrayList<Node> getCaminho(Node noInicial, Node noProcurado) {

        int i;
        ArrayList<Node> listaSaidas = new ArrayList<>();
        ArrayList<Edge> listaAux = new ArrayList<>();

        for (i = 0; i < this.edges.size(); i++) {
            if (this.getEdges().get(i).getDirected()) {
                if (noInicial.getId().equals(this.edges.get(i).getSource().getId())) {
                    listaSaidas.add(this.edges.get(i).getTarget());
                    listaAux.add(this.edges.get(i));
                    if (this.edges.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noInicial);
                        return listaCadeia;
                    }
                }
            } else {
                if (noInicial.getId().equals(this.edges.get(i).getSource().getId())) {
                    listaSaidas.add(this.edges.get(i).getTarget());
                    listaAux.add(this.edges.get(i));
                    if (this.edges.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noInicial);
                        return listaCadeia;
                    }
                } else if (noInicial.getId().equals(this.edges.get(i).getTarget().getId())) {
                    listaSaidas.add(this.edges.get(i).getSource());
                    listaAux.add(this.edges.get(i));
                    if (this.edges.get(i).getSource().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noInicial);
                        return listaCadeia;
                    }
                }
            }
        }

        if (listaSaidas.size()
                > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                ArrayList<Edge> listaPassagem = new ArrayList<>();
                listaPassagem.add(listaAux.get(j));
                ArrayList<Edge> listaAuxEdge = new ArrayList<>(this.edges);
                ArrayList volta = this.getCaminhoAuxiliar(listaSaidas.get(j), noProcurado, listaPassagem, listaAuxEdge);
                if (volta != null) {
                    volta.add(0, noInicial);
                    return volta;
                }
            }
        }
        return null;
    }

    private ArrayList<Node> getCaminhoAuxiliar(Node noAtual, Node noProcurado, ArrayList<Edge> listaPassagem, ArrayList<Edge> listaAuxEdge) {

        int i, n;

        ArrayList<Node> listaSaidas = new ArrayList<>();
        ArrayList<Edge> listaAuxPassagem = new ArrayList<>();

        for (n = 0; n < listaAuxEdge.size(); n++) {
            if (listaPassagem.contains(listaAuxEdge.get(n))) {
                listaAuxEdge.remove(listaAuxEdge.get(n));
            }
        }
        for (i = 0; i < listaAuxEdge.size(); i++) {
            if (this.getEdges().get(i).getDirected()) {
                if (noAtual.getId().equals(listaAuxEdge.get(i).getSource().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getTarget());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noAtual);
                        return listaCadeia;
                    }
                }
            } else {
                if (noAtual.getId().equals(listaAuxEdge.get(i).getSource().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getTarget());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noAtual);
                        return listaCadeia;
                    }
                } else if (noAtual.getId().equals(listaAuxEdge.get(i).getTarget().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getSource());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getSource().getId().equals(noProcurado.getId())) {
                        ArrayList listaCadeia = new ArrayList();
                        listaCadeia.add(noProcurado);
                        listaCadeia.add(0, noAtual);
                        return listaCadeia;
                    }
                }
            }
        }

        if (listaSaidas.size()
                > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                listaPassagem.add(listaAuxPassagem.get(j));
                ArrayList volta = this.getCaminhoAuxiliar(listaSaidas.get(j), noProcurado, listaPassagem, listaAuxEdge);
                if (volta != null) {
                    volta.add(0, noAtual);
                    return volta;
                }
            }
        }

        return null;
    }

    public Boolean isBiPartido() {
        int i;
        int separacao[] = new int[this.nodes.size()];

        for (i = 0; i < separacao.length; i++) {
            separacao[i] = -1;
        }
        separacao[0] = 0;

        for (i = 0; i < separacao.length; i++) {
            if (!biPartidoAuxiliar(i, separacao)) {
                return false;
            }
        }

        return true;
    }

    private Boolean biPartidoAuxiliar(int indice, int vetor[]) {

        ArrayList<Node> adjacentes = this.getNosAdjacentes(this.nodes.get(indice));

        int i;
        for (i = 0; i < adjacentes.size(); i++) {
            int indiceNo = getIndiceNode(adjacentes.get(i));
            if (vetor[indiceNo] == -1) {
                if (vetor[indice] == 0) {
                    vetor[indiceNo] = 1;
                } else {
                    vetor[indiceNo] = 0;
                }
            } else if (vetor[indiceNo] == vetor[indice]) {
                return false;
            }
        }
        return true;
    }

    public int getIndiceNode(Node no) {
        int i;
        for (i = 0; i < this.nodes.size(); i++) {
            if (no.getId().equals(this.nodes.get(i).getId())) {
                return i;
            }
        }

        return -1;
    }

    public int getIndiceEdge(Edge edge) {
        int i;
        for (i = 0; i < this.edges.size(); i++) {
            if (edge.getId().equals(this.edges.get(i).getId())) {
                return i;
            }
        }

        return -1;
    }

    public int getIndiceEdgePorId(String edge) {
        int i;
        for (i = 0; i < this.edges.size(); i++) {
            if (edge.equals(this.edges.get(i).getId())) {
                return i;
            }
        }

        return -1;
    }

    public int getIndiceNodePorId(String node) {
        int i;
        for (i = 0; i < this.nodes.size(); i++) {
            if (node.equals(this.nodes.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }
}
