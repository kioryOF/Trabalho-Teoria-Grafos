package modelos;


public class Edge {

    private String id;
    private Boolean directed;
    private Node source;
    private Node target;
    
    public Edge() {

    }

    public Edge(String id) {
        this.id = id;
        this.directed = false;
    }

    public Edge(String id, Node source, Node target) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.directed = false;
      
    }

    public Edge(String id, Node source, Node target, Boolean directed) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.directed = directed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDirected() {
        return directed;
    }

    public void setDirected(Boolean directed) {
        this.directed = directed;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

}
