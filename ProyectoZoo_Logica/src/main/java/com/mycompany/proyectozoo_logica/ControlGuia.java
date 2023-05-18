/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Guia;
import Dominio.Vegetacion;
import java.util.List;

/**
 *
 * @author diego
 */
public class ControlGuia {
    private IDatos datos;
    public boolean guardarGuia(Guia guia){
         datos=FabricaDatos.dameInstancia();
        return datos.guardarGuia(guia);
    }
    public List<Guia> recuperarGuias(){
         datos=FabricaDatos.dameInstancia();
        return datos.recuperarGuias();
    }
}
