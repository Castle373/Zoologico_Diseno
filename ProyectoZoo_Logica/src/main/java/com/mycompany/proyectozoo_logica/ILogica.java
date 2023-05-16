package com.mycompany.proyectozoo_logica;

import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import java.util.List;


public interface ILogica
{    
    public boolean recuperaDatosHabitat();
    public boolean recuperaDatosEspecies();
    public Habitat verificaNombreHabitat(String nombre);
    
    public boolean guardarHabitat(Habitat habitat);      
    public boolean guardarGuia(Guia guia); 
    public boolean guardarEspecie(Especie especie);
    public void abrirMenu();      
}
