package Paneles;

import Interfaz.login;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelos.m_perfiles;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_borrar_usuario extends javax.swing.JPanel {

    m_perfiles perfil = new m_perfiles();
    m_usuarios user = new m_usuarios();

    private Interfaz.principal panelPrincipal;
    private static login log;
    File selectFile;
    Image scaledImage;
    int id;

    public panel_borrar_usuario(Interfaz.principal panelPrincipal, m_usuarios user_selec) throws IOException {
        this.panelPrincipal = panelPrincipal;
        initComponents();
        id = user_selec.getId();
        mostrar();
        lbl_resultado_usuario.setVisible(false);
        lbl_resultado_error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txt_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_login = new javax.swing.JLabel();
        txt_password = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JLabel();
        txt_fechanacimiento = new javax.swing.JLabel();
        txt_altura = new javax.swing.JLabel();
        txt_peso = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_poblacion = new javax.swing.JLabel();
        txt_gimnasio = new javax.swing.JLabel();
        txt_rol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_resultado_usuario = new javax.swing.JLabel();
        lbl_resultado_error = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txt_id.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(txt_id, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Apellidos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Altura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Peso:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Población:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel12, gridBagConstraints);

        btn_borrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btn_borrar, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Gimnasio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Rol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel14, gridBagConstraints);

        btn_buscar.setText("BUSCAR USUARIO");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel1.add(btn_buscar, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Login:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel16, gridBagConstraints);

        txt_login.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_login.setForeground(new java.awt.Color(204, 204, 204));
        txt_login.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_login, gridBagConstraints);

        txt_password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_password, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(204, 204, 204));
        txt_nombre.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_apellidos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(204, 204, 204));
        txt_apellidos.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_apellidos, gridBagConstraints);

        txt_fechanacimiento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_fechanacimiento.setForeground(new java.awt.Color(204, 204, 204));
        txt_fechanacimiento.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_fechanacimiento, gridBagConstraints);

        txt_altura.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_altura.setForeground(new java.awt.Color(204, 204, 204));
        txt_altura.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_altura, gridBagConstraints);

        txt_peso.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(204, 204, 204));
        txt_peso.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_peso, gridBagConstraints);

        txt_telefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(204, 204, 204));
        txt_telefono.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_telefono, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(204, 204, 204));
        txt_direccion.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_direccion, gridBagConstraints);

        txt_poblacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_poblacion.setForeground(new java.awt.Color(204, 204, 204));
        txt_poblacion.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_poblacion, gridBagConstraints);

        txt_gimnasio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_gimnasio.setForeground(new java.awt.Color(204, 204, 204));
        txt_gimnasio.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_gimnasio, gridBagConstraints);

        txt_rol.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_rol.setForeground(new java.awt.Color(204, 204, 204));
        txt_rol.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_rol, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_imagen.setBackground(new java.awt.Color(204, 204, 204));
        lbl_imagen.setPreferredSize(new java.awt.Dimension(256, 256));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        jPanel2.add(lbl_imagen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lbl_resultado_usuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_usuario.setForeground(new java.awt.Color(0, 255, 0));
        lbl_resultado_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/correcto.png"))); // NOI18N
        lbl_resultado_usuario.setText("USUARIO BORRADO CORRECTAMENTE");
        lbl_resultado_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_resultado_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbl_resultado_usuario, new java.awt.GridBagConstraints());

        lbl_resultado_error.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_error.setForeground(new java.awt.Color(255, 51, 51));
        lbl_resultado_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/incorrecto.png"))); // NOI18N
        lbl_resultado_error.setText("NO SE A BORRADO EL USUARIO");
        lbl_resultado_error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_resultado_error.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(lbl_resultado_error, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar() throws IOException {
        perfil = perfil.get_perfil(id);
        txt_id.setText(String.valueOf(perfil.getId()));
        txt_login.setText(perfil.getLogin());
        txt_password.setText(perfil.getPassword());
        txt_nombre.setText(perfil.getNombre());
        txt_apellidos.setText(perfil.getApellidos());
        txt_fechanacimiento.setText(String.valueOf(perfil.getFechanacimiento()));
        txt_altura.setText(String.valueOf(perfil.getAltura()));
        txt_peso.setText(String.valueOf(perfil.getPeso()));
        txt_telefono.setText(perfil.getTelefono());
        txt_direccion.setText(perfil.getDireccion());
        txt_poblacion.setText(perfil.getPoblacion());
        txt_gimnasio.setText(perfil.getNombre_gimnasio());
        String rol = perfil.getNombre_rol();
        if (rol != null) {
            switch (rol) {
                case "Administrador":
                    txt_rol.setForeground(Color.RED);
                    break;
                case "Monitor":
                    txt_rol.setForeground(Color.YELLOW);
                    break;
                case "Usuario":
                    txt_rol.setForeground(Color.GREEN);
                    break;
                default:
                    String texto_rol = "Desconocido";
                    break;
            }
            txt_rol.setText(rol);
        }
        File fotoFile = perfil.getFoto();
        if (fotoFile != null) {
            ImageIcon icono = null;
            BufferedImage img = ImageIO.read(fotoFile);
            Image imagenEscalada = img.getScaledInstance(256, 256, Image.SCALE_SMOOTH);
            icono = new ImageIcon(imagenEscalada);
            lbl_imagen.setIcon(icono);
        } else {
            lbl_imagen.setIcon(null);
        }
    }

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        m_usuarios usuario = new m_usuarios();
        usuario.setId(Integer.parseInt(txt_id.getText()));
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "BORRAR UN USUARIO ¿SEGURO?", "BORRAR", a);
        if (resultado == 0) {
            if (usuario.delete()) {
                lbl_resultado_usuario.setVisible(true);
                lbl_resultado_error.setVisible(false);
                txt_id.setText("");
                txt_login.setText("");
                txt_password.setText("");
                txt_nombre.setText("");
                txt_apellidos.setText("");
                txt_altura.setText("");
                txt_peso.setText("");
                txt_fechanacimiento.setText("");
                txt_telefono.setText("");
                txt_direccion.setText("");
                txt_poblacion.setText("");
                txt_gimnasio.setText("");
                txt_rol.setText("");
                lbl_imagen.setIcon(null);
            } else {
                lbl_resultado_error.setText("Error al Borrar el usuario.");
                lbl_resultado_error.setVisible(true);
                lbl_resultado_usuario.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_mostrar_usuarios(panelPrincipal, "panel_borrar_usuario"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }//GEN-LAST:event_btn_buscarActionPerformed

    private String getFecha(JDateChooser jd) {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        }
        return null;
    }

    private File byteArrayToFile(byte[] bytes, String fileName) throws IOException {
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        }
        return file;
    }

    private BufferedImage resizeImage(File imageFile, int width, int height) throws IOException {
        BufferedImage originalImage = ImageIO.read(imageFile);
        Image resultingImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();

        return outputImage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_resultado_error;
    private javax.swing.JLabel lbl_resultado_usuario;
    private javax.swing.JLabel txt_altura;
    private javax.swing.JLabel txt_apellidos;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_fechanacimiento;
    private javax.swing.JLabel txt_gimnasio;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_login;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_peso;
    private javax.swing.JLabel txt_poblacion;
    private javax.swing.JLabel txt_rol;
    private javax.swing.JLabel txt_telefono;
    // End of variables declaration//GEN-END:variables
}
