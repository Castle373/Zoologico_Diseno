/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectozoo_gui;

import Dominio.Animal;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import Dominio.Especie;
import Dominio.Habitat;
import Dominio.HabitatOcupada;

import Dominio.Zona;
import com.mycompany.proyectozoo_logica.FabricaLogica;
import com.mycompany.proyectozoo_logica.ILogica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class frmRegistrarEspecie extends javax.swing.JFrame {

    boolean mostrar;
    ILogica logica;
    DefaultListModel<Cuidador> modeloListaCuidadorDisponibles = new DefaultListModel<>();
    DefaultListModel<Cuidador> modeloListaCuidadorSeleccionados = new DefaultListModel<>();
    DefaultListModel<Habitat> modeloListaHabitatDisponibles = new DefaultListModel<>();
    DefaultListModel<Habitat> modeloListaHabitatSeleccionados = new DefaultListModel<>();
    List<Animal> animalesAcutales;

    /**
     * Creates new form frmRegistrarEspecie
     */
    public frmRegistrarEspecie() {
        initComponents();

        listaDisponiblesCuidadores.setModel(modeloListaCuidadorDisponibles);
        listaSeleccionadosHabitats.setModel(modeloListaHabitatSeleccionados);
        listaDisponiblesHabitats.setModel(modeloListaHabitatDisponibles);
        listaSeleccionadosCuidadores.setModel(modeloListaCuidadorSeleccionados);
    }

    public frmRegistrarEspecie(List<Cuidador> listcui, List<Habitat> listhabi, List<Zona> listz) {
        initComponents();
        logica = FabricaLogica.crearInstancia();
        animalesAcutales = new ArrayList();
        listaDisponiblesCuidadores.setModel(modeloListaCuidadorDisponibles);
        listaSeleccionadosHabitats.setModel(modeloListaHabitatSeleccionados);
        listaDisponiblesHabitats.setModel(modeloListaHabitatDisponibles);
        listaSeleccionadosCuidadores.setModel(modeloListaCuidadorSeleccionados);
        this.desplegarDatos(listcui, listhabi, listz);
    }

    public void desplegarDatos(List<Cuidador> listcui, List<Habitat> listhabi, List<Zona> listz) {
        for (Cuidador con : listcui) {
            modeloListaCuidadorDisponibles.addElement(con);
        }
        for (Habitat habitat : listhabi) {
            modeloListaHabitatDisponibles.addElement(habitat);
        }
        for (Zona zona : listz) {
            cmbZona.addItem(zona);
        }
    }

    public void reiniciarListas() {
        while (!modeloListaCuidadorSeleccionados.isEmpty()) {
            modeloListaCuidadorDisponibles.addElement(modeloListaCuidadorSeleccionados.get(0));
            modeloListaCuidadorSeleccionados.remove(0);
        }
        while (!modeloListaHabitatSeleccionados.isEmpty()) {
            modeloListaHabitatDisponibles.addElement(modeloListaHabitatSeleccionados.get(0));
            modeloListaHabitatSeleccionados.remove(0);
        }
    }

    public void mostrarHabitat(Especie especie) {
        mostrar = true;
        JOptionPane.showMessageDialog(this, "Especie Encontrada");
        if (especie.getCuidadorEspecie() != null) {
            for (CuidadorEspecie c : especie.getCuidadorEspecie()) {
                for (int i = 0; i < modeloListaCuidadorDisponibles.size(); i++) {
                    Cuidador cuidador = logica.buscarCuidador(c.getCuidador());
                    if (modeloListaCuidadorDisponibles.get(i).equals(cuidador)) {
                        modeloListaCuidadorSeleccionados.addElement(cuidador);
                        modeloListaCuidadorDisponibles.remove(i);
                    }
                }

            }
        }
        if (especie.getHabitatsOcupadas() != null) {
            for (HabitatOcupada h : especie.getHabitatsOcupadas()) {
                for (int i = 0; i < modeloListaHabitatDisponibles.size(); i++) {
                    Habitat habitat = logica.buscarHabitat(h.getHabitat());
                    if (modeloListaHabitatDisponibles.get(i).equals(habitat)) {
                        modeloListaHabitatSeleccionados.addElement(habitat);
                        modeloListaHabitatDisponibles.remove(i);
                    }
                }
            }
        }
        txtNombre.setText(especie.getNombre());
        txtNombreCientifico.setText(especie.getNombreCientifico());
        txtDescripcion.setText(especie.getDescripcion());
        animalesAcutales = especie.getAnimales();
        descactivarCampos();
        btnRegistrarAnimal.setEnabled(true);
    }

    public void activarCampos() {
        txtNombre.setEnabled(true);
        txtNombreCientifico.setEnabled(true);
        txtDescripcion.setEnabled(true);
        cmbZona.setEnabled(true);
        listaDisponiblesCuidadores.setEnabled(true);
        listaSeleccionadosCuidadores.setEnabled(true);
        listaSeleccionadosHabitats.setEnabled(true);
        listaDisponiblesHabitats.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnRegistrarAnimal.setEnabled(true);
    }

    public void descactivarCampos() {
        txtNombre.setEnabled(false);
        txtNombreCientifico.setEnabled(false);
        txtDescripcion.setEnabled(false);
        cmbZona.setEnabled(false);
        listaDisponiblesCuidadores.setEnabled(false);
        listaSeleccionadosCuidadores.setEnabled(false);
        listaSeleccionadosHabitats.setEnabled(false);
        listaDisponiblesHabitats.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnRegistrarAnimal.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDisponiblesCuidadores = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSeleccionadosHabitats = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDisponiblesHabitats = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSeleccionadosCuidadores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreCientifico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cmbZona = new javax.swing.JComboBox<>();
        btnRegistrarAnimal = new javax.swing.JButton();
        txtAnimales = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Especie");

        listaDisponiblesCuidadores.setEnabled(false);
        listaDisponiblesCuidadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDisponiblesCuidadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDisponiblesCuidadores);

        listaSeleccionadosHabitats.setEnabled(false);
        listaSeleccionadosHabitats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSeleccionadosHabitatsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaSeleccionadosHabitats);

        listaDisponiblesHabitats.setEnabled(false);
        listaDisponiblesHabitats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDisponiblesHabitatsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaDisponiblesHabitats);

        listaSeleccionadosCuidadores.setEnabled(false);
        listaSeleccionadosCuidadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSeleccionadosCuidadoresMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listaSeleccionadosCuidadores);

        jLabel2.setText("Habitats");

        jLabel3.setText("Cuidadores");

        jLabel4.setText("Disponibles");

        jLabel5.setText("Disponibles");

        jLabel7.setText("Seleccionados");

        jLabel8.setText("Seleccionados");

        jLabel9.setText("Cuidadores");

        jLabel10.setText("Habitats");

        txtNombreCientifico.setEnabled(false);
        txtNombreCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCientificoActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre:");

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Descripcion:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setEnabled(false);
        jScrollPane5.setViewportView(txtDescripcion);

        jLabel12.setText("Nombre Cientifico:");

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbZona.setEnabled(false);
        cmbZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZonaActionPerformed(evt);
            }
        });

        btnRegistrarAnimal.setText("Registrar Animales");
        btnRegistrarAnimal.setEnabled(false);
        btnRegistrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnimalActionPerformed(evt);
            }
        });

        txtAnimales.setEditable(false);
        txtAnimales.setText("0");
        txtAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalesActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(153, 0, 0));
        btnReiniciar.setText("X");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cmbZona, 0, 141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12)
                                .addGap(9, 9, 9)
                                .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReiniciar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnGuardar)
                .addGap(112, 112, 112)
                .addComponent(btnRegistrarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnReiniciar)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarAnimal)
                        .addComponent(txtAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCientificoActionPerformed

    }//GEN-LAST:event_txtNombreCientificoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtNombre.getText().isEmpty()) {
            Especie espe = logica.verificaNombreEspecie(txtNombre.getText());
            if (espe != null) {
                mostrarHabitat(espe);

            } else {
                activarCampos();
                btnGuardar.setText("Guardar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para verificar");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void listaDisponiblesCuidadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDisponiblesCuidadoresMouseClicked
        if (evt.getClickCount() == 2) {
            Cuidador selectedValue = listaDisponiblesCuidadores.getSelectedValue();
            if (selectedValue != null) {
                modeloListaCuidadorSeleccionados.addElement(selectedValue);
                modeloListaCuidadorDisponibles.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaDisponiblesCuidadoresMouseClicked

    private void listaSeleccionadosCuidadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSeleccionadosCuidadoresMouseClicked
        if (evt.getClickCount() == 2) {
            Cuidador selectedValue = listaSeleccionadosCuidadores.getSelectedValue();
            if (selectedValue != null) {
                modeloListaCuidadorDisponibles.addElement(selectedValue);
                modeloListaCuidadorSeleccionados.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaSeleccionadosCuidadoresMouseClicked

    private void listaDisponiblesHabitatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDisponiblesHabitatsMouseClicked
        if (evt.getClickCount() == 2) {
            Habitat selectedValue = listaDisponiblesHabitats.getSelectedValue();
            if (selectedValue != null) {
                modeloListaHabitatSeleccionados.addElement(selectedValue);
                modeloListaHabitatDisponibles.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaDisponiblesHabitatsMouseClicked

    private void listaSeleccionadosHabitatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSeleccionadosHabitatsMouseClicked
        if (evt.getClickCount() == 2) {
            Habitat selectedValue = listaSeleccionadosHabitats.getSelectedValue();
            if (selectedValue != null) {
                modeloListaHabitatDisponibles.addElement(selectedValue);
                modeloListaHabitatSeleccionados.removeElement(selectedValue);
            }
        }
    }//GEN-LAST:event_listaSeleccionadosHabitatsMouseClicked

    private void cmbZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbZonaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validadCampos()) {

            guardarEspecie();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalesActionPerformed

    private void btnRegistrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnimalActionPerformed

        fmRegistroAnimales f = new fmRegistroAnimales(this, true, animalesAcutales, mostrar);
        f.setVisible(true);
        txtAnimales.setText(String.valueOf(animalesAcutales.size()));

    }//GEN-LAST:event_btnRegistrarAnimalActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        txtNombre.setText("");
        txtNombreCientifico.setText("");
        txtDescripcion.setText("");
        reiniciarListas();
        mostrar = false;
        descactivarCampos();
        txtNombre.setEnabled(true);
        animalesAcutales = new ArrayList<>();
        txtAnimales.setText(String.valueOf(animalesAcutales.size()));
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmPrincipalP f = new frmPrincipalP();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void guardarEspecie() {
        Especie especie = new Especie();
        especie.setDescripcion(txtDescripcion.getText());
        especie.setNombre(txtNombre.getText());
        especie.setNombreCientifico(txtNombreCientifico.getText());
        List<HabitatOcupada> habitats = new ArrayList<>();
        List<CuidadorEspecie> cuidadorEspecie = new ArrayList<>();
        especie.setId(new ObjectId());
        especie.setAnimales(animalesAcutales);
        for (int i = 0; i < modeloListaHabitatSeleccionados.size(); i++) {
            HabitatOcupada h = new HabitatOcupada(modeloListaHabitatSeleccionados.get(i).getId(), especie.getId());
            habitats.add(h);
        }
        for (int i = 0; i < modeloListaCuidadorSeleccionados.size(); i++) {
            CuidadorEspecie c = new CuidadorEspecie(new Date(), modeloListaCuidadorSeleccionados.get(i).getId(), especie.getId());
            cuidadorEspecie.add(c);
        }

        especie.setHabitatsOcupadas(habitats);
        especie.setCuidadorEspecie(cuidadorEspecie);
        if (this.logica.guardarEspecie(especie)) {
            JOptionPane.showMessageDialog(this, "Registro Exitoso");
            frmPrincipalP f = new frmPrincipalP();
            f.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al Registrar");
        }
    }

    public boolean validadCampos() {
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Indique un Nombre de Especie,Porfavor");
            return false;
        }
        if (txtNombreCientifico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Indique un Nombre de Especie Cientifico,Porfavor");
            return false;
        }
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Indique un Nombre de Especie Descripcion,Porfavor");
            return false;
        }
        if (modeloListaHabitatSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione minimo 1 habitat");
            return false;
        }
        if (modeloListaCuidadorSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione minimo 1 Cuidador");
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarEspecie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrarAnimal;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JComboBox<Zona> cmbZona;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Cuidador> listaDisponiblesCuidadores;
    private javax.swing.JList<Habitat> listaDisponiblesHabitats;
    private javax.swing.JList<Cuidador> listaSeleccionadosCuidadores;
    private javax.swing.JList<Habitat> listaSeleccionadosHabitats;
    private javax.swing.JTextField txtAnimales;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCientifico;
    // End of variables declaration//GEN-END:variables
}
