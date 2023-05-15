package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;


/**
 *@author Diego Robles Rojas
 */
public class CuidadorEspecie {

   
    public CuidadorEspecie() {
    }
    private ObjectId id;
    private Date fechaInicioCuidado;
    private Cuidador cuidador;
    private Especie especie;

    public CuidadorEspecie(Date fechaInicioCuidado, Cuidador cuidadorId, Especie especieId) {
        this.fechaInicioCuidado = fechaInicioCuidado;
        this.cuidador = cuidadorId;
        this.especie = especieId;
    }

    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

   

    public Date getFechaInicioCuidado() {
        return fechaInicioCuidado;
    }

    public void setFechaInicioCuidado(Date fechaInicioCuidado) {
        this.fechaInicioCuidado = fechaInicioCuidado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final CuidadorEspecie other = (CuidadorEspecie) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "cargoEspecie{" + "id=" + id + ", fechaInicioCargo=" + fechaInicioCuidado + ", cuidadorId=" + cuidador + ", especieId=" + especie + '}';
    }
    
    

    
    
}