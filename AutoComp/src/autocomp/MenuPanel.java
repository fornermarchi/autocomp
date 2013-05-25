/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocomp;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author adriano
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadQuestButton = new javax.swing.JButton();
        ConsQuestButton = new javax.swing.JButton();
        ImportAlunoButton = new javax.swing.JButton();
        ImportProfButton = new javax.swing.JButton();
        CadUsuarioButton = new javax.swing.JButton();
        ConfigProvaButton = new javax.swing.JButton();
        GerarProvaButton = new javax.swing.JButton();

        CadQuestButton.setText("Cadastro de Questão");
        CadQuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadQuestButtonActionPerformed(evt);
            }
        });

        ConsQuestButton.setText("Consulta de Questão");
        ConsQuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsQuestButtonActionPerformed(evt);
            }
        });

        ImportAlunoButton.setText("Importar Aluno");
        ImportAlunoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportAlunoButtonActionPerformed(evt);
            }
        });

        ImportProfButton.setText("Importar Professor");

        CadUsuarioButton.setText("Cadastrar Usuário");
        CadUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUsuarioButtonActionPerformed(evt);
            }
        });

        ConfigProvaButton.setText("Configurar Prova");
        ConfigProvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigProvaButtonActionPerformed(evt);
            }
        });

        GerarProvaButton.setText("Gerar Prova");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CadQuestButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CadUsuarioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConsQuestButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImportAlunoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImportProfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfigProvaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GerarProvaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadQuestButton)
                    .addComponent(ImportProfButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportAlunoButton)
                    .addComponent(ConsQuestButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadUsuarioButton)
                    .addComponent(ConfigProvaButton))
                .addGap(31, 31, 31)
                .addComponent(GerarProvaButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConsQuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsQuestButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsQuestButtonActionPerformed

    private void ImportAlunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportAlunoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImportAlunoButtonActionPerformed

    private void CadUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUsuarioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadUsuarioButtonActionPerformed

    private void ConfigProvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigProvaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfigProvaButtonActionPerformed

    private void CadQuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadQuestButtonActionPerformed
            QuestaoPanel questaoPanel = new QuestaoPanel();
            JFrame jf = (JFrame) this.getTopLevelAncestor();
            jf.getContentPane().removeAll();
            jf.getContentPane().add(questaoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, questaoPanel.getPreferredSize().height));
            jf.setMinimumSize(questaoPanel.getPreferredSize());
            jf.pack();
    }//GEN-LAST:event_CadQuestButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadQuestButton;
    private javax.swing.JButton CadUsuarioButton;
    private javax.swing.JButton ConfigProvaButton;
    private javax.swing.JButton ConsQuestButton;
    private javax.swing.JButton GerarProvaButton;
    private javax.swing.JButton ImportAlunoButton;
    private javax.swing.JButton ImportProfButton;
    // End of variables declaration//GEN-END:variables
}