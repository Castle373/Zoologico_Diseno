package com.mycompany.proyectozoo_logica;

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

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class FachadaLogica implements ILogica {

    private ControlHabitat controlHabitat;
    private ControlClima controlClima;
    private ControlContinentes controlContinentes;
    private ControlVegetacion controlVegetacion;
    private ControlGuia controlGuia;
    private ControlCuidadores controlCuidadores;
    private ControlZona controlZona;
    private ControlEspecie controlEspecie;
    private ControlHabitatOcupada controlHabitatO;
    private ControlCuidadorEspecie controlCuidadorEspecie;
    private ControlItinerario controlitinerario;
    public FachadaLogica() {
        this.controlHabitat = new ControlHabitat();
        this.controlHabitatO = new ControlHabitatOcupada();
        this.controlClima = new ControlClima();
        this.controlContinentes = new ControlContinentes();
        this.controlVegetacion = new ControlVegetacion();
        this.controlGuia= new ControlGuia();
        this.controlCuidadores = new ControlCuidadores();
        this.controlZona= new ControlZona();
        this.controlEspecie= new ControlEspecie();
        this.controlCuidadorEspecie= new ControlCuidadorEspecie();
        this.controlitinerario = new ControlItinerario();
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
            
//            frmRegistrarHabitat frm = new frmRegistrarHabitat(listacon, listaclima, listavege);
//            frm.setVisible(true);
        
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
//            frmRegistrarEspecie frm = new frmRegistrarEspecie(listacuidador, listahabitat, listaZona);
//            frm.setVisible(true);
        
        return true;
    }
    
    @Override
    public void abrirMenu() {
//       FrmPrincipal frm = new FrmPrincipal();
//       frm.setVisible(true);
            
    }

    @Override
    public boolean guardarGuia(Guia guia) {
       return this.controlGuia.guardarGuia(guia);
    }

    @Override
    public boolean guardarEspecie(Especie especie) {
        
        if (!especie.getHabitatsOcupadas().isEmpty()) {
            this.guardarHabitatsOcupadas(especie.getHabitatsOcupadas());
            for (int i = 0; i < especie.getHabitatsOcupadas().size(); i++) {
                this.agregarHabitatOcupadaAHabitat(especie.getHabitatsOcupadas().get(i).getHabitat(), especie.getHabitatsOcupadas().get(i));
            }
        }
        if (!especie.getCuidadorEspecie().isEmpty()) {
            this.guardarCuidadoresEspecies(especie.getCuidadorEspecie());
            for (int i = 0; i < especie.getCuidadorEspecie().size(); i++) {
                this.agregarCuidadorEspecieACuidador(especie.getCuidadorEspecie().get(i).getCuidador(), especie.getCuidadorEspecie().get(i));
            }
        }
        if (!controlEspecie.guardarEspecie(especie)) {
            return false;
        }
      return true;
    }

    @Override
    public boolean guardarHabitatsOcupadas(List<HabitatOcupada> habitatOcupada) {
        return controlHabitatO.guardarHabitat(habitatOcupada);
    } 

    @Override
    public boolean guardarCuidadoresEspecies(List<CuidadorEspecie> cuidadores) {
        return controlCuidadorEspecie.guardarCuidadoresEspecie(cuidadores);
    }

    @Override
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitat) {
       return controlHabitat.agregarHabitatOcupadaAHabitat(id, habitat);
    }

    @Override
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie) {
      return controlCuidadores.agregarCuidadorEspecieACuidador(id, cuidadorEspecie);
    }

    @Override
    public Especie verificaNombreEspecie(String nombre) {
        return controlEspecie.verificaEspecie(nombre);
    }

    @Override
    public List<Itinerario> recuperaItinerarios() {
        return controlitinerario.RecuperaItinerario();
    }

}
