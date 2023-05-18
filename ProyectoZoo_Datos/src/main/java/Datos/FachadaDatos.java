
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
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class FachadaDatos implements IDatos
{
    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion; 
    private HabitatDAO habitat;
    private GuiaDAO guia;
    private ZonaDAO zona;
    private CuidadorDAO cuidador;
    private EspecieDAO especie;
    private HabitatOcupaDAO habitatO;
    private CuidadoresEspecieDAO cuidadorEspecie;
    private ItinerarioDAO itinerario;
    public FachadaDatos(){
        continente=new ContinenteDAO();
        vegetacion=new VegetacionDAO();
        clima=new ClimaDAO();
        habitat=new HabitatDAO();
        guia= new GuiaDAO();
        zona = new ZonaDAO();
        cuidador = new CuidadorDAO();
        especie= new EspecieDAO();
        habitatO= new HabitatOcupaDAO();
        cuidadorEspecie= new CuidadoresEspecieDAO();
        itinerario = new ItinerarioDAO();
    }
    @Override
    public List<Clima> recuperarClima() {
     return  clima.buscarTodos();
       
    }

    @Override
    public List<Continente> recuperarContinente() {
       return  continente.buscarTodos();
    }

    @Override
    public List<Vegetacion> recuperarVegetacion() {
         return  vegetacion.buscarTodos();
    }

    @Override
    public Habitat verificarHabitat(String nombre) {
        Habitat h =habitat.buscarPorNombre(nombre);
    return h;
        
    }
    @Override
    public Especie verificarEspecie(String nombre) {
        return this.especie.buscarPorNombre(nombre);
    }
    
    @Override
    public boolean guardaHabitat(Habitat habitat) {
       return this.habitat.guardar(habitat);
    }

    @Override
    public boolean guardarGuia(Guia guia) {
       return this.guia.guardar(guia);
    }

    @Override
    public List<Zona> recuperarZonas() {
        return zona.buscarTodos();
    }

    @Override
    public List<Cuidador> recuperarCuidadores() {
        return cuidador.buscarTodos();
    }

    @Override
    public List<Habitat> recuperarHabitats() {
       return habitat.buscarTodos();
    }

    @Override
    public boolean guardaEspecie(Especie especie) {
      return this.especie.guardar(especie);
    }

    @Override
    public boolean guardarHabitats(List<HabitatOcupada> habitatOcupada) {
      return this.habitatO.guardarMuchos(habitatOcupada);
    }

    @Override
    public boolean guardarCuidadoresEspecie(List<CuidadorEspecie> cuidadoresEspecie) {
        return this.cuidadorEspecie.guardarMuchos(cuidadoresEspecie);
    }

    @Override
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitatO) {
     return this.habitat.agregarHabitatOcupada(id, habitatO);
    }

    @Override
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie) {
        return this.cuidador.agregarCuidadorEspecie(id, cuidadorEspecie);
    }

    @Override
    public Cuidador buscarCuidador(ObjectId id) {
        return cuidador.buscarPorID(id);
    }

    @Override
    public Habitat buscarHabitat(ObjectId id) {
       return habitat.buscarPorID(id);
    }
    @Override
    public List<Itinerario> recuperaItinerarios() {
        return itinerario.buscarTodos();
    }

    @Override
    public List<Guia> recuperarGuias() {
      return guia.buscarTodos();
    }

    @Override
    public Itinerario verificarItinerario(String nombre) {
       return this.itinerario.buscarPorNombre(nombre);
    }

    @Override
    public boolean guardarItinerario(Itinerario iti) {
        return this.itinerario.guardar(iti);
    }

    @Override
    public boolean actualizarItinerario(Itinerario itinerario) {
        return this.itinerario.actualizarItinerario(itinerario);
    }

    @Override
    public void RegistrarDatos() {
        ContinenteDAO con = new ContinenteDAO();
        Continente cona = new Continente("America");
        Continente conaf = new Continente("Africa");
        Continente conaA = new Continente("Asia");
        Continente conaE = new Continente("Europa");
        Continente conaO = new Continente("Oceania");
        con.guardar(cona);
        con.guardar(conaf);
        con.guardar(conaA);
        con.guardar(conaE);
        con.guardar(conaO);

        VegetacionDAO vege = new VegetacionDAO();
        Vegetacion ve = new Vegetacion("Forestado");
        Vegetacion veD = new Vegetacion("Desertica");
        Vegetacion veP = new Vegetacion("Jungla");
        vege.guardar(ve);
        vege.guardar(veD);
        vege.guardar(veP);

        ClimaDAO clima = new ClimaDAO();

        Clima clS = new Clima("Seco");
        Clima clN = new Clima("Humedo");
        Clima clT = new Clima("Templado");

 
        clima.guardar(clS);
        clima.guardar(clN);
        clima.guardar(clT);
        
        Zona zona= new Zona("Zona Reptiles", 10000);
         Zona zona1= new Zona("Zona Felinos", 10000);
          Zona zona2= new Zona("Zona Aves", 10000);
           Zona zona3= new Zona("Zona Acuatica", 10000);
        Cuidador cui = new Cuidador("Diego Robles Rojas", "direccion", "6441271967", new Date());
        ZonaDAO z = new ZonaDAO();
        z.guardar(zona);
        z.guardar(zona1);
        z.guardar(zona2);
        z.guardar(zona3);
        CuidadorDAO C = new CuidadorDAO();
        C.guardar(cui);
           Guia g = new Guia("Gibran Duran Solano", "direccion", "6441271967", new Date());
           GuiaDAO gs = new GuiaDAO();
           gs.guardar(g);
    }
    

}
