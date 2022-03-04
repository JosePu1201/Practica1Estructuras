/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.Apuestas;

/**
 *
 * @author jose
 */
public class Lista {

    private Apuesta cabeza;
    private Apuesta utlimo;

    public Lista() {
    }

    public void agregarfinal(Apuesta nuevo) {
        if (utlimo == null) {
            cabeza = nuevo;
            utlimo = nuevo;
        } else {
            Apuesta aux = utlimo;
            utlimo = nuevo;
            aux.setSiguiente(utlimo);
            utlimo.setAnterior(aux);
//            aux.getAnterior().setSiguiente(aux);        
        }

    }
        public void agregarPrincipio(Apuesta nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            utlimo = nuevo;
        } else {
            Apuesta aux = cabeza;
            Apuesta aux1 = cabeza.getSiguiente();
            cabeza = nuevo;
            aux.setAnterior(cabeza);
            aux.setSiguiente(aux1);
            cabeza.setSiguiente(aux);
//            aux.getAnterior().setSiguiente(aux);        
        }

    }

    public void imprimir() {
        Apuesta aux = cabeza;
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getSiguiente();

        }
    }
}
