/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.swing.JOptionPane;

/**
 *
 * @author TRS
 */
public class fmPrincipalAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form fmPrincipalAdministrador
     */
    public fmPrincipalAdministrador() {
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

        jToolBar1 = new javax.swing.JToolBar();
        btPaciente = new javax.swing.JButton();
        btCadUsuario = new javax.swing.JButton();
        btFicha = new javax.swing.JButton();
        btLaudo = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        laUsuario = new javax.swing.JLabel();
        laData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemPacientes = new javax.swing.JMenuItem();
        jMenuItemFichas = new javax.swing.JMenuItem();
        jMenuItemLaudos = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemCriarUsuarios = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/People-32.png"))); // NOI18N
        btPaciente.setText("Paciente");
        btPaciente.setToolTipText("Cadastrar Paciente");
        btPaciente.setFocusable(false);
        btPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btPaciente);

        btCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/People-32.png"))); // NOI18N
        btCadUsuario.setText("Usuario");
        btCadUsuario.setFocusable(false);
        btCadUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadUsuario);

        btFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new-32.png"))); // NOI18N
        btFicha.setText("Ficha");
        btFicha.setFocusable(false);
        btFicha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFicha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFichaActionPerformed(evt);
            }
        });
        jToolBar1.add(btFicha);

        btLaudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/report-32.png"))); // NOI18N
        btLaudo.setText("Laudo");
        btLaudo.setFocusable(false);
        btLaudo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLaudo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLaudoActionPerformed(evt);
            }
        });
        jToolBar1.add(btLaudo);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Exit-32.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setToolTipText("Sair do sistema");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        laUsuario.setText("Bem-vindo");

        laData.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(laUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(laData)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laUsuario)
                    .addComponent(laData)))
        );

        jMenuCadastros.setText("Cadastros");

        jMenuItemPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPacientes.setText("Pacientes");
        jMenuItemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemPacientes);

        jMenuItemFichas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFichas.setText("Fichas");
        jMenuItemFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFichasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFichas);

        jMenuItemLaudos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLaudos.setText("Laudos");
        jMenuItemLaudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLaudosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemLaudos);

        jMenuItemCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadUsuario.setText("Usuários");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Histórico Clínico");
        jMenuRelatorios.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Imagens Médicas");
        jMenuRelatorios.add(jMenuItem1);

        jMenuBar1.add(jMenuRelatorios);

        jMenuConfiguracoes.setText("Configurações");

        jMenuItemCriarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCriarUsuarios.setText("Criar Usuários");
        jMenuConfiguracoes.add(jMenuItemCriarUsuarios);

        jMenuBar1.add(jMenuConfiguracoes);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemSobre.setText("Sobre");
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteActionPerformed
        // TODO add your handling code here:
       fmPaciente paciente = new fmPaciente();
        jDesktopPane1.add(paciente);
        paciente.setVisible(true);
    }//GEN-LAST:event_btPacienteActionPerformed

    private void btFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFichaActionPerformed
        fmFicha2 ficha;
        ficha = new fmFicha2();
        jDesktopPane1.add(ficha);
        ficha.setVisible(true);
    }//GEN-LAST:event_btFichaActionPerformed

    private void btLaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLaudoActionPerformed
        // TODO add your handling code here:
        fmLaudo laudo = new fmLaudo();
        jDesktopPane1.add(laudo);
        laudo.setVisible(true);
    }//GEN-LAST:event_btLaudoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?","Sistema de Prontuários Médicos",1); // se o primeiro paramtro for null o JOptionframe se perde e fica atras das janelas e trava a aplicação

        if (valor == 0){
            System.exit(0); //Finalizar o programa
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadUsuarioActionPerformed
        // TODO add your handling code here:
        fmCadUsuario usuario = new fmCadUsuario();
        jDesktopPane1.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_btCadUsuarioActionPerformed

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
        // TODO add your handling code here:
        fmCadUsuario usuario = new fmCadUsuario();
        jDesktopPane1.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jMenuItemPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacientesActionPerformed
        // TODO add your handling code here:
        fmPaciente paciente = new fmPaciente();
        jDesktopPane1.add(paciente);
        paciente.setVisible(true);
    }//GEN-LAST:event_jMenuItemPacientesActionPerformed

    private void jMenuItemFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFichasActionPerformed
        // TODO add your handling code here:
        fmFicha2 ficha = new fmFicha2();
        jDesktopPane1.add(ficha);
        ficha.setVisible(true);
    }//GEN-LAST:event_jMenuItemFichasActionPerformed

    private void jMenuItemLaudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLaudosActionPerformed
        // TODO add your handling code here:
         fmLaudo laudo = new fmLaudo();
        jDesktopPane1.add(laudo);
        laudo.setVisible(true);
    }//GEN-LAST:event_jMenuItemLaudosActionPerformed

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
            java.util.logging.Logger.getLogger(fmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fmPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadUsuario;
    private javax.swing.JButton btFicha;
    private javax.swing.JButton btLaudo;
    private javax.swing.JButton btPaciente;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemCriarUsuarios;
    private javax.swing.JMenuItem jMenuItemFichas;
    private javax.swing.JMenuItem jMenuItemLaudos;
    private javax.swing.JMenuItem jMenuItemPacientes;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel laData;
    private javax.swing.JLabel laUsuario;
    // End of variables declaration//GEN-END:variables
}
