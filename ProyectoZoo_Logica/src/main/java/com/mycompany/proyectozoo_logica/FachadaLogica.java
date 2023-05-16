package com.mycompany.proyectozoo_logica;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Vegetacion;
import Dominio.Zona;
import com.mycompany.proyectozoo_gui.FrmPrincipal;
import com.mycompany.proyectozoo_gui.frmRegistrarEspecie;
import com.mycompany.proyectozoo_gui.frmRegistrarHabitat;
import java.util.ArrayList;
import java.util.List;

public class FachadaLogica implements ILogica {

    private ControlHabitat controlHabitat;
    private ControlClima controlClima;
    private ControlContinentes controlContinentes;
    private ControlVegetacion controlVegetacion;
    private ControlGuia controlGuia;
    private ControlCuidadores controlCuidadores;
    private ControlZona controlZona;
    private ControlEspecie controlEspecie;
    public FachadaLogica() {
        this.controlHabitat = new ControlHabitat();
        
        this.controlClima = new ControlClima();
        this.controlContinentes = new ControlContinentes();
        this.controlVegetacion = new ControlVegetacion();
        this.controlGuia= new ControlGuia();
        this.controlCuidadores = new ControlCuidadores();
        this.controlZona= new ControlZona();
        this.controlEspecie= new ControlEspecie();
    }

    @Override
    public Habitat verificaNombreHabitat(String nombre) {
        Habitat h =controlHabitat.verificaHabitat(nombre);
        return h;
    }

    @Override
    public boolean guardarHabitat(Habitat habitat) {
        return controlHabitat.guardarHabitat(habitat);
    }

    @Override
    public boolean recuperaDatosHabitat() {

            List<Clima> listaclima=controlClima.RecuperaClima();
            List<Continente> listacon=controlContinentes.RecuperaContinente();
            List<Vegetacion> listavege=controlVegetacion.RecuperaVegetacion();
            if (listaclima.isEmpty()||listacon.isEmpty()||listavege.isEmpty()) {
            return false;
            }
            frmRegistrarHabitat frm = new frmRegistrarHabitat(listacon, listaclima, listavege);
            frm.setVisible(true);
        
        return true;
    }
    @Override
    public boolean recuperaDatosEspecies() {

            List<Cuidador> listacuidador=controlCuidadores.recuperarCuidadores();
            List<Habitat> listahabitat=controlHabitat.recuperarHabitats();
            List<Zona> listaZona=controlZona.recuperarZonas();
            if (listacuidador.isEmpty()||listahabitat.isEmpty()||listaZona.isEmpty()) {
            return false;
            }
            frmRegistrarEspecie frm = new frmRegistrarEspecie(listacuidador, listahabitat, listaZona);
            frm.setVisible(true);
        
        return true;
    }
    
    @Override
    public void abrirMenu() {
       FrmPrincipal frm = new FrmPrincipal();
       frm.setVisible(true);
            
    }

    @Override
    public boolean guardarGuia(Guia guia) {
       return this.controlGuia.guardarGuia(guia);
    }

    @Override
    public boolean guardarEspecie(Especie especie) {
      return controlEspecie.guardarEspecie(especie);
    }

}
