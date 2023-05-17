
package com.mycompany.proyectozoo_logica;

/**
 *
 * @author diego
 * 
 */
public class FabricaLogica {
    public static ILogica crearInstancia(){
        return new FachadaLogica();
    }
}
