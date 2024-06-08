/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorun;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaime
 */
public class Autorun extends javax.swing.JFrame {

    /**
     * Creates new form Autorun
     */
    public Autorun() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        btn_manual_instalacion = new javax.swing.JButton();
        btn_instalador = new javax.swing.JButton();
        btn_manual_usuario = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btn_manual_instalacion.setText("Manual de instalación");
        btn_manual_instalacion.setMaximumSize(new java.awt.Dimension(160, 23));
        btn_manual_instalacion.setMinimumSize(new java.awt.Dimension(160, 23));
        btn_manual_instalacion.setPreferredSize(new java.awt.Dimension(160, 23));
        btn_manual_instalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manual_instalacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(230, 0, 5, 0);
        jPanel2.add(btn_manual_instalacion, gridBagConstraints);

        btn_instalador.setText("Instalador");
        btn_instalador.setMaximumSize(new java.awt.Dimension(160, 23));
        btn_instalador.setMinimumSize(new java.awt.Dimension(160, 23));
        btn_instalador.setPreferredSize(new java.awt.Dimension(160, 23));
        btn_instalador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instaladorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(btn_instalador, gridBagConstraints);

        btn_manual_usuario.setText("Manual de usuario");
        btn_manual_usuario.setMaximumSize(new java.awt.Dimension(160, 23));
        btn_manual_usuario.setMinimumSize(new java.awt.Dimension(160, 23));
        btn_manual_usuario.setPreferredSize(new java.awt.Dimension(160, 23));
        btn_manual_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manual_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(btn_manual_usuario, gridBagConstraints);

        btn_salir.setText("Salir");
        btn_salir.setMaximumSize(new java.awt.Dimension(160, 23));
        btn_salir.setMinimumSize(new java.awt.Dimension(160, 23));
        btn_salir.setPreferredSize(new java.awt.Dimension(160, 23));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(btn_salir, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gymgenius_Logo_blanco-remove500x500.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_manual_instalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manual_instalacionActionPerformed
        try {
            // Obtener el directorio base desde donde se ejecuta el JAR
            String basePath = new File("").getAbsolutePath();

            // Ruta relativa al archivo PDF
            String filePath = basePath + File.separator + "Manuales" + File.separator + "Manual _de_instalacion.pdf";

            // Imprimir la ruta para depuración
            System.out.println("Ruta del archivo: " + filePath);

            // Comando para abrir el archivo en Windows
            String command = "cmd /c start \"\" \"" + filePath + "\"";

            // Ejecutar el comando
            Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Autorun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_manual_instalacionActionPerformed

    private void btn_instaladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instaladorActionPerformed
        try {
            // Obtener el directorio base desde donde se ejecuta el JAR
            String basePath = new File("").getAbsolutePath();

            // Ruta relativa al archivo PDF
            String filePath = basePath + File.separator + "Instalador" + File.separator + "GymgeniusInstaller.exe";

            // Imprimir la ruta para depuración
            System.out.println("Ruta del archivo: " + filePath);

            // Comando para abrir el archivo en Windows
            String command = "cmd /c start \"\" \"" + filePath + "\"";

            // Ejecutar el comando
            Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Autorun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_instaladorActionPerformed

    private void btn_manual_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manual_usuarioActionPerformed
        try {
            // Obtener el directorio base desde donde se ejecuta el JAR
            String basePath = new File("").getAbsolutePath();

            // Ruta relativa al archivo PDF
            String filePath = basePath + File.separator + "Manuales" + File.separator + "Manual_de_usuario.pdf";

            // Imprimir la ruta para depuración
            System.out.println("Ruta del archivo: " + filePath);

            // Comando para abrir el archivo en Windows
            String command = "cmd /c start \"\" \"" + filePath + "\"";

            // Ejecutar el comando
            Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Autorun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_manual_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Autorun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autorun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autorun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autorun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autorun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_instalador;
    private javax.swing.JButton btn_manual_instalacion;
    private javax.swing.JButton btn_manual_usuario;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}