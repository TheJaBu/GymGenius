package Paneles;

import Interfaz.login;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import modelos.m_clases;
import modelos.m_gimnasios;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_clases extends javax.swing.JPanel {

    m_clases clase = new m_clases();
    m_usuarios user = new m_usuarios();
    m_gimnasios gym = new m_gimnasios();

    int id_gym;
    int id;
    int indice;
    int n_pagina = 1;
    int[] id_clases;
    private static login log;

    File selectFile;
    Image scaledImage;

    public panel_clases(String login, String password) throws IOException {
        initComponents();
        user = user.get_login(login, password);
        inicializar(user.getGimnasio_id());
        id_gym = user.getGimnasio_id();
    }

    private void inicializar(int id_gym) throws IOException {
        txt_gimnasios.setText(gym.get_gimnasio(id_gym).getNombre());
        switch (id_gym) {
            case 1:
                id_clases = new int[]{1, 2, 3, 4, 5, 6, 7};
                break;
            case 2:
                id_clases = new int[]{4, 5, 6};
                break;
            case 3:
                id_clases = new int[]{2, 3, 6, 7};
                break;
            case 4:
                id_clases = new int[]{1, 2, 3, 4, 5};
                break;
        }
        indice = 0;
        id = id_clases[indice];
        txt_clases_n.setText(n_pagina + "/" + String.valueOf(id_clases.length));
        mostrar();
    }

    private void mostrar() throws IOException {
        clase = clase.get_clase(id);
        txt_nombre.setText(clase.getNombre());
        txt_horarios.setText(clase.getHorarios());
        txt_descripcion.setText(clase.getDescripcion());
        File fotoFile = clase.getFoto();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_horarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        btn_anterior_gym = new javax.swing.JButton();
        btn_siguiente_gym = new javax.swing.JButton();
        txt_gimnasios = new javax.swing.JLabel();
        txt_clases_n = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1050, 660));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Horarios:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 88, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Descripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txt_nombre, gridBagConstraints);

        txt_horarios.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        txt_horarios.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 78, 0);
        jPanel1.add(txt_horarios, gridBagConstraints);

        jScrollPane1.setBorder(null);

        txt_descripcion.setBackground(new java.awt.Color(102, 102, 102));
        txt_descripcion.setColumns(20);
        txt_descripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(204, 204, 204));
        txt_descripcion.setLineWrap(true);
        txt_descripcion.setRows(5);
        txt_descripcion.setWrapStyleWord(true);
        txt_descripcion.setBorder(null);
        txt_descripcion.setPreferredSize(new java.awt.Dimension(300, 115));
        jScrollPane1.setViewportView(txt_descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.ipadx = 450;
        gridBagConstraints.ipady = 220;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 5);
        jPanel1.add(jLabel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 5, 5, 5);
        add(jPanel1, gridBagConstraints);

        btn_anterior.setText("<");
        btn_anterior.setBorderPainted(false);
        btn_anterior.setFocusPainted(false);
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(btn_anterior, gridBagConstraints);

        btn_siguiente.setText(">");
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setFocusPainted(false);
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        add(btn_siguiente, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel3, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_imagen.setBackground(new java.awt.Color(204, 204, 204));
        lbl_imagen.setPreferredSize(new java.awt.Dimension(256, 256));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        jPanel2.add(lbl_imagen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(50, 5, 5, 5);
        add(jPanel2, gridBagConstraints);

        btn_anterior_gym.setText("<<");
        btn_anterior_gym.setBorderPainted(false);
        btn_anterior_gym.setFocusPainted(false);
        btn_anterior_gym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior_gymActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 50, 0);
        add(btn_anterior_gym, gridBagConstraints);

        btn_siguiente_gym.setText(">>");
        btn_siguiente_gym.setBorderPainted(false);
        btn_siguiente_gym.setFocusPainted(false);
        btn_siguiente_gym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente_gymActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 5);
        add(btn_siguiente_gym, gridBagConstraints);

        txt_gimnasios.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txt_gimnasios.setForeground(new java.awt.Color(204, 204, 204));
        txt_gimnasios.setText("Gymnasios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 50, 0);
        add(txt_gimnasios, gridBagConstraints);

        txt_clases_n.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        txt_clases_n.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(txt_clases_n, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        if (indice > 0) {
            indice--;
        } else {
            indice = id_clases.length - 1;
        }
        try {
            id = id_clases[indice];
            txt_clases_n.setText((indice + 1) + "/" + String.valueOf(id_clases.length));
            mostrar();
        } catch (IOException ex) {
            Logger.getLogger(panel_gimnasios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        if (indice < id_clases.length - 1) {
            indice++;
        } else {
            indice = 0;
        }
        try {
            id = id_clases[indice];
            txt_clases_n.setText((indice + 1) + "/" + String.valueOf(id_clases.length));
            mostrar();
        } catch (IOException ex) {
            Logger.getLogger(panel_gimnasios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anterior_gymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior_gymActionPerformed
        try {
            if (id_gym > 1) {
                id_gym--;
            } else {
                id_gym = getTotalGimnasios();
            }
            inicializar(id_gym);
            n_pagina = 1;
            txt_gimnasios.setText(gym.get_gimnasio(id_gym).getNombre());
            txt_clases_n.setText(n_pagina + "/" + String.valueOf(id_clases.length));
            mostrar();
        } catch (IOException ex) {
            Logger.getLogger(panel_clases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_anterior_gymActionPerformed

    private void btn_siguiente_gymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente_gymActionPerformed
        try {
            if (id_gym < getTotalGimnasios()) {
                id_gym++;
            } else {
                id_gym = 1;
            }
            inicializar(id_gym);
            n_pagina = 1;
            txt_gimnasios.setText(gym.get_gimnasio(id_gym).getNombre());
            txt_clases_n.setText(n_pagina + "/" + String.valueOf(id_clases.length));
            mostrar();
        } catch (IOException ex) {
            Logger.getLogger(panel_clases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_siguiente_gymActionPerformed

    private int getTotalGimnasios() {
        return gym.getTotalGimnasios();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_anterior_gym;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_siguiente_gym;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel txt_clases_n;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JLabel txt_gimnasios;
    private javax.swing.JLabel txt_horarios;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables
}
