package com.mycompany.proyectozoo_logica;

import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.HabitatOcupada;
import java.util.List;
import org.bson.types.ObjectId;


public interface ILogica
{    
    public boolean recuperaDatosHabitat();
    public boolean recuperaDatosEspecies();
    public Habitat verificaNombreHabitat(String nombre);
    public Especie verificaNombreEspecie(String nombre);
    public Cuidador buscarCuidador(ObjectId id);
    public Habitat buscarHabitat(ObjectId id);
    public boolean guardarHabitat(Habitat habitat);      
    public boolean guardarGuia(Guia guia); 
    public boolean guardarEspecie(Especie especie);
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitat);
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie);
    public void abrirMenu();    
    public boolean guardarHabitatsOcupadas(List<HabitatOcupada> habitatOcupada);
    public boolean guardarCuidadoresEspecies(List<CuidadorEspecie> cuidadoresEspecies);
    
}
