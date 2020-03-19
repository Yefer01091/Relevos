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

    Persona p1;
    Persona p2;
    Persona p3;
    Persona p4;
    Persona p5;
    Persona p6;
    Persona p7;
    Persona p8;
    Persona p9;
    String[] matriz = new String[101];
    String azul = "\u001B[34m";
    String amarillo = "\u001B[32m";
    String rojo = "\u001B[31m";

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

    public String[] ajustarpos(Persona p1, Persona p2, Persona p3) {
        this.matriz[matriz.length-1]="META";
        for (int i = 0; i < matriz.length-1; i++) {
            this.matriz[i] = ".";
        }
        this.matriz[(int) p1.metrosrecorrido] = "a";
        this.matriz[(int) (p2.metrosrecorrido + 33)] = "b";
        this.matriz[(int) (p3.metrosrecorrido + 66)] = "c";

        return this.matriz;
    }

    public void imprimir(String[] x, String color) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(color + matriz[i]);
        }

        System.out.println("");

    }

    @Override
    public void run() {
        while (p3.metrosrecorrido < 33 || p6.metrosrecorrido < 33 || p9.metrosrecorrido < 33) {

            imprimir(ajustarpos(p1, p2, p3), azul);
            imprimir(ajustarpos(p4, p5, p6), amarillo);
            imprimir(ajustarpos(p7, p8, p9), rojo);
               System.out.println("");
                  System.out.println("");
                     System.out.println("");
                        System.out.println("");
                           System.out.println("");

            if (p3.metrosrecorrido == 33) {
               imprimir(ajustarpos(p1, p2, p3), azul);
            imprimir(ajustarpos(p4, p5, p6), amarillo);
            imprimir(ajustarpos(p7, p8, p9), rojo);
                System.out.println(" gano azul  ");
                break;
            }
            
            else if(p6.metrosrecorrido == 33){
                imprimir(ajustarpos(p1, p2, p3), azul);
            imprimir(ajustarpos(p4, p5, p6), amarillo);
            imprimir(ajustarpos(p7, p8, p9), rojo);
                System.out.println("  gano amarillo ");
                break;
            }
            
            else if (p9.metrosrecorrido == 33) {imprimir(ajustarpos(p1, p2, p3), azul);
            imprimir(ajustarpos(p4, p5, p6), amarillo);
            imprimir(ajustarpos(p7, p8, p9), rojo);
                 System.out.println("  gano rojo ");
                break;
            }
            

        }

    }
}

