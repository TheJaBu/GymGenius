package modelos;

import bd.bd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_usuarios extends bd {

    private static final String TABLE = "usuarios";

    private int id;
    private String login;
    private String password;
    private String nombre;
    private String apellidos;
    private Date fechanacimiento;
    private float altura;
    private float peso;
    private Date fecharegistro;
    private Date duracionsuscripcion;
    private String telefono;
    private String direccion;
    private String poblacion;
    private File foto;
    private int estadocuenta;
    private int gimnasio_id;
    private int rol_id;

    public m_usuarios() {
    }

    public m_usuarios(String login, String password, String nombre, String apellidos, Date fechanacimiento, float altura, float peso,
            Date fecharegistro, Date duracionsuscripcion, String telefono, String direccion, String poblacion, File foto, int estadocuenta,
            int gimnasio_id, int rol_id) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.altura = altura;
        this.peso = peso;
        this.fecharegistro = fecharegistro;
        this.duracionsuscripcion = duracionsuscripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.foto = foto;
        this.estadocuenta = estadocuenta;
        this.gimnasio_id = gimnasio_id;
        this.rol_id = rol_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public Date getDuracionsuscripcion() {
        return duracionsuscripcion;
    }

    public void setDuracionsuscripcion(Date duracionsuscripcion) {
        this.duracionsuscripcion = duracionsuscripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public int getEstadocuenta() {
        return estadocuenta;
    }

    public void setEstadocuenta(int estadocuenta) {
        this.estadocuenta = estadocuenta;
    }

    public int getGimnasio_id() {
        return gimnasio_id;
    }

    public void setGimnasio_id(int gimnasio_id) {
        this.gimnasio_id = gimnasio_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public m_usuarios load(ResultSet rs) throws SQLException, IOException {
        m_usuarios usuario = new m_usuarios();
        usuario.setId(rs.getInt("id"));
        usuario.setLogin(rs.getString("login"));
        usuario.setPassword(rs.getString("password"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setApellidos(rs.getString("apellidos"));
        usuario.setFechanacimiento(rs.getDate("fechanacimiento"));
        usuario.setAltura(rs.getFloat("altura"));
        usuario.setPeso(rs.getFloat("peso"));
        usuario.setFecharegistro(rs.getDate("fecharegistro"));
        usuario.setDuracionsuscripcion(rs.getDate("duracionsuscripcion"));
        usuario.setTelefono(rs.getString("telefono"));
        usuario.setDireccion(rs.getString("direccion"));
        usuario.setPoblacion(rs.getString("poblacion"));
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
            usuario.setFoto(tempFile);
        } else {
            usuario.setFoto(null);
        }
        usuario.setEstadocuenta(rs.getInt("estadocuenta"));
        usuario.setGimnasio_id(rs.getInt("gimnasio_id"));
        usuario.setRol_id(rs.getInt("rol_id"));
        return usuario;
    }

    public boolean insert() throws FileNotFoundException, IOException {
        String sql = "INSERT INTO " + TABLE + " (login, password, nombre, apellidos, fechanacimiento, altura, peso, fecharegistro, telefono, direccion,"
                + "poblacion, foto, gimnasio_id, rol_id, estadocuenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = conectar();
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            pstmt.setString(3, nombre);
            pstmt.setString(4, apellidos);
            pstmt.setDate(5, fechanacimiento);
            pstmt.setFloat(6, altura);
            pstmt.setFloat(7, peso);
            pstmt.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
            pstmt.setString(9, telefono);
            pstmt.setString(10, direccion);
            pstmt.setString(11, poblacion);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(12, fis, (int) foto.length());
            } else {
                pstmt.setNull(12, java.sql.Types.BLOB);
            }
            pstmt.setInt(13, gimnasio_id);
            pstmt.setInt(14, rol_id);
            pstmt.setInt(15, 1);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update() throws FileNotFoundException {
        String sql = "UPDATE " + TABLE + " SET login=?, password=?, nombre=?, apellidos=?, fechanacimiento=?, altura=?, peso=?, fecharegistro=?, telefono=?, direccion=?,"
                + "poblacion=?, foto=?, gimnasio_id=?, rol_id=?, duracionsuscripcion=?, estadocuenta=? WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            pstmt.setString(3, nombre);
            pstmt.setString(4, apellidos);
            pstmt.setDate(5, fechanacimiento);
            pstmt.setFloat(6, altura);
            pstmt.setFloat(7, peso);
            pstmt.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
            pstmt.setString(9, telefono);
            pstmt.setString(10, direccion);
            pstmt.setString(11, poblacion);
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                pstmt.setBinaryStream(12, fis, (int) foto.length());
            } else {
                pstmt.setNull(12, java.sql.Types.BLOB);
            }
            pstmt.setInt(13, gimnasio_id);
            pstmt.setInt(14, rol_id);
            pstmt.setDate(15, duracionsuscripcion);
            pstmt.setInt(16, estadocuenta);
            pstmt.setInt(17, id);
            int rowsAffected = pstmt.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public m_usuarios get_login(String login, String password) throws IOException {
        m_usuarios usuario = new m_usuarios();
        String sql = "SELECT * FROM " + TABLE + " WHERE login LIKE ? and password LIKE ?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                usuario = usuario.load(rs);
                return usuario;
            } else {
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return usuario;
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

    public boolean baja() {
        String sql = "UPDATE " + TABLE + " SET estadocuenta=0, duracionsuscripcion=null WHERE id=?";
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

    public boolean alta(int suscripcion_id) {
        String sqlSelect = "SELECT duracionsuscripcion FROM " + TABLE + " WHERE id=?";
        String sqlUpdate = "UPDATE " + TABLE + " SET duracionsuscripcion=?, estadocuenta=1 WHERE id=?";
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
                PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
            pstmtSelect.setInt(1, id);
            ResultSet rs = pstmtSelect.executeQuery();
            Date duracionActual = null;
            if (rs.next()) {
                duracionActual = rs.getDate("duracionsuscripcion");
            }
            Date duracionNueva = Date.valueOf(LocalDate.now().plusMonths(get_tiemposuscripcion(suscripcion_id)));
            if (duracionActual != null) {
                duracionNueva = Date.valueOf(duracionActual.toLocalDate().plusMonths(get_tiemposuscripcion(suscripcion_id)));
            }
            pstmtUpdate.setDate(1, duracionNueva);
            pstmtUpdate.setInt(2, id);
            int rowsAffected = pstmtUpdate.executeUpdate();
            conn.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int get_tiemposuscripcion(int idsuscripcion) {
        int suscripcion = 0;
        String sql = "SELECT * FROM suscripciones WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idsuscripcion);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {           
                suscripcion = rs.getInt("duracion");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return suscripcion;
    }

    public m_usuarios get_usuario(int id) throws IOException {
        m_usuarios usuario = new m_usuarios();
        String sql = "SELECT * FROM " + TABLE + " WHERE id=?";
        try (
                Connection conn = conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                usuario = usuario.load(rs);
                return usuario;
            } else {
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return usuario;
        }
    }

    public List<m_usuarios> getAll() throws IOException {
        List<m_usuarios> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE;
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                m_usuarios usuario = new m_usuarios();
                usuario = usuario.load(rs);
                usuarios.add(usuario);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public List<m_usuarios> getAllDisabled() throws IOException {
        List<m_usuarios> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE + " WHERE estadocuenta = 0";
        try (
                Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                m_usuarios usuario = new m_usuarios();
                usuario = usuario.load(rs);
                usuarios.add(usuario);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public int getTotalUsuarios() {
        int total = 0;
        String sql = "SELECT COUNT(*) AS total FROM " + TABLE;
        try {
            Connection conn = conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
}
