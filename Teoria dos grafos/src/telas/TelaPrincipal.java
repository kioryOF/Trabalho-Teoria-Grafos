package telas;

import java.io.FileNotFoundException;
import java.io.IOException;
import modelos.Graph;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import xml.ControladorXML;

public class TelaPrincipal extends javax.swing.JFrame {

    static private Graph grafo;
    private CriarNovoGraph cnGrafo;
    private AdicionaNode addNode;
    private AdicionaEdge addEdge;
    private JFileChooser fileChooser;

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

        javax.swing.GroupLayout jPanelVerticesLayout = new javax.swing.GroupLayout(jPanelVertices);
        jPanelVertices.setLayout(jPanelVerticesLayout);
        jPanelVerticesLayout.setHorizontalGroup(
            jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelVerticesLayout.createSequentialGroup()
                .addGroup(jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCriaNovoGraph, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(100, 100, 100)
                .addComponent(jButtonVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
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
            cnGrafo = new CriarNovoGraph();
            cnGrafo.setVisible(true);
        } else if (this.grafo.getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes de criar uma Aresta");
        } else {
            addEdge = new AdicionaEdge();
            addEdge.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAdicionaEdgeActionPerformed

    private void jButtonSalvarGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarGraphActionPerformed
        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            cnGrafo = new CriarNovoGraph();
            cnGrafo.setVisible(true);
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
            cnGrafo = new CriarNovoGraph();
            cnGrafo.setVisible(true);
        } else {
            addNode = new AdicionaNode();
            addNode.setVisible(true);
        }

    }//GEN-LAST:event_jButtonAdicionaNodeActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed

        if (this.grafo == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            cnGrafo = new CriarNovoGraph();
            cnGrafo.setVisible(true);
        } else {
            ControladorXML xml = new ControladorXML();
            jTextAreaGrafo.setText(xml.mostraGrafo(grafo));
        }
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

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
    private javax.swing.JTextField campoIdGrafo;
    private javax.swing.JTextField campoQntArestas;
    private javax.swing.JTextField campoQntVertices;
    private javax.swing.JButton jButtonAdicionaEdge;
    private javax.swing.JButton jButtonAdicionaNode;
    private javax.swing.JButton jButtonCriaNovoGraph;
    private javax.swing.JButton jButtonSalvarGraph;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCarregarGrafo;
    private javax.swing.JPanel jPanelCriarGrafo;
    private javax.swing.JPanel jPanelVertices;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaGrafo;
    private javax.swing.JTextArea painelCarregaGrafo;
    private javax.swing.JButton selecionaGrafo;
    // End of variables declaration//GEN-END:variables
}
