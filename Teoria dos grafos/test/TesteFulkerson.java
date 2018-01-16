
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.BuscaLargura;
import modelos.Data;
import modelos.Edge;
import modelos.FordFulkerson;
import modelos.Graph;
import modelos.Graphml;
import modelos.Node;
import xml.ControladorXML;

public class TesteFulkerson {

    public static void main(String[] args) {
        BuscaLargura bf = new BuscaLargura();
    
        ControladorXML xml = new ControladorXML();
        try {
            Graphml gml = xml.carregarGrafo("C:\\Users\\sothz\\Desktop\\Testar.xml");
            System.out.println(xml.mostraGrafo(bf.getBfs(gml, gml.getGraph().getNodes().get(0))));
        } catch (IOException ex) {
            Logger.getLogger(TesteFulkerson.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
