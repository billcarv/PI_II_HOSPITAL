package Aplicacao;

import Conexao.Conexao;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willian.carvalho
 */
public class Cliente extends javax.swing.JInternalFrame {
     
    public Object codigo = null;
    Conexao con = new Conexao();
    
    public Cliente(Object cod, int opc) {
        initComponents();
        checaOpcao(opc);
        codigo=cod;
        
        if (opc==2 || opc==3) {
            preencheCliente(codigo);        
        }
        
    }

    
    private void checaOpcao(int opc){
        txtCodigoCliente.setEditable(false);
        txtNomeCliente.setEditable(false);
        txtTelefoneCliente.setEditable(false);
        txtCelularCliente.setEditable(false);
        cmbConvenioCliente.setEditable(false);
        btnConfirmar.setVisible(false);
        btnConfirmar2.setVisible(false);
        btnConfirmar.setEnabled(false);
        btnConfirmar2.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnLimpar.setEnabled(false);
        btnSair.setEnabled(false);
        //cxbAtivoCliente.isSelected();
        switch(opc){
            case 1: //Inserir
                btnConfirmar.setVisible(true);
                btnConfirmar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnLimpar.setEnabled(true);
                txtNomeCliente.setEditable(true);
                txtTelefoneCliente.setEditable(true);
                txtCelularCliente.setEditable(true);
                cmbConvenioCliente.setEditable(true); 
                cxbAtivoCliente.setVisible(true);
                populaConvenio();
                break;
            case 2: //Visualizar
                btnSair.setEnabled(true);
                break;   
            case 3: //Alterar
                btnConfirmar2.setVisible(true);
                btnConfirmar2.setEnabled(true);
                btnCancelar.setEnabled(true);
                txtNomeCliente.setEditable(true);
                txtTelefoneCliente.setEditable(true);
                txtCelularCliente.setEditable(true);
                cmbConvenioCliente.setEditable(true); 
                cxbAtivoCliente.setVisible(true);
                populaConvenio();                
                break;
            case 4: //Excluir
                btnConfirmar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnLimpar.setEnabled(true);
                txtNomeCliente.setEditable(true);
                txtTelefoneCliente.setEditable(true);
                txtCelularCliente.setEditable(true);
                cmbConvenioCliente.setEditable(true); 
                cxbAtivoCliente.setVisible(true);
                
        }
    }


    private void populaConvenio(){
        con.executeSQL("Select codigo from convenio");
        try {
            con.resultset.first();
            do{
                cmbConvenioCliente.addItem(con.resultset.getString("codigo"));
            }while(con.resultset.next());
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private void preencheConvenio(){
        String cod =  (String) cmbConvenioCliente.getSelectedItem();
        con.executeSQL("Select nome from convenio where codigo ="+cod);
        try {
            con.resultset.first();
            do{
                txtNomeConvenio.setText(con.resultset.getString("nome"));
            }while(con.resultset.next());
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void preencheCliente(Object codigo){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat ze = new DecimalFormat("000000");
        int value = Integer.parseInt(codigo.toString());
        String sql = "select codigo,nome,telefone,celular,cadastro,ativo from cliente where codigo = "+value+" and deletado is null"; 
        con.executeSQL(sql);
        
        try {
            con.resultset.first();
            txtCodigoCliente.setText(ze.format(Integer.parseInt(Integer.toString(con.resultset.getInt("codigo")))));
            txtNomeCliente.setText(con.resultset.getString("nome"));
            txtTelefoneCliente.setText(con.resultset.getString("telefone"));
            txtCelularCliente.setText(con.resultset.getString("celular"));
            cmbCadastroCliente.setText(df.format(con.resultset.getDate("cadastro")));
            if (con.resultset.getString("ativo")== "S"){
                cxbAtivoCliente.isSelected();
            }
            //cmbConvenioCliente.set(con.resultset.getInt("convenio_codigo"));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void criaCliente(){ 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String nome = txtNomeCliente.getText();
        String telefone = txtTelefoneCliente.getText();
        String celular = txtCelularCliente.getText();
        String convenio = (String) cmbConvenioCliente.getSelectedItem();
        String sql = "insert into cliente (nome,telefone,celular,cadastro,convenio_codigo,ativo) "
            + "values ('"+nome+"','"+telefone+"','"+celular+"','"+dateFormat.format(date)+"',"+Integer.parseInt(convenio)+",'S')";    
        con.updateSQL(sql);  
        this.dispose();
    }
    
    private void atualizaCliente(Object cod){
        String nome = txtNomeCliente.getText();
        String telefone = txtTelefoneCliente.getText();
        String celular = txtCelularCliente.getText();
        String convenio = (String) cmbConvenioCliente.getSelectedItem();
        String ativo = null;
        
        if(this.cxbAtivoCliente.isEnabled()){
            ativo = "S";
        } else{
            ativo = "N";
        }
        
        String sql = "update cliente "
                + "set nome ='"+nome+"'"
                + ",telefone = '"+telefone+"'"
                + ",celular = '"+celular+"'"
                + ",convenio_codigo ="+ Integer.parseInt(convenio)
                + ",ativo = '"+ativo+"'"
                + " where codigo = "+Integer.parseInt((String) cod);    
    
        con.updateSQL(sql);  
        this.dispose();
       

    }    
    
    public void limpaTela(){
        txtNomeCliente.setText("");
        txtTelefoneCliente.setText("");
        txtCelularCliente.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        cxbAtivoCliente = new javax.swing.JCheckBox();
        btnConfirmar = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTelefoneCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCelularCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        cmbConvenioCliente = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        cmbCadastroCliente = new datechooser.beans.DateChooserCombo();
        txtNomeConvenio = new javax.swing.JTextField();
        btnConfirmar2 = new javax.swing.JButton();

        jLabel4.setText("Data de Cadastro ");

        cxbAtivoCliente.setText("Ativo");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel3.setText("Telefone");

        jLabel1.setText("Código  ");

        jLabel5.setText("Celular");

        jLabel2.setText("Nome ");

        jLabel6.setText("Convenio");

        cmbConvenioCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConvenioClienteItemStateChanged(evt);
            }
        });
        cmbConvenioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConvenioClienteActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        cmbCadastroCliente.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    cmbCadastroCliente.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    cmbCadastroCliente.setCurrentNavigateIndex(0);
    cmbCadastroCliente.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

    txtNomeConvenio.setEditable(false);
    txtNomeConvenio.setEnabled(false);

    btnConfirmar2.setText("Confirmar");
    btnConfirmar2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnConfirmar2MouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNomeCliente)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCelularCliente))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(cmbConvenioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtNomeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxbAtivoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
        .addGroup(layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnConfirmar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addComponent(cmbCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConvenioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cxbAtivoCliente))
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnConfirmar)
                .addComponent(btnCancelar)
                .addComponent(btnLimpar)
                .addComponent(btnSair)
                .addComponent(btnConfirmar2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        criaCliente();
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void cmbConvenioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConvenioClienteActionPerformed

    }//GEN-LAST:event_cmbConvenioClienteActionPerformed

    private void cmbConvenioClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConvenioClienteItemStateChanged
        preencheConvenio();
    }//GEN-LAST:event_cmbConvenioClienteItemStateChanged

    private void btnConfirmar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmar2MouseClicked
        atualizaCliente(codigo);
    }//GEN-LAST:event_btnConfirmar2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmar2;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private datechooser.beans.DateChooserCombo cmbCadastroCliente;
    private javax.swing.JComboBox<String> cmbConvenioCliente;
    private javax.swing.JCheckBox cxbAtivoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeConvenio;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
