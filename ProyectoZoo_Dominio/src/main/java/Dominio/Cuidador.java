package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Cuidador extends Empleado {

    /**
     * Default constructor
     */
    private List<Especialidad> especialidad;
    private List<CuidadorEspecie> cuidadorEspecie;
    
    public Cuidador() {
    }
    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
              
        super(id, nombre, direccion, telefono, fechaIngreso);
        especialidad=new ArrayList<>();      
        cuidadorEspecie= new ArrayList<>();  
    }

    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        especialidad=new ArrayList<>();      
        cuidadorEspecie= new ArrayList<>(); 
    }
    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    public List<CuidadorEspecie> getCuidadorEspecie() {
        return cuidadorEspecie;
    }

    public void setCuidadorEspecie(List<CuidadorEspecie> cuidadorEspecie) {
        this.cuidadorEspecie = cuidadorEspecie;
    }

    

    /**
     * 
     */
   
    
}