package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Guia extends Empleado {

    /**
     * Default constructor
     */
    public Guia() {
    }

    public Guia(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }

    public Guia(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

}
