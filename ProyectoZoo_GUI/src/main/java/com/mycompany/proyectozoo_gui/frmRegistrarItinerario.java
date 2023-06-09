/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectozoo_gui;

import Dominio.Continente;
import Dominio.Dias;
import Dominio.Guia;
import Dominio.Horario;
import Dominio.Itinerario;
import Dominio.Recorrido;
import Dominio.Zona;
import Logica.FabricaLogica;
import Logica.ILogica;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class frmRegistrarItinerario extends javax.swing.JFrame {

    ILogica logica;
    List<Guia> guias;
    List<Zona> zonas;
    DefaultListModel<Zona> modeloListaZonas = new DefaultListModel<>();
    DefaultListModel<Zona> modeloListaZonasSeleccionadas = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasLunes = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasMartes = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasMiercoles = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasJueves = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasViernes = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasSabado = new DefaultListModel<>();
    DefaultListModel<Guia> modeloListaGuiasDomingo = new DefaultListModel<>();

    /**
     * Creates new form frmRegistrarItinerario
     */
    public frmRegistrarItinerario(List<Guia> guias, List<Zona> zon) {
        logica = FabricaLogica.crearInstancia();
        initComponents();
        listaZonas.setModel(modeloListaZonas);
        listaZonasSeleccionadas.setModel(modeloListaZonasSeleccionadas);
        listaLunesGuia.setModel(modeloListaGuiasLunes);
        listaMartesGuia.setModel(modeloListaGuiasMartes);
        listaMiercolesGuia.setModel(modeloListaGuiasMiercoles);
        listaJuevesGuia.setModel(modeloListaGuiasJueves);
        listaViernesGuia.setModel(modeloListaGuiasViernes);
        listaSabadoGuia.setModel(modeloListaGuiasSabado);
        this.guias = guias;
        this.zonas = zon;
        llenarDatos(guias, zonas);

    }

    public void llenarDatos(List<Guia> lg, List<Zona> lz) {
        modeloListaZonas.removeAllElements();
        modeloListaGuiasLunes.removeAllElements();
        modeloListaGuiasMartes.removeAllElements();
        modeloListaGuiasMiercoles.removeAllElements();
        modeloListaGuiasJueves.removeAllElements();
        modeloListaGuiasViernes.removeAllElements();
        modeloListaGuiasSabado.removeAllElements();
        for (Zona zona : lz) {
            
            if (modeloListaZonasSeleccionadas.contains(zona)) {
                
            }else{
              modeloListaZonas.addElement(zona);  
            }
           
        }
        for (Guia guia : lg) {
            if (cbLunes.isSelected()) {
                modeloListaGuiasLunes.addElement(guia);
                tfLunes.setEnabled(true);
            } else {
                tfLunes.setText("");
                tfLunes.setEnabled(false);
            }
            if (cbMartes.isSelected()) {
                modeloListaGuiasMartes.addElement(guia);
                tfMartes.setEnabled(true);
            } else {
                tfMartes.setText("");
                tfMartes.setEnabled(false);
            }
            if (cbMiercoles.isSelected()) {
                modeloListaGuiasMiercoles.addElement(guia);
                tfMiercoles.setEnabled(true);
            } else {
                tfMiercoles.setText("");
                tfMiercoles.setEnabled(false);
            }
            if (cbJueves.isSelected()) {
                modeloListaGuiasJueves.addElement(guia);
                tfJueves.setEnabled(true);
            } else {
                tfJueves.setText("");
                tfJueves.setEnabled(false);
            }
            if (cbViernes.isSelected()) {
                modeloListaGuiasViernes.addElement(guia);
                tfViernes.setEnabled(true);
            } else {
                tfViernes.setText("");
                tfViernes.setEnabled(false);
            }
            if (cbSabado.isSelected()) {
                modeloListaGuiasSabado.addElement(guia);
                tfSabado.setEnabled(true);
            } else {
                tfSabado.setText("");
                tfSabado.setEnabled(false);
            }

        }

    }

    public void activarCampos() {
        cbLunes.setEnabled(true);
        cbMartes.setEnabled(true);
        cbJueves.setEnabled(true);
        cbMiercoles.setEnabled(true);
        cbViernes.setEnabled(true);
        cbSabado.setEnabled(true);
        tfDuracion.setEnabled(true);
        tfLongitud.setEnabled(true);
        tfVisitantes.setEnabled(true);
        btnGuarfarItinerario.setEnabled(true);
        listaZonas.setEnabled(true);
        listaZonasSeleccionadas.setEnabled(true);
        listaLunesGuia.setEnabled(true);
        listaMartesGuia.setEnabled(true);
        listaMiercolesGuia.setEnabled(true);
        listaJuevesGuia.setEnabled(true);
        listaViernesGuia.setEnabled(true);
        listaSabadoGuia.setEnabled(true);
        
    }

    public void desactivarCampos() {
        cbLunes.setEnabled(false);
        cbMartes.setEnabled(false);
        cbJueves.setEnabled(false);
        cbMiercoles.setEnabled(false);
        cbViernes.setEnabled(false);
        cbSabado.setEnabled(false);
        cbLunes.setSelected(false);
        cbMartes.setSelected(false);
        cbJueves.setSelected(false);
        cbMiercoles.setSelected(false);
        cbViernes.setSelected(false);
        cbSabado.setSelected(false);
        tfDuracion.setEnabled(false);
        tfLongitud.setEnabled(false);
        tfVisitantes.setEnabled(false);
        btnGuarfarItinerario.setEnabled(false);
        listaZonas.setEnabled(false);
        listaZonasSeleccionadas.setEnabled(false);
    }
    public void limpiarCampos(){
        tfNombre.setText("");
        tfLongitud.setText("");
        tfVisitantes.setText("");
        tfDuracion.setText("");
        tfLunes.setText("");
        tfMartes.setText("");
        tfMiercoles.setText("");
        tfJueves.setText("");
        tfViernes.setText("");
        tfSabado.setText("");
        llenarDatos(guias, zonas);
    }

    public void reiniciarZonas() {
        while (!modeloListaZonasSeleccionadas.isEmpty()) {
            modeloListaZonas.addElement(modeloListaZonasSeleccionadas.get(0));
            modeloListaZonasSeleccionadas.remove(0);
        }

    }

    public void mostrarItinerario(Itinerario iti) {
      tfVisitantes.setText(String.valueOf(iti.getMaxVisitantes()));
      tfDuracion.setText(String.valueOf(iti.getDuracion()));
      tfLongitud.setText(String.valueOf(iti.getLongitud()));
        for (Recorrido r :iti.getRecorridos()) {
            if (r.getHorario().getDia().equals(Dias.Lunes)) {
                tfLunes.setText(r.getHorario().getHora());
                modeloListaGuiasLunes.addElement(r.getGuia());
            }
            if (r.getHorario().getDia().equals(Dias.Martes)) {
                tfMartes.setText(r.getHorario().getHora());
                modeloListaGuiasMartes.addElement(r.getGuia());
            }
            if (r.getHorario().getDia().equals(Dias.Miercoles)) {
                tfMiercoles.setText(r.getHorario().getHora());
                modeloListaGuiasMiercoles.addElement(r.getGuia());
            }
            if (r.getHorario().getDia().equals(Dias.Jueves)) {
                tfJueves.setText(r.getHorario().getHora());
                modeloListaGuiasJueves.addElement(r.getGuia());
            }
            if (r.getHorario().getDia().equals(Dias.Viernes)) {
                tfViernes.setText(r.getHorario().getHora());
                modeloListaGuiasViernes.addElement(r.getGuia());
            }
            if (r.getHorario().getDia().equals(Dias.Sabado)) {
                tfSabado.setText(r.getHorario().getHora());
                modeloListaGuiasSabado.addElement(r.getGuia());
            }   
        }
        for (Zona c :iti.getZonasParques()) {
             for (int i = 0; i < modeloListaZonas.size(); i++) {
                 if (modeloListaZonas.get(i).equals(c)) {
                     modeloListaZonasSeleccionadas.addElement(c);
                     modeloListaZonas.remove(i);
                 }
             }
 
         }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLunes = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSabadoGuia = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfSabado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaMiercolesGuia = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaMartesGuia = new javax.swing.JList<>();
        btnVerificar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaLunesGuia = new javax.swing.JList<>();
        tfMartes = new javax.swing.JTextField();
        cbSabado = new javax.swing.JCheckBox();
        tfDuracion = new javax.swing.JTextField();
        tfLunes = new javax.swing.JTextField();
        tfLongitud = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaJuevesGuia = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaZonasSeleccionadas = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        cbMiercoles = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuarfarItinerario = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfViernes = new javax.swing.JTextField();
        tfVisitantes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbViernes = new javax.swing.JCheckBox();
        tfMiercoles = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbJueves = new javax.swing.JCheckBox();
        tfJueves = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaViernesGuia = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaZonas = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        cbMartes = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Registrar Itinerario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel21)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Hora inicial");

        jLabel5.setText("Longitud (M)");

        cbLunes.setText("Lunes");
        cbLunes.setEnabled(false);
        cbLunes.setPreferredSize(new java.awt.Dimension(70, 22));
        cbLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLunesActionPerformed(evt);
            }
        });

        jLabel15.setText("Guia");

        btnReiniciar.setBackground(new java.awt.Color(153, 0, 51));
        btnReiniciar.setText("X");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        listaSabadoGuia.setEnabled(false);
        jScrollPane2.setViewportView(listaSabadoGuia);

        jLabel20.setText("Zonas Seleccionadas");

        jLabel19.setText("Hora inicial");

        tfSabado.setPreferredSize(new java.awt.Dimension(70, 22));
        tfSabado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        jLabel18.setText("Hora inicial");

        listaMiercolesGuia.setEnabled(false);
        jScrollPane5.setViewportView(listaMiercolesGuia);

        listaMartesGuia.setEnabled(false);
        jScrollPane4.setViewportView(listaMartesGuia);

        btnVerificar.setBackground(new java.awt.Color(153, 255, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel16.setText("Guia");

        jLabel17.setText("Guia");

        listaLunesGuia.setEnabled(false);
        jScrollPane3.setViewportView(listaLunesGuia);

        tfMartes.setPreferredSize(new java.awt.Dimension(70, 22));
        tfMartes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        cbSabado.setText("Sabado");
        cbSabado.setEnabled(false);
        cbSabado.setPreferredSize(new java.awt.Dimension(70, 22));
        cbSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSabadoActionPerformed(evt);
            }
        });

        tfDuracion.setEnabled(false);
        tfDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDuracionKeyTyped(evt);
            }
        });

        tfLunes.setPreferredSize(new java.awt.Dimension(70, 22));
        tfLunes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        tfLongitud.setEnabled(false);
        tfLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLongitudActionPerformed(evt);
            }
        });
        tfLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLongitudKeyTyped(evt);
            }
        });

        jLabel3.setText("Zonas Disponibles");

        jLabel8.setText("Hora inicial");

        listaJuevesGuia.setEnabled(false);
        jScrollPane6.setViewportView(listaJuevesGuia);

        listaZonasSeleccionadas.setEnabled(false);
        listaZonasSeleccionadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaZonasSeleccionadasMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(listaZonasSeleccionadas);

        jLabel14.setText("Guia");

        cbMiercoles.setText("Miercoles");
        cbMiercoles.setEnabled(false);
        cbMiercoles.setPreferredSize(new java.awt.Dimension(70, 22));
        cbMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMiercolesActionPerformed(evt);
            }
        });

        jLabel10.setText("Hora inicial");

        jLabel6.setText("Visitantes (Max)");

        jLabel13.setText("Guia");

        btnGuarfarItinerario.setBackground(new java.awt.Color(153, 255, 153));
        btnGuarfarItinerario.setText("Guardar Itinerario");
        btnGuarfarItinerario.setEnabled(false);
        btnGuarfarItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarfarItinerarioActionPerformed(evt);
            }
        });

        tfViernes.setPreferredSize(new java.awt.Dimension(70, 22));
        tfViernes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        tfVisitantes.setEnabled(false);
        tfVisitantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfVisitantesKeyTyped(evt);
            }
        });

        jLabel2.setText("Ingrese itinerario");

        cbViernes.setText("Viernes");
        cbViernes.setEnabled(false);
        cbViernes.setPreferredSize(new java.awt.Dimension(70, 22));
        cbViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViernesActionPerformed(evt);
            }
        });

        tfMiercoles.setPreferredSize(new java.awt.Dimension(70, 22));
        tfMiercoles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        jLabel4.setText("Duración (min)");

        cbJueves.setText("Jueves");
        cbJueves.setEnabled(false);
        cbJueves.setPreferredSize(new java.awt.Dimension(70, 22));
        cbJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJuevesActionPerformed(evt);
            }
        });

        tfJueves.setPreferredSize(new java.awt.Dimension(70, 22));
        tfJueves.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLunesKeyTyped(evt);
            }
        });

        jLabel9.setText("Hora inicial");

        jLabel7.setText("Dias de la semana");

        listaViernesGuia.setEnabled(false);
        jScrollPane7.setViewportView(listaViernesGuia);

        listaZonas.setEnabled(false);
        listaZonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaZonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaZonas);

        jLabel12.setText("Guia");

        cbMartes.setText("Martes");
        cbMartes.setEnabled(false);
        cbMartes.setPreferredSize(new java.awt.Dimension(70, 22));
        cbMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMartesActionPerformed(evt);
            }
        });

        jLabel1.setText("Primero Valida el itinerario");

        jLabel22.setText("para activar campos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(btnVerificar)
                            .addGap(12, 12, 12)
                            .addComponent(btnReiniciar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4))
                                .addComponent(tfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel11)))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(80, 80, 80)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(tfLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(tfVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel17)))
                            .addGap(106, 106, 106)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel16)))
                            .addGap(110, 110, 110)
                            .addComponent(btnGuarfarItinerario))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(cbViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(cbSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel19)
                            .addGap(120, 120, 120)
                            .addComponent(jLabel18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(tfViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(tfSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel13)
                            .addGap(166, 166, 166)
                            .addComponent(jLabel12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10))))
                                    .addGap(110, 110, 110)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(tfMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel15)
                                    .addGap(166, 166, 166)
                                    .addComponent(jLabel14)))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(jLabel20)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnVerificar)
                        .addComponent(btnReiniciar))
                    .addGap(8, 8, 8)
                    .addComponent(jLabel7)
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel10)
                                            .addGap(14, 14, 14)
                                            .addComponent(tfLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel8)
                                            .addGap(14, 14, 14)
                                            .addComponent(tfMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(13, 13, 13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(tfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(4, 4, 4)
                            .addComponent(tfLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(4, 4, 4)
                            .addComponent(tfVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel17))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel16))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnGuarfarItinerario)))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel18))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (!tfNombre.getText().isEmpty()) {
            if (logica.verificaNombreItinerario(tfNombre.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Itinerario Encontrado se mostrara la informacion de esta");
                reiniciarZonas();
                mostrarItinerario(logica.verificaNombreItinerario(tfNombre.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "Se activaran los campos");
                activarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre a buscar");
        }

    }//GEN-LAST:event_btnVerificarActionPerformed

    private void cbViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViernesActionPerformed
        llenarDatos(guias, zonas);        // TODO add your handling code here:
    }//GEN-LAST:event_cbViernesActionPerformed

    private void cbLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLunesActionPerformed
        llenarDatos(guias, zonas);
    }//GEN-LAST:event_cbLunesActionPerformed

    private void cbMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMartesActionPerformed
        llenarDatos(guias, zonas);        // TODO add your handling code here:
    }//GEN-LAST:event_cbMartesActionPerformed

    private void cbMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMiercolesActionPerformed
        llenarDatos(guias, zonas);        // TODO add your handling code here:
    }//GEN-LAST:event_cbMiercolesActionPerformed

    private void cbJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJuevesActionPerformed
        llenarDatos(guias, zonas);        // TODO add your handling code here:
    }//GEN-LAST:event_cbJuevesActionPerformed

    private void cbSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSabadoActionPerformed
        llenarDatos(guias, zonas);        // TODO add your handling code here:
    }//GEN-LAST:event_cbSabadoActionPerformed

    private void tfLunesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLunesKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == ':')) {
            evt.consume();
        }
    }//GEN-LAST:event_tfLunesKeyTyped

    private void tfLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLongitudKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else {
            String currentText = tfLongitud.getText();
            String newText = currentText + c;
            try {
                int number = Integer.parseInt(newText);
                if (number < 1 || number > 1500) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfLongitudKeyTyped

    private void tfLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLongitudActionPerformed

    private void tfVisitantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVisitantesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else {
            String currentText = tfVisitantes.getText();
            String newText = currentText + c;
            try {
                int number = Integer.parseInt(newText);
                if (number < 1 || number > 30) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfVisitantesKeyTyped

    private void tfDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDuracionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else {
            String currentText = tfDuracion.getText();
            String newText = currentText + c;
            try {
                int number = Integer.parseInt(newText);
                if (number < 1 || number > 90) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfDuracionKeyTyped

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        
        desactivarCampos();
        reiniciarZonas();
        limpiarCampos();
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnGuarfarItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarfarItinerarioActionPerformed
        if (!validarRecorridos()) {
            JOptionPane.showMessageDialog(this, "Formato de Hora Incorrecto en los Recorridos");
            return;
        }
        if (!validarGuia()) {
            JOptionPane.showMessageDialog(this, "Seleccione un Guia en cada Recorrido");
            return;
        }
        if (!validarCampos()) {
            return;
        }
        guardarItinerario();
    }//GEN-LAST:event_btnGuarfarItinerarioActionPerformed

    private void listaZonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaZonasMouseClicked
        if (evt.getClickCount() == 2) {
            Zona selectedValue = listaZonas.getSelectedValue();
            if (selectedValue != null) {
                modeloListaZonasSeleccionadas.addElement(selectedValue);
                modeloListaZonas.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaZonasMouseClicked

    private void listaZonasSeleccionadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaZonasSeleccionadasMouseClicked

        if (evt.getClickCount() == 2) {
            Zona selectedValue = listaZonasSeleccionadas.getSelectedValue();
            if (selectedValue != null) {
                modeloListaZonas.addElement(selectedValue);
                modeloListaZonasSeleccionadas.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaZonasSeleccionadasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmPrincipalP f = new frmPrincipalP();
        f.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    public void guardarItinerario() {
        Itinerario itinerario = new Itinerario();
        itinerario.setNombre(tfNombre.getText());
        itinerario.setLongitud(Integer.parseInt(tfLongitud.getText()));
        itinerario.setMaxVisitantes(Integer.parseInt(tfVisitantes.getText()));
        itinerario.setDuracion(Integer.parseInt(tfDuracion.getText()));
        List<Zona> seleccionados = new ArrayList<>();
        for (int j = 0; j < modeloListaZonasSeleccionadas.size(); j++) {
            seleccionados.add(modeloListaZonasSeleccionadas.get(j));
        }
        itinerario.setZonasParques(seleccionados);
        List<Recorrido> recorridosItinerario = new ArrayList<Recorrido>();
        if (cbLunes.isSelected()) {
            Horario horarioLunes = new Horario(Dias.Lunes, tfLunes.getText());
            Recorrido lunes = new Recorrido(horarioLunes, listaLunesGuia.getSelectedValue());
            recorridosItinerario.add(lunes);
        }
        if (cbMartes.isSelected()) {
            Horario horarioMartes = new Horario(Dias.Martes, tfMartes.getText());
            Recorrido martes = new Recorrido(horarioMartes, listaMartesGuia.getSelectedValue());
            recorridosItinerario.add(martes);
        }

        if (cbMiercoles.isSelected()) {
            Horario horarioMiercoles = new Horario(Dias.Miercoles, tfMiercoles.getText());
            Recorrido miercoles = new Recorrido(horarioMiercoles, listaMiercolesGuia.getSelectedValue());
            recorridosItinerario.add(miercoles);
        }
        if (cbJueves.isSelected()) {
            Horario horarioJueves = new Horario(Dias.Jueves, tfJueves.getText());
            Recorrido jueves = new Recorrido(horarioJueves, listaJuevesGuia.getSelectedValue());
            recorridosItinerario.add(jueves);
        }

        if (cbViernes.isSelected()) {
            
            Horario horarioViernes = new Horario(Dias.Viernes, tfViernes.getText());
            Recorrido viernes = new Recorrido(horarioViernes, listaViernesGuia.getSelectedValue());
            recorridosItinerario.add(viernes);
        }

        if (cbSabado.isSelected()) {
         
            Horario horarioSabado = new Horario(Dias.Sabado, tfSabado.getText());
            Recorrido sabado = new Recorrido(horarioSabado, listaSabadoGuia.getSelectedValue());
            recorridosItinerario.add(sabado);
        }
        itinerario.setRecorridos(recorridosItinerario);
        
        if (logica.guardarItinerario(itinerario)) {
            JOptionPane.showMessageDialog(this, "Registro Existoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
           frmPrincipalP f = new frmPrincipalP();
        f.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Error al registrar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    public boolean validarCampos(){
        if (tfDuracion.getText().isEmpty()||tfLongitud.getText().isEmpty()
                ||tfNombre.getText().isEmpty()||tfVisitantes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Espacios En blanco");
            return false;
        }
        if (modeloListaZonasSeleccionadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione las Zonas");
            return false;
        }
        if (!cbLunes.isSelected()&&!cbMartes.isSelected()&&!cbMiercoles.isSelected()
                &&!cbJueves.isSelected()&&!cbViernes.isSelected()&&!cbSabado.isSelected()) {
            JOptionPane.showMessageDialog(this, "Seleccione Minimo un dia");
            return false;
        }
        return true;
    }
    public boolean validarGuia() {
        if (cbLunes.isSelected()) {
            if (listaLunesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbLunes.isSelected()) {
            if (listaLunesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbMartes.isSelected()) {
            if (listaMartesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbMiercoles.isSelected()) {
            if (listaMiercolesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbJueves.isSelected()) {
            if (listaJuevesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbViernes.isSelected()) {
            if (listaViernesGuia.isSelectionEmpty()) {
                return false;
            }
        }
        if (cbSabado.isSelected()) {
            if (listaSabadoGuia.isSelectionEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean validarRecorridos() {
        try {
            // Intenta analizar la cadena de texto como una hora en formato "HH:mm"
            if (cbLunes.isSelected()) {
                LocalTime.parse(tfLunes.getText());
            }
            if (cbMartes.isSelected()) {
                LocalTime.parse(tfMartes.getText());
            }

            if (cbMiercoles.isSelected()) {
                LocalTime.parse(tfMiercoles.getText());
            }

            if (cbJueves.isSelected()) {
                LocalTime.parse(tfJueves.getText());
            }

            if (cbViernes.isSelected()) {
                LocalTime.parse(tfViernes.getText());
            }

            if (cbSabado.isSelected()) {
                LocalTime.parse(tfSabado.getText());
            }

            return true; // El formato es válido
        } catch (Exception e) {
            return false; // El formato es inválido
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuarfarItinerario;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JCheckBox cbJueves;
    private javax.swing.JCheckBox cbLunes;
    private javax.swing.JCheckBox cbMartes;
    private javax.swing.JCheckBox cbMiercoles;
    private javax.swing.JCheckBox cbSabado;
    private javax.swing.JCheckBox cbViernes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JList<Guia> listaJuevesGuia;
    private javax.swing.JList<Guia> listaLunesGuia;
    private javax.swing.JList<Guia> listaMartesGuia;
    private javax.swing.JList<Guia> listaMiercolesGuia;
    private javax.swing.JList<Guia> listaSabadoGuia;
    private javax.swing.JList<Guia> listaViernesGuia;
    private javax.swing.JList<Zona> listaZonas;
    private javax.swing.JList<Zona> listaZonasSeleccionadas;
    private javax.swing.JTextField tfDuracion;
    private javax.swing.JTextField tfJueves;
    private javax.swing.JTextField tfLongitud;
    private javax.swing.JTextField tfLunes;
    private javax.swing.JTextField tfMartes;
    private javax.swing.JTextField tfMiercoles;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfSabado;
    private javax.swing.JTextField tfViernes;
    private javax.swing.JTextField tfVisitantes;
    // End of variables declaration//GEN-END:variables
}
