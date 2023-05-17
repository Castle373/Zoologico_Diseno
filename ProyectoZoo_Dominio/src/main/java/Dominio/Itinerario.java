package Dominio;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * @author Diego Robles Rojas
 */
public class Itinerario {

    /**
     * Default constructor
     */
    public Itinerario() {
    }

    private ObjectId id;
    private String Itinerario;
    private int totalEspecies;
    private int maxVisitantes;
    private float Longitud;
    private int numeroEspecies;
    private List<Zona> zonasParques;
    private List<Recorrido> recorridos;
    private List<Queja> quejas;

    public Itinerario(String Itinerario, int totalEspecies, int maxVisitantes, float Longitud, int numeroEspecies) {
        this.Itinerario = Itinerario;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.Longitud = Longitud;
        this.numeroEspecies = numeroEspecies;
        zonasParques= new ArrayList<>();
        recorridos = new ArrayList<>();
        quejas = new ArrayList<>();
    }
    
    public String getItinerario() {
        return Itinerario;
    }

    public void setItinerario(String Itinerario) {
        this.Itinerario = Itinerario;
    }

   

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float Longitud) {
        this.Longitud = Longitud;
    }

    public int getNumeroEspecies() {
        return numeroEspecies;
    }

    public void setNumeroEspecies(int numeroEspecies) {
        this.numeroEspecies = numeroEspecies;
    }

    public List<Zona> getZonasParques() {
        return zonasParques;
    }

    public void setZonasParques(List<Zona> zonasParques) {
        this.zonasParques = zonasParques;
    }

    
    
    public Itinerario(ObjectId id, int totalEspecies, int maxVisitantes) {
        this.id = id;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    public int getTotalEspecies() {
        return totalEspecies;
    }

    public void setTotalEspecies(int totalEspecies) {
        this.totalEspecies = totalEspecies;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    
    
}