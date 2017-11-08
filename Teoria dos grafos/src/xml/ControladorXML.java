package xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import modelos.Edge;
import modelos.Graph;
import modelos.Node;

public class ControladorXML {

    private XStream xstream;

    public ControladorXML() {
        this.xstream = new XStream(new DomDriver());

        //Permissões
        Class[] classes = new Class[]{Graph.class, Node.class, Edge.class};
        xstream.addPermission(AnyTypePermission.ANY);
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);

        //Formatação
        xstream.alias("graph", Graph.class);
        xstream.alias("node", Node.class);
        xstream.alias("edge", Edge.class);

        xstream.addImplicitCollection(Graph.class, "edges", Edge.class);
        xstream.addImplicitCollection(Graph.class, "nodes", Node.class);
        xstream.registerLocalConverter(Edge.class, "source", new NodeConverter());
        xstream.registerLocalConverter(Edge.class, "target", new NodeConverter());
        xstream.useAttributeFor(Graph.class, "id");
        xstream.useAttributeFor(Graph.class, "edgedefault");
        xstream.useAttributeFor(Node.class, "id");
        xstream.useAttributeFor(Edge.class, "id");
        xstream.useAttributeFor(Edge.class, "source");
        xstream.useAttributeFor(Edge.class, "target");
        xstream.useAttributeFor(Edge.class, "directed");
        
    }

    public void salvaGrafo(Graph graph, String path) throws FileNotFoundException {
        FileOutputStream arquivo = new FileOutputStream(path);
        this.xstream.toXML(graph, arquivo);
    }

    public Graph carregarGrafo(String path) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader(path));
        Graph graph = (Graph) xstream.fromXML(input);
        input.close();

        return graph;
    }

    public String mostraGrafo(Graph graph) {
        return xstream.toXML(graph);
    }

}
