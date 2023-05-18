/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Clima;
import java.util.List;

/**
 *
 * @author diego
 */
public class ControlClima {
    private IDatos datos;
    public List<Clima> RecuperaClima(){
        datos=FabricaDatos.dameInstancia();
        
        return datos.recuperarClima();
        
    }
}
