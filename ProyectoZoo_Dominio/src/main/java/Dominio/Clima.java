package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Clima {

    /**
     * Default constructor
     */
    public Clima() {
    }
    private ObjectId id;
    private String nombre;

    public Clima(String nombre) {
        this.nombre = nombre;
    }
    
    public Clima(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Clima other = (Clima) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}