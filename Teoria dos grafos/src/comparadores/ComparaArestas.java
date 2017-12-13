package comparadores;

import java.util.Comparator;
import modelos.Edge;

public class ComparaArestas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Edge aresta1 = (Edge) o1;
        Edge aresta2 = (Edge) o2;
        if (Float.parseFloat(aresta1.getData().getData()) > Float.parseFloat(aresta2.getData().getData())) {
            return 1;
        }
        if (Float.parseFloat(aresta1.getData().getData()) < Float.parseFloat(aresta2.getData().getData())) {
            return -1;
        }
        return 0;
    }
}
