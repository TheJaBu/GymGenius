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
public class m_gimnasios extends bd {

    private static String TABLE = "gimnasios";

    private int id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String localidad;
    private int codigopostal;
    private String telefono;
    private String horario;
    private File foto;
    private int delete_status;

    public m_gimnasios() {
    }

    public m_gimnasios(String nombre, String direccion, String ciudad, String localidad, int codigopostal, String telefono, String horario, File foto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.codigopostal = codigopostal;
        this.telefono = telefono;
        this.horario = horario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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

    public m_gimnasios load(ResultSet rs) throws SQLException, IOException {
        m_gimnasios gimnasios = new m_gimnasios();
        gimnasios.setId(rs.getInt("id"));
        gimnasios.setNombre(rs.getString("nombre"));
        gimnasios.setDireccion(rs.getString("direccion"));
        gimnasios.setCiudad(rs.getString("ciudad"));
        gimnasios.setLocalidad(rs.getString("localidad"));
        gimnasios.setCodigopostal(rs.getInt("codigopostal"));
        gimnasios.setTelefono(rs.getString("telefono"));
        gimnasios.setHorario(rs.getString("horario"));
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
            gimnasios.setFoto(tempFile);
        } else {
            gimnasios.setFoto(null);
        }
        return gimnasios;
    }

    public boolean insert() throws FileNotFoundException {
        String sql = "INSERT INTO " + TABLE + " (nombre, direccion, ciudad, localidad, codigopostal, telefono, horario, foto) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = conectar();
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, direccion);
            pstmt.setString(3, ciudad);
            pstmt.setString(4, localidad);
            pstmt.setInt(5, codigopostal);
            pstmt.setString(6, telefono);
            pstmt.setString(7, horario);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(8, fis, (int) foto.length());
            } else {
                pstmt.setNull(8, java.sql.Types.BLOB);
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
        String sql = "UPDATE " + TABLE + " SET nombre=?, direccion=?, ciudad=?, localidad=?, codigopostal=?, telefono=?, horario=?, foto=? WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, direccion);
            pstmt.setString(3, ciudad);
            pstmt.setString(4, localidad);
            pstmt.setInt(5, codigopostal);
            pstmt.setString(6, telefono);
            pstmt.setString(7, horario);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(8, fis, (int) foto.length());
            } else {
                pstmt.setNull(8, java.sql.Types.BLOB);
            }
            pstmt.setInt(9, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public m_gimnasios get_gimnasio(int id) throws IOException {
        m_gimnasios gimnasio = new m_gimnasios();
        String sql = "SELECT * FROM " + TABLE + " WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                gimnasio = gimnasio.load(rs);
                conn.close();
                return gimnasio;
            } else {
                return gimnasio;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return gimnasio;
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

    public List<m_gimnasios> getAll() throws IOException {
        List<m_gimnasios> gimnasios = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE;
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                m_gimnasios gimnasio = new m_gimnasios();
                gimnasio = gimnasio.load(rs);
                gimnasios.add(gimnasio);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gimnasios;
    }

    public int getTotalGimnasios() {
        int total = 0;
        String sql = "SELECT COUNT(*) AS total FROM " + TABLE;
        try {
            Connection conn = conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }

}
