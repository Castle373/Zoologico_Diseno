/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectozoo_gui;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Vegetacion;
import Dominio.Zona;
import com.mycompany.proyectozoo_logica.FabricaLogica;
import com.mycompany.proyectozoo_logica.ILogica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class frmPrincipalP extends javax.swing.JFrame {
ILogica logica;
    /**
     * Creates new form frmPrincipalP
     */
    public frmPrincipalP() {
        logica = FabricaLogica.crearInstancia();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarEspecie = new javax.swing.JButton();
        btnRegistrarHabitat = new javax.swing.JButton();
        btnRegistrarItinerario = new javax.swing.JButton();
        btnQueja = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarEspecie.setText("Registrar Especie");
        btnRegistrarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEspecieActionPerformed(evt);
            }
        });

        btnRegistrarHabitat.setText("Registrar Habitat");
        btnRegistrarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHabitatActionPerformed(evt);
            }
        });

        btnRegistrarItinerario.setText("Registrar Itinerarios");
        btnRegistrarItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarItinerarioActionPerformed(evt);
            }
        });

        btnQueja.setText("Registrar Queja");
        btnQueja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuejaActionPerformed(evt);
            }
        });

        jButton1.setText("RegistrarDatos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("No Presionar Si ya estan los datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Zoologico");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinosaurio-imagen-animada-0001.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarItinerario)
                            .addComponent(btnQueja, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarHabitat)
                        .addGap(5, 5, 5)
                        .addComponent(btnRegistrarEspecie)
                        .addGap(5, 5, 5)
                        .addComponent(btnRegistrarItinerario)
                        .addGap(5, 5, 5)
                        .addComponent(btnQueja))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarItinerarioActionPerformed
        if (logica.recuperarDatosItineario()!=null) {
            Object[] o= logica.recuperarDatosItineario();
            frmRegistrarItinerario frm = new frmRegistrarItinerario((List<Guia>)o[1],(List<Zona>) o[0]);
            frm.setVisible(true);
            this.dispose(); 
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo recuperar los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarItinerarioActionPerformed

    private void btnRegistrarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHabitatActionPerformed
    if (logica.recuperaDatosHabitat()==null) {
            JOptionPane.showMessageDialog(this, "No se pudo recuperar los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
             Object[] o= logica.recuperaDatosHabitat();
             
            List<Clima> lisc= (List<Clima>)o[0];
            List<Continente> lisCon= (List<Continente>)o[1];
            List<Vegetacion> lisVege= (List<Vegetacion>)o[2];
            frmRegistrarHabitat frm= new frmRegistrarHabitat(lisCon, lisc, lisVege);
            frm.setVisible(true);
             this.dispose();
        }
    }//GEN-LAST:event_btnRegistrarHabitatActionPerformed

    private void btnRegistrarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEspecieActionPerformed
        if (logica.recuperaDatosEspecies()==null) {
            JOptionPane.showMessageDialog(this, "No se pudo recuperar los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Object[] o= logica.recuperaDatosEspecies();
            List<Cuidador> luic= (List<Cuidador>)o[0];
            List<Habitat> luih= (List<Habitat>)o[1];
            List<Zona> luiz= (List<Zona>)o[2];
            frmRegistrarEspecie frm= new frmRegistrarEspecie(luic, luih, luiz);
            frm.setVisible(true);
            this.dispose(); 
         }
    }//GEN-LAST:event_btnRegistrarEspecieActionPerformed

    private void btnQuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuejaActionPerformed
     if (logica.recuperaItinerarios().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se pudo recuperar los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
             this.dispose();
             frmRegstroQueja RQueja = new frmRegstroQueja(logica.recuperaItinerarios());
             RQueja.setVisible(true);
             this.dispose(); 
        }
    }//GEN-LAST:event_btnQuejaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if (logica.recuperaDatosHabitat()==null) {
            logica.RegistrarDatos();
        }else{
            JOptionPane.showMessageDialog(this, "Datos Ya registrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQueja;
    private javax.swing.JButton btnRegistrarEspecie;
    private javax.swing.JButton btnRegistrarHabitat;
    private javax.swing.JButton btnRegistrarItinerario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
