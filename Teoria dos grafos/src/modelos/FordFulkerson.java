/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import comparadores.ComparaArestas;
import java.util.ArrayList;
import java.util.Collections;

public class FordFulkerson {

    private Graphml grafo;

    public FordFulkerson() {
        this.grafo = new Graphml();
    }

    public double getFluxoMaximo(Graphml grafo, Node inicial, Node destino) {
        this.grafo = grafo;
        double fluxoMax = 0;
        ArrayList<Edge> caminho = new ArrayList();

        do {
            caminho = getCaminhoMaior(inicial, destino);
            if (caminho != null) {
                fluxoMax = fluxoMax + atualizarGrafo(caminho);
            }

        } while (caminho != null);

        return fluxoMax;

    }

    private double atualizarGrafo(ArrayList<Edge> caminho) {
        double gargalo = Double.MAX_VALUE;

        //pega gargalo
        for (int i = 0; i < caminho.size(); i++) {

            double tamanhoAtual = Double.parseDouble(caminho.get(i).getData().getData());
            if (tamanhoAtual < gargalo) {
                gargalo = tamanhoAtual;
            }
        }

        //subtrai gargalo
        for (int i = 0; i < caminho.size(); i++) {

            double tamanhoAtual = Double.parseDouble(caminho.get(i).getData().getData());
            tamanhoAtual = tamanhoAtual - gargalo;
            caminho.get(i).getData().setData(String.valueOf(tamanhoAtual));

        }
        return gargalo;
    }

    private ArrayList<Edge> getCaminhoMaior(Node inicial, Node destino) {
        ArrayList<Node> visitados = new ArrayList<>();
        ArrayList<Edge> caminho = new ArrayList<>();
        Node atual = inicial;

        while (!atual.getId().equals(destino.getId())) {
            Edge aresta = new Edge();
            aresta = getMaiorArestaAdjacente(atual, visitados);
            //se não houver mais uma saida com fluxo
            if (aresta == null) {
                return null;
            }
            visitados.add(atual);
            caminho.add(aresta);

            atual = aresta.getTarget();

        }

        return caminho;
    }

    private Edge getMaiorArestaAdjacente(Node no, ArrayList<Node> visitados) {
        ArrayList<Edge> arestas = grafo.getGraph().getArestas(no);
        double maior = 0;
        Edge maiorAresta = new Edge();
        for (int i = 0; i < arestas.size(); i++) {
            Edge arestaAtual = arestas.get(i);
            if (Double.parseDouble(arestaAtual.getData().getData()) > 0 && !visitados.contains(arestaAtual.getTarget())) {

                if (maior < Double.parseDouble(arestaAtual.getData().getData())) {
                    maior = Double.parseDouble(arestaAtual.getData().getData());
                    maiorAresta = arestaAtual;
                }
            }
        }

        if (maior > 0) {
            return maiorAresta;
        } else {
            return null;
        }

    }
}
