/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica5;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
/**
 *
 * @author nenod
 */
public class Controladora {
    public static void main(String[] args){
        Ejecutor e = new Ejecutor("calc", 1);
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un commando para ejecutar");
        e.comando = leer.next();
        if (e.necesitaEjecucion()) {
            e.ejecutarTarea();
        }
    } 
}
