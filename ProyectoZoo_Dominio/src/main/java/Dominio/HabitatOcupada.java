/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author Diego Robles Rojas
 */
public class HabitatOcupada {
    private ObjectId id;
    private Habitat habitat;
    private Especie especie;

    public HabitatOcupada(Habitat habitat, Especie especie) {
        this.habitat = habitat;
        this.especie = especie;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
    
    
    
}
