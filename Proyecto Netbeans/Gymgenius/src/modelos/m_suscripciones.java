package modelos;

import bd.bd;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_suscripciones extends bd {

    private static String TABLE = "suscripciones";

    private int id;
    private String nombre;
    private float precio;
    private int duracion;

    public m_suscripciones() {
    }

    public m_suscripciones(String nombre, float precio, int duracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public m_suscripciones load(ResultSet rs) throws SQLException, IOException {
        m_suscripciones suscripcion = new m_suscripciones();
        suscripcion.setId(rs.getInt("id"));
        suscripcion.setNombre(rs.getString("nombre"));
        suscripcion.setPrecio(rs.getFloat("precio"));
        suscripcion.setDuracion(rs.getInt("duracion"));
        return suscripcion;
    }

    public m_suscripciones get_suscripcion(int id) throws IOException {
        m_suscripciones suscripcion = new m_suscripciones();
        String sql = "SELECT * FROM " + TABLE + " WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                suscripcion = suscripcion.load(rs);
                conn.close();
                return suscripcion;
            } else {
                return suscripcion;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return suscripcion;
        }
    }

}
