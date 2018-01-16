
import java.util.ArrayList;
import modelos.Data;
import modelos.Edge;
import modelos.FordFulkerson;
import modelos.Graph;
import modelos.Graphml;
import modelos.Key;
import modelos.Malgrange;
import modelos.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class TesteMalgrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        
        Node E = new Node("E");
        Node F = new Node("F");
        Node D = new Node("D");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");

        Data data1 = new Data("fluxo", "50");
        Data data2 = new Data("fluxo", "100");
        Data data3 = new Data("fluxo", "50");
        Data data4 = new Data("fluxo", "50");
        Data data5 = new Data("fluxo", "50");
        Data data6 = new Data("fluxo", "125");
        Data data7 = new Data("fluxo", "100");
        Data data8 = new Data("fluxo", "50");
        Data data9 = new Data("fluxo", "50");
        Data data10 = new Data("fluxo", "125");
        Data data11 = new Data("fluxo", "100");
        Data data12 = new Data("fluxo", "125");
        Data data13 = new Data("fluxo", "100");

        Edge aresta1 = new Edge("1", Boolean.TRUE, I, A, data1);
        Edge aresta2 = new Edge("2", Boolean.TRUE, A, G, data2);
        Edge aresta3 = new Edge("3", Boolean.TRUE, G, H, data3);
        Edge aresta4 = new Edge("4", Boolean.TRUE, H, I, data4);
        Edge aresta5 = new Edge("5", Boolean.TRUE, I, G, data5);
        Edge aresta6 = new Edge("6", Boolean.TRUE, H, A, data6);
        Edge aresta7 = new Edge("7", Boolean.TRUE, A, B, data7);
        Edge aresta8 = new Edge("8", Boolean.TRUE, B, C, data8);
        Edge aresta9 = new Edge("9", Boolean.TRUE, C, D, data9);
        Edge aresta10 = new Edge("10", Boolean.TRUE, D, B, data10);
        Edge aresta11 = new Edge("11", Boolean.TRUE, G, D, data11);
        Edge aresta12 = new Edge("12", Boolean.FALSE, F, E, data12);
        Edge aresta13 = new Edge("13", Boolean.TRUE, F, G, data13);
        Edge aresta14 = new Edge("14", Boolean.TRUE, E, D, data2);
        //Edge aresta14 = new Edge("6", Boolean.TRUE, H, F, data12);
        //Edge aresta15 = new Edge("7", Boolean.TRUE, B, H, data13);
        Graph grafo = new Graph("grafo");
        grafo.addNodes(A);
        grafo.addNodes(B);
        grafo.addNodes(C);
        grafo.addNodes(D);
        
        grafo.addNodes(F);
        grafo.addNodes(G);
        grafo.addNodes(H);
        grafo.addNodes(E);
        grafo.addNodes(I);

        grafo.addEdge(aresta1);
        grafo.addEdge(aresta2);
        grafo.addEdge(aresta3);
        grafo.addEdge(aresta4);
        grafo.addEdge(aresta5);
        grafo.addEdge(aresta6);
        grafo.addEdge(aresta7);
        grafo.addEdge(aresta8);
        grafo.addEdge(aresta9);
        grafo.addEdge(aresta10);
        grafo.addEdge(aresta11);
        grafo.addEdge(aresta12);
        grafo.addEdge(aresta13);
        grafo.addEdge(aresta14);

//        Key key = new Key("fluxo", "Edge", "fluxo", "double");
//        ArrayList<Key> keys = null;
//        keys.add(key);
        Graphml grafoml = new Graphml(grafo);

        //FordFulkerson ford = new FordFulkerson(grafoml);
        Malgrange v = new Malgrange();
        //System.out.println(v.malgrange(grafoml).getGraph().getId());
        System.out.println(v.getMalgrange(grafoml));
       // System.out.println(ford.getFluxoMaximo(grafoml, no0, no1));
    }

}
