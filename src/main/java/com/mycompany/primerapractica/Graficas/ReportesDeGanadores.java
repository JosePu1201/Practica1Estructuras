/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.primerapractica.Graficas;

import com.mycompany.primerapractica.Apuestas.Apuesta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class ReportesDeGanadores extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private Apuesta[] puesta;

    /**
     * Creates new form ReportesDeGanadores
     */
    public ReportesDeGanadores(Apuesta[] puesta) {
        this.puesta = puesta;
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Puntos");
        modelo.addColumn("Monto apostado");
        this.jTable1.setModel(modelo);
        agregarTabla(puesta);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Puntos", "Monto apostado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout());

        jButton2.setText("Guardar de mayor a menor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setText("Guardar de menor a mayor ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File archivo = new File(guardarComo.getSelectedFile() + ".txt");
        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
            salida.append(("Numero") + "\t\t\tApostador\t\t\tPuntos\t\t\tMonto");
            for (int i = puesta.length - 1; i >= 0; i--) {
                salida.newLine();
                salida.append((i + 1) + "\t\t\t" + puesta[i].getApostador() + "\t\t\t" + puesta[i].getPuntos() + "\t\t\t" + puesta[i].getMonto());
            }
            salida.close();
        } catch (Exception a) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File archivo = new File(guardarComo.getSelectedFile() + ".txt");
        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
            salida.append(("Numero") + "\t\t\tApostador\t\t\tPuntos\t\t\tMonto");
            for (int i = 0; i < puesta.length; i++) {
                salida.newLine();
                salida.append((i + 1) + "\t\t\t" + puesta[i].getApostador() + "\t\t\t" + puesta[i].getPuntos() + "\t\t\t" + puesta[i].getMonto());
            }
            salida.close();
        } catch (Exception a) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void agregarTabla(Apuesta[] apuesta) {
        for (int i = 0; i < apuesta.length; i++) {
            String[] a = new String[4];
            a[0] = (i + 1) + "";
            a[1] = apuesta[i].getApostador();
            a[2] = apuesta[i].getPuntos() + "";
            a[3] = apuesta[i].getMonto() + "";
            modelo.addRow(a);
        }
    }
}
