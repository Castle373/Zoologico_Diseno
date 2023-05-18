/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

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
        datos=FabricaDatos.dameInstancia();
        Especie e =datos.verificarEspecie(nombre);
        return e;
    }
    
    public boolean guardarEspecie(Especie especie){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardaEspecie(especie);
    }
    public boolean actualizaEspecie(Especie especie){
        datos=FabricaDatos.dameInstancia();
         return  datos.guardaEspecie(especie);
    }
    public List<Especie> recuperarEspecies(){
//       datos=FabricaDatos.dameInstancia();  
//       return datos.r();
    return null;
    }
}
