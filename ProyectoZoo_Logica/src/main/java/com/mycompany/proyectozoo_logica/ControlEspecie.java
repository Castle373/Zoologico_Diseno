/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Especie;

import java.util.List;

/**
 *
 * @author diego
 */
public class ControlEspecie {
    private IDatos datos;
    public Especie verificaEspecie(String nombre){
//        datos=FabricaDatos.dameInstancia();
//        Especie h =datos.verificarHabitat(nombre);
//        return h;
            return null;
    }
    
    public boolean guardarEspecie(Especie especie){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardaEspecie(especie);
    }
    public List<Especie> recuperarEspecies(){
//         datos=FabricaDatos.dameInstancia();  
//        return datos.recuperarHabitats();
    return null;
    }
}
