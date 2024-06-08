package Interfaz;

import Paneles.CambiaPanel;
import Interfaz.*;
import Paneles.*;
import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelos.m_usuarios;
/**
 *
 * @author Jaime Bueno Perez
 */
public class principal extends javax.swing.JFrame {

    m_usuarios user = new m_usuarios();
    
    int maximizar = 0;
    private static login log;
    private Point point;

    public principal(login parent) throws SQLException, IOException {
        initComponents();
        this.log = parent;
        this.setLocationRelativeTo(this);
        this.btn_perfil.setSelected(true);

        new CambiaPanel(panel_central, new panel_perfil(log.user.getLogin(), log.user.getPassword()));
        txt_login.setText(log.user.getNombre() + " " + log.user.getApellidos());
        int rol = log.user.getRol_id();
        switch (rol) {
            case 2:
                btn_base_de_datos.setVisible(false);
                break;
            case 3:
                btn_base_de_datos.setVisible(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panel_superior_i = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        logon = new javax.swing.JLabel();
        logob = new javax.swing.JLabel();
        panel_superior_d = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_maximizar = new javax.swing.JLabel();
        btn_cerrarsesion = new javax.swing.JLabel();
        btn_salir = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_perfil = new rsbuttom.RSButtonMetro();
        btn_horarios_precios = new rsbuttom.RSButtonMetro();
        btn_clases = new rsbuttom.RSButtonMetro();
        btn_gimnasios = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_acerca_de = new rsbuttom.RSButtonMetro();
        btn_base_de_datos = new rsbuttom.RSButtonMetro();
        panel_central = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panel_superior_i.setBackground(new java.awt.Color(0, 153, 255));
        panel_superior_i.setMinimumSize(new java.awt.Dimension(1100, 60));
        panel_superior_i.setPreferredSize(new java.awt.Dimension(1100, 60));
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

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.setContentAreaFilled(false);
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.setFocusPainted(false);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        panel_superior_i.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 40));

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
        panel_superior_i.add(logon, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 11, 310, 40));

        logob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Gymgenius_Logo_blanco-remove125x125.png"))); // NOI18N
        panel_superior_i.add(logob, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 11, 270, 45));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1100.0;
        jPanel1.add(panel_superior_i, gridBagConstraints);

        panel_superior_d.setBackground(new java.awt.Color(0, 153, 255));
        panel_superior_d.setAlignmentX(0.0F);
        panel_superior_d.setAlignmentY(0.0F);
        panel_superior_d.setMinimumSize(new java.awt.Dimension(500, 60));
        panel_superior_d.setPreferredSize(new java.awt.Dimension(500, 60));
        panel_superior_d.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 15));

        txt_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_login.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txt_login.setAlignmentY(0.0F);
        txt_login.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panel_superior_d.add(txt_login);

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimize.png"))); // NOI18N
        btn_minimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_minimizar.setAlignmentY(0.0F);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        panel_superior_d.add(btn_minimizar);

        btn_maximizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/maximize.png"))); // NOI18N
        btn_maximizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_maximizar.setAlignmentY(0.0F);
        btn_maximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_maximizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maximizarMouseClicked(evt);
            }
        });
        panel_superior_d.add(btn_maximizar);

        btn_cerrarsesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion (2).png"))); // NOI18N
        btn_cerrarsesion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_cerrarsesion.setAlignmentY(0.0F);
        btn_cerrarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrarsesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarsesionMouseClicked(evt);
            }
        });
        panel_superior_d.add(btn_cerrarsesion);

        btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close_1.png"))); // NOI18N
        btn_salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_salir.setAlignmentY(0.0F);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 180.0;
        jPanel1.add(panel_superior_d, gridBagConstraints);

        panel_menu.setBackground(new java.awt.Color(214, 217, 223));
        panel_menu.setAlignmentX(0.0F);
        panel_menu.setAlignmentY(0.0F);
        panel_menu.setMinimumSize(new java.awt.Dimension(230, 660));
        panel_menu.setPreferredSize(new java.awt.Dimension(230, 660));
        panel_menu.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(214, 217, 223));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("USUARIO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(jPanel4, gridBagConstraints);

        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btn_perfil.setText("PERFIL");
        btn_perfil.setColorHover(new java.awt.Color(204, 204, 204));
        btn_perfil.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_perfil.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_perfil.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_perfil.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_perfil.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_perfil.setFocusPainted(false);
        btn_perfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_perfil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_perfil.setIconTextGap(25);
        btn_perfil.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_perfilMousePressed(evt);
            }
        });
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_perfil, gridBagConstraints);

        btn_horarios_precios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        btn_horarios_precios.setText("PRECIOS");
        btn_horarios_precios.setColorHover(new java.awt.Color(204, 204, 204));
        btn_horarios_precios.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_horarios_precios.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_horarios_precios.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_horarios_precios.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_horarios_precios.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_horarios_precios.setFocusPainted(false);
        btn_horarios_precios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_horarios_precios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_horarios_precios.setIconTextGap(25);
        btn_horarios_precios.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_horarios_precios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_horarios_preciosMousePressed(evt);
            }
        });
        btn_horarios_precios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horarios_preciosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_horarios_precios, gridBagConstraints);

        btn_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clases1.png"))); // NOI18N
        btn_clases.setText("CLASES");
        btn_clases.setColorHover(new java.awt.Color(204, 204, 204));
        btn_clases.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_clases.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_clases.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_clases.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_clases.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_clases.setFocusPainted(false);
        btn_clases.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_clases.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_clases.setIconTextGap(25);
        btn_clases.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clasesMousePressed(evt);
            }
        });
        btn_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clasesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_clases, gridBagConstraints);

        btn_gimnasios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gimnasio.png"))); // NOI18N
        btn_gimnasios.setText("GIMNASIOS");
        btn_gimnasios.setColorHover(new java.awt.Color(204, 204, 204));
        btn_gimnasios.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_gimnasios.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_gimnasios.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_gimnasios.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_gimnasios.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_gimnasios.setFocusPainted(false);
        btn_gimnasios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gimnasios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_gimnasios.setIconTextGap(25);
        btn_gimnasios.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_gimnasios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_gimnasiosMousePressed(evt);
            }
        });
        btn_gimnasios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gimnasiosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_gimnasios, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(214, 217, 223));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 128, 131));
        jLabel2.setText("OTROS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(jPanel5, gridBagConstraints);

        btn_acerca_de.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png"))); // NOI18N
        btn_acerca_de.setText("ACERCA DE");
        btn_acerca_de.setColorHover(new java.awt.Color(204, 204, 204));
        btn_acerca_de.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_acerca_de.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_acerca_de.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_acerca_de.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_acerca_de.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_acerca_de.setFocusPainted(false);
        btn_acerca_de.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_acerca_de.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_acerca_de.setIconTextGap(25);
        btn_acerca_de.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_acerca_de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_acerca_deMousePressed(evt);
            }
        });
        btn_acerca_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acerca_deActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_acerca_de, gridBagConstraints);

        btn_base_de_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BD1.png"))); // NOI18N
        btn_base_de_datos.setText("BASE DE DATOS");
        btn_base_de_datos.setColorHover(new java.awt.Color(204, 204, 204));
        btn_base_de_datos.setColorNormal(new java.awt.Color(214, 217, 223));
        btn_base_de_datos.setColorPressed(new java.awt.Color(204, 204, 204));
        btn_base_de_datos.setColorTextHover(new java.awt.Color(128, 128, 131));
        btn_base_de_datos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btn_base_de_datos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btn_base_de_datos.setFocusPainted(false);
        btn_base_de_datos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_base_de_datos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_base_de_datos.setIconTextGap(25);
        btn_base_de_datos.setPreferredSize(new java.awt.Dimension(230, 35));
        btn_base_de_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_base_de_datosMousePressed(evt);
            }
        });
        btn_base_de_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_de_datosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 230.0;
        gridBagConstraints.weighty = 30.0;
        panel_menu.add(btn_base_de_datos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 660.0;
        jPanel1.add(panel_menu, gridBagConstraints);

        panel_central.setBackground(new java.awt.Color(102, 102, 102));
        panel_central.setAlignmentX(0.0F);
        panel_central.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_central.setPreferredSize(new java.awt.Dimension(1050, 660));
        panel_central.setLayout(new javax.swing.BoxLayout(panel_central, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1050.0;
        gridBagConstraints.weighty = 660.0;
        jPanel1.add(panel_central, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_maximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maximizarMouseClicked
        if (maximizar == 0) {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            maximizar = 1;
        } else {
            this.setExtendedState(JFrame.NORMAL);
            maximizar = 0;
        }

    }//GEN-LAST:event_btn_maximizarMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "SALIR", a);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close.png")));
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close_1.png")));
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_cerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarsesionMouseClicked
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA CERRAR SESION?", "CERRAR SESION", a);
        if (resultado == 0) {
            dispose();
            login login = new login();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_cerrarsesionMouseClicked

    private void btn_base_de_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_de_datosActionPerformed
        if (this.btn_base_de_datos.isSelected()) {
            new CambiaPanel(panel_central, new panel_base_de_datos(this));
            this.btn_base_de_datos.setColorNormal(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(204, 204, 204));

            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(214, 217, 223));

            this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(214, 217, 223));

            this.btn_clases.setColorNormal(new Color(214, 217, 223));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(214, 217, 223));

            this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(214, 217, 223));

            this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(214, 217, 223));

        } else {
            this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_base_de_datosActionPerformed

    private void btn_base_de_datosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_de_datosMousePressed
        this.btn_perfil.setSelected(false);
        this.btn_horarios_precios.setSelected(false);
        this.btn_clases.setSelected(false);
        this.btn_gimnasios.setSelected(false);
        this.btn_acerca_de.setSelected(false);
        this.btn_base_de_datos.setSelected(true);
    }//GEN-LAST:event_btn_base_de_datosMousePressed

    private void btn_acerca_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acerca_deActionPerformed
        if (this.btn_acerca_de.isSelected()) {
            new CambiaPanel(panel_central, new panel_acerca_de());
            this.btn_acerca_de.setColorNormal(new Color(204, 204, 204));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(204, 204, 204));

            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(214, 217, 223));

            this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(214, 217, 223));

            this.btn_clases.setColorNormal(new Color(214, 217, 223));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(214, 217, 223));

            this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(214, 217, 223));

            this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(214, 217, 223));
        } else {
            this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_acerca_deActionPerformed

    private void btn_acerca_deMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acerca_deMousePressed
        this.btn_perfil.setSelected(false);
        this.btn_horarios_precios.setSelected(false);
        this.btn_clases.setSelected(false);
        this.btn_gimnasios.setSelected(false);
        this.btn_acerca_de.setSelected(true);
        this.btn_base_de_datos.setSelected(false);
    }//GEN-LAST:event_btn_acerca_deMousePressed

    private void btn_gimnasiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gimnasiosActionPerformed
        if (this.btn_gimnasios.isSelected()) {
            try {
                new CambiaPanel(panel_central, new panel_gimnasios(log.user.getLogin(), log.user.getPassword()));
            } catch (IOException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.btn_gimnasios.setColorNormal(new Color(204, 204, 204));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(204, 204, 204));

            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(214, 217, 223));

            this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(214, 217, 223));

            this.btn_clases.setColorNormal(new Color(214, 217, 223));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(214, 217, 223));

            this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(214, 217, 223));

            this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(214, 217, 223));
        } else {
            this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_gimnasiosActionPerformed

    private void btn_gimnasiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gimnasiosMousePressed
        this.btn_perfil.setSelected(false);
        this.btn_horarios_precios.setSelected(false);
        this.btn_clases.setSelected(false);
        this.btn_gimnasios.setSelected(true);
        this.btn_acerca_de.setSelected(false);
        this.btn_base_de_datos.setSelected(false);
    }//GEN-LAST:event_btn_gimnasiosMousePressed

    private void btn_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasesActionPerformed
        if (this.btn_clases.isSelected()) {
            try {
                new CambiaPanel(panel_central, new panel_clases(log.user.getLogin(), log.user.getPassword()));
            } catch (IOException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.btn_clases.setColorNormal(new Color(204, 204, 204));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(204, 204, 204));

            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(214, 217, 223));

            this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(214, 217, 223));

            this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(214, 217, 223));

            this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(214, 217, 223));

            this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(214, 217, 223));
        } else {
            this.btn_clases.setColorNormal(new Color(214, 217, 223));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_clasesActionPerformed

    private void btn_clasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasesMousePressed
        this.btn_perfil.setSelected(false);
        this.btn_horarios_precios.setSelected(false);
        this.btn_clases.setSelected(true);
        this.btn_gimnasios.setSelected(false);
        this.btn_acerca_de.setSelected(false);
        this.btn_base_de_datos.setSelected(false);
    }//GEN-LAST:event_btn_clasesMousePressed

    private void btn_horarios_preciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horarios_preciosActionPerformed
        if (this.btn_horarios_precios.isSelected()) {
            new CambiaPanel(panel_central, new panel_precios());
            this.btn_horarios_precios.setColorNormal(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(204, 204, 204));

            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(214, 217, 223));

            this.btn_clases.setColorNormal(new Color(214, 217, 223));
            this.btn_clases.setColorHover(new Color(204, 204, 204));
            this.btn_clases.setColorPressed(new Color(214, 217, 223));

            this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
            this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
            this.btn_gimnasios.setColorPressed(new Color(214, 217, 223));

            this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
            this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
            this.btn_acerca_de.setColorPressed(new Color(214, 217, 223));

            this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
            this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
            this.btn_base_de_datos.setColorPressed(new Color(214, 217, 223));
        } else {
            this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
            this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
            this.btn_horarios_precios.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_horarios_preciosActionPerformed

    private void btn_horarios_preciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_horarios_preciosMousePressed
        this.btn_perfil.setSelected(false);
        this.btn_horarios_precios.setSelected(true);
        this.btn_clases.setSelected(false);
        this.btn_gimnasios.setSelected(false);
        this.btn_acerca_de.setSelected(false);
        this.btn_base_de_datos.setSelected(false);
    }//GEN-LAST:event_btn_horarios_preciosMousePressed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        if (this.btn_perfil.isSelected()) {
            try {
                new CambiaPanel(panel_central, new panel_perfil(log.user.getLogin(), log.user.getPassword()));
                this.btn_perfil.setColorNormal(new Color(204, 204, 204));
                this.btn_perfil.setColorHover(new Color(204, 204, 204));
                this.btn_perfil.setColorPressed(new Color(204, 204, 204));
                
                this.btn_horarios_precios.setColorNormal(new Color(214, 217, 223));
                this.btn_horarios_precios.setColorHover(new Color(204, 204, 204));
                this.btn_horarios_precios.setColorPressed(new Color(214, 217, 223));
                
                this.btn_clases.setColorNormal(new Color(214, 217, 223));
                this.btn_clases.setColorHover(new Color(204, 204, 204));
                this.btn_clases.setColorPressed(new Color(214, 217, 223));
                
                this.btn_gimnasios.setColorNormal(new Color(214, 217, 223));
                this.btn_gimnasios.setColorHover(new Color(204, 204, 204));
                this.btn_gimnasios.setColorPressed(new Color(214, 217, 223));
                                
                this.btn_acerca_de.setColorNormal(new Color(214, 217, 223));
                this.btn_acerca_de.setColorHover(new Color(204, 204, 204));
                this.btn_acerca_de.setColorPressed(new Color(214, 217, 223));
                
                this.btn_base_de_datos.setColorNormal(new Color(214, 217, 223));
                this.btn_base_de_datos.setColorHover(new Color(204, 204, 204));
                this.btn_base_de_datos.setColorPressed(new Color(214, 217, 223));
            } catch (SQLException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.btn_perfil.setColorNormal(new Color(214, 217, 223));
            this.btn_perfil.setColorHover(new Color(204, 204, 204));
            this.btn_perfil.setColorPressed(new Color(217, 217, 223));
        }
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_perfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMousePressed
        this.btn_perfil.setSelected(true);
        this.btn_horarios_precios.setSelected(false);
        this.btn_clases.setSelected(false);
        this.btn_gimnasios.setSelected(false);
        this.btn_acerca_de.setSelected(false);
        this.btn_base_de_datos.setSelected(false);
    }//GEN-LAST:event_btn_perfilMousePressed

    private void panel_superior_iMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superior_iMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_panel_superior_iMousePressed

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

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        int posicion = panel_menu.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -230, 2, 2, panel_menu);
            panel_menu.setVisible(false);
            panel_central.setBounds(0, panel_central.getY(), panel_central.getWidth() + 230, panel_central.getHeight());
        } else {
            Animacion.Animacion.mover_derecha(-230, 0, 2, 2, panel_menu);
            panel_menu.setVisible(true);
            panel_central.setBounds(230, panel_central.getY(), panel_central.getWidth() - 230, panel_central.getHeight());
        }
        panel_central.revalidate();
        panel_central.repaint();
    }//GEN-LAST:event_btn_menuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btn_acerca_de;
    private rsbuttom.RSButtonMetro btn_base_de_datos;
    private javax.swing.JLabel btn_cerrarsesion;
    private rsbuttom.RSButtonMetro btn_clases;
    private rsbuttom.RSButtonMetro btn_gimnasios;
    private rsbuttom.RSButtonMetro btn_horarios_precios;
    private javax.swing.JLabel btn_maximizar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel btn_minimizar;
    private rsbuttom.RSButtonMetro btn_perfil;
    private javax.swing.JLabel btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logob;
    private javax.swing.JLabel logon;
    private javax.swing.JPanel panel_central;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_superior_d;
    private javax.swing.JPanel panel_superior_i;
    private javax.swing.JLabel txt_login;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanel_central() {
        return panel_central;
    }
}
