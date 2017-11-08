package telas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Graph;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.Edge;
import modelos.Node;
import xml.ControladorXML;

public class TelaPrincipal extends javax.swing.JFrame {

    static private Graph grafo;
    private CriarNovoGraph cnGrafo;
    private AdicionaNode addNode;
    private RemoveNode removeNode;
    private RemoveEdge removeEdge;
    private AdicionaEdge addEdge;
    private JFileChooser fileChooser;
    private DadosNode dadosNode;

    public TelaPrincipal() {
        initComponents();
        grafo = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelCriarGrafo = new javax.swing.JPanel();
        jPanelVertices = new javax.swing.JPanel();
        jButtonCriaNovoGraph = new javax.swing.JButton();
        jButtonAdicionaEdge = new javax.swing.JButton();
        jButtonSalvarGraph = new javax.swing.JButton();
        jButtonAdicionaNode = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaGrafo = new javax.swing.JTextArea();
        jButtonVisualizar = new javax.swing.JButton();
        removeNo = new javax.swing.JToggleButton();
        removeAresta = new javax.swing.JToggleButton();
        jPanelCarregarGrafo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        selecionaGrafo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelCarregaGrafo = new javax.swing.JTextArea();
        campoIdGrafo = new javax.swing.JTextField();
        campoQntVertices = new javax.swing.JTextField();
        campoQntArestas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaRepresentacao = new javax.swing.JTextArea();
        matrizAdjacencia = new javax.swing.JButton();
        listaAdjacencia = new javax.swing.JButton();
        matrizIncidencia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCriaNovoGraph.setText("Criar um novo Grafo");
        jButtonCriaNovoGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriaNovoGraphActionPerformed(evt);
            }
        });

        jButtonAdicionaEdge.setText("Adicionar Aresta");
        jButtonAdicionaEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionaEdgeActionPerformed(evt);
            }
        });

        jButtonSalvarGraph.setText("Salvar Grafo");
        jButtonSalvarGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarGraphActionPerformed(evt);
            }
        });

        jButtonAdicionaNode.setText("Adicionar Nó");
        jButtonAdicionaNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionaNodeActionPerformed(evt);
            }
        });

        jTextAreaGrafo.setColumns(20);
        jTextAreaGrafo.setRows(5);
        jScrollPane2.setViewportView(jTextAreaGrafo);

        jButtonVisualizar.setText("VIsualizar no Painel");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        removeNo.setText("Remover Nó");
        removeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNoActionPerformed(evt);
            }
        });

        removeAresta.setText("Remover Aresta");
        removeAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVerticesLayout = new javax.swing.GroupLayout(jPanelVertices);
        jPanelVertices.setLayout(jPanelVerticesLayout);
        jPanelVerticesLayout.setHorizontalGroup(
            jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelVerticesLayout.createSequentialGroup()
                .addGroup(jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCriaNovoGraph, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelVerticesLayout.setVerticalGroup(
            jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerticesLayout.createSequentialGroup()
                .addComponent(jButtonCriaNovoGraph)
                .addGap(25, 25, 25)
                .addComponent(jButtonAdicionaNode)
                .addGap(25, 25, 25)
                .addComponent(jButtonAdicionaEdge)
                .addGap(18, 18, 18)
                .addComponent(removeNo)
                .addGap(18, 18, 18)
                .addComponent(removeAresta)
                .addGap(18, 18, 18)
                .addComponent(jButtonVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButtonSalvarGraph))
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanelCriarGrafoLayout = new javax.swing.GroupLayout(jPanelCriarGrafo);
        jPanelCriarGrafo.setLayout(jPanelCriarGrafoLayout);
        jPanelCriarGrafoLayout.setHorizontalGroup(
            jPanelCriarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVertices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCriarGrafoLayout.setVerticalGroup(
            jPanelCriarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCriarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVertices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Criar Grafo", jPanelCriarGrafo);

        selecionaGrafo.setText("Selecionar Grafo");
        selecionaGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaGrafoActionPerformed(evt);
            }
        });

        painelCarregaGrafo.setEditable(false);
        painelCarregaGrafo.setColumns(20);
        painelCarregaGrafo.setRows(5);
        jScrollPane1.setViewportView(painelCarregaGrafo);

        campoIdGrafo.setEditable(false);
        campoIdGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdGrafoActionPerformed(evt);
            }
        });

        campoQntVertices.setEditable(false);

        campoQntArestas.setEditable(false);

        jLabel1.setText("Id do grafo:");

        jLabel2.setText("Quantidade de Vértices:");

        jLabel3.setText("Quantidade de Arestas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecionaGrafo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(campoQntVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQntArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoIdGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1217, 1217, 1217))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoQntVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoQntArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(selecionaGrafo)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout jPanelCarregarGrafoLayout = new javax.swing.GroupLayout(jPanelCarregarGrafo);
        jPanelCarregarGrafo.setLayout(jPanelCarregarGrafoLayout);
        jPanelCarregarGrafoLayout.setHorizontalGroup(
            jPanelCarregarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarregarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCarregarGrafoLayout.setVerticalGroup(
            jPanelCarregarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarregarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Carregar Grafo", jPanelCarregarGrafo);

        areaRepresentacao.setEditable(false);
        areaRepresentacao.setColumns(20);
        areaRepresentacao.setRows(5);
        jScrollPane3.setViewportView(areaRepresentacao);

        matrizAdjacencia.setText("Matriz de Adjacências");
        matrizAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizAdjacenciaActionPerformed(evt);
            }
        });

        listaAdjacencia.setText(" Listas de Adjacências");
        listaAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAdjacenciaActionPerformed(evt);
            }
        });

        matrizIncidencia.setText(" Matriz de Incidências");
        matrizIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizIncidenciaActionPerformed(evt);
            }
        });

        jButton1.setText("Caracteristica de Nós");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ordem Grafo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tipo Grafo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matrizAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrizIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(matrizAdjacencia)
                .addGap(18, 18, 18)
                .addComponent(listaAdjacencia)
                .addGap(18, 18, 18)
                .addComponent(matrizIncidencia)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(60, 60, 60))
        );

        jTabbedPane.addTab("Representação Grafo", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionaGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaGrafoActionPerformed
        fileChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
                "xml files (*.xml)", "xml");
        fileChooser.setFileFilter(xmlfilter);
        int returnVal = fileChooser.showOpenDialog(jPanelCarregarGrafo);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ControladorXML xml = new ControladorXML();
            try {
                grafo = xml.carregarGrafo(fileChooser.getSelectedFile().getPath());
                System.out.println(fileChooser.getSelectedFile().getPath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");

            }
            painelCarregaGrafo.setText(xml.mostraGrafo(grafo));
            campoIdGrafo.setText(grafo.getId());
            campoQntVertices.setText(grafo.getNodes().size() + " Vértices");
            campoQntArestas.setText(grafo.getEdges().size() + " Arestas");
        }
    }//GEN-LAST:event_selecionaGrafoActionPerformed

    private void jButtonCriaNovoGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriaNovoGraphActionPerformed
        cnGrafo = new CriarNovoGraph();
        cnGrafo.setVisible(true);
    }//GEN-LAST:event_jButtonCriaNovoGraphActionPerformed

    private void jButtonAdicionaEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionaEdgeActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (this.grafo.getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            addEdge = new AdicionaEdge();
            addEdge.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAdicionaEdgeActionPerformed

    private void jButtonSalvarGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarGraphActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {

            ControladorXML xml = new ControladorXML();

            JFileChooser chooser = new JFileChooser();
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try {
                    xml.salvaGrafo(grafo, chooser.getSelectedFile() + ".xml");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");
                }
            }
        }
    }//GEN-LAST:event_jButtonSalvarGraphActionPerformed

    private void campoIdGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdGrafoActionPerformed

    private void jButtonAdicionaNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionaNodeActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            addNode = new AdicionaNode();
            addNode.setVisible(true);
        }

    }//GEN-LAST:event_jButtonAdicionaNodeActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed

        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            ControladorXML xml = new ControladorXML();
            jTextAreaGrafo.setText(xml.mostraGrafo(grafo));
        }
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void removeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNoActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        }
        if (grafo.getNodes().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um no antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            removeNode = new RemoveNode();
            removeNode.setVisible(true);
        }
    }//GEN-LAST:event_removeNoActionPerformed

    private void removeArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeArestaActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (grafo.getEdges().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
            this.jButtonAdicionaEdgeActionPerformed(evt);
        } else {
            removeEdge = new RemoveEdge();
            removeEdge.setVisible(true);
        }
    }//GEN-LAST:event_removeArestaActionPerformed

    private void matrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizIncidenciaActionPerformed
        if (grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (grafo.getEdges().size() > 0) {
                int linha = grafo.getNodes().size();
                int coluna = grafo.getEdges().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < coluna; i++) {
                    str += grafo.getEdges().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < linha; i++) {
                    str += grafo.getNodes().get(i).getId() + " :\t";
                    for (j = 0; j < coluna; j++) {

                        str += grafo.getMatrizIncidencia()[i][j] + "\t";

                    }
                    str += "\n";

                }
                str += "Legenda:";
                str += "\n";
                str += "1: Saida";
                str += "\n";
                str += "-1: Chegada";
                str += "\n";
                str += "2: Saida e chegada";
                areaRepresentacao.setText(str);
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
                this.jButtonAdicionaEdgeActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_matrizIncidenciaActionPerformed

    private void matrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizAdjacenciaActionPerformed
        if (grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (grafo.getEdges().size() > 0) {
                int n = grafo.getNodes().size();
                //int m = grafo.getEdges().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < n; i++) {
                    str += grafo.getNodes().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < n; i++) {
                    str += grafo.getNodes().get(i).getId() + " :\t";
                    for (j = 0; j < n; j++) {

                        str += grafo.getMatrizAdjacencia()[i][j] + "\t";

                    }
                    str += "\n";
                }
                areaRepresentacao.setText(str);
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
                this.jButtonAdicionaEdgeActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_matrizAdjacenciaActionPerformed

    private void listaAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAdjacenciaActionPerformed

        if (grafo == null) {

            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (grafo.getEdges().size() > 0) {
                int i, j;

                String str = "";
                for (i = 0; i < grafo.getListaDeAdjacencia().size(); i++) {
                    str += grafo.getNodes().get(i).getId() + " :\t";
                    ArrayList<Node> listaNo = grafo.getListaDeAdjacencia().get(i);

                    System.out.println(listaNo.size());
                    for (j = 0; j < listaNo.size(); j++) {

                        str += listaNo.get(j).getId() + "  ";
                    }
                    str += "\n";

                }
                System.out.println(str);
                areaRepresentacao.setText(str);
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
                this.jButtonAdicionaEdgeActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_listaAdjacenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (this.grafo.getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            dadosNode = new DadosNode();
            dadosNode.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (this.grafo.getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            String str = "Ordem do grafo é : " + grafo.getOrdem();
            areaRepresentacao.setText(str);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String str = "";
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (this.grafo.getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {

            if (grafo.isMultigrafo()) {
                str += "Multigrafo" + "\n";
            }
            if (grafo.isRegular()) {
                str += "Regular" + "\n";
            }
            if (grafo.isCompleto()) {
                str += "Completo";
            }
            if (grafo.isBiPartido()) {
                str += "Bipartido";
            }
            if (str == "") {
                str = "Não tem tipo";
            }

        }
        areaRepresentacao.setText(str);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    static public Graph getGrafo() {
        return grafo;
    }

    static public void setGrafo(Graph grafo) {
        TelaPrincipal.grafo = grafo;
    }

    public CriarNovoGraph getCnGrafo() {
        return cnGrafo;
    }

    public void setCnGrafo(CriarNovoGraph cnGrafo) {
        this.cnGrafo = cnGrafo;
    }

    public AdicionaNode getAddNode() {
        return addNode;
    }

    public void setAddNode(AdicionaNode addNode) {
        this.addNode = addNode;
    }

    public AdicionaEdge getAddEdge() {
        return addEdge;
    }

    public void setAddEdge(AdicionaEdge addEdge) {
        this.addEdge = addEdge;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRepresentacao;
    private javax.swing.JTextField campoIdGrafo;
    private javax.swing.JTextField campoQntArestas;
    private javax.swing.JTextField campoQntVertices;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdicionaEdge;
    private javax.swing.JButton jButtonAdicionaNode;
    private javax.swing.JButton jButtonCriaNovoGraph;
    private javax.swing.JButton jButtonSalvarGraph;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCarregarGrafo;
    private javax.swing.JPanel jPanelCriarGrafo;
    private javax.swing.JPanel jPanelVertices;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaGrafo;
    private javax.swing.JButton listaAdjacencia;
    private javax.swing.JButton matrizAdjacencia;
    private javax.swing.JButton matrizIncidencia;
    private javax.swing.JTextArea painelCarregaGrafo;
    private javax.swing.JToggleButton removeAresta;
    private javax.swing.JToggleButton removeNo;
    private javax.swing.JButton selecionaGrafo;
    // End of variables declaration//GEN-END:variables
}
