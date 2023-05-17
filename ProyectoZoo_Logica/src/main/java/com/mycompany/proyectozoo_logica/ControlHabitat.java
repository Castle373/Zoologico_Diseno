
package com.mycompany.proyectozoo_logica;


import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Cuidador;
import Dominio.Habitat;
import Dominio.HabitatOcupada;
import java.util.List;
import org.bson.types.ObjectId;

public class ControlHabitat  { 
    private IDatos datos;
            
            
    public Habitat verificaHabitat(String nombre){
        datos=FabricaDatos.dameInstancia();
        Habitat h =datos.verificarHabitat(nombre);
        return h;
    }
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitat){
         datos=FabricaDatos.dameInstancia();  
        return datos.agregarHabitatOcupadaAHabitat(id, habitat);
    }
    public boolean guardarHabitat(Habitat habitat){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardaHabitat(habitat);
    }
    public List<Habitat> recuperarHabitats(){
         datos=FabricaDatos.dameInstancia();  
        return datos.recuperarHabitats();
    }
    public Habitat buscarHabitats(ObjectId id){
        datos=FabricaDatos.dameInstancia();
       return datos.buscarHabitat(id);
    }
    
}
