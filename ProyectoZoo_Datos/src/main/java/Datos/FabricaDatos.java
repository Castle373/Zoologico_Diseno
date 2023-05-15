
package Datos;

/**
 *
 * @author IVAN
 */
public class FabricaDatos {
     public static IDatos dameInstancia(){
        return new FachadaDatos();
    }
}
