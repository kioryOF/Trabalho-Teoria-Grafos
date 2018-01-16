package modelos;

public class Edge {

    private String id;
    private Boolean directed;
    private Node source;
    private Node target;
    private Data data;

    public Edge(Edge original) {
        this.id = original.getId();
        this.directed = original.getDirected();
        this.source = new Node(original.getSource());
        this.target = new Node(original.getTarget());
        if (original.getData() != null) {
            this.data = new Data(original.getData());
        }else{
            
        }

    }

    public Edge() {
        this.data = new Data();
    }

    public Edge(String id) {
        this.id = id;
        this.directed = false;
        this.data = new Data();
    }

    public Edge(String id, Node source, Node target) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.directed = false;
        this.data = new Data();
    }

    public Edge(String id, Boolean directed, Node source, Node target, Data data) {
        this.id = id;
        this.directed = directed;
        this.source = source;
        this.target = target;
        this.data = data;
    }

    public Edge(String id, Node source, Node target, Boolean directed) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.directed = directed;
        this.data = new Data();
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
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
