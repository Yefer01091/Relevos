/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergio
 */
public class Persona extends Equipo {

    private Equipo equipo;
    private int metrosinicio;
    private int metrosrecorrido;
    private int id;

    public Persona(Equipo equipo, int metrosinicio, int id) {

        this.equipo = equipo;
        this.metrosinicio = metrosinicio;
        this.id = id;
    }

    @Override
    public synchronized void run() {
//fe
        synchronized (equipo) {
            while (id != equipo.getContador()) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            for (int i = 0; metrosrecorrido < 33; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
                }
                int n = (int) (Math.random() * 3 + 1);
                if (metrosrecorrido + n < 33) {
                    metrosrecorrido = metrosrecorrido + n;
                } else {
                    metrosrecorrido = 33;
                }

            }

            equipo.setContador(equipo.getContador()+1);
            equipo.notifyAll();
        }

    }
/**
 * 
 * metodo para saber los metros recorridos por persona
 * @return retorna los metros recorriido dela persona
 */
    public int getMetrosrecorrido() {
        return metrosrecorrido;
    }

}
