package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * @author Diego Robles Rojas
 */
public class Queja {

    /**
     * Default constructor
     */
    public Queja() {
    }

    /**
     * 
     */
    private ObjectId id;
    private String descripcion;
    private Date fecha;
    private String correoElectronico;
    private String telefonoVisitante;
    private String nombreCompletoVisitante;
    

    public Queja(String descripcion, Date fecha, String correoElectronico, String telefonoVisitante, String nombreCompletoVisitante, Recorrido recorrido) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.correoElectronico = correoElectronico;
        this.telefonoVisitante = telefonoVisitante;
        this.nombreCompletoVisitante = nombreCompletoVisitante;
        
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefonoVisitante() {
        return telefonoVisitante;
    }

    public void setTelefonoVisitante(String telefonoVisitante) {
        this.telefonoVisitante = telefonoVisitante;
    }

    public String getNombreCompletoVisitante() {
        return nombreCompletoVisitante;
    }

    public void setNombreCompletoVisitante(String nombreCompletoVisitante) {
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }
    
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}