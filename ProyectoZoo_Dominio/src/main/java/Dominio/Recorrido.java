package Dominio;

/**
 * @author Diego Robles Rojas
 */
public class Recorrido {

    /**
     * Default constructor
     */
    public Recorrido() {
    }

    /**
     * 
     */
    private Horario horario;
    private Guia guia;
    private Itinerario itinerario;

    public Recorrido(Horario horario, Guia guia, Itinerario itinerario) {
        this.horario = horario;
        this.guia = guia;
        this.itinerario = itinerario;
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

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
    
}