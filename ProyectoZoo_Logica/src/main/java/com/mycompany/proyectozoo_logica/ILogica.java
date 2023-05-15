package com.mycompany.proyectozoo_logica;

import Dominio.Habitat;
import java.util.List;


public interface ILogica
{    
    public boolean recuperaDatosHabitat();
    
    public Habitat verificaNombreHabitat(String nombre);
    
    public boolean guardarHabitat(Habitat habitat);      
    public void abrirMenu();      
}
