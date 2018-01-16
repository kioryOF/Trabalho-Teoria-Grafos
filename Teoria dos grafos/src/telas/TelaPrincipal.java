package telas;

import br.com.davesmartins.graphviewlib.ViewGraph;
import br.com.davesmartins.graphviewlib.erro.EGraphViewExcpetion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Graph;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.Dijkstra;
import modelos.Graphml;
import modelos.Kruskal;
import modelos.Node;
import modelos.OrdenacaoTopologica;
import modelos.BuscaProfundidade;
import modelos.BuscaLargura;
import modelos.FordFulkerson;
import modelos.Malgrange;
import modelos.Prim;
import xml.ControladorXML;

public class TelaPrincipal extends javax.swing.JFrame {

    static private Graphml graphml;
    private CriarNovoGraph cnGrafo;
    private AdicionaNode addNode;
    private RemoveNode removeNode;
    private RemoveEdge removeEdge;
    private AdicionaEdge addEdge;
    private JFileChooser fileChooser;
    private DadosNode dadosNode;
    private AdicionaKey addKey;
    private AdicionaData addData;
    private Dijkstra dij;
    private Graphml arvore;

    public TelaPrincipal() {
        initComponents();
        graphml = new Graphml();
        this.jButtonSalvar.setVisible(false);
        this.jPanelDijkstra.setVisible(false);
        this.jPanelFord.setVisible(false);
        this.jPanelBusca.setVisible(false);

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
        jButtonAddKey = new javax.swing.JButton();
        jButtonAddData = new javax.swing.JButton();
        jPanelCarregarGrafo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        selecionaGrafo = new javax.swing.JButton();
        campoQntVertices = new javax.swing.JTextField();
        campoQntArestas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoIdGrafo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelCarregaGrafo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaRepresentacao = new javax.swing.JTextArea();
        matrizAdjacencia = new javax.swing.JButton();
        listaAdjacencia = new javax.swing.JButton();
        matrizIncidencia = new javax.swing.JButton();
        jButtonCaracteristicas = new javax.swing.JButton();
        jButtonOrdemGrafo = new javax.swing.JButton();
        jButtonTipoGrafo = new javax.swing.JButton();
        jButtonVisualizarGraficamente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonKruskal = new javax.swing.JButton();
        jButtonPrim = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAlgoritmos = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jPanelDijkstra = new javax.swing.JPanel();
        jComboBoxRaiz = new javax.swing.JComboBox<>();
        jButtonEscolherRaiz = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxMenor = new javax.swing.JComboBox<>();
        jButtonEscolherMenor = new javax.swing.JButton();
        jTextFieldMenor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonDijkstra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonMalgrange = new javax.swing.JButton();
        jButtonFordFulkerson = new javax.swing.JButton();
        jButtonBuscaNoGrafo = new javax.swing.JButton();
        jButtonOrdenacaoTopologica = new javax.swing.JButton();
        jPanelFord = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxNoSaidaFord = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxNoChegadaFord = new javax.swing.JComboBox<>();
        jButtonCalculaFluxoMaximo = new javax.swing.JButton();
        jPanelBusca = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxNoSaidaBuscas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButtonBuscaProfundidade = new javax.swing.JButton();
        jButtonBuscaLargura = new javax.swing.JButton();
        jButtonSalvar2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaAlgoritmos2 = new javax.swing.JTextArea();

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

        jButtonVisualizar.setText("Visualizar estrutura");
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

        jButtonAddKey.setText("Adicionar Key");
        jButtonAddKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddKeyActionPerformed(evt);
            }
        });

        jButtonAddData.setText("Adicioanar Data");
        jButtonAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVerticesLayout = new javax.swing.GroupLayout(jPanelVertices);
        jPanelVertices.setLayout(jPanelVerticesLayout);
        jPanelVerticesLayout.setHorizontalGroup(
            jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelVerticesLayout.createSequentialGroup()
                .addGroup(jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCriaNovoGraph, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionaEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelVerticesLayout.setVerticalGroup(
            jPanelVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerticesLayout.createSequentialGroup()
                .addComponent(jButtonCriaNovoGraph)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdicionaNode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionaEdge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAresta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddKey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButtonVisualizar)
                .addGap(36, 36, 36)
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

        campoQntVertices.setEditable(false);

        campoQntArestas.setEditable(false);

        jLabel2.setText("Quantidade de Vértices:");

        jLabel3.setText("Quantidade de Arestas:");

        campoIdGrafo.setEditable(false);
        campoIdGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdGrafoActionPerformed(evt);
            }
        });

        jLabel1.setText("Id do grafo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(campoQntVertices, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(campoIdGrafo)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionaGrafo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(campoQntArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoQntVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoQntArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecionaGrafo))
        );

        painelCarregaGrafo.setEditable(false);
        painelCarregaGrafo.setColumns(20);
        painelCarregaGrafo.setRows(5);
        jScrollPane1.setViewportView(painelCarregaGrafo);

        javax.swing.GroupLayout jPanelCarregarGrafoLayout = new javax.swing.GroupLayout(jPanelCarregarGrafo);
        jPanelCarregarGrafo.setLayout(jPanelCarregarGrafoLayout);
        jPanelCarregarGrafoLayout.setHorizontalGroup(
            jPanelCarregarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarregarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCarregarGrafoLayout.setVerticalGroup(
            jPanelCarregarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCarregarGrafoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarregarGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButtonCaracteristicas.setText("Caracteristica de Nós");
        jButtonCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaracteristicasActionPerformed(evt);
            }
        });

        jButtonOrdemGrafo.setText("Ordem Grafo");
        jButtonOrdemGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdemGrafoActionPerformed(evt);
            }
        });

        jButtonTipoGrafo.setText("Tipo Grafo");
        jButtonTipoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoGrafoActionPerformed(evt);
            }
        });

        jButtonVisualizarGraficamente.setText("Visualizar graficamente");
        jButtonVisualizarGraficamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarGraficamenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listaAdjacencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOrdemGrafo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrizAdjacencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrizIncidencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCaracteristicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTipoGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizarGraficamente, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTipoGrafo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOrdemGrafo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaAdjacencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matrizIncidencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matrizAdjacencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVisualizarGraficamente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCaracteristicas)
                        .addGap(0, 145, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jTabbedPane.addTab("Representação Grafo", jPanel1);

        jButtonKruskal.setText("Kruskal");
        jButtonKruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKruskalActionPerformed(evt);
            }
        });

        jButtonPrim.setText("Prim");
        jButtonPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimActionPerformed(evt);
            }
        });

        jTextAreaAlgoritmos.setColumns(20);
        jTextAreaAlgoritmos.setRows(5);
        jScrollPane4.setViewportView(jTextAreaAlgoritmos);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jComboBoxRaiz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonEscolherRaiz.setText("Escolher");
        jButtonEscolherRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscolherRaizActionPerformed(evt);
            }
        });

        jLabel5.setText("Escolha o nó raiz:");

        jLabel4.setText("Opções Dijkstras");

        jLabel6.setText("Para saber a menor distancia");

        jLabel7.setText("de um no especifico, selecione-o");

        jComboBoxMenor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMenorActionPerformed(evt);
            }
        });

        jButtonEscolherMenor.setText("Escolher");
        jButtonEscolherMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscolherMenorActionPerformed(evt);
            }
        });

        jTextFieldMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMenorActionPerformed(evt);
            }
        });

        jLabel8.setText("Menor Distancia:");

        javax.swing.GroupLayout jPanelDijkstraLayout = new javax.swing.GroupLayout(jPanelDijkstra);
        jPanelDijkstra.setLayout(jPanelDijkstraLayout);
        jPanelDijkstraLayout.setHorizontalGroup(
            jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDijkstraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDijkstraLayout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDijkstraLayout.createSequentialGroup()
                        .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDijkstraLayout.createSequentialGroup()
                                .addComponent(jComboBoxMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEscolherMenor))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(jPanelDijkstraLayout.createSequentialGroup()
                                    .addComponent(jComboBoxRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonEscolherRaiz))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDijkstraLayout.setVerticalGroup(
            jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDijkstraLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEscolherRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEscolherMenor))
                .addGap(18, 18, 18)
                .addGroup(jPanelDijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButtonDijkstra.setText("Dijkstra");
        jButtonDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDijkstraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKruskal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDijkstra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanelDijkstra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonKruskal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDijkstra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );

        jTabbedPane.addTab("Algoritmos", jPanel3);

        jButtonMalgrange.setText("Malgrange");
        jButtonMalgrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMalgrangeActionPerformed(evt);
            }
        });

        jButtonFordFulkerson.setText("Ford-Fulkerson");
        jButtonFordFulkerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFordFulkersonActionPerformed(evt);
            }
        });

        jButtonBuscaNoGrafo.setText("Buscas no grafo");
        jButtonBuscaNoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaNoGrafoActionPerformed(evt);
            }
        });

        jButtonOrdenacaoTopologica.setText("Ordenação topológica");
        jButtonOrdenacaoTopologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenacaoTopologicaActionPerformed(evt);
            }
        });

        jLabel9.setText("Painel Ford");

        jLabel12.setText("Nó saida");

        jComboBoxNoSaidaFord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Nó chegada");

        jComboBoxNoChegadaFord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonCalculaFluxoMaximo.setText("Calcula Fluxo Máximo");
        jButtonCalculaFluxoMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculaFluxoMaximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFordLayout = new javax.swing.GroupLayout(jPanelFord);
        jPanelFord.setLayout(jPanelFordLayout);
        jPanelFordLayout.setHorizontalGroup(
            jPanelFordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonCalculaFluxoMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxNoSaidaFord, 0, 86, Short.MAX_VALUE)
                    .addComponent(jComboBoxNoChegadaFord, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFordLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelFordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanelFordLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFordLayout.setVerticalGroup(
            jPanelFordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFordLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNoSaidaFord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNoChegadaFord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonCalculaFluxoMaximo)
                .addContainerGap())
        );

        jLabel10.setText("Painel busca");

        jComboBoxNoSaidaBuscas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNoSaidaBuscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNoSaidaBuscasActionPerformed(evt);
            }
        });

        jLabel11.setText("Escolha um nó de saída:");

        jButtonBuscaProfundidade.setText("Busca Profundidade");
        jButtonBuscaProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaProfundidadeActionPerformed(evt);
            }
        });

        jButtonBuscaLargura.setText("Busca Largura");
        jButtonBuscaLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaLarguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscaLayout = new javax.swing.GroupLayout(jPanelBusca);
        jPanelBusca.setLayout(jPanelBuscaLayout);
        jPanelBuscaLayout.setHorizontalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBuscaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10))
                    .addComponent(jButtonBuscaProfundidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jButtonBuscaLargura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBoxNoSaidaBuscas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuscaLayout.setVerticalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNoSaidaBuscas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscaProfundidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscaLargura)
                .addGap(16, 16, 16))
        );

        jButtonSalvar2.setText("Salvar");
        jButtonSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar2ActionPerformed(evt);
            }
        });

        jTextAreaAlgoritmos2.setColumns(20);
        jTextAreaAlgoritmos2.setRows(5);
        jScrollPane5.setViewportView(jTextAreaAlgoritmos2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelFord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMalgrange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFordFulkerson, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOrdenacaoTopologica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuscaNoGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonMalgrange)
                            .addComponent(jButtonOrdenacaoTopologica))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscaNoGrafo)
                            .addComponent(jButtonFordFulkerson))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelFord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addComponent(jButtonSalvar2)))
                .addContainerGap())
        );

        jTabbedPane.addTab("Algoritmos continuação", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarGraficamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarGraficamenteActionPerformed
        fileChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
                "xml files (*.xml)", "xml");
        fileChooser.setFileFilter(xmlfilter);
        int returnVal = fileChooser.showOpenDialog(jPanelCarregarGrafo);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                ViewGraph.generateViewGraphByFrame(fileChooser.getSelectedFile().getPath());
            } catch (EGraphViewExcpetion ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonVisualizarGraficamenteActionPerformed

    private void jButtonTipoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoGrafoActionPerformed
        String str = "";
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (graphml.getGraph().getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {

            if (graphml.getGraph().isMultigrafo()) {
                str += "Multigrafo" + "\n";
            }
            if (graphml.getGraph().isRegular()) {
                str += "Regular" + "\n";
            }
            if (graphml.getGraph().isCompleto()) {
                str += "Completo";
            }
            if (graphml.getGraph().isBiPartido()) {
                str += "Bipartido";
            }
            if ("".equals(str)) {
                str = "Não tem tipo";
            }

        }
        areaRepresentacao.setText(str);
    }//GEN-LAST:event_jButtonTipoGrafoActionPerformed

    private void jButtonOrdemGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdemGrafoActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (graphml.getGraph().getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            String str = "Ordem do grafo é : " + graphml.getGraph().getOrdem();
            areaRepresentacao.setText(str);
        }
    }//GEN-LAST:event_jButtonOrdemGrafoActionPerformed

    private void jButtonCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaracteristicasActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (graphml.getGraph().getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            dadosNode = new DadosNode();
            dadosNode.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCaracteristicasActionPerformed

    private void matrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizIncidenciaActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (graphml.getGraph().getEdges().size() > 0) {
                int linha = graphml.getGraph().getNodes().size();
                int coluna = graphml.getGraph().getEdges().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < coluna; i++) {
                    str += graphml.getGraph().getEdges().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < linha; i++) {
                    str += graphml.getGraph().getNodes().get(i).getId() + " :\t";
                    for (j = 0; j < coluna; j++) {

                        str += graphml.getGraph().getMatrizIncidencia()[i][j] + "\t";

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

    private void listaAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAdjacenciaActionPerformed

        if (graphml.getGraph() == null) {

            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (graphml.getGraph().getEdges().size() > 0) {
                int i, j;

                String str = "";
                for (i = 0; i < graphml.getGraph().getListaDeAdjacencia().size(); i++) {
                    str += graphml.getGraph().getNodes().get(i).getId() + " :\t";
                    ArrayList<Node> listaNo = graphml.getGraph().getListaDeAdjacencia().get(i);

                    for (j = 0; j < listaNo.size(); j++) {

                        str += listaNo.get(j).getId() + "  ";
                    }
                    str += "\n";

                }

                areaRepresentacao.setText(str);
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
                this.jButtonAdicionaEdgeActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_listaAdjacenciaActionPerformed

    private void matrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizAdjacenciaActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            if (graphml.getGraph().getEdges().size() > 0) {
                int n = graphml.getGraph().getNodes().size();
                //int m = grafo.getEdges().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < n; i++) {
                    str += graphml.getGraph().getNodes().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < n; i++) {
                    str += graphml.getGraph().getNodes().get(i).getId() + " :\t";
                    for (j = 0; j < n; j++) {

                        str += graphml.getGraph().getMatrizAdjacencia()[i][j] + "\t";

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

    private void campoIdGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdGrafoActionPerformed

    private void selecionaGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaGrafoActionPerformed
        fileChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
                "xml files (*.xml)", "xml");
        fileChooser.setFileFilter(xmlfilter);
        int returnVal = fileChooser.showOpenDialog(jPanelCarregarGrafo);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ControladorXML xml = new ControladorXML();
            try {
                graphml = xml.carregarGrafo(fileChooser.getSelectedFile().getPath());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");

            }
            painelCarregaGrafo.setText(xml.mostraGrafo(graphml));
            campoIdGrafo.setText(graphml.getGraph().getId());
            campoQntVertices.setText(graphml.getGraph().getNodes().size() + " Vértices");
            campoQntArestas.setText(graphml.getGraph().getEdges().size() + " Arestas");
        }
    }//GEN-LAST:event_selecionaGrafoActionPerformed

    private void jButtonAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDataActionPerformed
        addData = new AdicionaData();
        addData.setVisible(true);
    }//GEN-LAST:event_jButtonAddDataActionPerformed

    private void jButtonAddKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddKeyActionPerformed
        addKey = new AdicionaKey();
        addKey.setVisible(true);
    }//GEN-LAST:event_jButtonAddKeyActionPerformed

    private void removeArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeArestaActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (graphml.getGraph().getEdges().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta antes");
            this.jButtonAdicionaEdgeActionPerformed(evt);
        } else {
            removeEdge = new RemoveEdge();
            removeEdge.setVisible(true);
        }
    }//GEN-LAST:event_removeArestaActionPerformed

    private void removeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNoActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        }
        if (graphml.getGraph().getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um no antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            removeNode = new RemoveNode();
            removeNode.setVisible(true);
        }
    }//GEN-LAST:event_removeNoActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed

        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            ControladorXML xml = new ControladorXML();
            jTextAreaGrafo.setText(xml.mostraGrafo(graphml));
        }
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonAdicionaNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionaNodeActionPerformed

        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            addNode = new AdicionaNode();
            addNode.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAdicionaNodeActionPerformed

    private void jButtonSalvarGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarGraphActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {

            ControladorXML xml = new ControladorXML();

            JFileChooser chooser = new JFileChooser();
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try {
                    xml.salvaGrafo(graphml, chooser.getSelectedFile() + ".xml");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");
                }
            }
        }
    }//GEN-LAST:event_jButtonSalvarGraphActionPerformed

    private void jButtonAdicionaEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionaEdgeActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else if (graphml.getGraph().getNodes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa criar pelo menos 1 nó antes");
            this.jButtonAdicionaNodeActionPerformed(evt);
        } else {
            addEdge = new AdicionaEdge();
            addEdge.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAdicionaEdgeActionPerformed

    private void jButtonCriaNovoGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriaNovoGraphActionPerformed
        cnGrafo = new CriarNovoGraph();
        cnGrafo.setVisible(true);
    }//GEN-LAST:event_jButtonCriaNovoGraphActionPerformed

    private void jButtonKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKruskalActionPerformed
        this.jPanelDijkstra.setVisible(false);

        Kruskal kruskal = new Kruskal();
        this.arvore = kruskal.getKruskal(new Graphml(graphml));

        ControladorXML xml = new ControladorXML();
        this.jTextAreaAlgoritmos.setText(xml.mostraGrafo(this.arvore));

        this.jButtonSalvar.setVisible(true);
    }//GEN-LAST:event_jButtonKruskalActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            ControladorXML xml = new ControladorXML();

            JFileChooser chooser = new JFileChooser();
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try {
                    xml.salvaGrafo(this.arvore, chooser.getSelectedFile() + ".xml");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");
                }
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimActionPerformed
        this.jPanelDijkstra.setVisible(false);
        Prim prim = new Prim();
        this.arvore = prim.getPrim(new Graphml(graphml));

        ControladorXML xml = new ControladorXML();
        this.jTextAreaAlgoritmos.setText(xml.mostraGrafo(this.arvore));

        this.jButtonSalvar.setVisible(true);
    }//GEN-LAST:event_jButtonPrimActionPerformed

    private void jButtonDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDijkstraActionPerformed
        this.jButtonSalvar.setVisible(false);
        this.jPanelDijkstra.setVisible(true);
        this.jComboBoxMenor.removeAllItems();
        this.jComboBoxRaiz.removeAllItems();
        int j;
        for (j = 0; j < graphml.getGraph().getNodes().size(); j++) {
            this.jComboBoxMenor.addItem(graphml.getGraph().getNodes().get(j).getId());
            this.jComboBoxRaiz.addItem(graphml.getGraph().getNodes().get(j).getId());
        }

        this.dij = new Dijkstra(new Graphml(graphml));
        this.jButtonSalvar.setVisible(false);
    }//GEN-LAST:event_jButtonDijkstraActionPerformed

    private void jComboBoxMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMenorActionPerformed

    private void jButtonEscolherRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscolherRaizActionPerformed
        String noId = this.jComboBoxRaiz.getSelectedItem().toString();
        int i = dij.getGraph().getIndiceNodePorId(noId);

        dij.execute(dij.getGraph().getNodes().get(i));
    }//GEN-LAST:event_jButtonEscolherRaizActionPerformed

    private void jButtonEscolherMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscolherMenorActionPerformed
        String noId = this.jComboBoxMenor.getSelectedItem().toString();
        int i = dij.getGraph().getIndiceNodePorId(noId);

        float menor = dij.menorDistancia(dij.getGraph().getNodes().get(i));
        if (menor == Float.MAX_VALUE) {
            this.jTextFieldMenor.setText("infinito");
        } else {
            this.jTextFieldMenor.setText(Float.toString(menor));
        }

    }//GEN-LAST:event_jButtonEscolherMenorActionPerformed

    private void jTextFieldMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMenorActionPerformed

    private void jButtonBuscaNoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaNoGrafoActionPerformed
        this.jPanelFord.setVisible(false);
        this.jPanelBusca.setVisible(true);
        this.jComboBoxNoSaidaBuscas.removeAllItems();
        int j;
        for (j = 0; j < graphml.getGraph().getNodes().size(); j++) {
            this.jComboBoxNoSaidaBuscas.addItem(graphml.getGraph().getNodes().get(j).getId());
        }
    }//GEN-LAST:event_jButtonBuscaNoGrafoActionPerformed

    private void jButtonFordFulkersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFordFulkersonActionPerformed
        this.jButtonSalvar2.setVisible(false);
        this.jPanelBusca.setVisible(false);
        this.jPanelFord.setVisible(true);
        this.jComboBoxNoSaidaFord.removeAllItems();
        this.jComboBoxNoChegadaFord.removeAllItems();
        int j;
        for (j = 0; j < graphml.getGraph().getNodes().size(); j++) {
            this.jComboBoxNoSaidaFord.addItem(graphml.getGraph().getNodes().get(j).getId());
            this.jComboBoxNoChegadaFord.addItem(graphml.getGraph().getNodes().get(j).getId());
        }


    }//GEN-LAST:event_jButtonFordFulkersonActionPerformed

    private void jButtonOrdenacaoTopologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenacaoTopologicaActionPerformed
        this.jButtonSalvar2.setVisible(false);
        this.jPanelBusca.setVisible(false);
        this.jPanelFord.setVisible(false);
        OrdenacaoTopologica ordenar = new OrdenacaoTopologica(new Graph(graphml.getGraph()));
        ArrayList<Node> ordemNos = ordenar.getOrdenacaoTopologica();
        String str = "";
        for (int i = 0; i < ordemNos.size(); i++) {
            str += ordemNos.get(i).getId() + "\n";
        }
        this.jTextAreaAlgoritmos2.setText(str);

    }//GEN-LAST:event_jButtonOrdenacaoTopologicaActionPerformed

    private void jButtonMalgrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMalgrangeActionPerformed
        this.jButtonSalvar2.setVisible(false);
        this.jPanelBusca.setVisible(false);
        this.jPanelFord.setVisible(false);
        Malgrange mg = new Malgrange();
        this.jTextAreaAlgoritmos2.setText("As componentes f-conexas são: "+mg.getMalgrange(new Graphml(graphml)));
    }//GEN-LAST:event_jButtonMalgrangeActionPerformed

    private void jButtonBuscaProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProfundidadeActionPerformed
        this.jButtonSalvar2.setVisible(true);
        String noId = this.jComboBoxNoSaidaBuscas.getSelectedItem().toString();
        Graphml grafoDfs = new Graphml(graphml);
        BuscaProfundidade buscaProfundidade = new BuscaProfundidade(grafoDfs);
        this.arvore = buscaProfundidade.getDfs(grafoDfs.getGraph().pegarNodeDaLista(noId));
        ControladorXML xml = new ControladorXML();
        System.out.println(xml.mostraGrafo(this.arvore));
        jTextAreaAlgoritmos2.setText(xml.mostraGrafo(this.arvore));
    }//GEN-LAST:event_jButtonBuscaProfundidadeActionPerformed

    private void jButtonSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar2ActionPerformed
        if (graphml.getGraph() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.jButtonCriaNovoGraphActionPerformed(evt);
        } else {
            ControladorXML xml = new ControladorXML();

            JFileChooser chooser = new JFileChooser();
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try {
                    xml.salvaGrafo(this.arvore, chooser.getSelectedFile() + ".xml");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo .xml");
                }
            }
        }
    }//GEN-LAST:event_jButtonSalvar2ActionPerformed

    private void jButtonCalculaFluxoMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculaFluxoMaximoActionPerformed
        String saida = this.jComboBoxNoSaidaFord.getSelectedItem().toString();
        String chegada = this.jComboBoxNoChegadaFord.getSelectedItem().toString();
        Graphml gml = new Graphml(graphml);
        FordFulkerson ff = new FordFulkerson();
        Double fluxoMaximo = ff.getFluxoMaximo(gml, gml.getGraph().pegarNodeDaLista(saida), gml.getGraph().pegarNodeDaLista(chegada));
        jTextAreaAlgoritmos2.setText("Fluxo máximo do do nó " + saida + " até o nó " + chegada + " é de :" + fluxoMaximo.toString());
    }//GEN-LAST:event_jButtonCalculaFluxoMaximoActionPerformed

    private void jButtonBuscaLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaLarguraActionPerformed
        this.jButtonSalvar2.setVisible(true);
        String noId = this.jComboBoxNoSaidaBuscas.getSelectedItem().toString();
        Graphml grafoBfs = new Graphml(graphml);
        BuscaLargura bfs = new BuscaLargura();
        this.arvore = bfs.getBfs(grafoBfs, grafoBfs.getGraph().pegarNodeDaLista(noId));
        ControladorXML xml = new ControladorXML();
        jTextAreaAlgoritmos2.setText(xml.mostraGrafo(this.arvore));
    }//GEN-LAST:event_jButtonBuscaLarguraActionPerformed

    private void jComboBoxNoSaidaBuscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNoSaidaBuscasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNoSaidaBuscasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    static public Graphml getGraphml() {
        return graphml;
    }

    static public void setGraphml(Graphml graphml) {
        TelaPrincipal.graphml = graphml;
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
    private javax.swing.JButton jButtonAddData;
    private javax.swing.JButton jButtonAddKey;
    private javax.swing.JButton jButtonAdicionaEdge;
    private javax.swing.JButton jButtonAdicionaNode;
    private javax.swing.JButton jButtonBuscaLargura;
    private javax.swing.JButton jButtonBuscaNoGrafo;
    private javax.swing.JButton jButtonBuscaProfundidade;
    private javax.swing.JButton jButtonCalculaFluxoMaximo;
    private javax.swing.JButton jButtonCaracteristicas;
    private javax.swing.JButton jButtonCriaNovoGraph;
    private javax.swing.JButton jButtonDijkstra;
    private javax.swing.JButton jButtonEscolherMenor;
    private javax.swing.JButton jButtonEscolherRaiz;
    private javax.swing.JButton jButtonFordFulkerson;
    private javax.swing.JButton jButtonKruskal;
    private javax.swing.JButton jButtonMalgrange;
    public javax.swing.JButton jButtonOrdemGrafo;
    private javax.swing.JButton jButtonOrdenacaoTopologica;
    private javax.swing.JButton jButtonPrim;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSalvar2;
    private javax.swing.JButton jButtonSalvarGraph;
    private javax.swing.JButton jButtonTipoGrafo;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JButton jButtonVisualizarGraficamente;
    private javax.swing.JComboBox<String> jComboBoxMenor;
    private javax.swing.JComboBox<String> jComboBoxNoChegadaFord;
    private javax.swing.JComboBox<String> jComboBoxNoSaidaBuscas;
    private javax.swing.JComboBox<String> jComboBoxNoSaidaFord;
    private javax.swing.JComboBox<String> jComboBoxRaiz;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBusca;
    private javax.swing.JPanel jPanelCarregarGrafo;
    private javax.swing.JPanel jPanelCriarGrafo;
    private javax.swing.JPanel jPanelDijkstra;
    private javax.swing.JPanel jPanelFord;
    private javax.swing.JPanel jPanelVertices;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaAlgoritmos;
    private javax.swing.JTextArea jTextAreaAlgoritmos2;
    private javax.swing.JTextArea jTextAreaGrafo;
    private javax.swing.JTextField jTextFieldMenor;
    private javax.swing.JButton listaAdjacencia;
    private javax.swing.JButton matrizAdjacencia;
    private javax.swing.JButton matrizIncidencia;
    private javax.swing.JTextArea painelCarregaGrafo;
    private javax.swing.JToggleButton removeAresta;
    private javax.swing.JToggleButton removeNo;
    private javax.swing.JButton selecionaGrafo;
    // End of variables declaration//GEN-END:variables
}
