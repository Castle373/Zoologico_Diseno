package Dominio;

import java.time.LocalTime;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 * @author Diego Robles Rojas
 */
public class Horario {

    /**
     * Default constructor
     */
    public Horario() {
    }

    /**
     * 
     */
    private ObjectId id;
    private Dias dia;
    private LocalTime hora;

    public Horario(ObjectId id, Dias dia, LocalTime hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    
    
}