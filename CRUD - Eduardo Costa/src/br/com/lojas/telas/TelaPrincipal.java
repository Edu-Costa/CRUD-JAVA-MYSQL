package br.com.lojas.telas;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Desktop = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menucadastrocliente = new javax.swing.JMenuItem();
        menucadastroos = new javax.swing.JMenuItem();
        menucadastrousuario = new javax.swing.JMenuItem();
        menurelatoriosservicos = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuajuda = new javax.swing.JMenu();
        menuajudasobre = new javax.swing.JMenuItem();
        menuopcoes = new javax.swing.JMenu();
        menuopcoessair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuario.setText("usuario");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("data");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuCadastro.setText("cadastro");

        menucadastrocliente.setText("cliente");
        menuCadastro.add(menucadastrocliente);

        menucadastroos.setText("os");
        menuCadastro.add(menucadastroos);

        menucadastrousuario.setText("usuario");
        menuCadastro.add(menucadastrousuario);

        menu.add(menuCadastro);

        menurelatoriosservicos.setText("relatórios");

        jMenuItem4.setText("servicos");
        menurelatoriosservicos.add(jMenuItem4);

        menu.add(menurelatoriosservicos);

        menuajuda.setText("ajuda");

        menuajudasobre.setText("sobre");
        menuajudasobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuajudasobreActionPerformed(evt);
            }
        });
        menuajuda.add(menuajudasobre);

        menu.add(menuajuda);

        menuopcoes.setText("opções");

        menuopcoessair.setText("sair");
        menuopcoessair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuopcoessairActionPerformed(evt);
            }
        });
        menuopcoes.add(menuopcoessair);

        menu.add(menuopcoes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblusuario))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblusuario)
                .addGap(37, 37, 37)
                .addComponent(lblData)
                .addContainerGap(197, Short.MAX_VALUE))
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    


    
    
    private void menuajudasobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuajudasobreActionPerformed
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuajudasobreActionPerformed

    private void menuopcoessairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuopcoessairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuopcoessairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Date data_atual = new Date();
       DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
       lblData.setText(formatador.format(data_atual));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuajuda;
    private javax.swing.JMenuItem menuajudasobre;
    private javax.swing.JMenuItem menucadastrocliente;
    private javax.swing.JMenuItem menucadastroos;
    private javax.swing.JMenuItem menucadastrousuario;
    private javax.swing.JMenu menuopcoes;
    private javax.swing.JMenuItem menuopcoessair;
    private javax.swing.JMenu menurelatoriosservicos;
    // End of variables declaration//GEN-END:variables
}
