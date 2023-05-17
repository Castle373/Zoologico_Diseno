/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.CuidadorEspecie;
import Dominio.HabitatOcupada;
import java.util.List;
import org.bson.types.ObjectId;


/**
 *
 * @author diego
 */
public class ControlHabitatOcupada {
 private IDatos datos;
  public boolean guardarHabitat(List<HabitatOcupada> habitat){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardarHabitats(habitat);
    }  
  
}
