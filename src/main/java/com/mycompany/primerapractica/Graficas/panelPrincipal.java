/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerapractica.Graficas;

import com.mycompany.primerapractica.Entrada.EntradaArchivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JPanel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class panelPrincipal extends JPanel {
    private EntradaArchivo funciones;
    private Botones derecha;
    private EdicionTexto centro;
    private ApuestaManual izquierda;

    public panelPrincipal() {        
        derecha = new Botones (this);
        derecha.setVisible(true);
        derecha.setBackground(Color.BLACK);
        izquierda = new ApuestaManual(this);
        izquierda.setBackground(Color.black);
        izquierda.setVisible(false);
        centro = new EdicionTexto(this);
        centro.setBackground(Color.black);
        funciones = new EntradaArchivo(centro.getjTextArea2());
        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());
        agregar();

    }

    public void agregar() {
        this.add(centro, BorderLayout.CENTER);
        this.add(derecha, BorderLayout.EAST);
        this.add(izquierda, BorderLayout.WEST);
        this.setVisible(false);
        this.setVisible(true);
    }

    public Botones getDerecha() {
        return derecha;
    }

    public void setDerecha(Botones derecha) {
        this.derecha.setVisible(false);
        this.derecha = derecha;
        this.derecha.setVisible(true);
    }

    public ApuestaManual getIzqueirda() {
        return izquierda;
    }

    public void setIzqueirda(ApuestaManual izqueirda) {
        this.izquierda.setVisible(false);
        this.izquierda = izqueirda;
        this.izquierda.setVisible(true);
    }

    public EdicionTexto getCentro() {
        return centro;
    }

    public void setCentro(EdicionTexto centros) {
        this.centro.setVisible(false);
        this.centro = centros;
        this.centro.setVisible(true);
    }

    public ApuestaManual getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(ApuestaManual izquierda) {
        this.izquierda.setVisible(false);
        this.izquierda = izquierda;
        this.izquierda.setVisible(true);
    }


    public void agregarTabala() {
//        this.add(reporte, BorderLayout.CENTER);
        this.setVisible(false);
        this.setVisible(true);
    }

    public EntradaArchivo getFunciones() {
        return funciones;
    }

    public void setFunciones(EntradaArchivo funciones) {
        this.funciones = funciones;
    }

}
