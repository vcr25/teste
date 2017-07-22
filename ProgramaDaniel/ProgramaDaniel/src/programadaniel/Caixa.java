
package programadaniel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Caixa extends javax.swing.JFrame {
    ConectaBanco conexao = new ConectaBanco ();
    
    public Caixa() {
        initComponents();
        conexao.conexao();
        preencherTabela("select * from caixa order by id desc limit 5");
        
        conexao.executa("select * from caixa order by nome");
        jCNome.removeAllItems();
        try {
            conexao.res.first();
            do {
            jCNome.addItem(conexao.res.getString("nome"));
         } while (conexao.res.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro!");
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBNovo = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTQuantidade = new javax.swing.JTextField();
        jTMarca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jCNome = new javax.swing.JComboBox<>();
        jBPesquisar = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        JBExcluir.setText("Excluir");
        JBExcluir.setEnabled(false);
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSairMouseClicked(evt);
            }
        });
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.setEnabled(false);
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome: ");

        jLabel3.setText("Quantidade: ");

        jLabel4.setText("Marca: ");

        jLabel5.setText("Modelo: ");

        jLabel6.setText("Número: ");

        jTNome.setToolTipText("");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabela);

        jCNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNomeActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(40, 40, 40)
                                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(35, 35, 35)
                                            .addComponent(jTMarca))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                            .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSalvar)
                        .addGap(46, 46, 46)
                        .addComponent(jCNome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jBSair)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPesquisar)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovo)
                    .addComponent(jBEditar)
                    .addComponent(JBExcluir)
                    .addComponent(jBSair)
                    .addComponent(jBSalvar)
                    .addComponent(jCNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSairMouseClicked
        // TODO add your handling code here:
        conexao.desconcta();
        System.exit(0);
        
    }//GEN-LAST:event_jBSairMouseClicked

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
           try {
            // TODO add your handling code here:
            PreparedStatement pst = conexao.con.prepareStatement("insert into caixa"
                    + " (nome,quantidade,marca,modelo,numero) values (?,?,?,?,?)");
            pst.setString(1, jTNome.getText());
            pst.setString(2, jTQuantidade.getText());
            pst.setString(3, jTMarca.getText());
            pst.setString(4, jTModelo.getText());
            pst.setString(5, jTNumero.getText());
            pst.executeUpdate();
            preencherTabela("select * from caixa order by id desc limit 5");
            JOptionPane.showMessageDialog( null, "Dados Enviados !");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog( null, "Não enviado !" + ex.getMessage());
        }
        jTNome.setText("");
        jTQuantidade.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        jTNumero.setText("");
        jTNome.setEnabled(false);
        jTQuantidade.setEnabled(false);
        jTMarca.setEnabled(false);
        jTModelo.setEnabled(false);
        jTNumero.setEnabled(false);
        
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            PreparedStatement pst =  conexao.con.prepareStatement("delete from "
                    + "caixa where nome = ?");
            pst.setString(1,jTNome.getText() );
            preencherTabela("select * from pesquisa order by id desc limit 5");
             JOptionPane.showMessageDialog( null, "Dados Excluidos !");
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Erro ao  excluir os Dados!");
        }
       
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        // TODO add your handling code here:
        jTNome.setText("");
        jTQuantidade.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        jTNumero.setText("");
        jTNome.setEnabled(true);
        jTQuantidade.setEnabled(true);
        jTMarca.setEnabled(true);
        jTModelo.setEnabled(true);
        jTNumero.setEnabled(true); 
        JBNovo.setEnabled(true);
        JBExcluir.setEnabled(true);
        jBEditar.setEnabled(true);
        jBSalvar.setEnabled(true);
    }//GEN-LAST:event_JBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            PreparedStatement pst =  conexao.con.prepareStatement("update caixa"
                    + " set nome =?,  quantidade=?,marca=?,modelo=?,numero=? where nome =?");
            pst.setString(1,jTNome.getText());
            pst.setString(2,jTQuantidade.getText());
            pst.setString(3,jTMarca.getText());
            pst.setString(4,jTModelo.getText());
            pst.setString(5,jTNumero.getText());
            pst.setString(6,jTNome.getText());
           // pst.setInt(6, Integer.parseInt(jTID.getText()));
            pst.executeUpdate();
             preencherTabela("select * from pesquisa order by id desc limit 5");
            JOptionPane.showMessageDialog( null, "Dados Alterados !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Erro !"+ex);
        }  
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // TODO add your handling code here:
      
        try {
            conexao.conexao();
            conexao.executa("select * from caixa where nome like '%"+jTPesquisar.getText()+"%'");
            conexao.res.first();
            //jTID.setText(String.valueOf(conexao.res.getInt("id")));
            jTNome.setText(conexao.res.getString("nome"));
            jTQuantidade.setText(conexao.res.getString("quantidade"));
            jTModelo.setText(conexao.res.getString("modelo"));
            jTMarca.setText(conexao.res.getString("marca"));
            jTNumero.setText(conexao.res.getString("numero"));
           // preencherTabela("select * from caixa order by id desc limit 5");
            jBEditar.setEnabled(true);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"Erro"+ex);
        }
        
        try {
        
       PreparedStatement pst = conexao.con.prepareStatement("insert into pesquisa"
                    + " (nome,quantidade,modelo,marca,numero) values (?,?,?,?,?)");
            pst.setString(1, jTNome.getText());
            pst.setString(2, jTQuantidade.getText());
            pst.setString(3,jTModelo.getText());
            pst.setString(4, jTMarca.getText());
            pst.setString(5, jTNumero.getText());
            pst.executeUpdate();
            preencherTabela("select * from pesquisa order by id desc limit 5");
           // JOptionPane.showMessageDialog( null, "Dados Enviados !");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog( null, "Não enviado !" + ex.getMessage());
        }
     
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jCNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCNomeActionPerformed

   
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        
        String []Coluna ;
        Coluna = new String []{"id", "nome", "quantidade","marca","modelo", "numero"};
        
        conexao.executa(sql);
        try {
            conexao.res.first();
             do {
                 dados.add(new Object[] {conexao.res.getInt("id"),conexao.res.getString("nome")
                         ,conexao.res.getString("quantidade"),
                 conexao.res.getString("marca"),conexao.res.getString("modelo")
                         ,conexao.res.getString("numero")});
            } 
             while(conexao.res.next());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog( null, "Erro !"+ex);
        }
     
        ModeloTabela modelo = new ModeloTabela (dados, Coluna);
        jTabela.setModel(modelo);
        jTabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTabela.getColumnModel().getColumn(0).setResizable(false);
        jTabela.getColumnModel().getColumn(1).setPreferredWidth(160);
        jTabela.getColumnModel().getColumn(1).setResizable(false);
        jTabela.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTabela.getColumnModel().getColumn(2).setResizable(false);
        jTabela.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTabela.getColumnModel().getColumn(3).setResizable(false);
        jTabela.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTabela.getColumnModel().getColumn(4).setResizable(false);
        jTabela.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTabela.getColumnModel().getColumn(5).setResizable(false);
        jTabela.getTableHeader().getReorderingAllowed();
        jTabela.setAutoResizeMode(jTabela.AUTO_RESIZE_OFF);
        jTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables

    
}
