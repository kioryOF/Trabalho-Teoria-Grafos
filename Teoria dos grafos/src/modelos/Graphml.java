package modelos;

import java.util.ArrayList;

public class Graphml {

    private ArrayList<Key> keys;
    private Graph graph;

    public Graphml(Graph graph, ArrayList<Key> keys) {
        this.graph = graph;
        this.keys = keys;
    }

    public Graphml(Graph graph) {
        this.graph = graph;
    }

    public Graphml() {
        this.keys = new ArrayList<Key>();
        this.graph = new Graph();
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public ArrayList<Key> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<Key> keys) {
        this.keys = keys;
    }

    public void addKeys(Key key) {
        this.keys.add(key);
    }

    public void removeKeys(Key key) {
        this.keys.remove(key);
    }

}
