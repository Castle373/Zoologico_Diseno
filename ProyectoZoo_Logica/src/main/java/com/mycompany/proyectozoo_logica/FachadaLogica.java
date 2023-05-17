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
        this.controlGuia = new ControlGuia();
        this.controlCuidadores = new ControlCuidadores();
        this.controlZona = new ControlZona();
        this.controlEspecie = new ControlEspecie();
        this.controlCuidadorEspecie = new ControlCuidadorEspecie();
        this.controlitinerario = new ControlItinerario();
    }

    @Override
    public Habitat verificaNombreHabitat(String nombre) {
        Habitat h = controlHabitat.verificaHabitat(nombre);
        return h;
    }

    @Override
    public boolean guardarHabitat(Habitat habitat) {
        return controlHabitat.guardarHabitat(habitat);
    }

    @Override
    public Object[] recuperaDatosHabitat() {
    Object[] o = new Object[3];
        List<Clima> listaclima = controlClima.RecuperaClima();
        List<Continente> listacon = controlContinentes.RecuperaContinente();
        List<Vegetacion> listavege = controlVegetacion.RecuperaVegetacion();
        o[0] = listaclima;
        o[1] = listacon;
        o[2] = listavege;
        
        if (listaclima.isEmpty() || listacon.isEmpty() || listavege.isEmpty()) {
            return null;
        }

        return o;
    }

    @Override
    public Object[] recuperaDatosEspecies() {
        Object[] o = new Object[3];
        
        List<Cuidador> listacuidador = controlCuidadores.recuperarCuidadores();
        List<Habitat> listahabitat = controlHabitat.recuperarHabitats();
        List<Zona> listaZona = controlZona.recuperarZonas();
        o[0] = listacuidador;
        o[1] = listahabitat;
        o[2] = listaZona;
        if (listacuidador.isEmpty() || listahabitat.isEmpty() || listaZona.isEmpty()) {
            return null;
        }

        //frmRegistrarEspecie frm = new frmRegistrarEspecie(listacuidador, listahabitat, listaZona);
        //frm.setVisible(true);
//            frmRegistrarEspecie frm = new frmRegistrarEspecie(listacuidador, listahabitat, listaZona);
//           frm.setVisible(true);
        return o;
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

    public Cuidador buscarCuidador(ObjectId id) {
        return controlCuidadores.buscarCuidador(id);
    }

    @Override
    public Habitat buscarHabitat(ObjectId id) {
        return controlHabitat.buscarHabitats(id);
    }

    @Override
    public List<Itinerario> recuperaItinerarios() {
        return controlitinerario.RecuperaItinerario();
    }

    @Override
    public List<Guia> recuperaGuias() {
        return controlGuia.recuperarGuias();
    }

    @Override
    public Object[] recuperarDatosItineario() {
        Object[] o = new Object[2];
        List<Zona> z = controlZona.recuperarZonas();
        o[0] = z;
        List<Guia> g = controlGuia.recuperarGuias();
        o[1] = g;
        if (z.isEmpty() || g.isEmpty()) {
            return null;
        }
        return o;
    }

    @Override
    public Itinerario verificaNombreItinerario(String nombre) {
        return controlitinerario.verificaItinerario(nombre);
    }

    @Override
    public boolean guardarItinerario(Itinerario Itinerario) {
        return controlitinerario.guardarItinerario(Itinerario);
    }

    @Override
    public boolean actualizarItinerario(Itinerario itinerario) {
        return controlitinerario.actualizarItinerario(itinerario);
    }

}
