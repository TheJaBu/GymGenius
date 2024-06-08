package Paneles;

import Interfaz.login;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelos.m_gimnasios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_borrar_gimnasio extends javax.swing.JPanel {

    m_gimnasios gym = new m_gimnasios();
    private Interfaz.principal panelPrincipal;
    private static login log;
    File selectFile;
    Image scaledImage;

    public panel_borrar_gimnasio(Interfaz.principal panelPrincipal, m_gimnasios gym_selec) throws IOException {
        this.panelPrincipal = panelPrincipal;
        initComponents();
        mostrarDatos(gym_selec);
        lbl_resultado_correcto.setVisible(false);
        lbl_resultado_error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JLabel();
        txt_localidad = new javax.swing.JLabel();
        txt_codigopostal = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_horario = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Localidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Código Postal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Horario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        btn_borrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btn_borrar, gridBagConstraints);

        btn_buscar.setText("BUSCAR GIMNASIO");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btn_buscar, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(jLabel15, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_direccion, gridBagConstraints);

        txt_ciudad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_ciudad.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_ciudad, gridBagConstraints);

        txt_localidad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_localidad.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_localidad, gridBagConstraints);

        txt_codigopostal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_codigopostal.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_codigopostal, gridBagConstraints);

        txt_telefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_telefono, gridBagConstraints);

        txt_horario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_horario.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(txt_horario, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("ID: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel16, gridBagConstraints);

        txt_id.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_id, gridBagConstraints);

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
        lbl_imagen.setPreferredSize(new java.awt.Dimension(128, 128));
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

        lbl_resultado_correcto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_correcto.setForeground(new java.awt.Color(0, 255, 0));
        lbl_resultado_correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/correcto.png"))); // NOI18N
        lbl_resultado_correcto.setText("GIMNASIO BORRADO CORRECTAMENTE");
        lbl_resultado_correcto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_resultado_correcto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbl_resultado_correcto, new java.awt.GridBagConstraints());

        lbl_resultado_error.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_resultado_error.setForeground(new java.awt.Color(255, 51, 51));
        lbl_resultado_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/incorrecto.png"))); // NOI18N
        lbl_resultado_error.setText("NO SE A BORRADO EL GIMNASIO");
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

    public void mostrarDatos(m_gimnasios gym_s) throws IOException {
        if (gym_s != null) {
            txt_id.setText(String.valueOf(gym_s.getId()));
            txt_id.setText(String.valueOf(gym_s.getId()));
            txt_nombre.setText(gym_s.getNombre());
            txt_direccion.setText(gym_s.getDireccion());
            txt_ciudad.setText(gym_s.getCiudad());
            txt_localidad.setText(gym_s.getLocalidad());
            txt_codigopostal.setText(String.valueOf(gym_s.getCodigopostal()));
            txt_telefono.setText(gym_s.getTelefono());
            txt_horario.setText(gym_s.getHorario());
            m_gimnasios gymFoto = new m_gimnasios();
            gymFoto = gymFoto.get_gimnasio(gym_s.getId());
            File fotoFile = gymFoto.getFoto();
            if (fotoFile != null) {
                ImageIcon icono = null;
                BufferedImage img = ImageIO.read(fotoFile);
                Image imagenEscalada = img.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
                icono = new ImageIcon(imagenEscalada);
                lbl_imagen.setIcon(icono);
            } else {
                lbl_imagen.setIcon(null);
            }
        }
    }

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        try {
            m_gimnasios gimnasio = new m_gimnasios();            
            gimnasio = gimnasio.get_gimnasio(Integer.parseInt(txt_id.getText()));            
            int a = JOptionPane.YES_NO_OPTION;
            int resultado = JOptionPane.showConfirmDialog(this, "BORRAR UN GIMNASIO ¿SEGURO?", "BORRAR", a);
            if (resultado == 0) {
                if (gimnasio.delete()) {
                    lbl_resultado_correcto.setVisible(true);
                    lbl_resultado_error.setVisible(false);
                    txt_nombre.setText("");
                    txt_direccion.setText("");
                    txt_ciudad.setText("");
                    txt_localidad.setText("");
                    txt_codigopostal.setText("");
                    txt_telefono.setText("");
                    txt_horario.setText("");
                    lbl_imagen.setIcon(null);
                } else {
                    lbl_resultado_error.setText("Error al Borrar el gimnasio.");
                    lbl_resultado_error.setVisible(true);
                    lbl_resultado_correcto.setVisible(false);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(panel_borrar_gimnasio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_mostrar_gimnasios(panelPrincipal, "panel_borrar_gimnasio"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }//GEN-LAST:event_btn_buscarActionPerformed

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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_resultado_correcto;
    private javax.swing.JLabel lbl_resultado_error;
    private javax.swing.JLabel txt_ciudad;
    private javax.swing.JLabel txt_codigopostal;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_horario;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_localidad;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_telefono;
    // End of variables declaration//GEN-END:variables
}
