/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

/**
 *
 * @author Yefer Patarroyo
 */
public class Main {
    public static void main(String[] args) {
        
       Equipo azul=new practica.Equipo(); 
        Persona corredor1=new Persona(azul,0,0);
        Persona corredor2=new Persona(azul,33,1);
        Persona corredor3=new Persona(azul,66,2);
        
        Equipo amarillo=new practica.Equipo(); 
        Persona corredora1=new Persona(amarillo,0,0);
        Persona corredora2=new Persona(amarillo,33,1);
        Persona corredora3=new Persona(amarillo,66,2);
        
        Equipo rojo=new practica.Equipo(); 
        Persona corredorb1=new Persona(rojo,0,0);
        Persona corredorb2=new Persona(rojo,33,1);
        Persona corredorb3=new Persona(rojo,66,2);
        Carretera viafaca=new Carretera(corredor1,corredor2,corredor3,corredora1,corredora2,corredora3,corredorb1,corredorb2,corredorb3);
        viafaca.start();
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredora1.start();
        corredora2.start();
        corredora3.start();
        corredorb1.start();
        corredorb2.start();
        corredorb3.start();
        
        
       
       //Equipo amarillo=new Equipo("amarillo");
       
       
      
    }
}
