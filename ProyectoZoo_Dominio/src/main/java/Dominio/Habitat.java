package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * @author Diego Robles Rojas
 */
public class Habitat {

    /**
     * Default constructor
     */
    public Habitat() {
    }

    /**
     * 
     */
    private ObjectId id;
    private String nombre;
    private Clima clima;
    private Vegetacion vegetacion;
    private List<Continente> continentes;
    private List<HabitatOcupada> habitatOcupada;

    public Habitat(String nombre, Clima clima, Vegetacion vegetacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = new ArrayList<>();
        this.vegetacion = vegetacion;
        this.habitatOcupada =new ArrayList<>();
    }

    public List<HabitatOcupada> getHabitatOcupada() {
        return habitatOcupada;
    }

    public void setHabitatOcupada(List<HabitatOcupada> habitatOcupada) {
        this.habitatOcupada = habitatOcupada;
    }

   
    public Habitat(String nombre) {
        this.nombre = nombre;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }
    



    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
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
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final Habitat other = (Habitat) obj;
        return Objects.equals(this.id, other.id);
    }

    

    
    
}