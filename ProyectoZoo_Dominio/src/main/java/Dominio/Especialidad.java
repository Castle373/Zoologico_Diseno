package Dominio;

import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Especialidad {

    /**
     * Default constructor
     */
    public Especialidad() {
    }

    private ObjectId id;
    private boolean conocimientosExpertos;
    private Cuidador cuidador;
    private Especie especie;

    public Especialidad(boolean conocimientosExpertos, Cuidador cuidador, Especie especie) {
        this.conocimientosExpertos = conocimientosExpertos;
        this.cuidador = cuidador;
        this.especie = especie;
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

    
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public boolean isConocimientosExpertos() {
        return conocimientosExpertos;
    }

    public void setConocimientosExpertos(boolean conocimientosExpertos) {
        this.conocimientosExpertos = conocimientosExpertos;
    }

}
