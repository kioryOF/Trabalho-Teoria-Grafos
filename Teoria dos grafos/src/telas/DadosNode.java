package telas;

import java.util.ArrayList;
import modelos.Node;

public class DadosNode extends javax.swing.JFrame {

    private String[] arrayDeNo;

    public DadosNode() {
        arrayDeNo = atualizaArray();
        initComponents();
    }

    private String[] atualizaArray() {
        ArrayList listaNo = new ArrayList();
        int tamanho = TelaPrincipal.getGraphml().getGraph().getNodes().size();
        int i;
        for (i = 0; i < tamanho; i++) {
            listaNo.add(TelaPrincipal.getGraphml().getGraph().getNodes().get(i).getId());
        }
        String[] arrayNo = (String[]) listaNo.toArray(new String[listaNo.size()]);
        return arrayNo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSegundoNo = new javax.swing.JComboBox<>();
        jComboBoxPrimeiroNo = new javax.swing.JComboBox<>();
        grauEmissao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextPane();
        grauRecepcao = new javax.swing.JButton();
        cadeiaNos = new javax.swing.JButton();
        caminhoNos = new javax.swing.JButton();
        nosAdjacentes = new javax.swing.JButton();
        fonteSumidouros = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        concluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Escolha o primeiro nó (se necessário):");

        jLabel2.setText("Escolha o segundo nó (se necessário):");

        jComboBoxSegundoNo.setModel(new javax.swing.DefaultComboBoxModel<>(arrayDeNo));
        jComboBoxSegundoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSegundoNoActionPerformed(evt);
            }
        });

        jComboBoxPrimeiroNo.setModel(new javax.swing.DefaultComboBoxModel<>(arrayDeNo));
        jComboBoxPrimeiroNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrimeiroNoActionPerformed(evt);
            }
        });

        grauEmissao.setText("Grau Emissão");
        grauEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauEmissaoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(areaTexto);

        grauRecepcao.setText("Grau Recepção");
        grauRecepcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauRecepcaoActionPerformed(evt);
            }
        });

        cadeiaNos.setText("Cadeia entre Nós");
        cadeiaNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadeiaNosActionPerformed(evt);
            }
        });

        caminhoNos.setText("Caminho entre Nós");
        caminhoNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoNosActionPerformed(evt);
            }
        });

        nosAdjacentes.setText("São Adjacentes");
        nosAdjacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosAdjacentesActionPerformed(evt);
            }
        });

        fonteSumidouros.setText("Nós Sumidouros e Fontes");
        fonteSumidouros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonteSumidourosActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jComboBoxPrimeiroNo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jComboBoxSegundoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grauEmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grauRecepcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadeiaNos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caminhoNos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fonteSumidouros, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nosAdjacentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(concluir)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSegundoNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrimeiroNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grauEmissao)
                    .addComponent(cadeiaNos)
                    .addComponent(nosAdjacentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grauRecepcao)
                    .addComponent(caminhoNos)
                    .addComponent(fonteSumidouros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(concluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSegundoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSegundoNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSegundoNoActionPerformed

    private void jComboBoxPrimeiroNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrimeiroNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrimeiroNoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void grauEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauEmissaoActionPerformed
        String inicio = (String) jComboBoxPrimeiroNo.getSelectedItem();
        Node origem = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(inicio);
        String str = "Grau de Emissão : \n" + origem.getId() + " :\t";;
        str += TelaPrincipal.getGraphml().getGraph().getGrauEmissao(origem);
        areaTexto.setText(str);
    }//GEN-LAST:event_grauEmissaoActionPerformed

    private void grauRecepcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauRecepcaoActionPerformed
        String inicio = (String) jComboBoxPrimeiroNo.getSelectedItem();
        Node origem = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(inicio);
        String str = "Grau de Recepção : \n" + origem.getId() + " :\t";
        str += TelaPrincipal.getGraphml().getGraph().getGrauRecepcao(origem);
        areaTexto.setText(str);
    }//GEN-LAST:event_grauRecepcaoActionPerformed

    private void nosAdjacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nosAdjacentesActionPerformed
        String inicio = (String) jComboBoxPrimeiroNo.getSelectedItem();
        String fim = (String) jComboBoxSegundoNo.getSelectedItem();
        Node origem = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(inicio);
        Node alvo = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(fim);
        if (TelaPrincipal.getGraphml().getGraph().isAdjacente(origem, alvo)) {
            areaTexto.setText("São adjacentes");
        } else {
            areaTexto.setText("Não são adjacentes");
        }

    }//GEN-LAST:event_nosAdjacentesActionPerformed

    private void fonteSumidourosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonteSumidourosActionPerformed
        int i;
        String sumidouro = "Vertices Sumidouros :\n";
        String fonte = "Vertices Fontes :\n";
        for (i = 0; i < TelaPrincipal.getGraphml().getGraph().getNodes().size(); i++) {
            if (TelaPrincipal.getGraphml().getGraph().isSumidouro(TelaPrincipal.getGraphml().getGraph().getNodes().get(i))) {
                sumidouro += TelaPrincipal.getGraphml().getGraph().getNodes().get(i).getId() + "\n";
            } else {
                if (TelaPrincipal.getGraphml().getGraph().isFonte(TelaPrincipal.getGraphml().getGraph().getNodes().get(i))) {
                    fonte += TelaPrincipal.getGraphml().getGraph().getNodes().get(i).getId() + "\n";
                }
            }

        }
        areaTexto.setText(sumidouro + "\n" + fonte);
    }//GEN-LAST:event_fonteSumidourosActionPerformed

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed
        this.dispose();
    }//GEN-LAST:event_concluirActionPerformed

    private void cadeiaNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadeiaNosActionPerformed
        String inicio = (String) jComboBoxPrimeiroNo.getSelectedItem();
        String fim = (String) jComboBoxSegundoNo.getSelectedItem();
        Node no1 = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(inicio);
        Node no2 = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(fim);
        ArrayList<Node> nos = TelaPrincipal.getGraphml().getGraph().getCadeia(no1, no2);
        String str = "";
        int i;
        if (nos == null && TelaPrincipal.getGraphml().getGraph().getCadeia(no2, no1) != null) {
            nos = TelaPrincipal.getGraphml().getGraph().getCadeia(no2, no1);
            for (i = 0; i < nos.size(); i++) {
                str += nos.get(i).getId()+"\t";
            }

        } else {
            if (nos != null) {
                for (i = 0; i < nos.size(); i++) {
                    str += nos.get(i).getId()+"\t";
                }
            } else {
                str = "Não possui Cadeia";
            }
        }
        areaTexto.setText(str);

    }//GEN-LAST:event_cadeiaNosActionPerformed

    private void caminhoNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoNosActionPerformed
        String inicio = (String) jComboBoxPrimeiroNo.getSelectedItem();
        String fim = (String) jComboBoxSegundoNo.getSelectedItem();
        Node no1 = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(inicio);
        Node no2 = TelaPrincipal.getGraphml().getGraph().pegarNodeDaLista(fim);
        ArrayList<Node> nos = TelaPrincipal.getGraphml().getGraph().getCaminho(no1, no2);
        String str = "";
        int i;
        if (nos == null && TelaPrincipal.getGraphml().getGraph().getCaminho(no2, no1) != null) {
            nos = TelaPrincipal.getGraphml().getGraph().getCaminho(no2, no1);
            for (i = 0; i < nos.size(); i++) {
                str += nos.get(i).getId()+"\t";
            }

        } else {
            if (nos != null) {
                for (i = 0; i < nos.size(); i++) {
                    str += nos.get(i).getId()+"\t";
                }
            } else {
                str = "Não possui Caminho";
            }
        }
        areaTexto.setText(str);


    }//GEN-LAST:event_caminhoNosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DadosNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosNode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaTexto;
    private javax.swing.JButton cadeiaNos;
    private javax.swing.JButton caminhoNos;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton concluir;
    private javax.swing.JButton fonteSumidouros;
    private javax.swing.JButton grauEmissao;
    private javax.swing.JButton grauRecepcao;
    private javax.swing.JComboBox<String> jComboBoxPrimeiroNo;
    private javax.swing.JComboBox<String> jComboBoxSegundoNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nosAdjacentes;
    // End of variables declaration//GEN-END:variables
}
