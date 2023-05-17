
package com.mycompany.proyectozoo_logica;

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
}
