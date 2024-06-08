package Interfaz;

import java.awt.Point;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.*;

/**
 *
 * @author Jaime Bueno Perez
 */
public class login extends javax.swing.JFrame {

    m_usuarios user = new m_usuarios();

    int maximizar = 0;

    private Point point;

    public login() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.btn_ocultar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panel_superior_d = new javax.swing.JPanel();
        btn_minimizar = new javax.swing.JLabel();
        btn_maximizar = new javax.swing.JLabel();
        btn_salir = new javax.swing.JLabel();
        panel_central = new javax.swing.JPanel();
        btn_ver = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_iniciar_sesion = new javax.swing.JLabel();
        btn_ocultar = new javax.swing.JLabel();
        panel_superior_i = new javax.swing.JPanel();
        logon = new javax.swing.JLabel();
        logob = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 300));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panel_superior_d.setBackground(new java.awt.Color(153, 153, 153));
        panel_superior_d.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_superior_d.setPreferredSize(new java.awt.Dimension(300, 50));
        panel_superior_d.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_superior_dMouseDragged(evt);
            }
        });
        panel_superior_d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_superior_dMousePressed(evt);
            }
        });
        panel_superior_d.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimize.png"))); // NOI18N
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        panel_superior_d.add(btn_minimizar);

        btn_maximizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/maximize.png"))); // NOI18N
        btn_maximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_maximizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maximizarMouseClicked(evt);
            }
        });
        panel_superior_d.add(btn_maximizar);

        btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close_1.png"))); // NOI18N
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        panel_superior_d.add(btn_salir);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 50.0;
        jPanel1.add(panel_superior_d, gridBagConstraints);

        panel_central.setBackground(new java.awt.Color(153, 153, 153));
        panel_central.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_central.setPreferredSize(new java.awt.Dimension(600, 240));
        panel_central.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ver_32px.png"))); // NOI18N
        btn_ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verMouseClicked(evt);
            }
        });
        panel_central.add(btn_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        txt_password.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_password.setBorder(null);
        panel_central.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, -1));

        txt_user.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_user.setBorder(null);
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        panel_central.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 250, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LOGIN.png"))); // NOI18N
        panel_central.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        btn_iniciar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ingresar.png"))); // NOI18N
        btn_iniciar_sesion.setAlignmentY(0.0F);
        btn_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_sesionMouseClicked(evt);
            }
        });
        panel_central.add(btn_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        btn_ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ocultar_32px.png"))); // NOI18N
        btn_ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ocultarMouseClicked(evt);
            }
        });
        panel_central.add(btn_ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 600.0;
        gridBagConstraints.weighty = 240.0;
        jPanel1.add(panel_central, gridBagConstraints);

        panel_superior_i.setBackground(new java.awt.Color(153, 153, 153));
        panel_superior_i.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_superior_i.setPreferredSize(new java.awt.Dimension(300, 50));
        panel_superior_i.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_superior_iMouseDragged(evt);
            }
        });
        panel_superior_i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_superior_iMousePressed(evt);
            }
        });
        panel_superior_i.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Gymgenius_Logo_negro-remove125x125.png"))); // NOI18N
        logon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                logonMouseDragged(evt);
            }
        });
        logon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logonMousePressed(evt);
            }
        });
        panel_superior_i.add(logon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        logob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Gymgenius_Logo_blanco-remove125x125.png"))); // NOI18N
        panel_superior_i.add(logob, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 45));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 50.0;
        jPanel1.add(panel_superior_i, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

    }//GEN-LAST:event_jPanel1MouseDragged

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close_1.png")));
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close.png")));
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "SALIR", a);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_salirMouseClicked

    private void logonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logonMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_logonMousePressed

    private void logonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logonMouseDragged
        if (maximizar == 0) {
            int CurrentX = this.getLocation().x;
            int CurrentY = this.getLocation().y;
            int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
            int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);
            int x = CurrentX + MoveX;
            int y = CurrentY + MoveY;
            this.setLocation(x, y);
        }
    }//GEN-LAST:event_logonMouseDragged

    private void btn_maximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maximizarMouseClicked
        if (maximizar == 0) {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            maximizar = 1;
        } else {
            this.setExtendedState(JFrame.NORMAL);
            maximizar = 0;
        }
    }//GEN-LAST:event_btn_maximizarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ocultarMouseClicked
        btn_ver.setVisible(true);
        btn_ocultar.setVisible(false);
        txt_password.setEchoChar('●');
    }//GEN-LAST:event_btn_ocultarMouseClicked

    private void btn_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionMouseClicked
        try {
            user = user.get_login(txt_user.getText(), txt_password.getText());
            if (user.getId() > 0) {
                int estado = user.getEstadocuenta();
                LocalDate fechaActual = LocalDate.now();
                Date duracionSuscripcionDate = user.getDuracionsuscripcion();
                if (duracionSuscripcionDate != null && estado != 0) {
                    LocalDate fechaSuscripcion = duracionSuscripcionDate.toLocalDate();
                    if (fechaSuscripcion.isEqual(fechaActual) || fechaSuscripcion.isAfter(fechaActual)) {
                        if (fechaSuscripcion.isEqual(fechaActual)) {
                            JOptionPane.showMessageDialog(this, "Tu suscripción caduca hoy");
                        }
                        try {
                            dispose();
                            principal principal = new principal(this);
                            principal.setVisible(true);
                            this.setVisible(false);
                        } catch (SQLException ex) {
                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Suscripción caducada");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario no tiene una suscripción válida o está dado de baja");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Autentificación errónea");
            }
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_iniciar_sesionMouseClicked

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
    }//GEN-LAST:event_txt_userActionPerformed

    private void btn_verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verMouseClicked
        btn_ver.setVisible(false);
        btn_ocultar.setVisible(true);
        txt_password.setEchoChar((char) 0);
    }//GEN-LAST:event_btn_verMouseClicked

    private void panel_superior_dMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superior_dMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_panel_superior_dMousePressed

    private void panel_superior_iMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superior_iMouseDragged
        if (maximizar == 0) {
            int CurrentX = this.getLocation().x;
            int CurrentY = this.getLocation().y;

            int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
            int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);

            int x = CurrentX + MoveX;
            int y = CurrentY + MoveY;

            this.setLocation(x, y);
        }
    }//GEN-LAST:event_panel_superior_iMouseDragged

    private void panel_superior_iMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superior_iMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_panel_superior_iMousePressed

    private void panel_superior_dMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superior_dMouseDragged
        if (maximizar == 0) {
            int CurrentX = this.getLocation().x;
            int CurrentY = this.getLocation().y;

            int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
            int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);

            int x = CurrentX + MoveX;
            int y = CurrentY + MoveY;

            this.setLocation(x, y);
        }
    }//GEN-LAST:event_panel_superior_dMouseDragged

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
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_iniciar_sesion;
    private javax.swing.JLabel btn_maximizar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JLabel btn_ocultar;
    private javax.swing.JLabel btn_salir;
    private javax.swing.JLabel btn_ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logob;
    private javax.swing.JLabel logon;
    private javax.swing.JPanel panel_central;
    private javax.swing.JPanel panel_superior_d;
    private javax.swing.JPanel panel_superior_i;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
