package telas;

import java.util.ArrayList;
import modelos.Edge;
import modelos.Node;

public class AdicionaEdge extends javax.swing.JFrame {

    private String[] arrayDeNo;
    private String[] orientacoes = {"Orientada", "Não Orientada"};

    public AdicionaEdge() {
        arrayDeNo = atualizaArray();
        initComponents();
    }

    private String[] atualizaArray() {
        ArrayList listaNo = new ArrayList();
        int tamanho = TelaPrincipal.getGrafo().getNodes().size();
        int i;
        for (i = 0; i < tamanho; i++) {
            listaNo.add(TelaPrincipal.getGrafo().getNodes().get(i).getId());
        }
        String[] arrayNo = (String[]) listaNo.toArray(new String[listaNo.size()]);
        return arrayNo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxInicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAdicionarAresta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxOrientacao = new javax.swing.JComboBox<>();
        jComboBoxFim = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxInicio.setModel(new javax.swing.DefaultComboBoxModel<>(arrayDeNo));
        jComboBoxInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInicioActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha o nó de Inicio:");

        jLabel2.setText("Escolha o nó de Fim:");

        jLabel3.setText("Digite o nome da Aresta:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAdicionarAresta.setText("Adicionar Aresta");
        jButtonAdicionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarArestaActionPerformed(evt);
            }
        });

        jLabel4.setText("Qual a Orientação da Aresta");

        jComboBoxOrientacao.setModel(new javax.swing.DefaultComboBoxModel<>(orientacoes));
        jComboBoxOrientacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrientacaoActionPerformed(evt);
            }
        });

        jComboBoxFim.setModel(new javax.swing.DefaultComboBoxModel<>(arrayDeNo));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxOrientacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAdicionarAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxOrientacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAdicionarAresta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarArestaActionPerformed

        String inicio = (String) jComboBoxInicio.getSelectedItem();
        String fim = (String) jComboBoxFim.getSelectedItem();
        Node origem = TelaPrincipal.getGrafo().pegarNodeDaLista(inicio);
        Node alvo = TelaPrincipal.getGrafo().pegarNodeDaLista(fim);

        String nome = jTextFieldNome.getText();

        Edge aresta;

        Object objeto = jComboBoxOrientacao.getSelectedItem();
        String orientacaoString = (String) objeto;
        int orientacao;
        if (orientacaoString == "Orientada") {
            orientacao = 1;
        } else {
            orientacao = 2;
        }
        // int orientacao = jComboBoxOrientacao.getSelectedIndex();
        Boolean orientacaoBool;

        if (orientacao == 1) { //Orientado
            orientacaoBool = true;
            aresta = new Edge(nome, origem, alvo, orientacaoBool);
            TelaPrincipal.getGrafo().addEdge(aresta);
            System.out.println(TelaPrincipal.getGrafo().getEdges().get(0).getId());

        } else if (orientacao == 2) { //Nao Orientado
            orientacaoBool = false;
            aresta = new Edge(nome, origem, alvo, orientacaoBool);
            TelaPrincipal.getGrafo().addEdge(aresta);
            System.out.println(TelaPrincipal.getGrafo().getEdges().get(0).getId());
        }

        this.dispose();
    }//GEN-LAST:event_jButtonAdicionarArestaActionPerformed

    private void jComboBoxOrientacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrientacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrientacaoActionPerformed

    private void jComboBoxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxInicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionaEdge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarAresta;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxFim;
    private javax.swing.JComboBox<String> jComboBoxInicio;
    private javax.swing.JComboBox<String> jComboBoxOrientacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
