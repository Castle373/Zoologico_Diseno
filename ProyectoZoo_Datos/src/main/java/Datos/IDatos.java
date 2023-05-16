
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


public interface IDatos 
{
    public List<Clima> recuperarClima();
    
    public List<Continente>recuperarContinente();
    
    public List<Vegetacion> recuperarVegetacion();
    
    public Habitat verificarHabitat(String nombre);
    
    public boolean guardaHabitat(Habitat habitat);
    public boolean guardaEspecie(Especie especie);
    public boolean guardarGuia(Guia guia);
    public List<Zona> recuperarZonas();
    public List<Cuidador> recuperarCuidadores();
    public List<Habitat> recuperarHabitats();
}
