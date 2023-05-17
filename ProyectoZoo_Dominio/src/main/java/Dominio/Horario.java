package Dominio;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;
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

    private Dias dia;
    private String hora;

    public Horario(Dias dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.dia);
        hash = 37 * hash + Objects.hashCode(this.hora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        return this.dia == other.dia;
    }

    @Override
    public String toString() {
        return hora ;
    }

    
    
}