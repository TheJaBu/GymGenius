package Paneles;

import Interfaz.*;
import Paneles.*;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import modelos.m_perfiles;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_perfil extends javax.swing.JPanel {

    m_perfiles perfil = new m_perfiles();
    m_usuarios user = new m_usuarios();

    private static login log;
    File selectFile;
    Image scaledImage;

    public panel_perfil(String login, String password) throws SQLException, IOException {
        initComponents();
        user = user.get_login(login, password);
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_login = new javax.swing.JLabel();
        txt_password = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JLabel();
        txt_fechanacimiento = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_poblacion = new javax.swing.JLabel();
        txt_gimnasio = new javax.swing.JLabel();
        txt_rol = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_suscripcion = new javax.swing.JLabel();
        txt_icm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Apellidos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Altura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Peso:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Población:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel12, gridBagConstraints);

        txt_altura.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_altura.setMinimumSize(new java.awt.Dimension(50, 29));
        txt_altura.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_altura, gridBagConstraints);

        txt_peso.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_peso.setMinimumSize(new java.awt.Dimension(50, 29));
        txt_peso.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_peso, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Gimnasio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Rol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Login:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel15, gridBagConstraints);

        txt_login.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_login.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_login, gridBagConstraints);

        txt_password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_password, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_apellidos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_apellidos, gridBagConstraints);

        txt_fechanacimiento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_fechanacimiento.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_fechanacimiento, gridBagConstraints);

        txt_telefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_telefono, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_direccion, gridBagConstraints);

        txt_poblacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_poblacion.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_poblacion, gridBagConstraints);

        txt_gimnasio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_gimnasio.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_gimnasio, gridBagConstraints);

        txt_rol.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_rol.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_rol, gridBagConstraints);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        jPanel1.add(btn_actualizar, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("ICM:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Duración Suscripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel1.add(jLabel17, gridBagConstraints);

        txt_suscripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_suscripcion.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_suscripcion, gridBagConstraints);

        txt_icm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_icm.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_icm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        user.setAltura(Float.parseFloat(txt_altura.getText()));
        user.setPeso(Float.parseFloat(txt_peso.getText()));
        try {
            if (user.update()) {
                mostrar();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(panel_perfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(panel_perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed
 
    private void mostrar() throws IOException {
        perfil = perfil.get_perfil(user.getId());
        txt_login.setText(perfil.getLogin());
        txt_password.setText(perfil.getPassword());
        txt_nombre.setText(perfil.getNombre());
        txt_apellidos.setText(perfil.getApellidos());
        txt_fechanacimiento.setText(String.valueOf(perfil.getFechanacimiento()));
        txt_altura.setText(String.valueOf(perfil.getAltura()));
        txt_peso.setText(String.valueOf(perfil.getPeso()));
        float altura = Float.parseFloat(txt_altura.getText());
        float peso = Float.parseFloat(txt_peso.getText());
        float imc = peso / (altura * altura);
        String imcFormateado = String.format("%.1f", imc);
        if (imc < 25) {
            txt_icm.setForeground(Color.GREEN);
        }
        if (imc > 25 && imc < 30) {
            txt_icm.setForeground(Color.YELLOW);
        }
        if (imc > 30) {
            txt_icm.setForeground(Color.RED);
        }
        txt_icm.setText(imcFormateado);
        txt_telefono.setText(perfil.getTelefono());
        txt_direccion.setText(perfil.getDireccion());
        txt_poblacion.setText(perfil.getPoblacion());
        txt_gimnasio.setText(perfil.getNombre_gimnasio());
        LocalDate fechaActual = LocalDate.now();
        Date fechaSuscripcion = perfil.getDuracionsuscripcion();
        if (fechaSuscripcion != null) {
            LocalDate fechaSuscripcionLocalDate = fechaSuscripcion.toLocalDate();
            long diasRestantes = ChronoUnit.DAYS.between(fechaActual, fechaSuscripcionLocalDate);

            if (diasRestantes < 0) {
                txt_suscripcion.setText("Suscripción agotada");
                txt_suscripcion.setForeground(Color.RED);
            } else {
                if (diasRestantes == 0) {
                    txt_suscripcion.setText("Ultimo dia");
                    txt_suscripcion.setForeground(Color.ORANGE);
                } else {
                    txt_suscripcion.setText(diasRestantes + " días restantes");
                    txt_suscripcion.setForeground(Color.GREEN);
                }
            }
        } else {            
            txt_suscripcion.setText("Sin suscripción");
            txt_suscripcion.setForeground(Color.YELLOW);
        }

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
    
    private File byteArrayToFile(byte[] bytes, String fileName) throws IOException {
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        }
        return file;
    }
    
    private String getFecha(JDateChooser jd) {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        }
        return null;
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
    private javax.swing.JTextField txt_altura;
    private javax.swing.JLabel txt_apellidos;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_fechanacimiento;
    private javax.swing.JLabel txt_gimnasio;
    private javax.swing.JLabel txt_icm;
    private javax.swing.JLabel txt_login;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_password;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JLabel txt_poblacion;
    private javax.swing.JLabel txt_rol;
    private javax.swing.JLabel txt_suscripcion;
    private javax.swing.JLabel txt_telefono;
    // End of variables declaration//GEN-END:variables
}
