package Aplicacao;

/**
 * @author willian.carvalho
 */
import Conexao.Conexao;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.table.*;

public class CadastroCliente extends javax.swing.JInternalFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();
    private Conexao con;
    
    public CadastroCliente(Conexao conect) {
        con = conect;
        criaJTablet();
        initComponents();
        jScrollPane1.setViewportView(tabela);
    }
 

    private void criaJTablet(){
        tabela = new JTable(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Celular");
        modelo.addColumn("Cadastro");
        tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(30);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(30);        

        try {
            con.conectar();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        pesquisarNomes("SELECT codigo,nome,telefone,celular,cadastro FROM cliente");
        
        
    }

    
    private void pesquisarNomes(String sql){
        DecimalFormat ze = new DecimalFormat("000000");
                
        modelo.setNumRows(0);
        con.executeSQL(sql);
        try {
            con.resultset.first();
            do{
                modelo.addRow(new Object [] {
                ze.format(con.resultset.getObject("codigo")),
                con.resultset.getObject("nome"),
                con.resultset.getObject("telefone"),con.resultset.getObject("celular"),
                con.resultset.getObject("cadastro")});
            }while(con.resultset.next());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }   
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPesquisaCliente = new javax.swing.JLabel();
        cmbPesquisaCliente = new javax.swing.JComboBox<>();
        txtPesquisaCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mnuClientes = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setBorder(null);
        setTitle("Cadastro de Clientes");

        lblPesquisaCliente.setText("Tipo");
        lblPesquisaCliente.setEnabled(true);
        lblPesquisaCliente.setVisible(false);
        lblPesquisaCliente.setInheritsPopupMenu(false);

        cmbPesquisaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));
        cmbPesquisaCliente.setVisible(false);

        txtPesquisaCliente.setVisible(false);

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.setVisible(false);
        btnPesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisaClienteMouseClicked(evt);
            }
        });
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(lblPesquisaCliente)
                .addGap(18, 18, 18)
                .addComponent(cmbPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisaCliente)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisaCliente)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
        );

        jMenu1.setText("Incluir");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        mnuClientes.add(jMenu1);

        jMenu6.setText("Pesquisar");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        mnuClientes.add(jMenu6);

        jMenu4.setText("Visualizar");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        mnuClientes.add(jMenu4);

        jMenu2.setText("Alterar");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        mnuClientes.add(jMenu2);

        jMenu3.setText("Excluir");
        mnuClientes.add(jMenu3);
        mnuClientes.add(jMenu5);

        jMenu7.setText("    ");
        jMenu7.setEnabled(false);
        mnuClientes.add(jMenu7);

        jMenu8.setText("Sair");
        jMenu8.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu8MenuSelected(evt);
            }
        });
        mnuClientes.add(jMenu8);

        setJMenuBar(mnuClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed

    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        habilitaPesquisa();
    }//GEN-LAST:event_jMenu6MenuSelected

    private void btnPesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisaClienteMouseClicked
        desabilitaPesquisa();
    }//GEN-LAST:event_btnPesquisaClienteMouseClicked

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        Cliente janela = new Cliente(null,1);
        Main.getPainel().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
        centralizaForm(janela);        
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected

    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        int x = tabela.getSelectedRow();
        Object codigo = modelo.getValueAt(x,0);
        Cliente janela = new Cliente(codigo,2);
        Main.getPainel().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
        centralizaForm(janela);
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        String consulta = null;
        if(cmbPesquisaCliente.getSelectedIndex()==0){
            int codigo = Integer.parseInt(txtPesquisaCliente.getText());
            consulta = "select codigo,nome,telefone,celular,cadastro from cliente where codigo = "+codigo+"";
        }else{
            String nome = txtPesquisaCliente.getText();
            consulta = "select codigo,nome,telefone,celular,cadastro from cliente where nome Like '%"+nome+"%'";
        }   
        pesquisarNomes(consulta);
        
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        int x = tabela.getSelectedRow();
        Object codigo = modelo.getValueAt(x,0);
        Cliente janela = new Cliente(codigo,3);
        Main.getPainel().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
        centralizaForm(janela);
    }//GEN-LAST:event_jMenu2MenuSelected

    
    private void desabilitaPesquisa(){
        lblPesquisaCliente.setVisible(false);
        cmbPesquisaCliente.setVisible(false);
        txtPesquisaCliente.setVisible(false);
        btnPesquisaCliente.setVisible(false);        
       //lblPesquisaCliente.setEnabled(false);
       //cmbPesquisaCliente.setEnabled(false);
       //txtPesquisaCliente.setEnabled(false);
       //btnPesquisaCliente.setEnabled(false);
    }
    
    private void habilitaPesquisa(){
        lblPesquisaCliente.setVisible(true);
        cmbPesquisaCliente.setVisible(true);
        txtPesquisaCliente.setVisible(true);
        btnPesquisaCliente.setVisible(true);
    //   lblPesquisaCliente.setEnabled(true);
    //   cmbPesquisaCliente.setEnabled(true);
    //   txtPesquisaCliente.setEnabled(true);
     //  btnPesquisaCliente.setEnabled(true);
    }  
    
    private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = Main.getPainel().getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JComboBox<String> cmbPesquisaCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisaCliente;
    private javax.swing.JMenuBar mnuClientes;
    private javax.swing.JTextField txtPesquisaCliente;
    // End of variables declaration//GEN-END:variables
}
