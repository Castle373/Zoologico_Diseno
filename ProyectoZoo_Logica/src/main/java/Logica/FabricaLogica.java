
package Logica;

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
