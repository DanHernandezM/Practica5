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
	
	private String comando;
	
	public Ejecutor(String comando, int periodo){
		super(periodo);
		this.comando = comando;
	}
	
	public String leerComando(){ return comando; }
		
}