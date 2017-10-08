package modelos;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class Node {
    @XStreamAsAttribute
    private String id;

    public Node(String id) {
        this.id = id;
    }

    public Node() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
