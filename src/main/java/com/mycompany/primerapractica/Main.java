/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica;

import com.mycompany.primerapractica.Graficas.EdicionTexto;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class Main {
    //main
    public static void main(String[] args) {
        EdicionTexto edicion = new  EdicionTexto();
        edicion.setVisible(true);
        JFrame nuevo = new JFrame();
        nuevo.setSize(500,500);
        nuevo.setLocationRelativeTo(null);
        nuevo.add(edicion);
        nuevo.setVisible(true);
    }
}
