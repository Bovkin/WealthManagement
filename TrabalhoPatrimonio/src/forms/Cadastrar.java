/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import PrincipalPatrimonio.ConexaoMySQL;
import PrincipalPatrimonio.Item;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author elton
 */
public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
        initComponents();
        //Abrir tela no meio
        this.setLocationRelativeTo(null);
        //Inicia com o foco no Numero de Patrimonio
        jTxtNumPatrimonio.requestFocus();
        
    }
//Metodo para limpar os campos
    public void limpaTexts() {
        jTxtNumPatrimonio.setText("");
        jTxtDescricao.setText("");
        jTxtSetor.setText("");
        jTxtResponsavel.setText("");
        jComboSituacao.setSelectedIndex(0);
        jComboEstadoConservacao.setSelectedIndex(0);
        jTxtNumPatrimonio.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCadastroVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadastroNumeroPatrimonio = new javax.swing.JLabel();
        jLabelCadastroSetor = new javax.swing.JLabel();
        jLabelCadastroResponsavel = new javax.swing.JLabel();
        jLabelCadastroSituacao = new javax.swing.JLabel();
        jLabelCadastroEstadoConservacao = new javax.swing.JLabel();
        jTxtSetor = new javax.swing.JFormattedTextField();
        jTxtNumPatrimonio = new javax.swing.JFormattedTextField();
        jTxtResponsavel = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jComboSituacao = new javax.swing.JComboBox<>();
        jComboEstadoConservacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTxtDescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(94, 90, 96));
        jPanel1.setBorder(null);

        jButtonCadastroVoltar.setBackground(new java.awt.Color(94, 90, 96));
        jButtonCadastroVoltar.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        jButtonCadastroVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastroVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.png"))); // NOI18N
        jButtonCadastroVoltar.setText("Voltar");
        jButtonCadastroVoltar.setToolTipText("Voltar ao Menu Principal");
        jButtonCadastroVoltar.setBorder(null);
        jButtonCadastroVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCadastroVoltar.setFocusCycleRoot(true);
        jButtonCadastroVoltar.setFocusPainted(false);
        jButtonCadastroVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCadastroVoltar.setRequestFocusEnabled(false);
        jButtonCadastroVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastroVoltarMouseClicked(evt);
            }
        });
        jButtonCadastroVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCadastroVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastroVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(209, 209, 209));
        jPanel2.setBorder(null);
        jPanel2.setFocusable(false);

        jLabelCadastroNumeroPatrimonio.setText("Número do Patrimônio");

        jLabelCadastroSetor.setText("Setor");

        jLabelCadastroResponsavel.setText("Responsável");

        jLabelCadastroSituacao.setText("Situação");

        jLabelCadastroEstadoConservacao.setText("Estado de Conservação");

        jTxtNumPatrimonio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jComboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Extraviado", "Não Extraviado" }));

        jComboEstadoConservacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Bem Conservado", "Mal Conservado" }));

        jLabel1.setText("Descrição");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(394, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtSetor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelCadastroSituacao)
                                        .addComponent(jLabelCadastroResponsavel)
                                        .addComponent(jLabelCadastroSetor)
                                        .addComponent(jLabelCadastroEstadoConservacao)
                                        .addComponent(jTxtResponsavel)
                                        .addComponent(jTxtNumPatrimonio)
                                        .addComponent(jLabelCadastroNumeroPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboEstadoConservacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroNumeroPatrimonio)
                .addGap(4, 4, 4)
                .addComponent(jTxtNumPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastroSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastroResponsavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabelCadastroSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCadastroEstadoConservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboEstadoConservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastroVoltarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroVoltarMouseClicked

    private void jButtonCadastroVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVoltarActionPerformed
        //Botão de voltar a tela home
        //Criando tela home e setando visivel e dipose na cadastrar
        Home janelaHome = new Home();
        janelaHome.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jButtonCadastroVoltarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Item itens = new Item();
        //Pegando os valor dos campos
        String numPatrimonio = jTxtNumPatrimonio.getText().trim();
        String responsavel = jTxtResponsavel.getText().trim();
        String descricao = jTxtDescricao.getText().trim();
        String setor = jTxtSetor.getText().trim();
        //If's para verificar se os campos estão devidamente preenchidos
        //Verifica se o numpatrimonio não é zerado, se for mostra uma mensagem e seta o foco para o campo - Utilizo neste campo o formatted para só inserir numero
        if (numPatrimonio.length() == 0) {
            JOptionPane.showMessageDialog(null, "Numero Patrimonio é um campo obrigatorio e deve conter somente números");
            jTxtNumPatrimonio.requestFocus();
            jTxtNumPatrimonio.selectAll();
            return;
            //verifica se o match corresponde - se não corresponder mostrara uma mensagem e setara o foco para o campo
        } else if (!descricao.matches("[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ][a-z-záàâãéèêíïóôõöúçñ]\\w*+ ([A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*[a-z-záàâãéèêíïóôõöúçñ]*\\w*+ )*[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*[a-z-záàâãéèêíïóôõöúçñ]*\\w*\\d*+")) {
            JOptionPane.showMessageDialog(null, "Campo Descrição inválido!");
            jTxtDescricao.requestFocus();
            jTxtDescricao.selectAll();
            return;
            //verifica se o match corresponde - se não corresponder mostrara uma mensagem e setara o foco para o campo
        } else if (!setor.matches("[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ][a-z-záàâãéèêíïóôõöúçñ]+( \\w*+[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*[a-z-záàâãéèêíïóôõöúçñ]*+\\w*+ )*[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*[a-z-záàâãéèêíïóôõöúçñ]*\\w*\\d*+")) {
            JOptionPane.showMessageDialog(null, "Campo Setor inválido!");
            jTxtSetor.requestFocus();
            jTxtSetor.selectAll();
            return;
            //verifica se o match corresponde - se não corresponder mostrara uma mensagem e setara o foco para o campo
        } else if (!responsavel.matches("[A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ][a-z-záàâãéèêíïóôõöúçñ]+ ([A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*[a-z-záàâãéèêíïóôõöúçñ]+ )*([A-Z-ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ][a-z-záàâãéèêíïóôõöúçñ]+)")) {
            JOptionPane.showMessageDialog(null, "Campo Responsavel inválido!");
            jTxtResponsavel.requestFocus();
            jTxtResponsavel.selectAll();
            return;
            //Verifica se foi selecionado alguma situacao. Se não foi será mostrada uma mensagem e setado o foco para o combo
        }else if(jComboSituacao.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo Situação inválido!");
            jComboSituacao.requestFocus();
            return;
            //Verifica se foi selecionado alguma Estado de Conservacao. Se não foi será mostrada uma mensagem e setado o foco para o combo
        }else if(jComboEstadoConservacao.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo Estado de Conservação inválido!");
            jComboEstadoConservacao.requestFocus();
            return;
        }
        //Adiciona aos itens
        itens.setNumeroPatrimonio(Integer.parseInt(jTxtNumPatrimonio.getText()));
        itens.setDescricao(jTxtDescricao.getText());
        itens.setSetor(jTxtSetor.getText());
        itens.setResponsavel(jTxtResponsavel.getText());
        itens.setSituacao((String) jComboSituacao.getSelectedItem());
        itens.setEstadoConservacao((String) jComboEstadoConservacao.getSelectedItem());
        //Chama metodo que adiciona os itens
        ConexaoMySQL.getInstance().addItem(itens);
        //Limpa os campos com a chamada deste metodo
        limpaTexts();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCadastroVoltar;
    private javax.swing.JComboBox<String> jComboEstadoConservacao;
    private javax.swing.JComboBox<String> jComboSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadastroEstadoConservacao;
    private javax.swing.JLabel jLabelCadastroNumeroPatrimonio;
    private javax.swing.JLabel jLabelCadastroResponsavel;
    private javax.swing.JLabel jLabelCadastroSetor;
    private javax.swing.JLabel jLabelCadastroSituacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxtDescricao;
    private javax.swing.JFormattedTextField jTxtNumPatrimonio;
    private javax.swing.JFormattedTextField jTxtResponsavel;
    private javax.swing.JFormattedTextField jTxtSetor;
    // End of variables declaration//GEN-END:variables
}
