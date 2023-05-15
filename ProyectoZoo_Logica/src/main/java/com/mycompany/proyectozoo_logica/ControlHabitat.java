
package com.mycompany.proyectozoo_logica;


import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
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
    
    
}
