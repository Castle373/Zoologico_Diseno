/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Continente;
import java.util.List;

/**
 *
 * @author diego
 */
public class ControlContinentes {
    private IDatos datos;
    public List<Continente> RecuperaContinente(){
         datos=FabricaDatos.dameInstancia();
        return datos.recuperarContinente();
    } 
}
