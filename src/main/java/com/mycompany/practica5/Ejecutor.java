/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica5;

/**
 *
 * @author nenod
 */
import java.util.*;
import java.io.IOException;

public class Ejecutor extends TareaPeriodica{
	
	protected String comando;
	
	public Ejecutor(String comando, int periodo){
		super(periodo);
		this.comando = comando;
	}
	
	public String leerComando(){
            return comando;
        }
	
        public boolean necesitaEjecucion() {
            if (!activa) return false;
            
        Calendar proximaEjecucion = new GregorianCalendar();
            proximaEjecucion.setTime(ultimaEjecucion);
            proximaEjecucion.add(Calendar.SECOND, periodo);
            
            Calendar ahora = new GregorianCalendar(); 
            
             return (proximaEjecucion.before(ahora)); 
        }
        public int ejecutarTarea() {    
            try {        
                Runtime.getRuntime().exec(comando);
                return 0;    
            } 
            catch(IOException e) {       
                System.err.println(e.toString());    
            }    
            return -1; 
        } 

        }