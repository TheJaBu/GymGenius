package modelos;

import bd.bd;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_funciones extends bd{
    
    private int id;
    private String nombre;

    public m_funciones() {
    }

    public m_funciones(String nombre) {
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
