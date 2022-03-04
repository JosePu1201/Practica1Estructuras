/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapractica.Entrada;

import com.mycompany.primerapractica.Apuestas.Apuesta;
import com.mycompany.primerapractica.Apuestas.Lista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *Entrada de archivos 
 * @author jose
 */
public class EntradaArchivo {
    JTextArea texto;
    private Lista lista;
    public EntradaArchivo(JTextArea texto) {
        this.texto = texto;
        lista = new  Lista();
    }

    public  void cargaDatos() throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        int i=0;
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            try ( FileReader fr = new FileReader(f) ) { //Lee el archivo de texto 
                BufferedReader br = new BufferedReader(fr);//Lee las lineas del archivo
                String linea;
                i = 1;
                while ((linea = br.readLine()) != null) {//Lee linea por linea
                    texto.append(linea + "\n");
                    i++;
                }
            }

        } catch (NullPointerException e) {

        }
        
    }
    public void generarListas(){
        String [] lineas = texto.getText().replaceAll("<","").replaceAll(">","").split("\n");
        for (int i = 0; i < lineas.length; i++) {
            String[] entradaLista = lineas[i].split(",");
            if(entradaLista.length == 12){
                int [] caballos = new int[10];
                for (int j = 2; j <entradaLista.length; j++) {
                    caballos [j-2]= Integer.parseInt(entradaLista[j]); 
                }
            lista.agregarfinal(new Apuesta(entradaLista[0], Double.parseDouble(entradaLista[1]), caballos));
            }
        }
        lista.imprimir();
    }
    
}