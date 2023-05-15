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
    private List<Especialidad> especiesExpecialidadas;
    private List<CuidadorEspecie> especiesCuidadas;
    
    public Cuidador() {
    }
    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
              
        super(id, nombre, direccion, telefono, fechaIngreso);
        especiesExpecialidadas=new ArrayList<>();      
        especiesCuidadas= new ArrayList<>();  
    }

    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        especiesExpecialidadas=new ArrayList<>();      
        especiesCuidadas= new ArrayList<>(); 
    }
    public List<Especialidad> getEspeciesExpecialidadas() {
        return especiesExpecialidadas;
    }

    public void setEspeciesExpecialidadas(List<Especialidad> especiesExpecialidadas) {
        this.especiesExpecialidadas = especiesExpecialidadas;
    }

    public List<CuidadorEspecie> getEspeciesCuidadas() {
        return especiesCuidadas;
    }

    public void setEspeciesCuidadas(List<CuidadorEspecie> especiesCuidadas) {
        this.especiesCuidadas = especiesCuidadas;
    }

    

    /**
     * 
     */
   
    
}