/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Malgrange {

    private Graphml grafoMalgrange;

    public Malgrange() {

    }

    public String getMalgrange(Graphml grafo) {
       
        grafoMalgrange = grafo;


        int qntNodes= grafoMalgrange.getGraph().getNodes().size();
        
        List<String> intersecao = new ArrayList<String>();
        
       
        String imprimir = "(";
        while(intersecao.size() != qntNodes){
        int qt = grafoMalgrange.getGraph().getNodes().size();
        int[][] matrizADJ = grafoMalgrange.getGraph().getMatrizAdjacencia();
        List<String> ftd = new ArrayList<String>();
        List<String> fti = new ArrayList<String>();
        
        
         int i = 0,  j = 0,contador = 0;

        int proximoDaLista = 0;
        ftd.add(0, grafoMalgrange.getGraph().getNodes().get(0).getId());
        

        while (contador < grafoMalgrange.getGraph().getNodes().size()) {

            while (j < qt) {

                if (matrizADJ[i][j] == 1) {
                    if (!ftd.contains(grafoMalgrange.getGraph().getNodes().get(j).getId())) {
                        ftd.add(grafoMalgrange.getGraph().getNodes().get(j).getId());
                    }

                }
                j++;
            }

            proximoDaLista++;
           if(proximoDaLista >= ftd.size()){
           break;}
            
            
            for (int a = 0; a < grafoMalgrange.getGraph().getNodes().size(); a++) {
               
                if(grafoMalgrange.getGraph().getNodes().get(a).getId() == ftd.get(proximoDaLista)){
                    i = grafoMalgrange.getGraph().getNodes().indexOf(grafoMalgrange.getGraph().getNodes().get(a));
                break;
                }
            }
            
            contador++;
            j = 0;
        }
        //System.out.println(ftd);
        List novaLista = new ArrayList(new HashSet(ftd));

        contador = 0;
        int proximoDaLista2 = 0;
        i = 0;
        j = 0;

        
             fti.add(0, grafoMalgrange.getGraph().getNodes().get(0).getId()); 
        
        
        
        

        while (contador < grafoMalgrange.getGraph().getNodes().size()) {

            while (i < qt) {

                if (matrizADJ[i][j] == 1) {
                    if (!fti.contains(grafoMalgrange.getGraph().getNodes().get(i).getId()) ) {
                        fti.add(grafoMalgrange.getGraph().getNodes().get(i).getId());
                    }

                }
                i++;
            }

            proximoDaLista2++;
             if(proximoDaLista2 >= fti.size()){
           break;}
             
             for (int a = 0; a < grafoMalgrange.getGraph().getNodes().size(); a++) {
               
                if(grafoMalgrange.getGraph().getNodes().get(a).getId() == fti.get(proximoDaLista2)){
                    j = grafoMalgrange.getGraph().getNodes().indexOf(grafoMalgrange.getGraph().getNodes().get(a));
                break;
                }
            }
            
            contador++;
            i = 0;
        }
        //System.out.println(fti);
        List novaLista2 = new ArrayList(new HashSet(fti));

        novaLista.retainAll(novaLista2);
        intersecao.addAll(novaLista);
            //System.out.println(novaLista);
        
        imprimir += "{";
        for (int r = 0; r < novaLista.size(); r++) {
            imprimir += novaLista.get(r);
            if(r != novaLista.size()-1){
            imprimir += ",";
            }
        }
        
        imprimir += "}";
        
        for (Node no: grafoMalgrange.getGraph().getNodes()) {
            if(intersecao.contains(no.getId())){
                grafoMalgrange.getGraph().removeNode(no);
            }
        }
        
        
        
        }
        imprimir += ")";
        //System.out.println("Vértices Fortemente Conexos:\n" + imprimir);
        return imprimir;
        
    }
}
