/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergio
 */
public class Carretera extends Thread {

    private Persona p1;
    private Persona p2;
    private Persona p3;
    private Persona p4;
    private Persona p5;
    private Persona p6;
    private Persona p7;
    private Persona p8;
    private Persona p9;
    private String[] matriz = new String[101];
    private String azul = "\u001B[34m";
    private String amarillo = "\u001B[32m";
    private String rojo = "\u001B[31m";

    /**
     * costructorde la clase padre que recibe 9 objetos de tipopersona
     *
     * @param p1.objeto tipo persona
     * @param p2.objeto tipo persona
     * @param p3.objeto tipo persona
     * @param p4.objeto tipo persona
     * @param p5.objeto tipo persona
     * @param p6.objeto tipo persona
     * @param p7.objeto tipo persona
     * @param p8.objeto tipo persona
     * @param p9.objeto tipo persona
     */
    public Carretera(Persona p1, Persona p2, Persona p3, Persona p4, Persona p5, Persona p6, Persona p7, Persona p8, Persona p9) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
    }

    /**
     * metodo que ajusta las pociciones dde las personas
     *
     * @param p1.objeto tipo persona
     * @param p2.objeto tipo persona
     * @param p3.objeto tipo persona
     * @return retorna matriz ajuattada
     */

    //llena el array con puntos
    public String[] ajustarpos(Persona p1, Persona p2, Persona p3) {
        this.matriz[matriz.length - 1] = "META";
        for (int i = 0; i < matriz.length - 1; i++) {
            this.matriz[i] = ".";
        }
        //llena la pos de la persona con la letra asignada
        this.matriz[(int) p1.getMetrosrecorrido()] = "a";
        this.matriz[(int) (p2.getMetrosrecorrido() + 33)] = "b";
        this.matriz[(int) (p3.getMetrosrecorrido() + 66)] = "c";

        return this.matriz;
    }

    /**
     * metodo para imrimir equipo carredores
     *
     * @param x vector de personas
     * @param color recibe un string el cual asigna el color
     */
    public void imprimir(String[] x, String color) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(color + matriz[i]);
        }

        System.out.println("");

    }

    /**
     *
     * metodo sobre escrito que esta en un ciclo de impresion
     */
    @Override
    public void run() {
        while (p3.getMetrosrecorrido() < 33 || p6.getMetrosrecorrido() < 33 || p9.getMetrosrecorrido() < 33) {

            imprimir(ajustarpos(p1, p2, p3), azul);
            imprimir(ajustarpos(p4, p5, p6), amarillo);
            imprimir(ajustarpos(p7, p8, p9), rojo);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            if (p3.getMetrosrecorrido() == 33) {
                imprimir(ajustarpos(p1, p2, p3), azul);
                imprimir(ajustarpos(p4, p5, p6), amarillo);
                imprimir(ajustarpos(p7, p8, p9), rojo);
                System.out.println(" gano azul  ");
                break;
            } else if (p6.getMetrosrecorrido() == 33) {
                imprimir(ajustarpos(p1, p2, p3), azul);
                imprimir(ajustarpos(p4, p5, p6), amarillo);
                imprimir(ajustarpos(p7, p8, p9), rojo);
                System.out.println("  gano amarillo ");
                break;
            } else if (p9.getMetrosrecorrido() == 33) {
                imprimir(ajustarpos(p1, p2, p3), azul);
                imprimir(ajustarpos(p4, p5, p6), amarillo);
                imprimir(ajustarpos(p7, p8, p9), rojo);
                System.out.println("  gano rojo ");
                break;
            }

        }

    }
}
