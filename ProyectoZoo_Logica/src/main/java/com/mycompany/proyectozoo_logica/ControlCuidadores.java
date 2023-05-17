/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class ControlCuidadores {
    private IDatos datos;
    public List<Cuidador> recuperarCuidadores(){
         datos=FabricaDatos.dameInstancia();  
        return datos.recuperarCuidadores();
    }
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie){
         datos=FabricaDatos.dameInstancia();  
        return datos.agregarCuidadorEspecieACuidador(id, cuidadorEspecie);
    }
    public Cuidador buscarCuidador(ObjectId id){
        datos=FabricaDatos.dameInstancia();
       return datos.buscarCuidador(id);
    }
    
    
}
