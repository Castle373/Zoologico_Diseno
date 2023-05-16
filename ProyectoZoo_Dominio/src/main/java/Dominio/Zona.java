package Dominio;

/**
 * @author Diego Robles Rojas
 */
public class Zona {

    /**
     * Default constructor
     */
    public Zona() {
    }

    public Zona(String nombre, float extension) {
        this.nombre = nombre;
        this.extension = extension;
    }

    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private float extension;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
