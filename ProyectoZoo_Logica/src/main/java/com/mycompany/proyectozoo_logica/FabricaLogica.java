
package com.mycompany.proyectozoo_logica;

/**
 *
 * @author IVAN
 * 
 */
public class FabricaLogica {
    public static ILogica crearInstancia(){
        return new FachadaLogica();
    }
}
