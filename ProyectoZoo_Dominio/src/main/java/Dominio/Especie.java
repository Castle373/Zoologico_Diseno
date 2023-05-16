package Dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Especie {

    /**
     * Default constructor
     */
    public Especie() {
    }

    
    private ObjectId id;
    private String nombre;
    private String nombreCientifico;
    private String descripcion;
    
    private List<Animal> animales;   
    // esta no estoy seguro
    
    private List<Especialidad> cuidadoresEspecializados;
    private List<CuidadorEspecie> cuidadores;
    
    @JsonIgnore // Para Jackson
    @BsonIgnore // Para el controlador MongoDB Java
    private List<HabitatOcupada> habitatsOcupadas;
    
    public Especie(String nombre, String nombreCientifico, String descripcion) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        animales = new ArrayList<>();
        cuidadoresEspecializados=new ArrayList<>();
        cuidadores= new ArrayList<>();
        habitatsOcupadas =new ArrayList<>();
    }

   

  

    public List<CuidadorEspecie> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(List<CuidadorEspecie> cuidadores) {
        this.cuidadores = cuidadores;
    }
    

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Especialidad> getCuidadoresEspecializados() {
        return cuidadoresEspecializados;
    }

    public void setCuidadoresEspecializados(List<Especialidad> cuidadoresEspecializados) {
        this.cuidadoresEspecializados = cuidadoresEspecializados;
    }

    public List<HabitatOcupada> getHabitatsOcupadas() {
        return habitatsOcupadas;
    }

    public void setHabitatsOcupadas(List<HabitatOcupada> habitatsOcupadas) {
        this.habitatsOcupadas = habitatsOcupadas;
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

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Especie other = (Especie) obj;
        return Objects.equals(this.id, other.id);
    }

    
    
}