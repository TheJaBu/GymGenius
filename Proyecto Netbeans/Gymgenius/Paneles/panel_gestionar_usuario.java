package Paneles;

import Interfaz.login;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_gestionar_usuario extends javax.swing.JPanel {

    m_usuarios user = new m_usuarios();

    private Interfaz.principal panelPrincipal;
    private static login log;
    File selectFile;
    Image scaledImage;

    public panel_gestionar_usuario(Interfaz.principal panelPrincipal, m_usuarios user_selec) throws IOException {
        this.panelPrincipal = panelPrincipal;
        initComponents();
        mostrarDatos(user_selec);
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
        txt_login = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_poblacion = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        txt_gimnasio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_rol = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_fechanacimiento = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_suscripcion = new javax.swing.JLabel();
        btn_baja = new javax.swing.JButton();
        btn_suscripcion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_explorar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        txt_rutaimagen = new javax.swing.JTextField();
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

        txt_login.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_login.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_login, gridBagConstraints);

        txt_password.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_password.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_password, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_nombre.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_apellidos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_apellidos.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_apellidos, gridBagConstraints);

        txt_altura.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_altura.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_altura, gridBagConstraints);

        txt_peso.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_peso.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_peso, gridBagConstraints);

        txt_telefono.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_telefono.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_telefono, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_direccion.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_direccion, gridBagConstraints);

        txt_poblacion.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_poblacion.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_poblacion, gridBagConstraints);

        btn_actualizar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 114, 5, 5);
        jPanel1.add(btn_actualizar, gridBagConstraints);

        txt_gimnasio.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_gimnasio.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_gimnasio, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Gimnasio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel13, gridBagConstraints);

        txt_rol.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_rol.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_rol, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Rol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel14, gridBagConstraints);

        txt_fechanacimiento.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_fechanacimiento, gridBagConstraints);

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

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Duración Suscripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel17, gridBagConstraints);

        txt_suscripcion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_suscripcion.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(txt_suscripcion, gridBagConstraints);

        btn_baja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_baja.setText("DAR DE BAJA");
        btn_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btn_baja, gridBagConstraints);

        btn_suscripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_suscripcion.setText("RENOVAR SUSCRIPCION");
        btn_suscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suscripcionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btn_suscripcion, gridBagConstraints);

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

        btn_explorar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_explorar.setText("Explorar");
        btn_explorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_explorarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(btn_explorar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Imagen Seleccionada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        lbl_imagen.setBackground(new java.awt.Color(204, 204, 204));
        lbl_imagen.setPreferredSize(new java.awt.Dimension(128, 128));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        jPanel2.add(lbl_imagen, gridBagConstraints);

        txt_rutaimagen.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_rutaimagen.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(txt_rutaimagen, gridBagConstraints);

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
        lbl_resultado_usuario.setText("USUARIO ACTUALIZADO CORRECTAMENTE");
        lbl_resultado_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_resultado_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbl_resultado_usuario, new java.awt.GridBagConstraints());

        lbl_resultado_error.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_error.setForeground(new java.awt.Color(255, 51, 51));
        lbl_resultado_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/incorrecto.png"))); // NOI18N
        lbl_resultado_error.setText("NO SE A ACTUALIZADO EL USUARIO");
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

    public void mostrarDatos(m_usuarios user_s) throws IOException {
        if (user_s != null) {
            txt_id.setText(String.valueOf(user_s.getId()));
            txt_login.setText(user_s.getLogin());
            txt_password.setText(user_s.getPassword());
            txt_nombre.setText(user_s.getNombre());
            txt_apellidos.setText(user_s.getApellidos());
            Date fechaNacimientoSQL = user_s.getFechanacimiento();
            if (fechaNacimientoSQL != null) {
                Instant instant = Instant.ofEpochMilli(fechaNacimientoSQL.getTime());
                LocalDate fechaNacimiento = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                Calendar calendar = Calendar.getInstance();
                calendar.set(fechaNacimiento.getYear(), fechaNacimiento.getMonthValue() - 1, fechaNacimiento.getDayOfMonth());
                txt_fechanacimiento.setDate(calendar.getTime());
            }
            txt_altura.setText(String.valueOf(user_s.getAltura()));
            txt_peso.setText(String.valueOf(user_s.getPeso()));
            txt_telefono.setText(user_s.getTelefono());
            txt_direccion.setText(user_s.getDireccion());
            txt_poblacion.setText(user_s.getPoblacion());
            txt_gimnasio.setText(String.valueOf(user_s.getGimnasio_id()));
            txt_rol.setText(String.valueOf(user_s.getRol_id()));
            m_usuarios usuFoto = new m_usuarios();
            usuFoto = usuFoto.get_login(user_s.getLogin(), user_s.getPassword());
            File fotoFile = usuFoto.getFoto();
            if (fotoFile != null) {
                ImageIcon icono = null;
                BufferedImage img = ImageIO.read(fotoFile);
                Image imagenEscalada = img.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
                icono = new ImageIcon(imagenEscalada);
                lbl_imagen.setIcon(icono);
            } else {
                lbl_imagen.setIcon(null);
            }
            LocalDate fechaActual = LocalDate.now();
            java.sql.Date fechaSuscripcion = user_s.getDuracionsuscripcion();
            if (fechaSuscripcion != null) {
                java.util.Date fechaUtil = new java.util.Date(fechaSuscripcion.getTime());
                LocalDate fechaSuscripcionLocalDate = fechaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                long diasRestantes = ChronoUnit.DAYS.between(fechaActual, fechaSuscripcionLocalDate);
                if (diasRestantes < 0) {
                    txt_suscripcion.setText("Agotada");
                    txt_suscripcion.setForeground(Color.RED);
                } else {
                    txt_suscripcion.setText(diasRestantes + " días restantes");
                    txt_suscripcion.setForeground(Color.GREEN);
                }
            } else if (fechaSuscripcion == null && Integer.parseInt(txt_id.getText()) > 0) {
                txt_suscripcion.setText("Sin suscripción");
                txt_suscripcion.setForeground(Color.YELLOW);
            }
        }
    }

    private void btn_explorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_explorarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                selectFile = fileChooser.getSelectedFile();
                txt_rutaimagen.setText(selectFile.getName());
                Image img = ImageIO.read(selectFile);
                ImageIcon originalIcon = new ImageIcon(img);
                int lblwidth = lbl_imagen.getWidth();
                int lblheigth = lbl_imagen.getHeight();
                Image scaledImage = originalIcon.getImage().getScaledInstance(lblwidth, lblheigth, Image.SCALE_SMOOTH);
                lbl_imagen.setIcon(new ImageIcon(scaledImage));
            } catch (IOException ex) {
                Logger.getLogger(panel_gestionar_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_explorarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        try {
            m_usuarios usuario = new m_usuarios();
            usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
            if (txt_login == null) {
                lbl_resultado_error.setText("El login no puede estar vacío.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setLogin(txt_login.getText());
            if (txt_password == null) {
                lbl_resultado_error.setText("El password no puede estar vacío.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setPassword(txt_password.getText());
            if (txt_nombre == null) {
                lbl_resultado_error.setText("El nombre no puede estar vacío.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setNombre(txt_nombre.getText());
            usuario.setApellidos(txt_apellidos.getText());
            Date fecha = txt_fechanacimiento.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaStr = formato.format(fecha);
            Date fechaFormateada = formato.parse(fechaStr);
            if (fecha == null) {
                lbl_resultado_error.setText("La fecha de nacimiento no puede estar vacía.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setFechanacimiento(new java.sql.Date(fecha.getTime()));
            usuario.setAltura(Float.parseFloat(txt_altura.getText()));
            usuario.setPeso(Float.parseFloat(txt_peso.getText()));
            usuario.setTelefono(txt_telefono.getText());
            usuario.setDireccion(txt_direccion.getText());
            usuario.setPoblacion(txt_poblacion.getText());
            if (selectFile != null) {
                BufferedImage resizedImage = resizeImage(selectFile, 256, 256);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(resizedImage, "jpg", baos);
                byte[] imagenBytes = baos.toByteArray();
                baos.close();
                File imagenFile = byteArrayToFile(imagenBytes, "imagen_redimensionada.jpg");
                usuario.setFoto(imagenFile);
            } else {
                if (usuario.getFoto() == null) {
                    usuario.setFoto(null);
                }
            }
            if (txt_gimnasio == null) {
                lbl_resultado_error.setText("Tienes que indicar un gimnasio");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setGimnasio_id(Integer.parseInt(txt_gimnasio.getText()));
            if (txt_rol == null) {
                lbl_resultado_error.setText("Tienes que indicar el rol");
                lbl_resultado_error.setVisible(true);
                return;
            }
            usuario.setRol_id(Integer.parseInt(txt_rol.getText()));
            if (usuario.update()) {
                lbl_resultado_usuario.setVisible(true);
                lbl_resultado_error.setVisible(false);
            } else {
                lbl_resultado_error.setText("Error al actualizar el usuario.");
                lbl_resultado_error.setVisible(true);
                lbl_resultado_usuario.setVisible(false);
            }
        } catch (ParseException ex) {
            Logger.getLogger(panel_gestionar_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(panel_gestionar_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_mostrar_usuarios(panelPrincipal, "panel_gestionar_usuario"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaActionPerformed
        try {
            m_usuarios usuario = new m_usuarios();
            usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
            if (usuario.baja()) {
                usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
                mostrarDatos(usuario);
            }            
        } catch (IOException ex) {
            Logger.getLogger(panel_gestionar_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_bajaActionPerformed

    private void btn_suscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suscripcionActionPerformed
        try {
            m_usuarios usuario = new m_usuarios();
            usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));

            Object[] options = {"Mensual", "Trimestral", "Anual"};
            int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción de pago:", "Selección de Pago", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch (seleccion) {
                case 0:
                    if (usuario.alta(1)) {
                        usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
                        mostrarDatos(usuario);
                    }
                    break;
                case 1:
                    if (usuario.alta(2)) {
                        usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
                        mostrarDatos(usuario);
                    }
                    break;
                case 2:
                    if (usuario.alta(3)) {
                        usuario = usuario.get_usuario(Integer.parseInt(txt_id.getText()));
                        mostrarDatos(usuario);
                    }
                    break;
                default:
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(panel_gestionar_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_suscripcionActionPerformed

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
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_baja;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_explorar;
    private javax.swing.JButton btn_suscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private com.toedter.calendar.JDateChooser txt_fechanacimiento;
    private javax.swing.JTextField txt_gimnasio;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_poblacion;
    private javax.swing.JTextField txt_rol;
    private javax.swing.JTextField txt_rutaimagen;
    private javax.swing.JLabel txt_suscripcion;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
