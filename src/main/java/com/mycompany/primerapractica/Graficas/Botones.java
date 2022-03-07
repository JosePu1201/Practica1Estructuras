/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.primerapractica.Graficas;

import com.mycompany.primerapractica.Apuestas.Apuesta;
import com.mycompany.primerapractica.Entrada.EntradaArchivo;

/**
 *
 * @author jose
 */
public class Botones extends javax.swing.JPanel {

    private panelPrincipal panel;

    /**
     * Creates new form Botones
     */
    public Botones(panelPrincipal panel) {
        this.panel = panel;
        initComponents();
        ingresar.setEnabled(false);
        mostrar.setEnabled(false);
        verificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carga = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        verificar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(0, 1));

        carga.setText("CARGAR ARCHIVO DE TEXTO");
        carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaActionPerformed(evt);
            }
        });
        add(carga);

        cerrar.setText("CERRAR APUESTAS");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        add(cerrar);

        verificar.setText("VERIFICAR APUESTAS");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        add(verificar);

        ingresar.setText("INGRESAR RESULTADOS");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        add(ingresar);

        mostrar.setText("MOSTRAR RESULTADOS DE APUESTAS");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        add(mostrar);

        jButton1.setText("REPORTES");
        add(jButton1);

        limpiar.setText("LIMPIAR AREA DE TEXTO");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        add(limpiar);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        panel.getFunciones().getLista().setCabeza(null);
        panel.getFunciones().getLista().setUtlimo(null);
        panel.getFunciones().generarListas();
        verificar.setEnabled(true);
    }//GEN-LAST:event_cerrarActionPerformed

    private void cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaActionPerformed
        try {
            panel.getFunciones().cargaDatos();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cargaActionPerformed

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        panel.getFunciones().getLista().verificarApuesta(panel.getFunciones().getLista().getCabeza());
        panel.getFunciones().getLista().imprimir();
        ingresar.setEnabled(true);
    }//GEN-LAST:event_verificarActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        panel.getIzqueirda().setVisible(true);
        panel.agregar();
        mostrar.setEnabled(true);
    }//GEN-LAST:event_ingresarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        Apuesta [] nuevo = EntradaArchivo.PorSeleccion(panel.getFunciones().getLista().arreglo());
        for (Apuesta apuesta : nuevo) {
            System.out.println(apuesta.toString());
        }
        ReportesDeGanadores reportes = new ReportesDeGanadores(nuevo);
    }//GEN-LAST:event_mostrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        panel.getCentro().getjTextArea2().setText("");
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carga;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
