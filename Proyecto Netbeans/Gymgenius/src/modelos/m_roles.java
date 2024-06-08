package modelos;

import bd.bd;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_roles extends bd{

    private int id;
    private String nombre;

    public m_roles() {
    }

    public m_roles(String nombre) {
        this.nombre = nombre;
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

    
}
