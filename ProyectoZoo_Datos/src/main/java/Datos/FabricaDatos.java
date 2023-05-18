
package Datos;

/**
 *
 * @author Diego
 */
public class FabricaDatos {
     public static IDatos dameInstancia(){
        return new FachadaDatos();
    }
}
