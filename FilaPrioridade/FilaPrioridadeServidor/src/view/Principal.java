/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import Conexão.RecebeJson;
import Entidades.Normal;
import Entidades.Prioridade;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    private static RecebeJson rj;
    int tipoAtendimento = 0;
    int tipoAgencia;
    public Principal() {
        initComponents();
        rj = new RecebeJson();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBPrelatorioDeClientes = new javax.swing.JButton();
        jBrelatorioDeAtendimentos = new javax.swing.JButton();
        jBrelatorioDeAtendimentos1 = new javax.swing.JButton();
        jBrelatorioDeAtendimentos2 = new javax.swing.JButton();
        jPTipoAtendimento1 = new javax.swing.JPanel();
        jLTipoAtendimento = new javax.swing.JLabel();
        jCAtendimento1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(404, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fila.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));

        jBPrelatorioDeClientes.setBackground(new java.awt.Color(255, 255, 255));
        jBPrelatorioDeClientes.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBPrelatorioDeClientes.setForeground(new java.awt.Color(51, 102, 153));
        jBPrelatorioDeClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jBPrelatorioDeClientes.setText("Relatório de clientes");
        jBPrelatorioDeClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPrelatorioDeClientes.setPreferredSize(new java.awt.Dimension(260, 80));
        jBPrelatorioDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrelatorioDeClientesActionPerformed(evt);
            }
        });

        jBrelatorioDeAtendimentos.setBackground(new java.awt.Color(255, 255, 255));
        jBrelatorioDeAtendimentos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBrelatorioDeAtendimentos.setForeground(new java.awt.Color(51, 102, 153));
        jBrelatorioDeAtendimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jBrelatorioDeAtendimentos.setText("Tamanho");
        jBrelatorioDeAtendimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBrelatorioDeAtendimentos.setPreferredSize(new java.awt.Dimension(260, 80));
        jBrelatorioDeAtendimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrelatorioDeAtendimentosActionPerformed(evt);
            }
        });

        jBrelatorioDeAtendimentos1.setBackground(new java.awt.Color(255, 255, 255));
        jBrelatorioDeAtendimentos1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBrelatorioDeAtendimentos1.setForeground(new java.awt.Color(51, 102, 153));
        jBrelatorioDeAtendimentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jBrelatorioDeAtendimentos1.setText("Relatório de atendimento");
        jBrelatorioDeAtendimentos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBrelatorioDeAtendimentos1.setPreferredSize(new java.awt.Dimension(260, 80));
        jBrelatorioDeAtendimentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrelatorioDeAtendimentos1ActionPerformed(evt);
            }
        });

        jBrelatorioDeAtendimentos2.setBackground(new java.awt.Color(255, 255, 255));
        jBrelatorioDeAtendimentos2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBrelatorioDeAtendimentos2.setForeground(new java.awt.Color(51, 102, 153));
        jBrelatorioDeAtendimentos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jBrelatorioDeAtendimentos2.setText("Frente");
        jBrelatorioDeAtendimentos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBrelatorioDeAtendimentos2.setPreferredSize(new java.awt.Dimension(260, 80));
        jBrelatorioDeAtendimentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrelatorioDeAtendimentos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBrelatorioDeAtendimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBrelatorioDeAtendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPrelatorioDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBrelatorioDeAtendimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPrelatorioDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrelatorioDeAtendimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrelatorioDeAtendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrelatorioDeAtendimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPTipoAtendimento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));
        jPTipoAtendimento1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLTipoAtendimento.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLTipoAtendimento.setForeground(new java.awt.Color(51, 102, 153));
        jLTipoAtendimento.setText("Tipo de Atendimento: ");

        jCAtendimento1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jCAtendimento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Caixa", "Gerencial Pessoa Física", "Gerencial Pessoa Jurídica" }));
        jCAtendimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAtendimento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTipoAtendimento1Layout = new javax.swing.GroupLayout(jPTipoAtendimento1);
        jPTipoAtendimento1.setLayout(jPTipoAtendimento1Layout);
        jPTipoAtendimento1Layout.setHorizontalGroup(
            jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTipoAtendimento1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTipoAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPTipoAtendimento1Layout.setVerticalGroup(
            jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoAtendimento1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoAtendimento)
                    .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
            .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPrelatorioDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrelatorioDeClientesActionPerformed
        String txt = rj.getRelatClientes(tipoAtendimento);
        JOptionPane.showMessageDialog(null, txt);

    }//GEN-LAST:event_jBPrelatorioDeClientesActionPerformed

    private void jBrelatorioDeAtendimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrelatorioDeAtendimentosActionPerformed
        String txt = rj.getFilaStatus();
        JOptionPane.showMessageDialog(null, txt);
    }//GEN-LAST:event_jBrelatorioDeAtendimentosActionPerformed

    private void jBrelatorioDeAtendimentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrelatorioDeAtendimentos1ActionPerformed
        String txt = rj.getTotalAtendidas();
        JOptionPane.showMessageDialog(null, txt);
    }//GEN-LAST:event_jBrelatorioDeAtendimentos1ActionPerformed

    private void jBrelatorioDeAtendimentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrelatorioDeAtendimentos2ActionPerformed
        String txt = rj.getProx();
        
        JOptionPane.showMessageDialog(null, txt);
    }//GEN-LAST:event_jBrelatorioDeAtendimentos2ActionPerformed

    private void jCAtendimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAtendimento1ActionPerformed
        int escolha;
        escolha = jCAtendimento1.getSelectedIndex();
        if(escolha == 0){
            tipoAtendimento = 0;

        }else if(escolha == 1){
            tipoAtendimento = 1;

        }else if(escolha == 2){
            tipoAtendimento = 2;

        }else if(escolha == 3){
            tipoAtendimento = 3;

        }else if(escolha == 4){
            tipoAtendimento = 4;

        }
    }//GEN-LAST:event_jCAtendimento1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {  
                new Principal().setVisible(true);
                
        try {
            rj.start(7777, 4444);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPrelatorioDeClientes;
    private javax.swing.JButton jBrelatorioDeAtendimentos;
    private javax.swing.JButton jBrelatorioDeAtendimentos1;
    private javax.swing.JButton jBrelatorioDeAtendimentos2;
    private javax.swing.JComboBox<String> jCAtendimento1;
    private javax.swing.JLabel jLTipoAtendimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPTipoAtendimento1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
