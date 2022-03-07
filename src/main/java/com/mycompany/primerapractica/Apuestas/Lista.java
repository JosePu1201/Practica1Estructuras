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
    private String errores = "";
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
        int i = 0;
        Apuesta aux = cabeza;
        while (aux != null) {
            System.out.println(i + aux.toString());
            aux = aux.getSiguiente();
            i++;
        }
    }

    public void calcResult(int[] res) {
        Apuesta aux = cabeza;
        while (aux != null) {
            aux.calcularPuntos(res);
            aux = aux.getSiguiente();
        }
    }

    public void verificarApuesta(Apuesta apuesta) {
        if (apuesta != null) {
            if (verificarRepeticion(apuesta.getCaballos())) {
                eliminarApuesta(apuesta);//o(n)
            } else {
                verificarApuesta(apuesta.getSiguiente());//o(n)
            }
        }
    }

    public boolean verificarRepeticion(int[] a) {
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

    public void eliminarApuesta(Apuesta eliminar) {//o(n)
        if (eliminar != cabeza && eliminar != utlimo) {
            if (eliminar.getSiguiente() != null) {
                eliminar.getAnterior().setSiguiente(eliminar.getSiguiente());
                eliminar.getSiguiente().setAnterior(eliminar.getAnterior());
                Apuesta tmp = eliminar.getSiguiente();
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
//                guardarEliminadas(eliminar);
                verificarApuesta(tmp);
            } else {
                eliminar.getAnterior().setSiguiente(null);
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
//                guardarEliminadas(eliminar);
            }

        } else if (eliminar == cabeza) {
            if (eliminar.getSiguiente() != null) {
                cabeza = eliminar.getSiguiente();
                cabeza.setAnterior(null);
                eliminar.setSiguiente(null);
                //guardarEliminadas(eliminar);
                verificarApuesta(cabeza);
            } else {
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                //guardarEliminadas(eliminar);
            }
        } else if (eliminar == utlimo) {
            utlimo = utlimo.getAnterior();
            utlimo.setSiguiente(null);
            eliminar.setAnterior(null);
            eliminar.setSiguiente(null);
//            guardarEliminadas(eliminar);
        } else {
            if (eliminar.getSiguiente() != null) {
                verificarApuesta(eliminar.getSiguiente());
            }
        }
    }

    public int tamaneo() {
        int i = 0;
        Apuesta aux = cabeza;
        while (aux != null) {
            aux = aux.getSiguiente();
            i++;
        }
        return i;
    }

    public Apuesta[] arreglo() {
        Apuesta salida[] = new Apuesta[tamaneo()];
        Apuesta aux = cabeza;
        int i = 0;
        while (aux != null) {
            salida[i] = aux;
            aux = aux.getSiguiente();
            i++;
        }
        return salida;
    }

    public Apuesta getCabeza() {
        return cabeza;
    }

    public void setCabeza(Apuesta cabeza) {
        this.cabeza = cabeza;
    }

    public Apuesta getUtlimo() {
        return utlimo;
    }

    public void setUtlimo(Apuesta utlimo) {
        this.utlimo = utlimo;
    }

    public String getErrores() {
        return errores;
    }

    public void setErrores(String errores) {
        this.errores = errores;
    }

}
