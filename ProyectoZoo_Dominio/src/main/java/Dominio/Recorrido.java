package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Diego Robles Rojas
 */
public class Recorrido {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
    private Horario horario;
    private Guia guia;
    private List<Queja> quejas;
    public Recorrido() {
        this.quejas= new ArrayList<>();
    }
    public Recorrido(Horario horario, Guia guia) {
        this.horario = horario;
        this.guia = guia;
        this.quejas= new ArrayList<>();
    }

    public List<Queja> getQuejas() {
        return quejas;
    }

    public void setQuejas(List<Queja> quejas) {
        this.quejas = quejas;
    }
    public void addQueja(Queja queja) {
        this.quejas.add(queja);
    }
    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.horario);
        hash = 23 * hash + Objects.hashCode(this.guia);
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
        final Recorrido other = (Recorrido) obj;
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return Objects.equals(this.guia, other.guia);
    }

    @Override
    public String toString() {
        return horario.getDia().toString();
    }
 
    
    
}