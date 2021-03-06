/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.Apuestas;

/**
 *
 * @author jose
 */
public class Apuesta {

    private Apuesta siguiente;
    private Apuesta anterior;
    private String apostador;
    private double monto;
    private int[] caballos;
    private int puntos = 0;

    public Apuesta(Apuesta siguiente, Apuesta anterior, String apostador) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.apostador = apostador;
    }

    public Apuesta(String apostador, double motno, int[] caballos) {
        this.apostador = apostador;
        this.monto = motno;
        this.caballos = caballos;
    }

    public Apuesta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Apuesta siguiente) {
        this.siguiente = siguiente;
    }

    public Apuesta getAnterior() {
        return anterior;
    }

    public void setAnterior(Apuesta anterior) {
        this.anterior = anterior;
    }

    public String getApostador() {
        return apostador;
    }

    public void setApostador(String apostador) {
        this.apostador = apostador;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double motno) {
        this.monto = motno;
    }

    public int[] getCaballos() {
        return caballos;
    }

    public void setCaballos(int[] caballos) {
        this.caballos = caballos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        String arreglo = "   Arreglo -->";
        for (int i = 0; i < caballos.length; i++) {
           arreglo = arreglo+caballos[i]+"-";
        }
        return "Apostador: " + apostador + "Monto: " + monto+arreglo;

    }

    public void calcularPuntos(int[] res) {
        for (int i = 0; i < caballos.length; i++) {
            if (caballos[i] == res[i]) {
                puntos = puntos + (10 - i);
            }
        }
    }

    public void eliminar() {

    }

}
