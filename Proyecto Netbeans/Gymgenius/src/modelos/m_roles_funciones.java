package modelos;

import bd.bd;

/**
 *
 * @author Jaime Bueno Perez
 */
public class m_roles_funciones extends bd{

    private int id;
    private int rol_id;
    private int funcion_id;

    public m_roles_funciones() {
    }

    public m_roles_funciones(int rol_id, int funcion_id) {
        this.rol_id = rol_id;
        this.funcion_id = funcion_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    
}
