
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import java.util.List;

public class FachadaDatos implements IDatos
{
    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion; 
    private HabitatDAO habitat;
    public FachadaDatos(){
        continente=new ContinenteDAO();
        vegetacion=new VegetacionDAO();
        clima=new ClimaDAO();
        habitat=new HabitatDAO();
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

}
