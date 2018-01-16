
import java.util.ArrayList;
import modelos.Data;
import modelos.Edge;
import modelos.FordFulkerson;
import modelos.Graph;
import modelos.Graphml;
import modelos.Key;
import modelos.Malgrange;
import modelos.Node;
import modelos.OrdenacaoTopologica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node no0 = new Node("0");
        Node no1 = new Node("1");
        Node no2 = new Node("2");
        Node no3 = new Node("3");
        Node no4 = new Node("4");

        Data data1 = new Data("fluxo", "50");
        Data data2 = new Data("fluxo", "100");
        Data data3 = new Data("fluxo", "50");
        Data data4 = new Data("fluxo", "50");
        Data data5 = new Data("fluxo", "50");
        Data data6 = new Data("fluxo", "125");
        Data data7 = new Data("fluxo", "100");

        Edge aresta1 = new Edge("a", Boolean.TRUE, no0, no2, data2);
        Edge aresta2 = new Edge("b", Boolean.TRUE, no0, no3, data1);
        Edge aresta3 = new Edge("c", Boolean.TRUE, no2, no3, data3);
        Edge aresta4 = new Edge("d", Boolean.TRUE, no3, no4, data7);
        Edge aresta5 = new Edge("e", Boolean.TRUE, no4, no1, data6);
        Edge aresta6 = new Edge("f", Boolean.TRUE, no2, no1, data4);
        Edge aresta7 = new Edge("g", Boolean.TRUE, no2, no4, data5);
        Graph grafo = new Graph("grafo");
        grafo.addNodes(no0);
        grafo.addNodes(no1);
        grafo.addNodes(no2);
        grafo.addNodes(no3);
        grafo.addNodes(no4);

        grafo.addEdge(aresta1);
        grafo.addEdge(aresta2);
        grafo.addEdge(aresta3);
        grafo.addEdge(aresta4);
        grafo.addEdge(aresta5);
        grafo.addEdge(aresta6);
        grafo.addEdge(aresta7);

//        Key key = new Key("fluxo", "Edge", "fluxo", "double");
//        ArrayList<Key> keys = null;
//        keys.add(key);
//        Graphml grafoml = new Graphml(grafo);
        //FordFulkerson ford = new FordFulkerson(grafoml);
//        Malgrange v = new Malgrange();
//        System.out.println(v.malgrange(grafoml).getGraph().getId());
//        BuscaProfundidade busca = new BuscaProfundidade(grafo);
//        Graph graf = busca.getDfs(no0);
//        for (int i = 0; i < graf.getEdges().size(); i++) {
//            System.out.println(graf.getEdges().get(i).getId());
//        }
        OrdenacaoTopologica ordenar = new OrdenacaoTopologica(grafo);
        ArrayList<Node> nos = ordenar.getOrdenacaoTopologica();
        for (int i = 0; i < nos.size(); i++) {
            System.out.println(nos.get(i).getId());
        }

        // System.out.println(ford.getFluxoMaximo(grafoml, no0, no1));
    }

}
