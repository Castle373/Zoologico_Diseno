/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectozoo_logica;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Cuidador;
import java.util.List;

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
}
