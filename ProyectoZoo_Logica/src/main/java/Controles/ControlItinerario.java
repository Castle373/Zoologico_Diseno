
package Controles;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Itinerario;
import java.util.List;

/**
 *
 * @author kuose
 */
public class ControlItinerario {
      private IDatos datos;
    public List<Itinerario> RecuperaItinerario(){
        datos=FabricaDatos.dameInstancia();
        
        return datos.recuperaItinerarios();   
    }
     public Itinerario verificaItinerario(String nombre){
        datos=FabricaDatos.dameInstancia();
        Itinerario i =datos.verificarItinerario(nombre);
        return i;
    }
     public boolean guardarItinerario(Itinerario iti){
        datos=FabricaDatos.dameInstancia();
        return datos.guardarItinerario(iti); 
    }
     public boolean actualizarItinerario(Itinerario iti){
        datos=FabricaDatos.dameInstancia();
        return datos.actualizarItinerario(iti); 
    }
}
