
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.HabitatOcupada;
import Dominio.Itinerario;
import Dominio.Vegetacion;
import Dominio.Zona;
import java.util.List;
import org.bson.types.ObjectId;


public interface IDatos 
{
    public List<Clima> recuperarClima();
    
    public List<Continente>recuperarContinente();
    
    public List<Vegetacion> recuperarVegetacion();
    public List<Guia> recuperarGuias();
    public Habitat verificarHabitat(String nombre);
    public Especie verificarEspecie(String nombre);
    public Itinerario verificarItinerario(String nombre);
    public Cuidador buscarCuidador(ObjectId id);
    public Habitat buscarHabitat(ObjectId id);
    public boolean guardaHabitat(Habitat habitat);
    public boolean guardaEspecie(Especie especie);
    public boolean guardarGuia(Guia guia);
    public boolean guardarItinerario(Itinerario itinerario);
    public boolean actualizarItinerario(Itinerario itinerario);
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitat);
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie);
    public boolean guardarHabitats(List<HabitatOcupada> habitatOcupada);
    public boolean guardarCuidadoresEspecie(List<CuidadorEspecie> cuidadoresEspecie);
    
    public List<Zona> recuperarZonas();
    public List<Cuidador> recuperarCuidadores();
    public List<Habitat> recuperarHabitats();
    public List<Itinerario> recuperaItinerarios();
}
