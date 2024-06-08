package modelos;

import bd.bd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_clases extends bd {

    private static String TABLE = "clases";

    private int id;
    private String nombre;
    private String descripcion;
    private String horarios;
    private File foto;
    private int delete_status;

    public m_clases() {
    }

    public m_clases(String nombre, String descripcion, String horarios, File foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horarios = horarios;
        this.foto = foto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public int getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(int delete_status) {
        this.delete_status = delete_status;
    }

    public m_clases load(ResultSet rs) throws SQLException, IOException {
        m_clases clase = new m_clases();
        clase.setId(rs.getInt("id"));
        clase.setNombre(rs.getString("nombre"));
        clase.setDescripcion(rs.getString("descripcion"));
        clase.setHorarios(rs.getString("horarios"));
        Blob fotoBlob = rs.getBlob("foto");
        if (fotoBlob != null) {
            InputStream inputStream = fotoBlob.getBinaryStream();
            File tempFile = File.createTempFile("temp", ".jpg");
            try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            clase.setFoto(tempFile);
        } else {
            clase.setFoto(null);
        }
        return clase;
    }

    public boolean insert() throws FileNotFoundException {
        String sql = "INSERT INTO " + TABLE + " (nombre, descripcion, horarios, foto) VALUES (?, ?, ?, ?)";
        Connection conn = conectar();
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setString(3, horarios);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(4, fis, (int) foto.length());
            } else {
                pstmt.setNull(4, java.sql.Types.BLOB);
            }
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update() throws FileNotFoundException {
        String sql = "UPDATE " + TABLE + " SET nombre=?, descripcion=?, horarios=?, foto=? WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setString(3, horarios);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(4, fis, (int) foto.length());
            } else {
                pstmt.setNull(4, java.sql.Types.BLOB);
            }
            pstmt.setInt(5, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete() {
        String sql = "DELETE FROM " + TABLE + " WHERE id=?";
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public m_clases get_clase(int id) throws IOException {
        m_clases clase = new m_clases();
        String sql = "SELECT * FROM " + TABLE + " WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                clase = clase.load(rs);
                conn.close();
                return clase;
            } else {
                return clase;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return clase;
        }
    }

    public boolean disable() {
        String sql = "UPDATE " + TABLE + " SET delete_status=1 WHERE id=?";
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean enable() {
        String sql = "UPDATE " + TABLE + " SET delete_status=0 WHERE id=?";
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<m_clases> getAll() throws IOException {
        List<m_clases> clases = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE;
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                m_clases clase = new m_clases();
                clase = clase.load(rs);
                clases.add(clase);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }
}
