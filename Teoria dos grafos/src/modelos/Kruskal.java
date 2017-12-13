package modelos;

import comparadores.ComparaArestas;
import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {

    private ArrayList<ArrayList<String>> listaPais;
    private ArrayList<String> nosId;
    private ArrayList<Edge> arestas;
    private ArrayList<Node> nos;
    private Graphml graphml;
    public Kruskal() {
        this.listaPais = new ArrayList();
        this.arestas = new ArrayList();
        this.nos = new ArrayList();
        this.nosId = new ArrayList();
        
    }

    public Graphml getKruskal(Graphml grafoml) {
        this.graphml = grafoml;
        
        nos = graphml.getGraph().getNodes();
        for (int i = 0; i < nos.size(); i++) {
            nosId.add(graphml.getGraph().getNodes().get(i).getId());
        }

        ArrayList<Edge> arvore = new ArrayList<Edge>();

        for (int i = 0; i < nos.size(); i++) {
            ArrayList<String> listaAux = new ArrayList<String>();
            listaAux.add(graphml.getGraph().getNodes().get(i).getId());
            listaPais.add(listaAux);
        }
        ComparaArestas c = new ComparaArestas();
        arestas = (ArrayList<Edge>) graphml.getGraph().getEdges().clone();
        Collections.sort(arestas, c);
        for (int i = 0; i < arestas.size(); i++) {

            if (comparaPais(arestas.get(i).getSource().getId(), arestas.get(i).getTarget().getId())) {
                arvore.add(arestas.get(i));
                unir(arestas.get(i).getSource(), arestas.get(i).getTarget());
                unir(arestas.get(i).getTarget(), arestas.get(i).getSource());
            }

        }

        graphml.setGraph(arestasParaArvore(arvore));
        return graphml;

    }

    private boolean comparaPais(String source, String target) {

        return Collections.disjoint(pais(source), pais(target));
    }

    private ArrayList<String> pais(String idNo) {

        return listaPais.get(nosId.indexOf(idNo));

    }

    private void unir(Node source, Node target) {
        int m = listaPais.get(nosId.indexOf(target.getId())).size();

        for (int i = 0; i < m; i++) {
            String x = listaPais.get(nosId.indexOf(target.getId())).get(i);
            if (!(listaPais.get(nosId.indexOf(source.getId())).contains(x))) {
                listaPais.get(nosId.indexOf(source.getId())).add(x);
            }
        }
    }


    private Graph arestasParaArvore(ArrayList<Edge> arvore) {
//        ArrayList<Node> nosArvore = new ArrayList<>();
//        ArrayList<String> nosIdArvore = new ArrayList<>();
//        Node noAux;
//        String noAuxId;
//        for (int i = 0; i < arvore.size(); i++) {
//            noAux = arvore.get(i).getSource();
//            noAuxId = arvore.get(i).getSource().getId();
//            if (!(nosIdArvore.contains(noAuxId))) {
//                nosIdArvore.add(noAuxId);
//                nosArvore.add(noAux);
//            }
//            noAux = arvore.get(i).getTarget();
//            noAuxId = arvore.get(i).getTarget().getId();
//            if (!(nosIdArvore.contains(noAuxId))) {
//                nosIdArvore.add(noAuxId);
//                nosArvore.add(noAux);
//            }
//
//        }
        Graph grafo = new Graph(graphml.getGraph().getId(), graphml.getGraph().getEdgedefault(), this.nos, arvore);
        return grafo;
    }

}
