package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * @author Diego Robles Rojas
 */
public class Vegetacion {

    /**
     * Default constructor
     */
    public Vegetacion() {
    }

    /**
     * 
     */
    private String nombre;
    private ObjectId id;

    public Vegetacion(String nombre) {
        this.nombre = nombre;
    }

    public Vegetacion(String nombre, ObjectId id) {
        this.nombre = nombre;
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vegetacion other = (Vegetacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}