/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelos.Data;

public class AdicionaData extends javax.swing.JFrame {

    private String[] arrayDeNo;
    private String[] arrayDeEdges;
    private String[] arrayDeKeys;
    private ButtonGroup grupoRadio;

    public AdicionaData() {
        initComponents();
        this.arrayDeNo = atualizaArrayNo();
        this.arrayDeEdges = atualizaArrayEdges();
        this.arrayDeKeys = atualizaArrayKeys();
        int i;
        for (i = 0; i < arrayDeKeys.length; i++) {
            this.jComboBoxKey.addItem(this.arrayDeKeys[i]);
        }
        grupoRadio = new ButtonGroup();
        grupoRadio.add(jRadioButtonEdge);
        grupoRadio.add(jRadioButtonNode);
    }

    private String[] atualizaArrayNo() {
        ArrayList listaNo = new ArrayList();
        int tamanho = TelaPrincipal.getGraphml().getGraph().getNodes().size();
        int i;
        for (i = 0; i < tamanho; i++) {
            listaNo.add(TelaPrincipal.getGraphml().getGraph().getNodes().get(i).getId());
        }
        String[] arrayNo = (String[]) listaNo.toArray(new String[listaNo.size()]);
        return arrayNo;
    }

    private String[] atualizaArrayEdges() {
        ArrayList listaEdge = new ArrayList();
        int tamanho = TelaPrincipal.getGraphml().getGraph().getEdges().size();
        int i;
        for (i = 0; i < tamanho; i++) {
            listaEdge.add(TelaPrincipal.getGraphml().getGraph().getEdges().get(i).getId());
        }
        String[] arrayEdge = (String[]) listaEdge.toArray(new String[listaEdge.size()]);
        return arrayEdge;
    }

    private String[] atualizaArrayKeys() {
        ArrayList listaKeys = new ArrayList();
        int tamanho = TelaPrincipal.getGraphml().getKeys().size();
        int i;
        for (i = 0; i < tamanho; i++) {
            listaKeys.add(TelaPrincipal.getGraphml().getKeys().get(i).getId());
        }
        String[] arrayKeys = (String[]) listaKeys.toArray(new String[listaKeys.size()]);
        return arrayKeys;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBoxKey = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValorData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdData = new javax.swing.JTextField();
        jButtonCancela = new javax.swing.JButton();
        jButtonConfirma = new javax.swing.JButton();
        jRadioButtonEdge = new javax.swing.JRadioButton();
        jRadioButtonNode = new javax.swing.JRadioButton();
        jComboBoxSelecao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKeyActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha a qual Key a data representa:");

        jLabel2.setText("Valor da Data:");

        jTextFieldValorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorDataActionPerformed(evt);
            }
        });

        jLabel3.setText("Id da Data:");

        jTextFieldIdData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdDataActionPerformed(evt);
            }
        });

        jButtonCancela.setText("Cancelar");
        jButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelaActionPerformed(evt);
            }
        });

        jButtonConfirma.setText("Confirmar");
        jButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaActionPerformed(evt);
            }
        });

        jRadioButtonEdge.setText("Edge");
        jRadioButtonEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEdgeActionPerformed(evt);
            }
        });

        jRadioButtonNode.setText("Node");
        jRadioButtonNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNodeActionPerformed(evt);
            }
        });

        jComboBoxSelecao.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecaoActionPerformed(evt);
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
                        .addComponent(jButtonCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jButtonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxKey, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jRadioButtonEdge)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonNode))
                                .addComponent(jTextFieldIdData, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldValorData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                            .addComponent(jComboBoxSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jComboBoxKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEdge)
                    .addComponent(jRadioButtonNode))
                .addGap(30, 30, 30)
                .addComponent(jComboBoxSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancela)
                    .addComponent(jButtonConfirma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKeyActionPerformed

    private void jTextFieldIdDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdDataActionPerformed

    private void jTextFieldValorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorDataActionPerformed

    private void jRadioButtonEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEdgeActionPerformed
        if (this.jRadioButtonEdge.isSelected()) {
            atualizaComboBox(this.arrayDeEdges);
        }
    }//GEN-LAST:event_jRadioButtonEdgeActionPerformed

    private void jRadioButtonNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNodeActionPerformed
        if (this.jRadioButtonNode.isSelected()) {
            atualizaComboBox(this.arrayDeNo);
        }

    }//GEN-LAST:event_jRadioButtonNodeActionPerformed

    private void jComboBoxSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecaoActionPerformed
        
    }//GEN-LAST:event_jComboBoxSelecaoActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaActionPerformed
        Data data = new Data(this.jTextFieldIdData.getText(), this.jTextFieldValorData.getText());
        int i;
        if (this.jRadioButtonEdge.isSelected()) {
            i = TelaPrincipal.getGraphml().getGraph().getIndiceEdgePorId(this.jComboBoxSelecao.getSelectedItem().toString());
            TelaPrincipal.getGraphml().getGraph().getEdges().get(i).setData(data);
        } else if (this.jRadioButtonNode.isSelected()) {
            i = TelaPrincipal.getGraphml().getGraph().getIndiceNodePorId(this.jComboBoxSelecao.getSelectedItem().toString());
            TelaPrincipal.getGraphml().getGraph().getNodes().get(i).addData(data);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione se a Data é para Nodes, ou Edges!");
        }
        
        this.dispose();
    }//GEN-LAST:event_jButtonConfirmaActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionaData().setVisible(true);

            }
        });
    }

    private void atualizaComboBox(String[] listaDeItens) {
        this.jComboBoxSelecao.removeAllItems();
        int i;
        for (i = 0; i < listaDeItens.length; i++) {
            this.jComboBoxSelecao.addItem(listaDeItens[i]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JComboBox<String> jComboBoxKey;
    private javax.swing.JComboBox<String> jComboBoxSelecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButtonEdge;
    private javax.swing.JRadioButton jRadioButtonNode;
    private javax.swing.JTextField jTextFieldIdData;
    private javax.swing.JTextField jTextFieldValorData;
    // End of variables declaration//GEN-END:variables
}
