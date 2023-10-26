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

public class TareaPeriodica{

	protected int periodo;
	protected Date ultimaEjecucion;
	protected boolean activa;
	
	public TareaPeriodica(int periodo){
		this.periodo = periodo;
		actualizar();
		activa = true;
	}
	
	public TareaPeriodica() { this(1); }
	
	public void actualizar(){
		ultimaEjecucion = new Date(); // Hora actual
	}
	
	public void activar() { activa = true; }
	public void desactivar() { activa = false; }
	
	public boolean necesitaEjecucion() {
		return false;
		// Metodo blanco intencionalmente
	}
	
	public int ejecutarTarea() {
		return 0;
		// Método blanco intencionalmente
	}
	
}