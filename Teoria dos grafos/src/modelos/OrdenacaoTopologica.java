package modelos;

import java.util.ArrayList;

public class OrdenacaoTopologica {

    Graph grafo;
    ArrayList<Node> ordemNode;
    int grauMaxRecepcao;

    public OrdenacaoTopologica(Graph grafo) {
        this.grafo = grafo;
        this.ordemNode = new ArrayList<>();
        atualizaGrau();
    }

    public void ordena() {
        for (int i = 0; i < grafo.getNodes().size(); i++) {
            if (grafo.getGrauRecepcao(grafo.getNodes().get(i)) == 0) {
                ordemNode.add(grafo.getNodes().get(i));
                grafo.removeNode(grafo.getNodes().get(i));
            }
        }
        atualizaGrau();
        if (!grafo.getNodes().isEmpty()) {
            ordena();
        }
    }

    public ArrayList<Node> getOrdenacaoTopologica() {
        ordena();
        return ordemNode;
    }

    private void atualizaGrau() {
        for (int i = 0; i < grafo.getNodes().size(); i++) {
            if (grafo.getGrauRecepcao(grafo.getNodes().get(i)) > grauMaxRecepcao) {
                grauMaxRecepcao = grafo.getGrauRecepcao(grafo.getNodes().get(i));
            }
        }

    }
}
