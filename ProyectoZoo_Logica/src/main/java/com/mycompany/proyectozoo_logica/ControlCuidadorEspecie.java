/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.CuidadorEspecie;
import Dominio.Especie;

import java.util.List;

/**
 *
 * @author diego
 */
public class ControlCuidadorEspecie {
    private IDatos datos;
  public boolean guardarCuidadoresEspecie(List<CuidadorEspecie> cuidadores){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardarCuidadoresEspecie(cuidadores);
    }  
  public Especie verificaHabitat(String nombre){
        datos=FabricaDatos.dameInstancia();
        return datos.verificarEspecie(nombre);
       
    }
}
