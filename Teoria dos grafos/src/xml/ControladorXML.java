package xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.collections.ArrayConverter;
import com.thoughtworks.xstream.converters.extended.NamedArrayConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import modelos.Data;
import modelos.Edge;
import modelos.Graph;
import modelos.Graphml;
import modelos.Key;
import modelos.Node;

public class ControladorXML {

    private XStream xstream;

    public ControladorXML() {
        this.xstream = new XStream(new DomDriver());

        xstream.setMode(XStream.NO_REFERENCES);
        //Permissões
        Class[] classes = new Class[]{Graph.class, Node.class, Edge.class, Data.class, Graphml.class, Key.class};
        xstream.addPermission(AnyTypePermission.ANY);
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);

        //Formatação
        xstream.alias("graphml", Graphml.class);
        xstream.alias("key", Key.class);
        xstream.alias("graph", Graph.class);
        xstream.alias("node", Node.class);
        xstream.alias("edge", Edge.class);
        xstream.alias("data", Data.class);

        xstream.aliasField("for", Key.class, "paraObjeto");
        xstream.aliasField("attr.name", Key.class, "attributeName");
        xstream.aliasField("attr.type", Key.class, "attributeType");
        xstream.aliasField("key", Data.class, "keyId");
        xstream.aliasField("default", Key.class, "defaultType");

        xstream.addImplicitCollection(Graph.class, "edges", Edge.class);
        xstream.addImplicitCollection(Graph.class, "nodes", Node.class);
        xstream.addImplicitCollection(Graphml.class, "keys");
        xstream.addImplicitArray(Node.class, "datas", Data.class);

        xstream.registerLocalConverter(Edge.class, "source", new NodeConverter());
        xstream.registerLocalConverter(Edge.class, "target", new NodeConverter());
        xstream.registerLocalConverter(Data.class, "datas", new ArrayConverter(xstream.getMapper()));

        Converter converter = new ToAttributedValueConverter(Data.class, xstream.getMapper(), xstream.getReflectionProvider(), xstream.getConverterLookup(), "data");
        xstream.registerConverter(converter);

        xstream.useAttributeFor(Graph.class, "id");
        xstream.useAttributeFor(Graph.class, "edgedefault");
        xstream.useAttributeFor(Node.class, "id");
        xstream.useAttributeFor(Edge.class, "id");
        xstream.useAttributeFor(Edge.class, "source");
        xstream.useAttributeFor(Edge.class, "target");
        xstream.useAttributeFor(Edge.class, "directed");
        xstream.useAttributeFor(Key.class, "id");
        xstream.useAttributeFor(Key.class, "paraObjeto");
        xstream.useAttributeFor(Key.class, "attributeName");
        xstream.useAttributeFor(Key.class, "attributeType");
        xstream.useAttributeFor(Data.class, "keyId");

    }

    public void salvaGrafo(Graphml graphml, String path) throws FileNotFoundException {
        FileOutputStream arquivo = new FileOutputStream(path);
        this.xstream.toXML(graphml, arquivo);
    }

    public Graphml carregarGrafo(String path) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader(path));
        Graphml graphml = (Graphml) xstream.fromXML(input);
        input.close();

        return graphml;
    }
    
    public Graphml textToGraph(String text) throws IOException{
        Graphml graphml = (Graphml) xstream.fromXML(text);
        return graphml;
    }

    public String mostraGrafo(Graphml graphml) {
        return xstream.toXML(graphml);
    }

    public String mostraGrafo(Graph graph) {
        return xstream.toXML(graph);
    }

}
