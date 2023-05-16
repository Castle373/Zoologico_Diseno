
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Vegetacion;
import Dominio.Zona;
import java.util.List;

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
    public FachadaDatos(){
        continente=new ContinenteDAO();
        vegetacion=new VegetacionDAO();
        clima=new ClimaDAO();
        habitat=new HabitatDAO();
        guia= new GuiaDAO();
        zona = new ZonaDAO();
        cuidador = new CuidadorDAO();
        especie= new EspecieDAO();
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
    
    

}
