
package com.mycompany.proyectozoo_logica;


import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Habitat;
import java.util.List;

public class ControlHabitat  { 
    private IDatos datos;
            
            
    public Habitat verificaHabitat(String nombre){
        datos=FabricaDatos.dameInstancia();
        Habitat h =datos.verificarHabitat(nombre);
        return h;
    }
    
    public boolean guardarHabitat(Habitat habitat){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardaHabitat(habitat);
    }
    public List<Habitat> recuperarHabitats(){
         datos=FabricaDatos.dameInstancia();  
        return datos.recuperarHabitats();
    }
    
}
