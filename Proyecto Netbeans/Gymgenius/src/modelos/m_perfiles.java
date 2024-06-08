package modelos;

import bd.bd;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_perfiles extends bd {

    private static final String TABLE = "vw_perfil";

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
    private String nombre_gimnasio;
    private String nombre_rol;

    public m_perfiles() {
    }

    public m_perfiles(String login, String password, String nombre, String apellidos, Date fechanacimiento, float altura, float peso,
            Date fecharegistro, Date duracionsuscripcion, String telefono, String direccion, String poblacion, File foto, int estadocuenta,
            String nombre_gimnasio, String nombre_rol) {
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
        this.nombre_gimnasio = nombre_gimnasio;
        this.nombre_rol = nombre_rol;
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

    public String getNombre_gimnasio() {
        return nombre_gimnasio;
    }

    public void setNombre_gimnasio(String nombre_gimnasio) {
        this.nombre_gimnasio = nombre_gimnasio;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public m_perfiles load(ResultSet rs) throws SQLException, IOException {
        m_perfiles usuario = new m_perfiles();
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
        usuario.setNombre_gimnasio(rs.getString("nombre_gimnasio"));
        usuario.setNombre_rol(rs.getString("nombre_rol"));

        return usuario;
    }

    public m_perfiles get_perfil(int id) throws IOException {
        m_perfiles usuario = new m_perfiles();
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

}
