package Paneles;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import modelos.m_clases;
import modelos.m_gimnasios;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_base_de_datos extends javax.swing.JPanel {

    m_usuarios user = new m_usuarios();
    m_gimnasios gimnasio = new m_gimnasios();
    m_clases clase = new m_clases();

    private Interfaz.principal panelPrincipal;

    public panel_base_de_datos(Interfaz.principal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btn_añadir_usuario = new javax.swing.JButton();
        btn_añadir_gimnasio = new javax.swing.JButton();
        btn_borrar_usuario = new javax.swing.JButton();
        btn_borrar_gimnasio = new javax.swing.JButton();
        btn_editar_gimnasio = new javax.swing.JButton();
        btn_editar_usuario = new javax.swing.JButton();
        btn_mostrar_usuarios = new javax.swing.JButton();
        btn_mostar_gimnasios = new javax.swing.JButton();
        btn_gestionar_clase = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        btn_añadir_usuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_añadir_usuario.setForeground(new java.awt.Color(153, 153, 153));
        btn_añadir_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_usuario.png"))); // NOI18N
        btn_añadir_usuario.setText("AÑADIR USUARIO");
        btn_añadir_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_añadir_usuario.setFocusPainted(false);
        btn_añadir_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_añadir_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_añadir_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_añadir_usuario, gridBagConstraints);

        btn_añadir_gimnasio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_añadir_gimnasio.setForeground(new java.awt.Color(153, 153, 153));
        btn_añadir_gimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_gimnasio.png"))); // NOI18N
        btn_añadir_gimnasio.setText("AÑADIR GIMNASIO");
        btn_añadir_gimnasio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_añadir_gimnasio.setFocusPainted(false);
        btn_añadir_gimnasio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_añadir_gimnasio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_añadir_gimnasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_gimnasioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_añadir_gimnasio, gridBagConstraints);

        btn_borrar_usuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_borrar_usuario.setForeground(new java.awt.Color(153, 153, 153));
        btn_borrar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar_usuario.png"))); // NOI18N
        btn_borrar_usuario.setText("BORRAR USUARIO");
        btn_borrar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar_usuario.setFocusPainted(false);
        btn_borrar_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_borrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_borrar_usuario, gridBagConstraints);

        btn_borrar_gimnasio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_borrar_gimnasio.setForeground(new java.awt.Color(153, 153, 153));
        btn_borrar_gimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar_gimnasio.png"))); // NOI18N
        btn_borrar_gimnasio.setText("BORRAR GIMNASIO");
        btn_borrar_gimnasio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar_gimnasio.setFocusPainted(false);
        btn_borrar_gimnasio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar_gimnasio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_borrar_gimnasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_gimnasioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_borrar_gimnasio, gridBagConstraints);

        btn_editar_gimnasio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_editar_gimnasio.setForeground(new java.awt.Color(153, 153, 153));
        btn_editar_gimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        btn_editar_gimnasio.setText("GESTIONAR GIMNASIOS");
        btn_editar_gimnasio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar_gimnasio.setFocusPainted(false);
        btn_editar_gimnasio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar_gimnasio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editar_gimnasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_gimnasioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_editar_gimnasio, gridBagConstraints);

        btn_editar_usuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_editar_usuario.setForeground(new java.awt.Color(153, 153, 153));
        btn_editar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_usuario.png"))); // NOI18N
        btn_editar_usuario.setText("GESTIONAR USUARIOS");
        btn_editar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar_usuario.setFocusPainted(false);
        btn_editar_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_editar_usuario, gridBagConstraints);

        btn_mostrar_usuarios.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_mostrar_usuarios.setForeground(new java.awt.Color(153, 153, 153));
        btn_mostrar_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrar_usuarios.png"))); // NOI18N
        btn_mostrar_usuarios.setText("MOSTRAR USUARIOS");
        btn_mostrar_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostrar_usuarios.setFocusPainted(false);
        btn_mostrar_usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mostrar_usuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mostrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_usuariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_mostrar_usuarios, gridBagConstraints);

        btn_mostar_gimnasios.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_mostar_gimnasios.setForeground(new java.awt.Color(153, 153, 153));
        btn_mostar_gimnasios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostar_gimnasios.png"))); // NOI18N
        btn_mostar_gimnasios.setText("MOSTRAR GIMNASIOS");
        btn_mostar_gimnasios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostar_gimnasios.setFocusPainted(false);
        btn_mostar_gimnasios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mostar_gimnasios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mostar_gimnasios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostar_gimnasiosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_mostar_gimnasios, gridBagConstraints);

        btn_gestionar_clase.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_gestionar_clase.setForeground(new java.awt.Color(153, 153, 153));
        btn_gestionar_clase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_clase.png"))); // NOI18N
        btn_gestionar_clase.setText("GESTIONAR CLASES");
        btn_gestionar_clase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gestionar_clase.setFocusPainted(false);
        btn_gestionar_clase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_gestionar_clase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_gestionar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_claseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(btn_gestionar_clase, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadir_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_usuarioActionPerformed
        new CambiaPanel(panelPrincipal.getPanel_central(), new panel_añadir_usuario());
    }//GEN-LAST:event_btn_añadir_usuarioActionPerformed

    private void btn_editar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_usuarioActionPerformed
        try {
            new CambiaPanel(panelPrincipal.getPanel_central(), new panel_gestionar_usuario(panelPrincipal, user));
        } catch (IOException ex) {
            Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editar_usuarioActionPerformed

    private void btn_borrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_usuarioActionPerformed
        try {
            new CambiaPanel(panelPrincipal.getPanel_central(), new panel_borrar_usuario(panelPrincipal, user));
        } catch (IOException ex) {
            Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_borrar_usuarioActionPerformed

    private void btn_añadir_gimnasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_gimnasioActionPerformed
        new CambiaPanel(panelPrincipal.getPanel_central(), new panel_añadir_gimnasio());
    }//GEN-LAST:event_btn_añadir_gimnasioActionPerformed

    private void btn_editar_gimnasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_gimnasioActionPerformed
        try {
            new CambiaPanel(panelPrincipal.getPanel_central(), new panel_gestionar_gimnasio(panelPrincipal, gimnasio));
        } catch (IOException ex) {
            Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editar_gimnasioActionPerformed

    private void btn_borrar_gimnasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_gimnasioActionPerformed
        try {
            new CambiaPanel(panelPrincipal.getPanel_central(), new panel_borrar_gimnasio(panelPrincipal, gimnasio));
        } catch (IOException ex) {
            Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_borrar_gimnasioActionPerformed

    private void btn_mostrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_usuariosActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_perfil_bd(panelPrincipal, user));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_btn_mostrar_usuariosActionPerformed

    private void btn_mostar_gimnasiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostar_gimnasiosActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_mostrar_gimnasios(panelPrincipal, "panel_base_de_datos"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }//GEN-LAST:event_btn_mostar_gimnasiosActionPerformed

    private void btn_gestionar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_claseActionPerformed
        try {
            new CambiaPanel(panelPrincipal.getPanel_central(), new panel_gestionar_clase(panelPrincipal, clase));
        } catch (IOException ex) {
            Logger.getLogger(panel_base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_gestionar_claseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir_gimnasio;
    private javax.swing.JButton btn_añadir_usuario;
    private javax.swing.JButton btn_borrar_gimnasio;
    private javax.swing.JButton btn_borrar_usuario;
    private javax.swing.JButton btn_editar_gimnasio;
    private javax.swing.JButton btn_editar_usuario;
    private javax.swing.JButton btn_gestionar_clase;
    private javax.swing.JButton btn_mostar_gimnasios;
    private javax.swing.JButton btn_mostrar_usuarios;
    // End of variables declaration//GEN-END:variables
}
