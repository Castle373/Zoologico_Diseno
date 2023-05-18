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
    

    private ObjectId id;
    private String nombre;
    private int totalEspecies;
    private int maxVisitantes;
    private int longitud;
    private int duracion;
    private List<Zona> zonasParques;
    private List<Recorrido> recorridos;
    

    public Itinerario(String Itinerario, int totalEspecies, int maxVisitantes, int Longitud, int duracion) {
        this.nombre = Itinerario;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.longitud = Longitud;
        this.duracion = duracion;
        zonasParques= new ArrayList<>();
        recorridos = new ArrayList<>();

    }
    public Itinerario() {
        zonasParques= new ArrayList<>();
        recorridos = new ArrayList<>();

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }


    
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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

    @Override
    public String toString() {
        return nombre ;
    }

    
    
}