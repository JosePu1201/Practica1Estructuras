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
 * Entrada de archivos
 *
 * @author jose
 */
public class EntradaArchivo {

    JTextArea texto;
    private Lista lista;

    public EntradaArchivo(JTextArea texto) {
        this.texto = texto;
        lista = new Lista();
    }

    public void cargaDatos() throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        int i = 0;
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            try ( FileReader fr = new FileReader(f)) { //Lee el archivo de texto 
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

    public void generarListas() {
        String[] lineas = texto.getText().split("\n");

        for (int i = 0; i < lineas.length; i++) {
            boolean error = false;
            String[] entradaLista = lineas[i].split(",");
            if (entradaLista.length == 12) {
                int[] caballos = new int[10];
                for (int j = 2; j < entradaLista.length; j++) {
                    if (casteoInt(entradaLista[j]) > 0 && casteoInt(entradaLista[j]) < 11) {
                        caballos[j - 2] = casteoInt(entradaLista[j]);
                    } else {
                        error = true;

                    }

                }
                try {
                    if (!error) {
                        double monto = Double.parseDouble(entradaLista[1]);
                        lista.agregarfinal(new Apuesta(entradaLista[0], Double.parseDouble(entradaLista[1]), caballos));

                    }
                } catch (Exception a) {
                    System.out.println("Error Double");
                }

            }
        }
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        lista.calcResult(res);

    }

    private int casteoInt(String e) {
        int salida = 0;
        try {
            salida = Integer.parseInt(e);
        } catch (Exception a) {
            salida = -1;
            System.out.println("Error: " + e);
        }
        return salida;
    }

    public boolean verificarApuestas(int[] a) {
        boolean error = false;
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        boolean c4 = false;
        boolean c5 = false;
        boolean c6 = false;
        boolean c7 = false;
        boolean c8 = false;
        boolean c9 = false;
        boolean c10 = false;
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    if (!c1) {
                        c1 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 2:
                    if (!c2) {
                        c2 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 3:
                    if (!c3) {
                        c3 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 4:
                    if (!c4) {
                        c4 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 5:
                    if (!c5) {
                        c5 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 6:
                    if (!c6) {
                        c6 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 7:
                    if (!c7) {
                        c7 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 8:
                    if (!c8) {
                        c8 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 9:
                    if (!c9) {
                        c9 = true;
                    } else {
                        error = true;
                    }
                    break;
                case 10:
                    if (!c10) {
                        c10 = true;
                    } else {
                        error = true;
                    }
                    break;

            }
        }
        return error;
    }

    public JTextArea getTexto() {
        return texto;
    }

    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

}
