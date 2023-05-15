package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Animal{

    /**
     * Default constructor
     */
    public Animal() {
    }
    private ObjectId id;
    private String nombre;
    private boolean sexo;
    private int edad;
    private Especie especie;

    public Animal(ObjectId id, String nombre, boolean sexo, int edad, Especie especieId) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.especie = especieId;
    }

    public Animal(String nombre, boolean sexo, int edad, Especie especieId) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.especie = especieId;
    }

    public Animal(String nombre, boolean sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", nombreCientifico=" + sexo + ", edad=" + edad + '}';
    }
    
    

}
