package modelos;

import comparadores.ComparaArestas;
import java.util.ArrayList;
import java.util.Collections;

public class Prim {

    private ArrayList<Edge> arestas;
    private ArrayList<Edge> arestasAdicionadas;
    private ArrayList<Node> nos;
    private ArrayList<Node> nosAdicionados;
    private ArrayList<String> nosIdAdicionados;
    private ArrayList<String> nosId;

    private Graphml graphml;

    public Prim() {
        this.arestas = new ArrayList();
        this.arestasAdicionadas = new ArrayList();
        this.nos = new ArrayList();
        this.nosAdicionados = new ArrayList();
        this.nosIdAdicionados = new ArrayList();
        this.nosId = new ArrayList();
    }

    public Graphml getPrim(Graphml grafoml) {
        graphml = grafoml;
        nos = graphml.getGraph().getNodes();
        for (int i = 0; i < nos.size(); i++) {
            nosId.add(graphml.getGraph().getNodes().get(i).getId());
        }

        ComparaArestas c = new ComparaArestas();
        arestas = (ArrayList<Edge>) graphml.getGraph().getEdges().clone();
        Collections.sort(arestas, c);

        nosAdicionados.add(nos.get(0));
        nosIdAdicionados.add(nos.get(0).getId());
        
        
        while (nosAdicionados.size() != nos.size()) {
            for (int j = 0; j < arestas.size(); j++) {
                // nosAdicionados.add(nos.get(i));
                if (nosIdAdicionados.contains(arestas.get(j).getSource().getId())
                        && !nosIdAdicionados.contains(arestas.get(j).getTarget().getId())) {
                    arestasAdicionadas.add(arestas.get(j));
                    nosAdicionados.add(arestas.get(j).getTarget());
                    nosIdAdicionados.add(arestas.get(j).getTarget().getId());
                    arestas.remove(j);
                    break;
                }
                if (nosIdAdicionados.contains(arestas.get(j).getTarget().getId())
                        && !nosIdAdicionados.contains(arestas.get(j).getSource().getId())) {
                    arestasAdicionadas.add(arestas.get(j));
                    nosAdicionados.add(arestas.get(j).getSource());
                    nosIdAdicionados.add(arestas.get(j).getSource().getId());
                    arestas.remove(j);
                    break;
                }
            }
        }
        Graph graph = new Graph(grafoml.getGraph().getId(), grafoml.getGraph().getEdgedefault(), nos, arestasAdicionadas);
        
        this.graphml.setGraph(graph);
        return graphml;
    }
}
