/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalgabrielalberto;

/**
 *
 * @author usuario
 */
public class AppRacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Creamos números para hacer las pruebas
        Racional racionalZ = new Racional(4,5);
        
        Racional racionalK = new Racional(3,4);
        
        Racional racionalAleatorio = Racional.aleatorio();
        
        //Mostramos los números creados
        System.out.println("RacionalZ = " +racionalZ);
        System.out.println("RacionalK =" +racionalK);
        System.out.println("RacionalAleatorio = " +racionalAleatorio);
        
        //Comprobamos la igualdad entre los números creados
        System.out.println(Racional.igualdad(racionalZ, racionalK));
        
        //Probamos la suma
        racionalZ.suma(racionalK);
        
        System.out.println("El resultado de la suma es = "+racionalZ);
        
        //Prueba división
        System.out.println("El resultado de dividir Z y K es" + Racional.division(racionalZ, racionalK));
        
        //Prueba multiplicación
        
        racionalZ.producto(racionalK);
        
        System.out.println("El resultado de la multiplicacion es = "+racionalZ);
    }
    
}
