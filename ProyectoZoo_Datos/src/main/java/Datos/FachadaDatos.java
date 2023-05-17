
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.HabitatOcupada;
import Dominio.Vegetacion;
import Dominio.Zona;
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

    
    
    

}
