
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

/**
 *
 * @author spinter
 */
public class Equipo extends Thread  {
 
 
 private int contador=0;

    public Equipo() {
                
       
    }
/**
 * metodo que  devuelve un contador
 * @return  retorna una variable de control
 */
    
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     
}