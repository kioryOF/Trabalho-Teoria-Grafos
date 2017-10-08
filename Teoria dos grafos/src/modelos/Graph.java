package modelos;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.ArrayList;

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
        this.edges.add(edge);
    }

    public Node pegarNodeDaLista(String nome) {
        int i;
        for (i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getId() == nome){
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

}
