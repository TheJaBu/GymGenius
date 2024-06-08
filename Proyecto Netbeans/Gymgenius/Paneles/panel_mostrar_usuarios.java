package Paneles;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import modelos.m_usuarios;

/**
 *
 * @author Jaime Bueno Perez
 */
public class panel_mostrar_usuarios extends javax.swing.JPanel {

    private Interfaz.principal panelPrincipal;

    public panel_mostrar_usuarios(Interfaz.principal panelPrincipal, String panelretorno) throws IOException {
        this.panelPrincipal = panelPrincipal;
        initComponents();

        m_usuarios user = new m_usuarios();
        List<m_usuarios> usuarios = user.getAll();

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Login");
        model.addColumn("Password");
        model.addColumn("FechaNacimiento");
        model.addColumn("Altura");
        model.addColumn("Peso");
        model.addColumn("FechaRegistro");
        model.addColumn("DuracionSuscripcion");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        model.addColumn("Poblacion");
        model.addColumn("Gimnasio");
        model.addColumn("Rol");
        model.addColumn("EstadoCuenta");

        table.setModel(model);

        for (int i = 0; i < model.getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            int width = 50;
            for (int j = 0; j < table.getRowCount(); j++) {
                TableCellRenderer renderer = table.getCellRenderer(j, i);
                Component comp = table.prepareRenderer(renderer, j, i);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            column.setPreferredWidth(width);
        }

        for (m_usuarios usuario : usuarios) {
            String nombre = usuario.getNombre();
            Object[] rowData = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellidos(),
                usuario.getLogin(),
                usuario.getPassword(),
                usuario.getFechanacimiento(),
                usuario.getAltura(),
                usuario.getPeso(),
                usuario.getFecharegistro(),
                usuario.getDuracionsuscripcion(),
                usuario.getTelefono(),
                usuario.getDireccion(),
                usuario.getPoblacion(),
                usuario.getGimnasio_id(),
                usuario.getRol_id(),
                usuario.getEstadocuenta()
            };
            model.addRow(rowData);
        }

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada != -1) {
                    int id = (int) table.getValueAt(filaSeleccionada, 0);
                    String nombre = (String) table.getValueAt(filaSeleccionada, 1);
                    String apellidos = (String) table.getValueAt(filaSeleccionada, 2);
                    String login = (String) table.getValueAt(filaSeleccionada, 3);
                    String password = (String) table.getValueAt(filaSeleccionada, 4);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaNacimiento = null;
                    try {
                        fechaNacimiento = (Date) table.getValueAt(filaSeleccionada, 5);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    float altura = (float) table.getValueAt(filaSeleccionada, 6);
                    float peso = (float) table.getValueAt(filaSeleccionada, 7);
                    Date fechaRegistro = null;
                    try {
                        fechaRegistro = (Date) table.getValueAt(filaSeleccionada, 8);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    Date duracionSuscripcion = null;
                    try {
                        duracionSuscripcion = (Date) table.getValueAt(filaSeleccionada, 9);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    String telefono = (String) table.getValueAt(filaSeleccionada, 10);
                    String direccion = (String) table.getValueAt(filaSeleccionada, 11);
                    String poblacion = (String) table.getValueAt(filaSeleccionada, 12);
                    int gimnasio = (int) table.getValueAt(filaSeleccionada, 13);
                    int rol = (int) table.getValueAt(filaSeleccionada, 14);
                    int estadocuenta = (int) table.getValueAt(filaSeleccionada, 15);

                    user.setId(id);
                    user.setNombre(nombre);
                    user.setApellidos(apellidos);
                    user.setLogin(login);
                    user.setPassword(password);
                    user.setFechanacimiento(fechaNacimiento);
                    user.setAltura(altura);
                    user.setPeso(peso);
                    user.setFecharegistro(fechaRegistro);
                    user.setDuracionsuscripcion(duracionSuscripcion);
                    user.setTelefono(telefono);
                    user.setDireccion(direccion);
                    user.setPoblacion(poblacion);
                    user.setGimnasio_id(gimnasio);
                    user.setRol_id(rol);
                    user.setEstadocuenta(estadocuenta);

                    try {
                        if (panelretorno == "panel_perfil_bd") {
                            new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_perfil_bd(panelPrincipal, user));
                        }
                        if (panelretorno == "panel_gestionar_usuario") {
                            new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_gestionar_usuario(panelPrincipal, user));
                        }
                        if (panelretorno == "panel_borrar_usuario") {
                            new Paneles.CambiaPanel(panelPrincipal.getPanel_central(), new panel_borrar_usuario(panelPrincipal, user));
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(panel_mostrar_usuarios.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(panel_mostrar_usuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    panelPrincipal.revalidate();
                    panelPrincipal.repaint();
                }
            }         
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane.setAutoscrolls(true);
        jScrollPane.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "", "", null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Login", "Password", "Fecha Nacimiento", "Altura", "Peso", "Fecha Registro", "Duracion Suscripcion", "Telefono", "Direccion", "Poblacion", "Gimansio", "Rol", "Estado Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        table.setName(""); // NOI18N
        table.setRowHeight(17);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
