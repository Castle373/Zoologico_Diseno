package Dominio;

import java.util.ArrayList;
import java.util.List;
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

   

    public List<Especialidad> getCuiadadoresExpecialicados() {
        return cuidadoresEspecializados;
    }

    public void setCuiadadoresExpecialicados(List<Especialidad> cuiadadoresExpecialicados) {
        this.cuidadoresEspecializados = cuiadadoresExpecialicados;
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

    
    
}