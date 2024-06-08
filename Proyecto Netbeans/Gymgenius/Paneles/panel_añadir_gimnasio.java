package Paneles;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelos.m_gimnasios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_añadir_gimnasio extends javax.swing.JPanel {

    File selectFile;
    Image scaledImage;
    public panel_añadir_gimnasio() {
        initComponents();
        lbl_resultado_correcto.setVisible(false);
        lbl_resultado_error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        txt_localidad = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_horario = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        txt_codigopostal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_explorar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        txt_rutaimagen = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbl_resultado_correcto = new javax.swing.JLabel();
        lbl_resultado_error = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gimnasio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Localidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Código Postal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Horario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel11, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_nombre.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_direccion.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_direccion, gridBagConstraints);

        txt_ciudad.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_ciudad.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_ciudad, gridBagConstraints);

        txt_localidad.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_localidad.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_localidad, gridBagConstraints);

        txt_telefono.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_telefono.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_telefono, gridBagConstraints);

        txt_horario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_horario.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_horario, gridBagConstraints);

        btn_añadir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_añadir.setText("AÑADIR");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btn_añadir, gridBagConstraints);

        txt_codigopostal.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txt_codigopostal.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txt_codigopostal, gridBagConstraints);

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

        lbl_resultado_correcto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_correcto.setForeground(new java.awt.Color(0, 255, 0));
        lbl_resultado_correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/correcto.png"))); // NOI18N
        lbl_resultado_correcto.setText("GIMNASIO REGISTRADO CORRECTAMENTE");
        lbl_resultado_correcto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_resultado_correcto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbl_resultado_correcto, new java.awt.GridBagConstraints());

        lbl_resultado_error.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_error.setForeground(new java.awt.Color(255, 51, 51));
        lbl_resultado_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/incorrecto.png"))); // NOI18N
        lbl_resultado_error.setText("NO SE A REGISTRADO EL GIMNASIO");
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

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        try {
            m_gimnasios gimnasios = new m_gimnasios();
            if (txt_nombre.getText().isEmpty()) {
                lbl_resultado_error.setText("Indique el nombre.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            gimnasios.setNombre(txt_nombre.getText());
            if (txt_direccion.getText().isEmpty()) {
                lbl_resultado_error.setText("La direccion no puede estar vacía.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            gimnasios.setDireccion(txt_direccion.getText());
            if (txt_ciudad.getText().isEmpty()) {
                lbl_resultado_error.setText("Indique la ciudad.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            gimnasios.setCiudad(txt_ciudad.getText());
            if (txt_localidad.getText().isEmpty()) {
                lbl_resultado_error.setText("Indique la ciudad.");
                lbl_resultado_error.setVisible(true);
                return;
            }
            gimnasios.setLocalidad(txt_localidad.getText());     
            gimnasios.setCodigopostal(Integer.parseInt(txt_codigopostal.getText()));
            gimnasios.setTelefono(txt_telefono.getText());            
            gimnasios.setHorario(txt_horario.getText());
            if (selectFile != null) {
                BufferedImage resizedImage = resizeImage(selectFile, lbl_imagen.getWidth(), lbl_imagen.getHeight());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(resizedImage, "jpg", baos);
                byte[] imagenBytes = baos.toByteArray();
                baos.close();
                File imagenFile = byteArrayToFile(imagenBytes, "imagen_redimensionada.jpg");
                gimnasios.setFoto(imagenFile);
            } else {
                gimnasios.setFoto(null);
            }            
            if (gimnasios.insert()) {
                lbl_resultado_correcto.setVisible(true);
                lbl_resultado_error.setVisible(false);
            } else {
                lbl_resultado_error.setText("Error al insertar el gimnasio.");
                lbl_resultado_error.setVisible(true);
                lbl_resultado_correcto.setVisible(false);
            }

        } catch (IOException ex) {
            Logger.getLogger(panel_añadir_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_explorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_explorarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectFile = fileChooser.getSelectedFile();
            txt_rutaimagen.setText(selectFile.getName());
            try {
                Image img = ImageIO.read(selectFile);
                ImageIcon originalIcon = new ImageIcon(img);
                int lblwidth = lbl_imagen.getWidth();
                int lblheigth = lbl_imagen.getHeight();
                Image scaledImage = originalIcon.getImage().getScaledInstance(lblwidth, lblheigth, Image.SCALE_SMOOTH);
                lbl_imagen.setIcon(new ImageIcon(scaledImage));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }//GEN-LAST:event_btn_explorarActionPerformed

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
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_explorar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_resultado_correcto;
    private javax.swing.JLabel lbl_resultado_error;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_codigopostal;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_horario;
    private javax.swing.JTextField txt_localidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rutaimagen;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
