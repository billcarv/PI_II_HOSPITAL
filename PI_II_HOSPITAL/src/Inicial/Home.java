package Inicial;

import Agendamentos.jfAgendamentoCentral;
import Consultas.jfConsultaClientes;
import Consultas.jfConsultaMedicos;
import Consultas.jfConsultaUnidades;
import Parametros.jfParamAgendamentos;
import Parametros.jfParamEspecialidades;
import Parametros.jfParamHistClientes;
import Parametros.jfParamListagens;
import Parametros.jfParamRanking;


/**
 * @author willian.acarvalho
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmCadastroClientes = new javax.swing.JMenuItem();
        jmAgendamentos = new javax.swing.JMenu();
        jmAgendamentosMedico = new javax.swing.JMenuItem();
        jmAgendamentosCliente = new javax.swing.JMenuItem();
        jmAgendamentosUnidade = new javax.swing.JMenuItem();
        jmAgendamentosAgendas = new javax.swing.JMenu();
        jmAgendamentosCentral = new javax.swing.JMenuItem();
        jmAgendamentosUnidades = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmRelatoriosListagens = new javax.swing.JMenu();
        jmRelatoriosListagensUnidades = new javax.swing.JMenuItem();
        jmRelatoriosListagensMedicos = new javax.swing.JMenuItem();
        jmRelatoriosRankings = new javax.swing.JMenu();
        jmRelatoriosRankingConvenios = new javax.swing.JMenuItem();
        jmRelatoriosRankingExpedientes = new javax.swing.JMenuItem();
        jmRelatoriosRankingEspecialidades = new javax.swing.JMenuItem();
        jmRelatoriosRankingMedicos = new javax.swing.JMenuItem();
        jmRelatoriosRankingUnidades = new javax.swing.JMenuItem();
        jmRelatoriosHistoricos = new javax.swing.JMenuItem();
        jmRelatoriosClientes = new javax.swing.JMenuItem();
        jmRelatoriosMedicos = new javax.swing.JMenuItem();
        jmRelatoriosEspecialidades = new javax.swing.JMenuItem();
        jmRelatoriosUnidades = new javax.swing.JMenuItem();
        jmRelatoriosConvenios = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGA - Sistema de Gerenciamento de Agendamentos");

        jMenuBar1.setName("jfHome"); // NOI18N

        jmCadastros.setText("Cadastros");

        jmCadastroClientes.setText("Clientes");
        jmCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmCadastroClientes);

        jMenuBar1.add(jmCadastros);

        jmAgendamentos.setText("Agendamentos");

        jmAgendamentosMedico.setText("Medicos");
        jmAgendamentosMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgendamentosMedicoActionPerformed(evt);
            }
        });
        jmAgendamentos.add(jmAgendamentosMedico);

        jmAgendamentosCliente.setText("Cliente");
        jmAgendamentosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgendamentosClienteMouseClicked(evt);
            }
        });
        jmAgendamentosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgendamentosClienteActionPerformed(evt);
            }
        });
        jmAgendamentos.add(jmAgendamentosCliente);

        jmAgendamentosUnidade.setText("Unidade");
        jmAgendamentosUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgendamentosUnidadeActionPerformed(evt);
            }
        });
        jmAgendamentos.add(jmAgendamentosUnidade);

        jmAgendamentosAgendas.setText("Agenda ");
        jmAgendamentosAgendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgendamentosAgendasActionPerformed(evt);
            }
        });

        jmAgendamentosCentral.setText("Agenda Central");
        jmAgendamentosCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgendamentosCentralActionPerformed(evt);
            }
        });
        jmAgendamentosAgendas.add(jmAgendamentosCentral);

        jmAgendamentosUnidades.setText("Agenda da Unidade");
        jmAgendamentosAgendas.add(jmAgendamentosUnidades);

        jmAgendamentos.add(jmAgendamentosAgendas);

        jMenuBar1.add(jmAgendamentos);

        jmRelatorios.setText("Relatorios");

        jMenuItem1.setText("Agendamentos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmRelatorios.add(jMenuItem1);

        jmRelatoriosListagens.setText("Listagem de Espera");

        jmRelatoriosListagensUnidades.setText("Lista Espera x Unidade");
        jmRelatoriosListagensUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosListagensUnidadesActionPerformed(evt);
            }
        });
        jmRelatoriosListagens.add(jmRelatoriosListagensUnidades);

        jmRelatoriosListagensMedicos.setText("Lista Espera x Medico");
        jmRelatoriosListagensMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosListagensMedicosActionPerformed(evt);
            }
        });
        jmRelatoriosListagens.add(jmRelatoriosListagensMedicos);

        jmRelatorios.add(jmRelatoriosListagens);

        jmRelatoriosRankings.setText("Rankings");

        jmRelatoriosRankingConvenios.setText("Ranking por Convênios");
        jmRelatoriosRankingConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosRankingConveniosActionPerformed(evt);
            }
        });
        jmRelatoriosRankings.add(jmRelatoriosRankingConvenios);

        jmRelatoriosRankingExpedientes.setText("Ranking por Expedientes");
        jmRelatoriosRankingExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosRankingExpedientesActionPerformed(evt);
            }
        });
        jmRelatoriosRankings.add(jmRelatoriosRankingExpedientes);

        jmRelatoriosRankingEspecialidades.setText("Ranking por Especialidades");
        jmRelatoriosRankingEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosRankingEspecialidadesActionPerformed(evt);
            }
        });
        jmRelatoriosRankings.add(jmRelatoriosRankingEspecialidades);

        jmRelatoriosRankingMedicos.setText("Ranking por Médicos");
        jmRelatoriosRankingMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosRankingMedicosActionPerformed(evt);
            }
        });
        jmRelatoriosRankings.add(jmRelatoriosRankingMedicos);

        jmRelatoriosRankingUnidades.setText("Ranking por Unidade");
        jmRelatoriosRankingUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosRankingUnidadesActionPerformed(evt);
            }
        });
        jmRelatoriosRankings.add(jmRelatoriosRankingUnidades);

        jmRelatorios.add(jmRelatoriosRankings);

        jmRelatoriosHistoricos.setText("Historico Pacientes");
        jmRelatoriosHistoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosHistoricosActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosHistoricos);

        jmRelatoriosClientes.setText("Relação de Clientes");
        jmRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosClientesActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosClientes);

        jmRelatoriosMedicos.setText("Relação de Médicos");
        jmRelatoriosMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosMedicosActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosMedicos);

        jmRelatoriosEspecialidades.setText("Relação de Especialidades");
        jmRelatoriosEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosEspecialidadesActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosEspecialidades);

        jmRelatoriosUnidades.setText("Relação de Unidades");
        jmRelatoriosUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosUnidadesActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosUnidades);

        jmRelatoriosConvenios.setText("Relação de Convênios");
        jmRelatoriosConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatoriosConveniosActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatoriosConvenios);

        jMenuBar1.add(jmRelatorios);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(826, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroClientesActionPerformed
        jfConsultaClientes form = new jfConsultaClientes();
        form.setVisible(true);    
    }//GEN-LAST:event_jmCadastroClientesActionPerformed

    private void jmAgendamentosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgendamentosClienteMouseClicked

    }//GEN-LAST:event_jmAgendamentosClienteMouseClicked

    private void jmAgendamentosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgendamentosClienteActionPerformed
        jfConsultaClientes form = new jfConsultaClientes();
        form.setVisible(true);
    }//GEN-LAST:event_jmAgendamentosClienteActionPerformed

    private void jmAgendamentosMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgendamentosMedicoActionPerformed
        jfConsultaMedicos form = new jfConsultaMedicos();
        form.setVisible(true);
    }//GEN-LAST:event_jmAgendamentosMedicoActionPerformed

    private void jmAgendamentosUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgendamentosUnidadeActionPerformed
        jfConsultaUnidades obj = new jfConsultaUnidades();
        obj.setVisible(true);
    }//GEN-LAST:event_jmAgendamentosUnidadeActionPerformed

    private void jmAgendamentosAgendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgendamentosAgendasActionPerformed

    }//GEN-LAST:event_jmAgendamentosAgendasActionPerformed

    private void jmAgendamentosCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgendamentosCentralActionPerformed
        jfAgendamentoCentral obj = new jfAgendamentoCentral();
        obj.setVisible(true);
    }//GEN-LAST:event_jmAgendamentosCentralActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed

    }//GEN-LAST:event_jmSairActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmRelatoriosListagensUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosListagensUnidadesActionPerformed
        jfParamEspecialidades form = new jfParamEspecialidades();
        form.setVisible(true);
    }//GEN-LAST:event_jmRelatoriosListagensUnidadesActionPerformed

    private void jmRelatoriosListagensMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosListagensMedicosActionPerformed

    }//GEN-LAST:event_jmRelatoriosListagensMedicosActionPerformed

    private void jmRelatoriosRankingConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosRankingConveniosActionPerformed
        jfParamRanking form = new jfParamRanking();
        form.setVisible(true);
    }//GEN-LAST:event_jmRelatoriosRankingConveniosActionPerformed

    private void jmRelatoriosRankingExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosRankingExpedientesActionPerformed

    }//GEN-LAST:event_jmRelatoriosRankingExpedientesActionPerformed

    private void jmRelatoriosRankingEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosRankingEspecialidadesActionPerformed
    }//GEN-LAST:event_jmRelatoriosRankingEspecialidadesActionPerformed

    private void jmRelatoriosRankingMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosRankingMedicosActionPerformed
    }//GEN-LAST:event_jmRelatoriosRankingMedicosActionPerformed

    private void jmRelatoriosRankingUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosRankingUnidadesActionPerformed
    }//GEN-LAST:event_jmRelatoriosRankingUnidadesActionPerformed

    private void jmRelatoriosHistoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosHistoricosActionPerformed
        jfParamHistClientes form = new jfParamHistClientes();
        form.setVisible(true);
    }//GEN-LAST:event_jmRelatoriosHistoricosActionPerformed

    private void jmRelatoriosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosClientesActionPerformed
        jfParamListagens form = new jfParamListagens();
        form.setVisible(true);
    }//GEN-LAST:event_jmRelatoriosClientesActionPerformed

    private void jmRelatoriosMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosMedicosActionPerformed
    }//GEN-LAST:event_jmRelatoriosMedicosActionPerformed

    private void jmRelatoriosEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosEspecialidadesActionPerformed
    }//GEN-LAST:event_jmRelatoriosEspecialidadesActionPerformed

    private void jmRelatoriosUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosUnidadesActionPerformed
    }//GEN-LAST:event_jmRelatoriosUnidadesActionPerformed

    private void jmRelatoriosConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatoriosConveniosActionPerformed
    }//GEN-LAST:event_jmRelatoriosConveniosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jfParamAgendamentos form = new jfParamAgendamentos();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmAgendamentos;
    private javax.swing.JMenu jmAgendamentosAgendas;
    private javax.swing.JMenuItem jmAgendamentosCentral;
    private javax.swing.JMenuItem jmAgendamentosCliente;
    private javax.swing.JMenuItem jmAgendamentosMedico;
    private javax.swing.JMenuItem jmAgendamentosUnidade;
    private javax.swing.JMenuItem jmAgendamentosUnidades;
    private javax.swing.JMenuItem jmCadastroClientes;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenuItem jmRelatoriosClientes;
    private javax.swing.JMenuItem jmRelatoriosConvenios;
    private javax.swing.JMenuItem jmRelatoriosEspecialidades;
    private javax.swing.JMenuItem jmRelatoriosHistoricos;
    private javax.swing.JMenu jmRelatoriosListagens;
    private javax.swing.JMenuItem jmRelatoriosListagensMedicos;
    private javax.swing.JMenuItem jmRelatoriosListagensUnidades;
    private javax.swing.JMenuItem jmRelatoriosMedicos;
    private javax.swing.JMenuItem jmRelatoriosRankingConvenios;
    private javax.swing.JMenuItem jmRelatoriosRankingEspecialidades;
    private javax.swing.JMenuItem jmRelatoriosRankingExpedientes;
    private javax.swing.JMenuItem jmRelatoriosRankingMedicos;
    private javax.swing.JMenuItem jmRelatoriosRankingUnidades;
    private javax.swing.JMenu jmRelatoriosRankings;
    private javax.swing.JMenuItem jmRelatoriosUnidades;
    private javax.swing.JMenu jmSair;
    // End of variables declaration//GEN-END:variables
}
